package com.payone.commerce.platform.lib.endpoints;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;
import java.security.InvalidKeyException;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

import com.payone.commerce.platform.lib.CommunicatorConfiguration;

import okhttp3.OkHttpClient;

class BaseApiClientTest {

    @Test
    void testClientSpecificHttpClientCustomization() throws InvalidKeyException {
        // Create a BaseApiClient with null configuration for testing
        BaseApiClient baseApiClient = new BaseApiClient();
        
        // Create a custom client
        OkHttpClient customClient = new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .build();
        
        // Set custom client
        baseApiClient.setHttpClient(customClient);
        
        // Verify that getClient returns the custom client we set
        assertSame(customClient, baseApiClient.getClient());
    }
    
    @Test
    void testGlobalHttpClientPriority() throws InvalidKeyException {
        // Create configuration with a global custom client
        CommunicatorConfiguration config = new CommunicatorConfiguration("testKey", "testSecret", "test.host", "testIntegrator");
        OkHttpClient globalClient = new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .build();
        config.setHttpClient(globalClient);
        
        // Create BaseApiClient with this configuration
        BaseApiClient baseApiClient = new BaseApiClient(config);
        
        // Create a client-specific custom client
        OkHttpClient clientSpecificClient = new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .build();
        
        // Set client-specific client
        baseApiClient.setHttpClient(clientSpecificClient);
        
        // Verify that getClient prioritizes the global client from config
        assertSame(globalClient, baseApiClient.getClient());
        assertNotSame(clientSpecificClient, baseApiClient.getClient());
    }
    
    @Test
    void testDefaultClientWhenNoneProvided() throws InvalidKeyException {
        // Create configuration without setting a global client
        CommunicatorConfiguration config = new CommunicatorConfiguration("testKey", "testSecret", "test.host", "testIntegrator");
        
        // Create BaseApiClient with this configuration
        BaseApiClient baseApiClient = new BaseApiClient(config);
        
        // Verify that getClient returns a default OkHttpClient instance
        assertNotNull(baseApiClient.getClient());
        assertTrue(baseApiClient.getClient() instanceof OkHttpClient);
    }
}