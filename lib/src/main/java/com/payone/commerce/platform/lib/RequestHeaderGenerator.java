package com.payone.commerce.platform.lib;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.payone.commerce.platform.lib.serializer.JsonSerializer;
import com.payone.commerce.platform.lib.utils.ServerMetaInfo;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import okhttp3.Headers;
import okhttp3.Headers.Builder;
import okhttp3.Request;

public class RequestHeaderGenerator {

    public static final String SERVER_META_INFO_HEADER_NAME = "X-GCS-ServerMetaInfo";
    public static final String CLIENT_META_INFO_HEADER_NAME = "X-GCS-ClientMetaInfo";
    public static final String DATE_HEADER_NAME = "Date";
    public static final String AUTHORIZATION_HEADER_NAME = "Authorization";
    public static final String CONTENT_TYPE_HEADER_NAME = "Content-Type";

    private static final String ALGORITHM = "HmacSHA256";
    private static final String WHITESPACE_REGEX = "\\r?\\n[\\h]*";

    private final CommunicatorConfiguration config;
    private final Mac mac;

    public RequestHeaderGenerator(CommunicatorConfiguration config) throws InvalidKeyException {
        this.config = config;

        try {
            this.mac = Mac.getInstance(RequestHeaderGenerator.ALGORITHM);
            SecretKeySpec secretKeySpec = new SecretKeySpec(config.getApiSecret().getBytes(StandardCharsets.UTF_8),
                    ALGORITHM);
            this.mac.init(secretKeySpec);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError("HmacSHA256 must be available to use the PCP Java SDK", e);
        }
    }

    public Request generateAdditionalRequestHeaders(Request request) {
        Headers headers = request.headers();
        Builder headersBuilder = headers.newBuilder();

        if (headersBuilder.get(DATE_HEADER_NAME) == null) {
            headersBuilder.add(DATE_HEADER_NAME, new Date());
        }
        if (headersBuilder.get(SERVER_META_INFO_HEADER_NAME) == null) {
            headersBuilder.add(SERVER_META_INFO_HEADER_NAME, getServerMetaInfo());
        }
        if (headersBuilder.get(CLIENT_META_INFO_HEADER_NAME) == null) {
            headersBuilder.add(CLIENT_META_INFO_HEADER_NAME, getClientMetaInfo());
        }
        if (headersBuilder.get(AUTHORIZATION_HEADER_NAME) == null) {
            headersBuilder.add(AUTHORIZATION_HEADER_NAME, getAuthHeader(request, headersBuilder));
        }

        Headers newHeaders = headersBuilder.build();
        return request.newBuilder().headers(newHeaders).build();

    }

    private String getAuthHeader(Request request, Builder headersBuilder) {
        // 1. method
        StringBuilder stringToSign = new StringBuilder(request.method());
        stringToSign.append("\n");
        // 2. Content-Type
        if (headersBuilder.get(CONTENT_TYPE_HEADER_NAME) != null) {
            stringToSign.append(headersBuilder.get(CONTENT_TYPE_HEADER_NAME));
        }
        stringToSign.append("\n");
        // 3. Date
        stringToSign.append(headersBuilder.get(DATE_HEADER_NAME))
                .append("\n");
        // 4. Canonicalized Headers (starting with X-GCS, sorted by names)
        if (headersBuilder.get(CLIENT_META_INFO_HEADER_NAME) != null) {
            stringToSign.append(CLIENT_META_INFO_HEADER_NAME.toLowerCase())
                    .append(":")
                    .append(headersBuilder.get(CLIENT_META_INFO_HEADER_NAME).replaceAll(WHITESPACE_REGEX, " ").trim())
                    .append("\n");
        }
        if (headersBuilder.get(SERVER_META_INFO_HEADER_NAME) != null) {
            stringToSign.append(SERVER_META_INFO_HEADER_NAME.toLowerCase())
                    .append(":")
                    .append(headersBuilder.get(SERVER_META_INFO_HEADER_NAME).replaceAll(WHITESPACE_REGEX, " ").trim())
                    .append("\n");
        }
        // 5. Canonicalized Resource (has to include query parameters)
        stringToSign.append(request.url().encodedPath());
        if (request.url().encodedQuery() != null) {
            stringToSign.append("?")
                    .append(request.url().encodedQuery());
        }
        stringToSign.append("\n");
        String signature = this.sign(stringToSign.toString());
        return String.format("GCS v1HMAC:%s:%s", config.getApiKey(), signature);
    }

    private String sign(String target) {
        byte[] hash = this.mac.doFinal(target.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(hash);
    }

    private String getServerMetaInfo() {
        ServerMetaInfo meta = config.getServerMetaInfo();
        String jsonString;

        try {
            jsonString = JsonSerializer.serializeToJson(meta);
            return Base64.getEncoder().encodeToString(jsonString.getBytes(StandardCharsets.UTF_8));
        } catch (JsonProcessingException e) {
            throw new AssertionError(
                    "Server Meta Info must be encodable as JSON, this is likely an internal bug of the java PCP SDK",
                    e);
        }
    }

    private String getClientMetaInfo() {
        byte[] encodedBytes = Base64.getEncoder().encode("\"[]\"".getBytes(StandardCharsets.UTF_8));
        return new String(encodedBytes);
    }

}
