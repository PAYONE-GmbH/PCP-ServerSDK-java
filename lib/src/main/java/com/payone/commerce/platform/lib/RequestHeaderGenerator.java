package com.payone.commerce.platform.lib;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.List;
import java.util.Date;

// import com.fasterxml.jackson.core.JsonProcessingException;
// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.payone.commerce.platform.lib.utils.ServerMetaInfo;
// import java.util.Base64;
// import java.nio.charset.StandardCharsets;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import okhttp3.Headers;
import okhttp3.Headers.Builder;
import okhttp3.Request;

public class RequestHeaderGenerator {
    private static final String ALGORITHM = "HmacSHA256";

    private final CommunicatorConfiguration config;
    private final String DATE_HEADER_NAME = "Date";
    // private final String SERVER_META_INFO_HEADER_NAME = "X-GCS-ServerMetaInfo";
    // private final String CLIENT_META_INFO_HEADER_NAME = "X-GCS-ClientMetaInfo";
    private final String AUTHORIZATION_HEADER_NAME = "Authorization";
    private final Mac mac;

    public RequestHeaderGenerator(CommunicatorConfiguration config) throws InvalidKeyException {
        this.config = config;

        try {
            this.mac = Mac.getInstance(RequestHeaderGenerator.ALGORITHM);
            SecretKeySpec secretKeySpec = new SecretKeySpec(config.getApiSecret().getBytes(StandardCharsets.UTF_8),
                    ALGORITHM);
            this.mac.init(secretKeySpec);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("HmacSHA256 must be available to use the PCP Java SDK", e);
        }
    }

    public Request generateAdditionalRequestHeaders(Request request) throws Exception {
        Headers headers = request.headers();
        Builder headersBuilder = headers.newBuilder();
        Date date = new Date();
        if (headersBuilder.get(DATE_HEADER_NAME) == null) {
            headersBuilder.add(DATE_HEADER_NAME, date);
        }
        // if (headersBuilder.get(SERVER_META_INFO_HEADER_NAME) == null) {
        // headersBuilder.add(SERVER_META_INFO_HEADER_NAME, getServerMetaInfo());
        // }
        // if (headersBuilder.get(CLIENT_META_INFO_HEADER_NAME) == null) {
        // headersBuilder.add(CLIENT_META_INFO_HEADER_NAME, getClientMetaInfo());
        // }
        if (headersBuilder.get(AUTHORIZATION_HEADER_NAME) == null) {
            headersBuilder.add(AUTHORIZATION_HEADER_NAME, getAuthHeader(request, headersBuilder));
        }

        Headers newHeaders = headersBuilder.build();
        return request.newBuilder().headers(newHeaders).build();

    }

    private String getAuthHeader(Request request, Builder headersBuilder) throws Exception {
        String contentType = "";
        if (headersBuilder.get("Content-Type") != null) {
            contentType = headersBuilder.get("Content-Type");
        }
        List<String> orderedSignData = List.of(request.method(), contentType,
                headersBuilder.get("Date"),
                request.url().encodedPath().toString());
        String stringToSign = String.join("\n", orderedSignData) + "\n";
        String signature = this.sign(stringToSign);
        return String.format("GCS v1HMAC:%s:%s", config.getApiKey(), signature);
    }

    private String sign(String target) {
        byte[] hash = this.mac.doFinal(target.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(hash);
    }

    // private String getServerMetaInfo() throws JsonProcessingException {
    // ServerMetaInfo meta = new ServerMetaInfo();
    // ObjectMapper objectMapper = new ObjectMapper();
    // String jsonString = objectMapper.writeValueAsString(meta);
    // byte[] encodedBytes =
    // Base64.getEncoder().encode(jsonString.getBytes(StandardCharsets.UTF_8));
    // return new String(encodedBytes);
    // }

    // private String getClientMetaInfo() {
    // byte[] encodedBytes =
    // Base64.getEncoder().encode("\"[]\"".getBytes(StandardCharsets.UTF_8));
    // return new String(encodedBytes);
    // }

}
