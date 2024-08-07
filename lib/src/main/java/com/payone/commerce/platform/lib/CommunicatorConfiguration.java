package com.payone.commerce.platform.lib;

public class CommunicatorConfiguration {
    private final String apiKey;
    private final String apiSecret;
    private final String host;
    private final String integrator;

    public CommunicatorConfiguration(String apiKey, String apiSecret, String host, String integrator) {
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        this.host = host;
        this.integrator = integrator;
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

    public String getIntegrator() {
        return integrator;
    }
}
