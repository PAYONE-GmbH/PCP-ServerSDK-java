package com.payone.commerce.platform.lib.endpoints;

import java.io.IOException;
import java.security.InvalidKeyException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.payone.commerce.platform.lib.CommunicatorConfiguration;
import com.payone.commerce.platform.lib.RequestHeaderGenerator;
import com.payone.commerce.platform.lib.errors.ApiErrorResponseException;
import com.payone.commerce.platform.lib.errors.ApiResponseRetrievalException;
import com.payone.commerce.platform.lib.models.ErrorResponse;
import com.payone.commerce.platform.lib.serializer.JsonSerializer;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class BaseApiClient {
    private static final String JSON_PARSE_ERROR = "Excepted valid JSON response, but failed to parse";
    protected static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    private final OkHttpClient client = new OkHttpClient();
    private final RequestHeaderGenerator requestHeaderGenerator;
    private final CommunicatorConfiguration config;

    public BaseApiClient(CommunicatorConfiguration config) throws InvalidKeyException {
        this.config = config;
        this.requestHeaderGenerator = new RequestHeaderGenerator(config);
    }

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

    protected void makeApiCall(Request request)
            throws IOException, ApiErrorResponseException, ApiResponseRetrievalException {
        request = this.getRequestHeaderGenerator().generateAdditionalRequestHeaders(request);
        Response response = getResponse(request);
        handleError(response);
    }

    protected <T> T makeApiCall(Request request, TypeReference<T> valueTypeRef)
            throws IOException, ApiErrorResponseException, ApiResponseRetrievalException {
        request = this.getRequestHeaderGenerator().generateAdditionalRequestHeaders(request);
        Response response = getResponse(request);
        handleError(response);
        try {
            return JsonSerializer.deserializeFromJson(response.body().string(), valueTypeRef);
        } catch (JsonMappingException e) {
            throw new AssertionError(JSON_PARSE_ERROR, e);
        }
    }

    protected <T> T makeApiCall(Request request, Class<T> clazz)
            throws IOException, ApiErrorResponseException, ApiResponseRetrievalException {
        request = this.getRequestHeaderGenerator().generateAdditionalRequestHeaders(request);
        Response response = getResponse(request);
        handleError(response);
        try {
            return JsonSerializer.deserializeFromJson(response.body().string(), clazz);
        } catch (JsonMappingException e) {
            throw new AssertionError(JSON_PARSE_ERROR, e);
        }
    }

    private void handleError(Response response)
            throws ApiErrorResponseException, ApiResponseRetrievalException, IOException {
        if (response.isSuccessful()) {
            return;
        }

        String responseBody = response.body().string();
        if (responseBody == null || responseBody.isEmpty()) {
            throw new ApiResponseRetrievalException(response.code(), responseBody);
        }
        try {
            ErrorResponse error = JsonSerializer.deserializeFromJson(responseBody, ErrorResponse.class);
            throw new ApiErrorResponseException(response.code(), responseBody, error.getErrors());
        } catch (JsonProcessingException e) {
            throw new ApiResponseRetrievalException(response.code(), responseBody, e);
        }
    }

    public Response getResponse(Request request) throws IOException {
        return this.getClient().newCall(request).execute();
    }

}
