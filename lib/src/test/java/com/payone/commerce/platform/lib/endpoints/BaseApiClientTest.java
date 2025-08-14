package com.payone.commerce.platform.lib.endpoints;

import static org.junit.jupiter.api.Assertions.*;

import java.security.InvalidKeyException;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

import com.payone.commerce.platform.lib.CommunicatorConfiguration;

import okhttp3.OkHttpClient;

class BaseApiClientTest {

    @Test
    void testClientSpecificHttpClientCustomization() throws InvalidKeyException {
        // Create a BaseApiClient with configuration
        CommunicatorConfiguration config = new CommunicatorConfiguration("testKey", "testSecret", "test.host", "testIntegrator");
        BaseApiClient baseApiClient = new BaseApiClient(config);

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
    void testClientSpecificHttpClientPriority() throws InvalidKeyException {
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

        // Verify that getClient prioritizes the client-specific client over global client
        assertSame(clientSpecificClient, baseApiClient.getClient());
        assertNotSame(globalClient, baseApiClient.getClient());
    }
    
    @Test
    void testGlobalHttpClientWhenNoClientSpecific() throws InvalidKeyException {
        // Create configuration with a global custom client
        CommunicatorConfiguration config = new CommunicatorConfiguration("testKey", "testSecret", "test.host", "testIntegrator");
        OkHttpClient globalClient = new OkHttpClient.Builder()
                .connectTimeout(45, TimeUnit.SECONDS)
                .build();
        config.setHttpClient(globalClient);

        // Create BaseApiClient with this configuration (no client-specific client set)
        BaseApiClient baseApiClient = new BaseApiClient(config);

        // Verify that getClient returns the global client when no client-specific client is set
        assertSame(globalClient, baseApiClient.getClient());
    }

    @Test
    void testDefaultClientFromConfiguration() throws InvalidKeyException {
        // Create configuration (which now provides a default client automatically)
        CommunicatorConfiguration config = new CommunicatorConfiguration("testKey", "testSecret", "test.host", "testIntegrator");

        // Create BaseApiClient with this configuration
        BaseApiClient baseApiClient = new BaseApiClient(config);

        // Verify that getClient returns the default OkHttpClient from configuration
        assertNotNull(baseApiClient.getClient());
        assertTrue(baseApiClient.getClient() instanceof OkHttpClient);
        assertSame(config.getHttpClient(), baseApiClient.getClient());
    }
}