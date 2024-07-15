package com.payone.commerce.platform.lib;

import java.util.Date;

// import com.fasterxml.jackson.core.JsonProcessingException;
// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.payone.commerce.platform.lib.utils.ServerMetaInfo;
// import java.util.Base64;
// import java.nio.charset.StandardCharsets;

import okhttp3.Headers;
import okhttp3.Headers.Builder;
import okhttp3.Request;

public class RequestHeaderGenerator {

    private final CommunicatorConfiguration config;
    private final String DATE_HEADER_NAME = "Date";
    // private final String SERVER_META_INFO_HEADER_NAME = "X-GCS-ServerMetaInfo";
    // private final String CLIENT_META_INFO_HEADER_NAME = "X-GCS-ClientMetaInfo";
    private final String AUTHORIZATION_HEADER_NAME = "Authorization";

    public RequestHeaderGenerator(CommunicatorConfiguration config) {
        this.config = config;
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
            headersBuilder.add(AUTHORIZATION_HEADER_NAME, getAuthHeader(request, date));
        }

        Headers newHeaders = headersBuilder.build();
        return request.newBuilder().headers(newHeaders).build();

    }

    private String getAuthHeader(Request request, Date date) throws Exception {
        HmacSignatureGenerator hmacSignatureGenerator = HmacSignatureGenerator
                .withSecret(this.config.getApiSecret());

        String signature = hmacSignatureGenerator.generate(request.method(), date,
                request.url().encodedPath().toString());
        return String.format("GCS v1HMAC:%s:%s", config.getApiKey(), signature);
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
