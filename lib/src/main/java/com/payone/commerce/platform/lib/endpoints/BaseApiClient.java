/*
 * This source file was generated by the Gradle 'init' task
 */

package com.payone.commerce.platform.lib.endpoints;

import java.security.InvalidKeyException;

import com.payone.commerce.platform.lib.CommunicatorConfiguration;
import com.payone.commerce.platform.lib.RequestHeaderGenerator;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class BaseApiClient {

    private final OkHttpClient client = new OkHttpClient();
    protected static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    private final RequestHeaderGenerator requestHeaderGenerator;

    public BaseApiClient(CommunicatorConfiguration config) throws InvalidKeyException {
        this.requestHeaderGenerator = new RequestHeaderGenerator(config);
    }

    protected RequestHeaderGenerator getRequestHeaderGenerator() {
        return requestHeaderGenerator;
    }

    protected OkHttpClient getClient() {
        return client;
    }

    protected Response makeApiCall(Request request) throws Exception {
        Response response = this.getClient().newCall(request).execute();

        if (!response.isSuccessful()) {
            throw new Exception("Unexpected code " + response);
        }

        return response;
    }

}
