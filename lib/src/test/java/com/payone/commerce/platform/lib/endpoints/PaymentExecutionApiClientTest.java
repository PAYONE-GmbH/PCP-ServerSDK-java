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
import com.payone.commerce.platform.lib.models.PaymentExecutionRequest;
import com.payone.commerce.platform.lib.models.RefundPaymentResponse;
import com.payone.commerce.platform.lib.models.RefundRequest;
import com.payone.commerce.platform.lib.models.CancelPaymentRequest;
import com.payone.commerce.platform.lib.models.CancelPaymentResponse;
import com.payone.commerce.platform.lib.models.CapturePaymentRequest;
import com.payone.commerce.platform.lib.models.CapturePaymentResponse;
import com.payone.commerce.platform.lib.models.CompletePaymentRequest;
import com.payone.commerce.platform.lib.models.CompletePaymentResponse;
import com.payone.commerce.platform.lib.models.CreatePaymentResponse;
import com.payone.commerce.platform.lib.testutils.ApiResponseMocks;

import okhttp3.Response;

public class PaymentExecutionApiClientTest {
    private final String TEST_KEY = "KEY";
    private final String TEST_SECRET = "Super duper Ethan Hunt level secret";
    private final CommunicatorConfiguration CONFIG = new CommunicatorConfiguration(TEST_KEY, TEST_SECRET,
            "awesome-api.com");

    @Nested
    @DisplayName("createPaymentRequest")
    class createPayment {
        @Test
        @DisplayName("given request was successful, then return response")
        void createPaymentRequestSuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            CreatePaymentResponse expected = new CreatePaymentResponse();
            Response response = ApiResponseMocks.createResponse(200, new CreatePaymentResponse());

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            PaymentExecutionRequest payload = new PaymentExecutionRequest();
            CreatePaymentResponse res = paymentExecutionApiClient.createPayment("1", "2", "3", payload);

            assertEquals(expected, res);
        }

        @Test
        @DisplayName("given request was unsuccessful (400), then throw exception")
        void createPaymentRequestUnsuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            PaymentExecutionRequest payload = new PaymentExecutionRequest();
            try {
                paymentExecutionApiClient.createPayment("1", "2", "3", payload);
            } catch (ApiResponseException e) {
                int code = e.getResponse().getErrors().get(0).getHttpStatusCode();
                assertEquals(400, code);
            }
        }

        @Test
        @DisplayName("given request was unsuccessful (500), then throw exception")
        void createPaymentRequestUnsuccessful500() throws InvalidKeyException, ApiResponseException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(500);

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            PaymentExecutionRequest payload = new PaymentExecutionRequest();
            try {
                paymentExecutionApiClient.createPayment("1", "2", "3", payload);
            } catch (RuntimeException e) {
                String m = e.getMessage();
                assertEquals("Api error: 500", m);
            }
        }

        @Test
        @DisplayName("Given required params are null, then throw exception")
        void createPaymentRequestNullParams() throws InvalidKeyException, ApiResponseException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            PaymentExecutionRequest payload = new PaymentExecutionRequest();
            try {
                paymentExecutionApiClient.createPayment(null, "2", "3", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Merchant ID is required", m);
            }

            try {
                paymentExecutionApiClient.createPayment("1", null, "3", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Commerce Case ID is required", m);
            }

            try {
                paymentExecutionApiClient.createPayment("1", "2", null, payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Checkout ID is required", m);
            }

            try {
                paymentExecutionApiClient.createPayment("1", "2", "3", null);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Payload is required", m);
            }
        }
    }

    @Nested
    @DisplayName("capturePaymentRequest")
    class CapturePayment {
        @Test
        @DisplayName("given request was successful, then return response")
        void capturePaymentRequestSuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            CapturePaymentResponse expected = new CapturePaymentResponse();
            Response response = ApiResponseMocks.createResponse(200, new CapturePaymentResponse());

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            CapturePaymentRequest payload = new CapturePaymentRequest();
            CapturePaymentResponse res = paymentExecutionApiClient.capturePayment("1", "2", "3", "4", payload);

            assertEquals(expected, res);
        }

        @Test
        @DisplayName("given request unsuccessful (400), then throw exception")
        void capturePaymentRequestUnsuccessful400() throws InvalidKeyException, ApiResponseException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            CapturePaymentRequest payload = new CapturePaymentRequest();
            try {
                paymentExecutionApiClient.capturePayment("1", "2", "3", "4", payload);
            } catch (ApiResponseException e) {
                int code = e.getResponse().getErrors().get(0).getHttpStatusCode();
                assertEquals(400, code);
            }
        }

        @Test
        @DisplayName("given request unsuccessful (500), then throw exception")
        void capturePaymentRequestUnsuccessful500() throws InvalidKeyException, ApiResponseException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(500);

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            CapturePaymentRequest payload = new CapturePaymentRequest();
            try {
                paymentExecutionApiClient.capturePayment("1", "2", "3", "4", payload);
            } catch (RuntimeException e) {
                String m = e.getMessage();
                assertEquals("Api error: 500", m);
            }
        }

        @Test
        @DisplayName("Given required params are null, then throw exception")
        void capturePaymentRequestParamsNull() throws InvalidKeyException, ApiResponseException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            CapturePaymentRequest payload = new CapturePaymentRequest();
            try {
                paymentExecutionApiClient.capturePayment(null, "2", "3", "4", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Merchant ID is required", m);
            }

            try {
                paymentExecutionApiClient.capturePayment("1", null, "3", "4", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Commerce Case ID is required", m);
            }

            try {
                paymentExecutionApiClient.capturePayment("1", "2", null, "4", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Checkout ID is required", m);
            }

            try {
                paymentExecutionApiClient.capturePayment("1", "2", "3", null, payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Payment Execution ID is required", m);
            }

            try {
                paymentExecutionApiClient.capturePayment("1", "2", "3", "4", null);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Payload is required", m);
            }
        }
    }

    @Nested
    @DisplayName("cancelPaymentRequest")
    class CancelPayment {
        @Test
        @DisplayName("given request was successful, then return response")
        void cancelPaymentRequestSuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            CancelPaymentResponse expected = new CancelPaymentResponse();
            Response response = ApiResponseMocks.createResponse(200, new CancelPayment());

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            CancelPaymentRequest payload = new CancelPaymentRequest();
            CancelPaymentResponse res = paymentExecutionApiClient.cancelPayment("1", "2", "3", "4", payload);

            assertEquals(expected, res);
        }

        @Test
        @DisplayName("given request unsuccessful (400), then throw exception")
        void cancelPaymentRequestUnsuccessful400() throws InvalidKeyException, ApiResponseException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            CancelPaymentRequest payload = new CancelPaymentRequest();
            try {
                paymentExecutionApiClient.cancelPayment("1", "2", "3", "4", payload);
            } catch (ApiResponseException e) {
                int code = e.getResponse().getErrors().get(0).getHttpStatusCode();
                assertEquals(400, code);
            }
        }

        @Test
        @DisplayName("given request unsuccessful (500), then throw exception")
        void cancelPaymentRequestUnsuccessful500() throws InvalidKeyException, ApiResponseException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(500);

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            CancelPaymentRequest payload = new CancelPaymentRequest();
            try {
                paymentExecutionApiClient.cancelPayment("1", "2", "3", "4", payload);
            } catch (RuntimeException e) {
                String m = e.getMessage();
                assertEquals("Api error: 500", m);
            }
        }

        @Test
        @DisplayName("Given required params are null, then throw exception")
        void cancelPaymentRequestParamsNull() throws InvalidKeyException, ApiResponseException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            CancelPaymentRequest payload = new CancelPaymentRequest();
            try {
                paymentExecutionApiClient.cancelPayment(null, "2", "3", "4", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Merchant ID is required", m);
            }

            try {
                paymentExecutionApiClient.cancelPayment("1", null, "3", "4", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Commerce Case ID is required", m);
            }

            try {
                paymentExecutionApiClient.cancelPayment("1", "2", null, "4", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Checkout ID is required", m);
            }

            try {
                paymentExecutionApiClient.cancelPayment("1", "2", "3", null, payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Payment Execution ID is required", m);
            }

            try {
                paymentExecutionApiClient.cancelPayment("1", "2", "3", "4", null);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Payload is required", m);
            }
        }
    }

    @Nested
    @DisplayName("completePaymentRequest")
    class CompletePayment {
        @Test
        @DisplayName("given request was successful, then return response")
        void completePaymentRequestSuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            CompletePaymentResponse expected = new CompletePaymentResponse();
            Response response = ApiResponseMocks.createResponse(200, new CompletePaymentResponse());

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            CompletePaymentRequest payload = new CompletePaymentRequest();
            CompletePaymentResponse res = paymentExecutionApiClient.completePayment("1", "2", "3", "4", payload);

            assertEquals(expected, res);
        }

        @Test
        @DisplayName("given request unsuccessful (400), then throw exception")
        void completePaymentRequestUnsuccessful400() throws InvalidKeyException, ApiResponseException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            CompletePaymentRequest payload = new CompletePaymentRequest();
            try {
                paymentExecutionApiClient.completePayment("1", "2", "3", "4", payload);
            } catch (ApiResponseException e) {
                int code = e.getResponse().getErrors().get(0).getHttpStatusCode();
                assertEquals(400, code);
            }
        }

        @Test
        @DisplayName("given request unsuccessful (500), then throw exception")
        void completePaymentRequestUnsuccessful500() throws InvalidKeyException, ApiResponseException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(500);

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            CompletePaymentRequest payload = new CompletePaymentRequest();
            try {
                paymentExecutionApiClient.completePayment("1", "2", "3", "4", payload);
            } catch (RuntimeException e) {
                String m = e.getMessage();
                assertEquals("Api error: 500", m);
            }
        }

        @Test
        @DisplayName("Given required params are null, then throw exception")
        void completePaymentRequestParamsNull() throws InvalidKeyException, ApiResponseException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            CompletePaymentRequest payload = new CompletePaymentRequest();
            try {
                paymentExecutionApiClient.completePayment(null, "2", "3", "4", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Merchant ID is required", m);
            }

            try {
                paymentExecutionApiClient.completePayment("1", null, "3", "4", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Commerce Case ID is required", m);
            }

            try {
                paymentExecutionApiClient.completePayment("1", "2", null, "4", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Checkout ID is required", m);
            }

            try {
                paymentExecutionApiClient.completePayment("1", "2", "3", null, payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Payment Execution ID is required", m);
            }

            try {
                paymentExecutionApiClient.completePayment("1", "2", "3", "4", null);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Payload is required", m);
            }
        }
    }

    @Nested
    @DisplayName("refundPaymentRequest")
    class PaymentRefund {
        @Test
        @DisplayName("given request was successful, then return response")
        void refundPaymentRequestSuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            RefundPaymentResponse expected = new RefundPaymentResponse();
            Response response = ApiResponseMocks.createResponse(200, new RefundPaymentResponse());

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            RefundRequest payload = new RefundRequest();
            RefundPaymentResponse res = paymentExecutionApiClient.refundPayment("1", "2", "3", "4", payload);

            assertEquals(expected, res);
        }

        @Test
        @DisplayName("given request unsuccessful (400), then throw exception")
        void refundPaymentRequestUnsuccessful400() throws InvalidKeyException, ApiResponseException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            RefundRequest payload = new RefundRequest();
            try {
                paymentExecutionApiClient.refundPayment("1", "2", "3", "4", payload);
            } catch (ApiResponseException e) {
                int code = e.getResponse().getErrors().get(0).getHttpStatusCode();
                assertEquals(400, code);
            }
        }

        @Test
        @DisplayName("given request unsuccessful (500), then throw exception")
        void refundPaymentRequestUnsuccessful500() throws InvalidKeyException, ApiResponseException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(500);

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            RefundRequest payload = new RefundRequest();
            try {
                paymentExecutionApiClient.refundPayment("1", "2", "3", "4", payload);
            } catch (RuntimeException e) {
                String m = e.getMessage();
                assertEquals("Api error: 500", m);
            }
        }

        @Test
        @DisplayName("Given required params are null, then throw exception")
        void refundPaymentRequestParamsNull() throws InvalidKeyException, ApiResponseException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            RefundRequest payload = new RefundRequest();
            try {
                paymentExecutionApiClient.refundPayment(null, "2", "3", "4", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Merchant ID is required", m);
            }

            try {
                paymentExecutionApiClient.refundPayment("1", null, "3", "4", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Commerce Case ID is required", m);
            }

            try {
                paymentExecutionApiClient.refundPayment("1", "2", null, "4", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Checkout ID is required", m);
            }

            try {
                paymentExecutionApiClient.refundPayment("1", "2", "3", null, payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Payment Execution ID is required", m);
            }

            try {
                paymentExecutionApiClient.refundPayment("1", "2", "3", "4", null);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Payload is required", m);
            }
        }
    }
}
