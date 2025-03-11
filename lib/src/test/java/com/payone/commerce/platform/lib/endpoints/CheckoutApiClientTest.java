package com.payone.commerce.platform.lib.endpoints;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.security.InvalidKeyException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.payone.commerce.platform.lib.errors.ApiErrorResponseException;
import com.payone.commerce.platform.lib.errors.ApiException;
import com.payone.commerce.platform.lib.errors.ApiResponseRetrievalException;
import com.payone.commerce.platform.lib.models.CheckoutResponse;
import com.payone.commerce.platform.lib.models.CheckoutsResponse;
import com.payone.commerce.platform.lib.models.CompleteOrderRequest;
import com.payone.commerce.platform.lib.models.CompletePaymentResponse;
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
        void createCheckoutRequestSuccessful() throws InvalidKeyException, ApiException, IOException {

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
        void createCheckoutRequestUnsuccessful() throws InvalidKeyException, IOException {
            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(checkoutApiClient).getResponse(any());

            CreateCheckoutRequest payload = new CreateCheckoutRequest();

            ApiErrorResponseException e = assertThrows(ApiErrorResponseException.class, () -> {
                checkoutApiClient.createCheckoutRequest("1", "2", payload);
            });
            assertEquals(400, e.getStatusCode());
        }

        @Test
        @DisplayName("given request was unsuccessful (500) with an empty body, then throw exception")
        void createCheckoutRequestUnsuccessful500() throws InvalidKeyException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createEmptyErrorResponse(500);

            doReturn(response).when(checkoutApiClient).getResponse(any());

            CreateCheckoutRequest payload = new CreateCheckoutRequest();
            ApiResponseRetrievalException e = assertThrows(ApiResponseRetrievalException.class, () -> {
                checkoutApiClient.createCheckoutRequest("1", "2", payload);
            });
            assertEquals(500, e.getStatusCode());
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void createCheckoutRequestNullParams() throws InvalidKeyException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            CreateCheckoutRequest payload = new CreateCheckoutRequest();

            IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
                checkoutApiClient.createCheckoutRequest(null, "2", payload);
            });
            String m = e.getMessage();
            assertEquals("Merchant ID is required", m);

            e = assertThrows(IllegalArgumentException.class,
                    () -> checkoutApiClient.createCheckoutRequest("1", null, payload));
            m = e.getMessage();
            assertEquals("Commerce Case ID is required", m);

            e = assertThrows(IllegalArgumentException.class,
                    () -> checkoutApiClient.createCheckoutRequest("1", "2", null));
            m = e.getMessage();
            assertEquals("Payload is required", m);
        }
    }

    @Nested
    @DisplayName("getCheckoutRequest")
    class GetCheckoutRequestTests {
        @Test
        @DisplayName("given request was successful, then return response")
        void getCheckoutRequestSuccessful() throws InvalidKeyException, ApiException, IOException {

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
        void getCheckoutRequestUnsuccessful() throws InvalidKeyException, IOException {
            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(checkoutApiClient).getResponse(any());

            ApiErrorResponseException e = assertThrows(ApiErrorResponseException.class, () -> {
                checkoutApiClient.getCheckoutRequest("1", "2", "3");
            });
            int s = e.getErrors().get(0).getHttpStatusCode();
            assertEquals(400, s);
        }

        @Test
        @DisplayName("given request was unsuccessful (500), then throw exception")
        void getCheckoutRequestUnsuccessful500() throws InvalidKeyException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createEmptyErrorResponse(500);

            doReturn(response).when(checkoutApiClient).getResponse(any());

            ApiResponseRetrievalException e = assertThrows(ApiResponseRetrievalException.class, () -> {
                checkoutApiClient.getCheckoutRequest("1", "2", "3");
            });
            int code = e.getStatusCode();
            assertEquals(500, code);
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void getCheckoutRequestNullParams() throws InvalidKeyException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));

            IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
                checkoutApiClient.getCheckoutRequest(null, "2", "3");
            });
            String m = e.getMessage();
            assertEquals("Merchant ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                checkoutApiClient.getCheckoutRequest("1", null, "3");
            });
            m = e.getMessage();
            assertEquals("Commerce Case ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                checkoutApiClient.getCheckoutRequest("1", "2", null);
            });
            m = e.getMessage();
            assertEquals("Checkout ID is required", m);
        }
    }

    @Nested
    @DisplayName("getCheckoutsRequest")
    class getCheckoutsRequestTests {
        @Test
        @DisplayName("given request was successful, then return response")
        void getCheckoutsRequestSuccessful() throws InvalidKeyException, ApiException, IOException {

            CheckoutApiClient checkoutApiClient = spy(
                    new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            CheckoutsResponse expected = new CheckoutsResponse();
            Response response = ApiResponseMocks.createResponse(200, new CheckoutsResponse());

            doReturn(response).when(checkoutApiClient).getResponse(any());
            when(checkoutApiClient.getResponse(any())).thenReturn(response);

            CheckoutsResponse res = checkoutApiClient.getCheckoutsRequest("1");

            assertEquals(expected, res);

        }

        @Test
        @DisplayName("given request was unsuccessful (400), then throw exception")
        void getCheckoutsRequestUnsuccessful() throws InvalidKeyException, IOException {

            CheckoutApiClient checkoutApiClient = spy(
                    new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(checkoutApiClient).getResponse(any());

            ApiErrorResponseException e = assertThrows(ApiErrorResponseException.class, () -> {
                checkoutApiClient.getCheckoutsRequest("1");
            });
            int s = e.getStatusCode();
            assertEquals(400, s);

        }

        @Test
        @DisplayName("given request was unsuccessful (500) with empty body, then throw exception")
        void getCommerceCaseRequestUnsuccessful500() throws InvalidKeyException, IOException {

            CheckoutApiClient checkoutApiClient = spy(
                    new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createEmptyErrorResponse(500);

            doReturn(response).when(checkoutApiClient).getResponse(any());

            ApiResponseRetrievalException e = assertThrows(ApiResponseRetrievalException.class, () -> {
                checkoutApiClient.getCheckoutsRequest("1");
            });
            int code = e.getStatusCode();
            assertEquals(500, code);
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void getCheckoutsRequestNullParams() throws InvalidKeyException {

            CheckoutApiClient checkoutApiClient = spy(
                    new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));

            IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
                checkoutApiClient.getCheckoutsRequest(null);
            });
            String m = e.getMessage();
            assertEquals("Merchant ID is required", m);

        }
    }

    @Nested
    @DisplayName("updateCheckoutRequest")
    class UpdateCheckoutRequestTests {
        @Test
        @DisplayName("given request was successful, then throw no exception")
        void updateCheckoutRequestSuccessful() throws InvalidKeyException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createResponse(200);

            doReturn(response).when(checkoutApiClient).getResponse(any());
            when(checkoutApiClient.getResponse(any())).thenReturn(response);

            PatchCheckoutRequest payload = new PatchCheckoutRequest();

            assertDoesNotThrow(() -> checkoutApiClient.updateCheckoutRequest("1", "2", "3", payload));

        }

        @Test
        @DisplayName("given request was unsuccessful (400), then throw exception")
        void updateCheckoutRequestUnsuccessful() throws InvalidKeyException, IOException {
            Response response = ApiResponseMocks.createErrorResponse(400);
            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            doReturn(response).when(checkoutApiClient).getResponse(any());

            ApiErrorResponseException e = assertThrows(ApiErrorResponseException.class, () -> {
                PatchCheckoutRequest payload = new PatchCheckoutRequest();
                checkoutApiClient.updateCheckoutRequest("1", "2", "3", payload);
            });
            assertEquals(400, e.getStatusCode());
        }

        @Test
        @DisplayName("given request was unsuccessful (500), then throw exception")
        void updateCheckoutRequestUnsuccessful500() throws InvalidKeyException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(500);

            doReturn(response).when(checkoutApiClient).getResponse(any());

            PatchCheckoutRequest payload = new PatchCheckoutRequest();
            ApiErrorResponseException e = assertThrows(ApiErrorResponseException.class, () -> {
                checkoutApiClient.updateCheckoutRequest("1", "2", "3", payload);
            });
            int code = e.getStatusCode();
            assertEquals(500, code);
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void updateCheckoutRequestNullParams() throws InvalidKeyException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));

            IllegalArgumentException e;
            String m;

            e = assertThrows(IllegalArgumentException.class, () -> {
                PatchCheckoutRequest payload = new PatchCheckoutRequest();
                checkoutApiClient.updateCheckoutRequest(null, "2", "3", payload);
            });
            m = e.getMessage();
            assertEquals("Merchant ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                PatchCheckoutRequest payload = new PatchCheckoutRequest();
                checkoutApiClient.updateCheckoutRequest("1", null, "3", payload);
            });
            m = e.getMessage();
            assertEquals("Commerce Case ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                PatchCheckoutRequest payload = new PatchCheckoutRequest();
                checkoutApiClient.updateCheckoutRequest("1", "2", null, payload);
            });
            m = e.getMessage();
            assertEquals("Checkout ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                checkoutApiClient.updateCheckoutRequest("1", "2", "3", null);
            });
            m = e.getMessage();
            assertEquals("Payload is required", m);
        }
    }

    @Nested
    @DisplayName("removeCheckoutRequest")
    class RemoveCheckoutRequestTests {
        @Test
        @DisplayName("given request was successful, then throw no exception")
        void removeCheckoutRequestSuccessful() throws InvalidKeyException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createResponse(200);

            doReturn(response).when(checkoutApiClient).getResponse(any());
            when(checkoutApiClient.getResponse(any())).thenReturn(response);

            assertDoesNotThrow(() -> checkoutApiClient.removeCheckoutRequest("1", "2", "3"));

        }

        @Test
        @DisplayName("given request was unsuccessful (400), then throw exception")
        void removeCheckoutRequestUnsuccessful() throws InvalidKeyException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(checkoutApiClient).getResponse(any());

            ApiErrorResponseException e = assertThrows(ApiErrorResponseException.class, () -> {
                checkoutApiClient.removeCheckoutRequest("1", "2", "3");
            });
            int s = e.getErrors().get(0).getHttpStatusCode();
            assertEquals(400, s);
        }

        @Test
        @DisplayName("given request was unsuccessful (500), then throw exception")
        void removeCheckoutRequestUnsuccessful500() throws InvalidKeyException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createEmptyErrorResponse(500);

            doReturn(response).when(checkoutApiClient).getResponse(any());

            ApiResponseRetrievalException e = assertThrows(ApiResponseRetrievalException.class, () -> {
                checkoutApiClient.removeCheckoutRequest("1", "2", "3");
            });
            int code = e.getStatusCode();
            assertEquals(500, code);
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void removeCheckoutRequestNullParams() throws InvalidKeyException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));

            IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
                checkoutApiClient.removeCheckoutRequest(null, "2", "3");
            });
            String m = e.getMessage();
            assertEquals("Merchant ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                checkoutApiClient.removeCheckoutRequest("1", null, "3");
            });
            m = e.getMessage();
            assertEquals("Commerce Case ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                checkoutApiClient.removeCheckoutRequest("1", "2", null);
            });
            m = e.getMessage();
            assertEquals("Checkout ID is required", m);
        }
    }

    @Nested
    @DisplayName("completeCheckoutRequest")
    class CompleteCheckoutRequestTests {
        @Test
        @DisplayName("given request was successful, then return response")
        void completeCheckoutRequestSuccessful() throws InvalidKeyException, ApiException, IOException {

            CheckoutApiClient checkoutApiClient = spy(
                    new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            CompletePaymentResponse expected = new CompletePaymentResponse();
            Response response = ApiResponseMocks.createResponse(200, new CompletePaymentResponse());

            doReturn(response).when(checkoutApiClient).getResponse(any());
            when(checkoutApiClient.getResponse(any())).thenReturn(response);

            CompleteOrderRequest payload = new CompleteOrderRequest();
            CompletePaymentResponse res = checkoutApiClient.completeCheckoutRequest("1", "2", "3", payload);

            assertEquals(expected, res);

        }

        @Test
        @DisplayName("given request was unsuccessful (400), then throw exception")
        void completeCheckoutRequestUnsuccessful() throws InvalidKeyException, IOException {
            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(checkoutApiClient).getResponse(any());

            CompleteOrderRequest payload = new CompleteOrderRequest();

            ApiErrorResponseException e = assertThrows(ApiErrorResponseException.class, () -> {
                checkoutApiClient.completeCheckoutRequest("1", "2", "3", payload);
            });
            assertEquals(400, e.getStatusCode());
        }

        @Test
        @DisplayName("given request was unsuccessful (500) with an empty body, then throw exception")
        void completeCheckoutRequestUnsuccessful500() throws InvalidKeyException, IOException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createEmptyErrorResponse(500);

            doReturn(response).when(checkoutApiClient).getResponse(any());

            CompleteOrderRequest payload = new CompleteOrderRequest();
            ApiResponseRetrievalException e = assertThrows(ApiResponseRetrievalException.class, () -> {
                checkoutApiClient.completeCheckoutRequest("1", "2", "3", payload);
            });
            assertEquals(500, e.getStatusCode());
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void completeCheckoutRequestNullParams() throws InvalidKeyException {

            CheckoutApiClient checkoutApiClient = spy(new CheckoutApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            CompleteOrderRequest payload = new CompleteOrderRequest();

            IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
                checkoutApiClient.completeCheckoutRequest(null, "2", "3", payload);
            });
            String m = e.getMessage();
            assertEquals("Merchant ID is required", m);

            e = assertThrows(IllegalArgumentException.class,
                    () -> checkoutApiClient.completeCheckoutRequest("1", null, "3", payload));
            m = e.getMessage();
            assertEquals("Commerce Case ID is required", m);

            e = assertThrows(IllegalArgumentException.class,
                    () -> checkoutApiClient.completeCheckoutRequest("1", "2", null, payload));
            m = e.getMessage();
            assertEquals("Checkout ID is required", m);

            e = assertThrows(IllegalArgumentException.class,
                    () -> checkoutApiClient.completeCheckoutRequest("1", "2", "3", null));
            m = e.getMessage();
            assertEquals("Payload is required", m);
        }
    }

}
