package com.payone.commerce.platform.lib;

import java.util.Date;

import okhttp3.Headers;
import okhttp3.Headers.Builder;
import okhttp3.Request;

public class RequestHeaderGenerator {

    private final CommunicatorConfiguration config;

    public RequestHeaderGenerator(CommunicatorConfiguration config) {
        this.config = config;
    }

    public Request generateAdditionalRequestHeaders(Request request) throws Exception {
        Headers headers = request.headers();
        Builder headersBuilder = headers.newBuilder();
        Date date = new Date();
        if (headersBuilder.get("Date") == null) {
            headersBuilder.add("Date", date);
        }
        // if (headersBuilder.get("X-GCS-ServerMetaInfo") == null) {
        // // TODO: Add the server meta info
        // headersBuilder.add("X-GCS-ServerMetaInfo", "java");
        // }
        // if (headersBuilder.get("X-GCS-ClientMetaInfo") == null) {
        // // TODO: Add the server meta info
        // headersBuilder.add("X-GCS-ClientMetaInfo", "java");
        // }
        if (headersBuilder.get("Authorization") == null) {
            headersBuilder.add("Authorization", getAuthHeader(request, date));
        }

        Headers newHeaders = headersBuilder.build();
        return request.newBuilder().headers(newHeaders).build();

    }

    private String getAuthHeader(Request request, Date date) throws Exception {
        HmacSignatureGenerator hmacSignatureGenerator = HmacSignatureGenerator
                .withSecret(this.config.getApiSecret());

        String signature = hmacSignatureGenerator.generate(request.method(), date,
                request.url().encodedPath().toString());
        String authHeader = String.format("GCS v1HMAC:%s:%s", config.getApiKey(), signature);
        System.out.println(authHeader);
        return authHeader;

    }

}
