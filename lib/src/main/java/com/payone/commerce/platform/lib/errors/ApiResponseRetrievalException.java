package com.payone.commerce.platform.lib.errors;

public class ApiResponseRetrievalException extends ApiException {
    public ApiResponseRetrievalException(int statusCode, String responseBody, Throwable cause) {
        super(statusCode, responseBody, cause);
    }

    public ApiResponseRetrievalException(int statusCode, String responseBody) {
        super(statusCode, responseBody, null);
    }
}
