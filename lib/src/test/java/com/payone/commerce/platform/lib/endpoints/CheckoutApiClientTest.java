package com.payone.commerce.platform.lib.endpoints;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import java.io.IOException;
import java.security.InvalidKeyException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.payone.commerce.platform.lib.ApiResponseException;
import com.payone.commerce.platform.lib.CommunicatorConfiguration;
import com.payone.commerce.platform.lib.models.CreateCheckoutRequest;
import com.payone.commerce.platform.lib.models.CreateCheckoutResponse;
import com.payone.commerce.platform.lib.testutils.ApiResponseMocks;

import okhttp3.Response;

public class CheckoutApiClientTest {

    private final String TEST_KEY = "KEY";
    private final String TEST_SECRET = "Super duper Ethan Hunt level secret";
    private final CommunicatorConfiguration CONFIG = new CommunicatorConfiguration(TEST_KEY, TEST_SECRET,
            "awesome-api.com");

    @Nested
    @DisplayName("createCheckoutRequest")
    class CreateCheckoutRequestTests {
        @Test
        @DisplayName("given request was successful, then return response")
        void createCheckoutRequestSuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient baseApiClient = spy(new CheckoutApiClient(CONFIG));
            CreateCheckoutResponse expected = new CreateCheckoutResponse();
            Response response = ApiResponseMocks.createResponse(200, new CreateCheckoutResponse());

            doReturn(response).when(baseApiClient).getResponse(any());

            CreateCheckoutRequest payload = new CreateCheckoutRequest();
            CreateCheckoutResponse res = baseApiClient.createCheckoutRequest("1", "2", payload);

            assertEquals(expected, res);

        }

        @Test
        @DisplayName("given request was unsuccessful (400), then throw exception")
        void createCheckoutRequestUnsuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient baseApiClient = spy(new CheckoutApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(baseApiClient).getResponse(any());

            CreateCheckoutRequest payload = new CreateCheckoutRequest();
            try {
                baseApiClient.createCheckoutRequest("1", "2", payload);
            } catch (ApiResponseException e) {
                int s = e.getResponse().getErrors().get(0).getHttpStatusCode();
                assertEquals(400, s);
            }
        }

        @Test
        @DisplayName("given request was unsuccessful (500), then throw exception")
        void createCheckoutRequestUnsuccessful500() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient baseApiClient = spy(new CheckoutApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(500);

            doReturn(response).when(baseApiClient).getResponse(any());

            CreateCheckoutRequest payload = new CreateCheckoutRequest();
            try {
                baseApiClient.createCheckoutRequest("1", "2", payload);
            } catch (RuntimeException e) {
                String m = e.getMessage();
                assertEquals("Api error: 500", m);
            }
        }
    }

}
