package com.payone.commerce.platform.lib.endpoints;

import java.io.IOException;
import java.security.InvalidKeyException;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.payone.commerce.platform.lib.ApiResponseException;
import com.payone.commerce.platform.lib.CommunicatorConfiguration;
import com.payone.commerce.platform.lib.RequestHeaderGenerator;
import com.payone.commerce.platform.lib.models.ErrorResponse;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public abstract class BaseApiClient {

    private final OkHttpClient client = new OkHttpClient();
    private final String JSON_PARSE_ERROR = "Excepted valid JSON response, but failed to parse";
    protected final JsonMapper JSON_MAPPER = new JsonMapper();
    protected final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    private final RequestHeaderGenerator requestHeaderGenerator;
    private final CommunicatorConfiguration config;

    public BaseApiClient(CommunicatorConfiguration config) throws InvalidKeyException {
        this.config = config;
        this.requestHeaderGenerator = new RequestHeaderGenerator(config);
        JSON_MAPPER.registerModule(new JavaTimeModule());

    }

    // only used for testsuite
    public BaseApiClient() {
        this.config = null;
        this.requestHeaderGenerator = null;
    }

    protected RequestHeaderGenerator getRequestHeaderGenerator() {
        return requestHeaderGenerator;
    }

    protected OkHttpClient getClient() {
        return client;
    }

    protected CommunicatorConfiguration getConfig() {
        return config;
    }

    protected JsonMapper getJsonMapper() {
        return JSON_MAPPER;
    }

    protected void makeApiCall(Request request) throws IOException, ApiResponseException {
        Response response = getResponse(request);
        handleError(response);
    }

    protected <T> T makeApiCall(Request request, TypeReference<T> valueTypeRef)
            throws IOException, ApiResponseException {
        Response response = getResponse(request);
        handleError(response);
        try {
            return getJsonMapper().readValue(response.body().string(), valueTypeRef);
        } catch (JsonMappingException e) {
            throw new RuntimeException(JSON_PARSE_ERROR, e);
        }
    }

    protected <T> T makeApiCall(Request request, Class<T> clazz) throws IOException, ApiResponseException {
        Response response = getResponse(request);
        handleError(response);
        try {
            return getJsonMapper().readValue(response.body().string(), clazz);
        } catch (JsonMappingException e) {
            throw new RuntimeException(JSON_PARSE_ERROR, e);
        }
    }

    private void handleError(Response response)
            throws ApiResponseException, IOException {
        if (response.isSuccessful()) {
            return;
        }
        if (response.code() != 400) {
            throw new RuntimeException("Api error: " + response.code());
        }
        try {
            ErrorResponse error = getJsonMapper().readValue(response.body().string(), ErrorResponse.class);
            throw new ApiResponseException(error);
        } catch (JsonMappingException e) {
            throw new RuntimeException(JSON_PARSE_ERROR, e);
        }

    }

    public Response getResponse(Request request) throws IOException {
        return this.getClient().newCall(request).execute();
    }

}
