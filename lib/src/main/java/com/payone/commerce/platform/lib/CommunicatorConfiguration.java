package com.payone.commerce.platform.lib;

import com.payone.commerce.platform.lib.utils.ServerMetaInfo;

public class CommunicatorConfiguration {
    private final String apiKey;
    private final String apiSecret;
    private final String host;
    private final ServerMetaInfo serverMetaInfo;

    public CommunicatorConfiguration(String apiKey, String apiSecret, String host, String integrator) {
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        this.host = host;
        this.serverMetaInfo = ServerMetaInfo.withDefaults(integrator);
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
}
