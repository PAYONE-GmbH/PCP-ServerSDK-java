package com.payone.commerce.platform.lib.utils;

import java.util.Map;

/**
 * Interface for classes can be used to configure query parameters for API
 * requests
 */
public interface QueryConfig {
    /**
     * Convert the object to a map of query unencoded parameters. The parameters are
     * meant to be used in OkHttp's HttpUrl.Builder
     * 
     * @return Map of unencoded query parameters
     */
    public Map<String, String> toQueryMap();
}
