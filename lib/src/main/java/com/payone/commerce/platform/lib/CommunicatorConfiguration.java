package com.payone.commerce.platform.lib;

import com.payone.commerce.platform.lib.utils.ServerMetaInfo;

import okhttp3.OkHttpClient;

public class CommunicatorConfiguration {
    private final String apiKey;
    private final String apiSecret;
    private final String host;
    private final ServerMetaInfo serverMetaInfo;
    private OkHttpClient httpClient;

    public CommunicatorConfiguration(String apiKey, String apiSecret, String host, String integrator) {
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        this.host = host;
        this.serverMetaInfo = ServerMetaInfo.withDefaults(integrator);
        this.httpClient = null;
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

    public ServerMetaInfo getServerMetaInfo() {
        return serverMetaInfo;
    }

    public OkHttpClient getHttpClient() {
        return httpClient;
    }
    
    public void setHttpClient(OkHttpClient httpClient) {
        this.httpClient = httpClient;
    }
}
