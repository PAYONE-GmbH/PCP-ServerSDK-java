package com.payone.commerce.platform.lib.endpoints;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.security.InvalidKeyException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.payone.commerce.platform.lib.errors.ApiErrorResponseException;
import com.payone.commerce.platform.lib.errors.ApiException;
import com.payone.commerce.platform.lib.errors.ApiResponseRetrievalException;
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
        void createPaymentRequestSuccessful() throws InvalidKeyException, ApiException, IOException {

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
        void createPaymentRequestUnsuccessful() throws InvalidKeyException, ApiException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            ApiErrorResponseException e = assertThrows(ApiErrorResponseException.class, () -> {
                PaymentExecutionRequest payload = new PaymentExecutionRequest();
                paymentExecutionApiClient.createPayment("1", "2", "3", payload);
            });
            int code = e.getErrors().get(0).getHttpStatusCode();
            assertEquals(400, code);
        }

        @Test
        @DisplayName("given request was unsuccessful (500) with empty body, then throw exception")
        void createPaymentRequestUnsuccessful500() throws InvalidKeyException, ApiException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            Response response = ApiResponseMocks.createEmptyErrorResponse(500);

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            ApiResponseRetrievalException e = assertThrows(ApiResponseRetrievalException.class, () -> {
                PaymentExecutionRequest payload = new PaymentExecutionRequest();
                paymentExecutionApiClient.createPayment("1", "2", "3", payload);
            });
            int code = e.getStatusCode();
            assertEquals(500, code);
        }

        @Test
        @DisplayName("Given required params are null, then throw exception")
        void createPaymentRequestNullParams() throws InvalidKeyException, ApiException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            PaymentExecutionRequest payload = new PaymentExecutionRequest();

            IllegalArgumentException e;
            String m;

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentExecutionApiClient.createPayment(null, "2", "3", payload);
            });
            m = e.getMessage();
            assertEquals("Merchant ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentExecutionApiClient.createPayment("1", null, "3", payload);
            });
            m = e.getMessage();
            assertEquals("Commerce Case ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentExecutionApiClient.createPayment("1", "2", null, payload);
            });
            m = e.getMessage();
            assertEquals("Checkout ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentExecutionApiClient.createPayment("1", "2", "3", null);
            });
            m = e.getMessage();
            assertEquals("Payload is required", m);
        }
    }

    @Nested
    @DisplayName("capturePaymentRequest")
    class CapturePayment {
        @Test
        @DisplayName("given request was successful, then return response")
        void capturePaymentRequestSuccessful() throws InvalidKeyException, ApiException, IOException {

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
        void capturePaymentRequestUnsuccessful400() throws InvalidKeyException, ApiException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            ApiErrorResponseException e = assertThrows(ApiErrorResponseException.class, () -> {
                CapturePaymentRequest payload = new CapturePaymentRequest();
                paymentExecutionApiClient.capturePayment("1", "2", "3", "4", payload);
            });
            int code = e.getErrors().get(0).getHttpStatusCode();
            assertEquals(400, code);
        }

        @Test
        @DisplayName("given request unsuccessful (500) with empty body, then throw exception")
        void capturePaymentRequestUnsuccessful500() throws InvalidKeyException, ApiException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            Response response = ApiResponseMocks.createEmptyErrorResponse(500);

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            ApiResponseRetrievalException e = assertThrows(ApiResponseRetrievalException.class, () -> {
                CapturePaymentRequest payload = new CapturePaymentRequest();
                paymentExecutionApiClient.capturePayment("1", "2", "3", "4", payload);
            });
            int code = e.getStatusCode();
            assertEquals(500, code);
        }

        @Test
        @DisplayName("Given required params are null, then throw exception")
        void capturePaymentRequestParamsNull() throws InvalidKeyException, ApiException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            CapturePaymentRequest payload = new CapturePaymentRequest();

            IllegalArgumentException e;
            String m;

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentExecutionApiClient.capturePayment(null, "2", "3", "4", payload);
            });
            m = e.getMessage();
            assertEquals("Merchant ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentExecutionApiClient.capturePayment("1", null, "3", "4", payload);
            });
            m = e.getMessage();
            assertEquals("Commerce Case ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentExecutionApiClient.capturePayment("1", "2", null, "4", payload);
            });
            m = e.getMessage();
            assertEquals("Checkout ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentExecutionApiClient.capturePayment("1", "2", "3", null, payload);
            });
            m = e.getMessage();
            assertEquals("Payment Execution ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentExecutionApiClient.capturePayment("1", "2", "3", "4", null);
            });
            m = e.getMessage();
            assertEquals("Payload is required", m);
        }
    }

    @Nested
    @DisplayName("cancelPaymentRequest")
    class CancelPayment {
        @Test
        @DisplayName("given request was successful, then return response")
        void cancelPaymentRequestSuccessful() throws InvalidKeyException, ApiException, IOException {

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
        void cancelPaymentRequestUnsuccessful400() throws InvalidKeyException, ApiException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            CancelPaymentRequest payload = new CancelPaymentRequest();
            ApiErrorResponseException e = assertThrows(ApiErrorResponseException.class, () -> {
                paymentExecutionApiClient.cancelPayment("1", "2", "3", "4", payload);
            });
            int code = e.getErrors().get(0).getHttpStatusCode();
            assertEquals(400, code);
        }

        @Test
        @DisplayName("given request unsuccessful (500) with empty body, then throw exception")
        void cancelPaymentRequestUnsuccessful500() throws InvalidKeyException, ApiException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            Response response = ApiResponseMocks.createEmptyErrorResponse(500);

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            ApiResponseRetrievalException e = assertThrows(ApiResponseRetrievalException.class, () -> {
                CancelPaymentRequest payload = new CancelPaymentRequest();
                paymentExecutionApiClient.cancelPayment("1", "2", "3", "4", payload);
            });
            int code = e.getStatusCode();
            assertEquals(500, code);
        }

        @Test
        @DisplayName("Given required params are null, then throw exception")
        void cancelPaymentRequestParamsNull() throws InvalidKeyException, ApiException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            CancelPaymentRequest payload = new CancelPaymentRequest();

            IllegalArgumentException e;
            String m;

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentExecutionApiClient.cancelPayment(null, "2", "3", "4", payload);
            });
            m = e.getMessage();
            assertEquals("Merchant ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentExecutionApiClient.cancelPayment("1", null, "3", "4", payload);
            });
            m = e.getMessage();
            assertEquals("Commerce Case ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentExecutionApiClient.cancelPayment("1", "2", null, "4", payload);
            });
            m = e.getMessage();
            assertEquals("Checkout ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentExecutionApiClient.cancelPayment("1", "2", "3", null, payload);
            });
            m = e.getMessage();
            assertEquals("Payment Execution ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentExecutionApiClient.cancelPayment("1", "2", "3", "4", null);
            });
            m = e.getMessage();
            assertEquals("Payload is required", m);
        }
    }

    @Nested
    @DisplayName("completePaymentRequest")
    class CompletePayment {
        @Test
        @DisplayName("given request was successful, then return response")
        void completePaymentRequestSuccessful() throws InvalidKeyException, ApiException, IOException {

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
        void completePaymentRequestUnsuccessful400() throws InvalidKeyException, ApiException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            ApiErrorResponseException e = assertThrows(ApiErrorResponseException.class, () -> {
                CompletePaymentRequest payload = new CompletePaymentRequest();
                paymentExecutionApiClient.completePayment("1", "2", "3", "4", payload);
            });
            int code = e.getErrors().get(0).getHttpStatusCode();
            assertEquals(400, code);
        }

        @Test
        @DisplayName("given request unsuccessful (500) with empty body, then throw exception")
        void completePaymentRequestUnsuccessful500() throws InvalidKeyException, ApiException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            Response response = ApiResponseMocks.createEmptyErrorResponse(500);

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            ApiResponseRetrievalException e = assertThrows(ApiResponseRetrievalException.class, () -> {
                CompletePaymentRequest payload = new CompletePaymentRequest();
                paymentExecutionApiClient.completePayment("1", "2", "3", "4", payload);
            });
            int code = e.getStatusCode();
            assertEquals(500, code);
        }

        @Test
        @DisplayName("Given required params are null, then throw exception")
        void completePaymentRequestParamsNull() throws InvalidKeyException, ApiException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            CompletePaymentRequest payload = new CompletePaymentRequest();

            IllegalArgumentException e;
            String m;

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentExecutionApiClient.completePayment(null, "2", "3", "4", payload);
            });
            m = e.getMessage();
            assertEquals("Merchant ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentExecutionApiClient.completePayment("1", null, "3", "4", payload);
            });
            m = e.getMessage();
            assertEquals("Commerce Case ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentExecutionApiClient.completePayment("1", "2", null, "4", payload);
            });
            m = e.getMessage();
            assertEquals("Checkout ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentExecutionApiClient.completePayment("1", "2", "3", null, payload);
            });
            m = e.getMessage();
            assertEquals("Payment Execution ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentExecutionApiClient.completePayment("1", "2", "3", "4", null);
            });
            m = e.getMessage();
            assertEquals("Payload is required", m);
        }
    }

    @Nested
    @DisplayName("refundPaymentRequest")
    class PaymentRefund {
        @Test
        @DisplayName("given request was successful, then return response")
        void refundPaymentRequestSuccessful() throws InvalidKeyException, ApiException, IOException {

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
        void refundPaymentRequestUnsuccessful400() throws InvalidKeyException, ApiException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            RefundRequest payload = new RefundRequest();
            ApiErrorResponseException e = assertThrows(ApiErrorResponseException.class, () -> {
                paymentExecutionApiClient.refundPayment("1", "2", "3", "4", payload);
            });
            int code = e.getErrors().get(0).getHttpStatusCode();
            assertEquals(400, code);
        }

        @Test
        @DisplayName("given request unsuccessful (500) with empty body, then throw exception")
        void refundPaymentRequestUnsuccessful500() throws InvalidKeyException, ApiException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            Response response = ApiResponseMocks.createEmptyErrorResponse(500);

            doReturn(response).when(paymentExecutionApiClient).getResponse(any());
            when(paymentExecutionApiClient.getResponse(any())).thenReturn(response);

            ApiResponseRetrievalException e = assertThrows(ApiResponseRetrievalException.class, () -> {
                RefundRequest payload = new RefundRequest();
                paymentExecutionApiClient.refundPayment("1", "2", "3", "4", payload);
            });
            int code = e.getStatusCode();
            assertEquals(500, code);
        }

        @Test
        @DisplayName("Given required params are null, then throw exception")
        void refundPaymentRequestParamsNull() throws InvalidKeyException, ApiException, IOException {

            PaymentExecutionApiClient paymentExecutionApiClient = spy(new PaymentExecutionApiClient(CONFIG));
            RefundRequest payload = new RefundRequest();

            IllegalArgumentException e;
            String m;

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentExecutionApiClient.refundPayment(null, "2", "3", "4", payload);
            });
            m = e.getMessage();
            assertEquals("Merchant ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentExecutionApiClient.refundPayment("1", null, "3", "4", payload);
            });
            m = e.getMessage();
            assertEquals("Commerce Case ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentExecutionApiClient.refundPayment("1", "2", null, "4", payload);
            });
            m = e.getMessage();
            assertEquals("Checkout ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentExecutionApiClient.refundPayment("1", "2", "3", null, payload);
            });
            m = e.getMessage();
            assertEquals("Payment Execution ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentExecutionApiClient.refundPayment("1", "2", "3", "4", null);
            });
            m = e.getMessage();
            assertEquals("Payload is required", m);
        }
    }
}
