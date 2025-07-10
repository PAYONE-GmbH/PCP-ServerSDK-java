package com.payone.commerce.platform.lib.endpoints;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.security.InvalidKeyException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.payone.commerce.platform.lib.CommunicatorConfiguration;
import com.payone.commerce.platform.lib.models.AuthenticationToken;

public class AuthenticationApiClientTest {
    private CommunicatorConfiguration config;
    private AuthenticationApiClient client;

    @BeforeEach
    void setUp() throws InvalidKeyException {
        config = mock(CommunicatorConfiguration.class);
        when(config.getHost()).thenReturn("api.testhost.com");
        when(config.getApiKey()).thenReturn("dummy-key");
        when(config.getApiSecret()).thenReturn("dummy-secret");
        client = new AuthenticationApiClient(config);
    }

    @Test
    void testGetAuthenticationTokens_NullMerchantId_ThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            client.getAuthenticationTokens(null, null);
        });
        System.out.println("Exception message: " + exception.getMessage());
        // Check the actual message for debugging
        assertNotNull(exception.getMessage());
        assertEquals("Merchant ID is required", exception.getMessage());
    }

    @Test
    void testGetAuthenticationTokens_ValidMerchantId_ReturnsToken() throws Exception {
        // Arrange
        AuthenticationApiClient spyClient = org.mockito.Mockito.spy(client);
        AuthenticationToken mockToken = new AuthenticationToken();
        mockToken.setToken("jwt-token");
        mockToken.setId(java.util.UUID.randomUUID());
        mockToken.setCreationDate(java.time.OffsetDateTime.now());
        mockToken.setExpirationDate(java.time.OffsetDateTime.now().plusHours(1));
        org.mockito.Mockito.doReturn(mockToken)
                .when(spyClient)
                .makeApiCall(org.mockito.Mockito.any(), org.mockito.Mockito.eq(AuthenticationToken.class));

        // Act
        AuthenticationToken result = spyClient.getAuthenticationTokens("merchant-123", null);

        // Assert
        assertNotNull(result);
        assertEquals("jwt-token", result.getToken());
        assertNotNull(result.getId());
        assertNotNull(result.getCreationDate());
        assertNotNull(result.getExpirationDate());
    }

    @Test
    void testGetAuthenticationTokens_ValidMerchantId_WithRequestId_ReturnsToken() throws Exception {
        // Arrange
        AuthenticationApiClient spyClient = org.mockito.Mockito.spy(client);
        AuthenticationToken mockToken = new AuthenticationToken();
        mockToken.setToken("jwt-token");
        mockToken.setId(java.util.UUID.randomUUID());
        mockToken.setCreationDate(java.time.OffsetDateTime.now());
        mockToken.setExpirationDate(java.time.OffsetDateTime.now().plusHours(1));
        org.mockito.Mockito.doReturn(mockToken)
                .when(spyClient)
                .makeApiCall(org.mockito.Mockito.any(), org.mockito.Mockito.eq(AuthenticationToken.class));
        String requestId = "request-id-123";
        // Act
        AuthenticationToken result = spyClient.getAuthenticationTokens("merchant-123", requestId);
        // Assert
        assertNotNull(result);
        assertEquals("jwt-token", result.getToken());
        assertNotNull(result.getId());
        assertNotNull(result.getCreationDate());
        assertNotNull(result.getExpirationDate());
        // Verify that the request was made with the correct headers
        org.mockito.Mockito.verify(spyClient).makeApiCall(
                org.mockito.Mockito.argThat(request -> request.header("X-Request-ID").equals(requestId)),
                org.mockito.Mockito.eq(AuthenticationToken.class));
    }

}
