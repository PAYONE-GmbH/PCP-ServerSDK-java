package com.payone.commerce.platform.lib;

public enum HttpMethod {
    GET,
    POST,
    PUT,
    DELETE,
    HEAD,
    OPTIONS,
    TRACE,
    PATCH;

    @Override
    public String toString() {
        return name();
    }
}
