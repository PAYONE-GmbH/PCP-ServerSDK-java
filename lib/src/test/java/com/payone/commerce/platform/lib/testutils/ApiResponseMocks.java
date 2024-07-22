package com.payone.commerce.platform.lib.testutils;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.payone.commerce.platform.lib.models.APIError;
import com.payone.commerce.platform.lib.models.ErrorResponse;

import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class ApiResponseMocks {
    public static <T> Response createResponse(int statusCode, T clazz) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(clazz);

        return new Response.Builder()
                .request(new Request.Builder().url("https://some-url.com").build())
                .protocol(Protocol.HTTP_2)
                .code(statusCode)
                .message("")
                .body(ResponseBody.create(
                        jsonString,
                        MediaType.get("application/json; charset=utf-8")))
                .build();
    }

    public static Response createResponse(int statusCode) {
        return new Response.Builder()
                .request(new Request.Builder().url("https://some-url.com").build())
                .protocol(Protocol.HTTP_2)
                .code(statusCode)
                .message("")
                .build();
    }

    public static Response createErrorResponse(int statusCode) throws JsonProcessingException {
        APIError apiError = new APIError();
        apiError.setHttpStatusCode(statusCode);
        return createErrorResponse(statusCode, apiError);
    }

    public static Response createErrorResponse(int statusCode, APIError apiError) throws JsonProcessingException {
        return createErrorResponse(statusCode, List.of(apiError));
    }

    public static Response createErrorResponse(int statusCode, List<APIError> apiErrors)
            throws JsonProcessingException {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setErrors(apiErrors);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(errorResponse);

        return new Response.Builder()
                .request(new Request.Builder().url("https://some-url.com").build())
                .protocol(Protocol.HTTP_2)
                .code(statusCode)
                .message("")
                .body(ResponseBody.create(jsonString,
                        MediaType.get("application/json; charset=utf-8")))
                .build();
    }
}
