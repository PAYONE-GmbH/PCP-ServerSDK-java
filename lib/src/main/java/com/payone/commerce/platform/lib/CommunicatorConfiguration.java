package com.payone.commerce.platform.lib;

public class CommunicatorConfiguration {
    public final String apiKey;
    public final String apiSecret;

    public CommunicatorConfiguration(String apiKey, String apiSecret) {
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getApiSecret() {
        return apiSecret;
    }
}
