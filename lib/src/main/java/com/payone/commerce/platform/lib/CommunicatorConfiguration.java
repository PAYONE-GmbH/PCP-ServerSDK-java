package com.payone.commerce.platform.lib;

public class CommunicatorConfiguration {
    private final String apiKey;
    private final String apiSecret;
    private final String host;

    public CommunicatorConfiguration(String apiKey, String apiSecret, String host) {
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        this.host = host;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getApiSecret() {
        return apiSecret;
    }

    public String getHost() {
        return host;
    }
}
