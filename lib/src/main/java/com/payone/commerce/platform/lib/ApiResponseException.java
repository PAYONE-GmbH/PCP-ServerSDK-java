package com.payone.commerce.platform.lib;

import com.payone.commerce.platform.lib.models.ErrorResponse;

public class ApiResponseException extends Exception {
    private final ErrorResponse response;

    public ApiResponseException(ErrorResponse response) {
        this.response = response;
    }

    public ErrorResponse getResponse() {
        return response;
    }
}
