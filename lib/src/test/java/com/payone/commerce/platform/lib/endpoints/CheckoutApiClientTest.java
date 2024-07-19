package com.payone.commerce.platform.lib.endpoints;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.security.InvalidKeyException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.payone.commerce.platform.lib.ApiResponseException;
import com.payone.commerce.platform.lib.CommunicatorConfiguration;
import com.payone.commerce.platform.lib.models.CheckoutResponse;
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

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(CONFIG));
            CreateCheckoutResponse expected = new CreateCheckoutResponse();
            Response response = ApiResponseMocks.createResponse(200, new CreateCheckoutResponse());

            doReturn(response).when(checkoutApiClient).getResponse(any());
            when(checkoutApiClient.getResponse(any())).thenReturn(response);

            CreateCheckoutRequest payload = new CreateCheckoutRequest();
            CreateCheckoutResponse res = checkoutApiClient.createCheckoutRequest("1", "2", payload);

            assertEquals(expected, res);

        }

        @Test
        @DisplayName("given request was unsuccessful (400), then throw exception")
        void createCheckoutRequestUnsuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(checkoutApiClient).getResponse(any());

            CreateCheckoutRequest payload = new CreateCheckoutRequest();
            try {
                checkoutApiClient.createCheckoutRequest("1", "2", payload);
            } catch (ApiResponseException e) {
                int s = e.getResponse().getErrors().get(0).getHttpStatusCode();
                assertEquals(400, s);
            }
        }

        @Test
        @DisplayName("given request was unsuccessful (500), then throw exception")
        void createCheckoutRequestUnsuccessful500() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(500);

            doReturn(response).when(checkoutApiClient).getResponse(any());

            CreateCheckoutRequest payload = new CreateCheckoutRequest();
            try {
                checkoutApiClient.createCheckoutRequest("1", "2", payload);
            } catch (RuntimeException e) {
                String m = e.getMessage();
                assertEquals("Api error: 500", m);
            }
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void createCheckoutRequestNullParams() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(CONFIG));
            CreateCheckoutRequest payload = new CreateCheckoutRequest();

            try {
                checkoutApiClient.createCheckoutRequest(null, "2", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Merchant ID is required", m);
            }

            try {
                checkoutApiClient.createCheckoutRequest("1", null, payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Commerce Case ID is required", m);
            }

            try {
                checkoutApiClient.createCheckoutRequest("1", "2", null);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Payload is required", m);
            }
        }
    }

    @Nested
    @DisplayName("getCheckoutRequest")
    class GetCheckoutRequestTests {
        @Test
        @DisplayName("given request was successful, then return response")
        void createCheckoutRequestSuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(CONFIG));
            CheckoutResponse expected = new CheckoutResponse();
            Response response = ApiResponseMocks.createResponse(200, new CheckoutResponse());

            doReturn(response).when(checkoutApiClient).getResponse(any());
            when(checkoutApiClient.getResponse(any())).thenReturn(response);

            CheckoutResponse res = checkoutApiClient.getCheckoutRequest("1", "2", "3");

            assertEquals(expected, res);

        }

        @Test
        @DisplayName("given request was unsuccessful (400), then throw exception")
        void createCheckoutRequestUnsuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(checkoutApiClient).getResponse(any());

            try {
                checkoutApiClient.getCheckoutRequest("1", "2", "3");
            } catch (ApiResponseException e) {
                int s = e.getResponse().getErrors().get(0).getHttpStatusCode();
                assertEquals(400, s);
            }
        }

        @Test
        @DisplayName("given request was unsuccessful (500), then throw exception")
        void createCheckoutRequestUnsuccessful500() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(500);

            doReturn(response).when(checkoutApiClient).getResponse(any());

            try {
                checkoutApiClient.getCheckoutRequest("1", "2", "3");
            } catch (RuntimeException e) {
                String m = e.getMessage();
                assertEquals("Api error: 500", m);
            }
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void createCheckoutRequestNullParams() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(CONFIG));

            try {
                checkoutApiClient.getCheckoutRequest(null, "2", "3");
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Merchant ID is required", m);
            }

            try {
                checkoutApiClient.getCheckoutRequest("1", null, "3");
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Commerce Case ID is required", m);
            }

            try {
                checkoutApiClient.getCheckoutRequest("1", "2", null);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Checkout ID is required", m);
            }
        }
    }

}
