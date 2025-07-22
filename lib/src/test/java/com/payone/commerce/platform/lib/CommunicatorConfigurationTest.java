package com.payone.commerce.platform.lib;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import okhttp3.OkHttpClient;

class CommunicatorConfigurationTest {

    @Test
    void testHttpClientCustomization() {
        // Create configuration
        CommunicatorConfiguration config = new CommunicatorConfiguration("testKey", "testSecret", "test.host", "testIntegrator");
        
        // Initially, HTTP client should be null
        assertNull(config.getHttpClient());
        
        // Set custom HTTP client
        OkHttpClient customClient = new OkHttpClient.Builder()
                .connectTimeout(30, java.util.concurrent.TimeUnit.SECONDS)
                .build();
        config.setHttpClient(customClient);
        
        // Verify that the custom HTTP client is set correctly
        assertSame(customClient, config.getHttpClient());
    }
}