package com.payone.commerce.platform.lib.errors;

import java.util.Collections;
import java.util.List;

import com.payone.commerce.platform.lib.models.APIError;

public class ApiErrorResponseException extends ApiException {
    private final List<APIError> errors;

    public ApiErrorResponseException(int statusCode, String responseBody, List<APIError> errors, Throwable cause) {
        super(statusCode, responseBody, cause);
        this.errors = errors == null ? Collections.emptyList() : errors;
    }

    public ApiErrorResponseException(int statusCode, String responseBody, List<APIError> errors) {
        super(statusCode, responseBody, null);
        this.errors = errors == null ? Collections.emptyList() : errors;
    }

    public List<APIError> getErrors() {
        return errors;
    }
}
