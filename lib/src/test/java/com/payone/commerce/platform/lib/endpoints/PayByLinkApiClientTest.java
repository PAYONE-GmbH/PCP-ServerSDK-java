package com.payone.commerce.platform.lib.endpoints;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import java.io.IOException;
import java.security.InvalidKeyException;

import org.junit.jupiter.api.Test;

import com.payone.commerce.platform.lib.errors.ApiException;
import com.payone.commerce.platform.lib.models.CreatePayByLinkRequest;
import com.payone.commerce.platform.lib.models.CreatePayByLinkResponse;
import com.payone.commerce.platform.lib.testutils.ApiResponseMocks;
import com.payone.commerce.platform.lib.testutils.TestConfig;

import okhttp3.Response;

class PayByLinkApiClientTest {
        @Test
        void createPayByLinkReturnsResponse() throws InvalidKeyException, ApiException, IOException {
                PayByLinkApiClient client = spy(new PayByLinkApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
                Response response = ApiResponseMocks.createResponse(201, new CreatePayByLinkResponse());
                doReturn(response).when(client).getResponse(any());

                CreatePayByLinkResponse result = client.createPayByLink("merchant", "case", "checkout",
                                new CreatePayByLinkRequest());

                assertEquals(new CreatePayByLinkResponse(), result);
        }

        @Test
        void createPayByLinkRequiresParameters() throws InvalidKeyException {
                PayByLinkApiClient client = new PayByLinkApiClient(TestConfig.COMMUNICATOR_CONFIGURATION);
                CreatePayByLinkRequest payload = new CreatePayByLinkRequest();

                assertEquals("Merchant ID is required", assertThrows(IllegalArgumentException.class,
                                () -> client.createPayByLink(null, "case", "checkout", payload)).getMessage());
                assertEquals("Commerce Case ID is required", assertThrows(IllegalArgumentException.class,
                                () -> client.createPayByLink("merchant", null, "checkout", payload)).getMessage());
                assertEquals("Checkout ID is required", assertThrows(IllegalArgumentException.class,
                                () -> client.createPayByLink("merchant", "case", null, payload)).getMessage());
                assertEquals("Payload is required", assertThrows(IllegalArgumentException.class,
                                () -> client.createPayByLink("merchant", "case", "checkout", null)).getMessage());
        }
}
