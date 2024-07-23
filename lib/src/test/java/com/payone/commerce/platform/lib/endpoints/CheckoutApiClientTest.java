package com.payone.commerce.platform.lib.endpoints;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.payone.commerce.platform.lib.ApiResponseException;
import com.payone.commerce.platform.lib.models.CheckoutResponse;
import com.payone.commerce.platform.lib.models.CreateCheckoutRequest;
import com.payone.commerce.platform.lib.models.CreateCheckoutResponse;
import com.payone.commerce.platform.lib.models.PatchCheckoutRequest;
import com.payone.commerce.platform.lib.testutils.ApiResponseMocks;
import com.payone.commerce.platform.lib.testutils.TestConfig;

import okhttp3.Response;

public class CheckoutApiClientTest {

    @Nested
    @DisplayName("createCheckoutRequest")
    class CreateCheckoutRequestTests {
        @Test
        @DisplayName("given request was successful, then return response")
        void createCheckoutRequestSuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient checkoutApiClient = spy(
                    new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
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

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
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

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
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

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
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
        void getCheckoutRequestSuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            CheckoutResponse expected = new CheckoutResponse();
            Response response = ApiResponseMocks.createResponse(200, new CheckoutResponse());

            doReturn(response).when(checkoutApiClient).getResponse(any());
            when(checkoutApiClient.getResponse(any())).thenReturn(response);

            CheckoutResponse res = checkoutApiClient.getCheckoutRequest("1", "2", "3");

            assertEquals(expected, res);

        }

        @Test
        @DisplayName("given request was unsuccessful (400), then throw exception")
        void getCheckoutRequestUnsuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
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
        void getCheckoutRequestUnsuccessful500() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
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
        void getCheckoutRequestNullParams() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));

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

    @Nested
    @DisplayName("getCheckoutsRequest")
    class getCheckoutsRequestTests {
        @Test
        @DisplayName("given request was successful, then return response")
        void getCheckoutsRequestSuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient checkoutApiClient = spy(
                    new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            List<CheckoutResponse> expected = Arrays.asList(new CheckoutResponse());
            Response response = ApiResponseMocks.createResponse(200, Arrays.asList(new CheckoutResponse()));

            doReturn(response).when(checkoutApiClient).getResponse(any());
            when(checkoutApiClient.getResponse(any())).thenReturn(response);

            List<CheckoutResponse> res = checkoutApiClient.getCheckoutsRequest("1");

            assertEquals(expected, res);

        }

        @Test
        @DisplayName("given request was unsuccessful (400), then throw exception")
        void getCheckoutsRequestUnsuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient checkoutApiClient = spy(
                    new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(checkoutApiClient).getResponse(any());

            try {
                checkoutApiClient.getCheckoutsRequest("1");
            } catch (ApiResponseException e) {
                int s = e.getResponse().getErrors().get(0).getHttpStatusCode();
                assertEquals(400, s);
            }
        }

        @Test
        @DisplayName("given request was unsuccessful (500), then throw exception")
        void getCheckoutsRequestUnsuccessful500() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient checkoutApiClient = spy(
                    new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(500);

            doReturn(response).when(checkoutApiClient).getResponse(any());

            try {
                checkoutApiClient.getCheckoutsRequest("1");
            } catch (RuntimeException e) {
                String m = e.getMessage();
                assertEquals("Api error: 500", m);
            }
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void getCheckoutsRequestNullParams() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient checkoutApiClient = spy(
                    new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));

            try {
                checkoutApiClient.getCheckoutsRequest(null);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Merchant ID is required", m);
            }

        }
    }

    @Nested
    @DisplayName("updateCheckoutRequest")
    class UpdateCheckoutRequestTests {
        @Test
        @DisplayName("given request was successful, then throw no exception")
        void updateCheckoutRequestSuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createResponse(200);

            doReturn(response).when(checkoutApiClient).getResponse(any());
            when(checkoutApiClient.getResponse(any())).thenReturn(response);

            PatchCheckoutRequest payload = new PatchCheckoutRequest();

            assertDoesNotThrow(() -> checkoutApiClient.updateCheckoutRequest("1", "2", "3", payload));

        }

        @Test
        @DisplayName("given request was unsuccessful (400), then throw exception")
        void updateCheckoutRequestUnsuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(checkoutApiClient).getResponse(any());

            try {

                PatchCheckoutRequest payload = new PatchCheckoutRequest();
                checkoutApiClient.updateCheckoutRequest("1", "2", "3", payload);
            } catch (ApiResponseException e) {
                int s = e.getResponse().getErrors().get(0).getHttpStatusCode();
                assertEquals(400, s);
            }
        }

        @Test
        @DisplayName("given request was unsuccessful (500), then throw exception")
        void updateCheckoutRequestUnsuccessful500() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(500);

            doReturn(response).when(checkoutApiClient).getResponse(any());

            try {
                PatchCheckoutRequest payload = new PatchCheckoutRequest();
                checkoutApiClient.updateCheckoutRequest("1", "2", "3", payload);
            } catch (RuntimeException e) {
                String m = e.getMessage();
                assertEquals("Api error: 500", m);
            }
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void updateCheckoutRequestNullParams() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));

            try {
                PatchCheckoutRequest payload = new PatchCheckoutRequest();
                checkoutApiClient.updateCheckoutRequest(null, "2", "3", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Merchant ID is required", m);
            }

            try {
                PatchCheckoutRequest payload = new PatchCheckoutRequest();
                checkoutApiClient.updateCheckoutRequest("1", null, "3", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Commerce Case ID is required", m);
            }

            try {
                PatchCheckoutRequest payload = new PatchCheckoutRequest();
                checkoutApiClient.updateCheckoutRequest("1", "2", null, payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Checkout ID is required", m);
            }
            try {
                checkoutApiClient.updateCheckoutRequest("1", "2", "3", null);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Payload is required", m);
            }
        }
    }

    @Nested
    @DisplayName("removeCheckoutRequest")
    class RemoveCheckoutRequestTests {
        @Test
        @DisplayName("given request was successful, then throw no exception")
        void removeCheckoutRequestSuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createResponse(200);

            doReturn(response).when(checkoutApiClient).getResponse(any());
            when(checkoutApiClient.getResponse(any())).thenReturn(response);

            assertDoesNotThrow(() -> checkoutApiClient.removeCheckoutRequest("1", "2", "3"));

        }

        @Test
        @DisplayName("given request was unsuccessful (400), then throw exception")
        void removeCheckoutRequestUnsuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(checkoutApiClient).getResponse(any());

            try {

                checkoutApiClient.removeCheckoutRequest("1", "2", "3");
            } catch (ApiResponseException e) {
                int s = e.getResponse().getErrors().get(0).getHttpStatusCode();
                assertEquals(400, s);
            }
        }

        @Test
        @DisplayName("given request was unsuccessful (500), then throw exception")
        void removeCheckoutRequestUnsuccessful500() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(500);

            doReturn(response).when(checkoutApiClient).getResponse(any());

            try {
                checkoutApiClient.removeCheckoutRequest("1", "2", "3");
            } catch (RuntimeException e) {
                String m = e.getMessage();
                assertEquals("Api error: 500", m);
            }
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void removeCheckoutRequestNullParams() throws InvalidKeyException, ApiResponseException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));

            try {
                checkoutApiClient.removeCheckoutRequest(null, "2", "3");
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Merchant ID is required", m);
            }

            try {
                checkoutApiClient.removeCheckoutRequest("1", null, "3");
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Commerce Case ID is required", m);
            }

            try {
                checkoutApiClient.removeCheckoutRequest("1", "2", null);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Checkout ID is required", m);
            }

        }
    }

}
