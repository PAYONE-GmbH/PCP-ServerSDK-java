package com.payone.commerce.platform.lib.endpoints;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import java.io.IOException;
import java.security.InvalidKeyException;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import com.payone.commerce.platform.lib.errors.ApiErrorResponseException;
import com.payone.commerce.platform.lib.errors.ApiException;
import com.payone.commerce.platform.lib.errors.ApiResponseRetrievalException;
import com.payone.commerce.platform.lib.models.CreatePaymentIntentRequest;
import com.payone.commerce.platform.lib.models.CreatePaymentIntentResponse;
import com.payone.commerce.platform.lib.models.PaymentIntentResponse;
import com.payone.commerce.platform.lib.testutils.ApiResponseMocks;
import com.payone.commerce.platform.lib.testutils.TestConfig;

import okhttp3.Request;
import okhttp3.Response;
import okio.Buffer;

public class PaymentIntentApiClientTest {
    @Test
    void createPaymentIntentSuccessful() throws InvalidKeyException, ApiException, IOException {
        PaymentIntentApiClient client = spy(new PaymentIntentApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
        Response response = ApiResponseMocks.createResponse(201, new CreatePaymentIntentResponse());
        ArgumentCaptor<Request> requestCaptor = ArgumentCaptor.forClass(Request.class);
        doReturn(response).when(client).getResponse(requestCaptor.capture());

        CreatePaymentIntentResponse result = client.createPaymentIntent("merchant", new CreatePaymentIntentRequest());

        Request request = requestCaptor.getValue();
        assertEquals(new CreatePaymentIntentResponse(), result);
        assertEquals("POST", request.method());
        assertEquals("/v1/merchant/payment-intents", request.url().encodedPath());
        assertEquals("application/json; charset=utf-8", request.header("Content-Type"));
        Buffer buffer = new Buffer();
        request.body().writeTo(buffer);
        assertEquals("{}", buffer.readUtf8());
    }

    @Test
    void createPaymentIntentRejectsNullArguments() throws InvalidKeyException {
        PaymentIntentApiClient client = new PaymentIntentApiClient(TestConfig.COMMUNICATOR_CONFIGURATION);

        IllegalArgumentException merchantIdException = assertThrows(IllegalArgumentException.class,
                () -> client.createPaymentIntent(null, new CreatePaymentIntentRequest()));
        IllegalArgumentException payloadException = assertThrows(IllegalArgumentException.class,
                () -> client.createPaymentIntent("merchant", null));

        assertEquals("Merchant ID is required", merchantIdException.getMessage());
        assertEquals("Payload is required", payloadException.getMessage());
    }

    @Test
    void createPaymentIntentThrowsApiErrorResponseException() throws InvalidKeyException, IOException {
        PaymentIntentApiClient client = spy(new PaymentIntentApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
        doReturn(ApiResponseMocks.createErrorResponse(400)).when(client).getResponse(any());

        ApiErrorResponseException exception = assertThrows(ApiErrorResponseException.class,
                () -> client.createPaymentIntent("merchant", new CreatePaymentIntentRequest()));

        assertEquals(400, exception.getStatusCode());
    }

    @Test
    void createPaymentIntentThrowsApiResponseRetrievalExceptionForEmptyError()
            throws InvalidKeyException, IOException {
        PaymentIntentApiClient client = spy(new PaymentIntentApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
        doReturn(ApiResponseMocks.createEmptyErrorResponse(500)).when(client).getResponse(any());

        ApiResponseRetrievalException exception = assertThrows(ApiResponseRetrievalException.class,
                () -> client.createPaymentIntent("merchant", new CreatePaymentIntentRequest()));

        assertEquals(500, exception.getStatusCode());
    }

    @Test
    void getPaymentIntentSuccessful() throws InvalidKeyException, ApiException, IOException {
        PaymentIntentApiClient client = spy(new PaymentIntentApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
        Response response = ApiResponseMocks.createResponse(200, new PaymentIntentResponse());
        ArgumentCaptor<Request> requestCaptor = ArgumentCaptor.forClass(Request.class);
        doReturn(response).when(client).getResponse(requestCaptor.capture());

        PaymentIntentResponse result = client.getPaymentIntent("merchant", "payment-intent");

        Request request = requestCaptor.getValue();
        assertEquals(new PaymentIntentResponse(), result);
        assertEquals("GET", request.method());
        assertEquals("/v1/merchant/payment-intents/payment-intent", request.url().encodedPath());
    }

    @Test
    void getPaymentIntentRejectsNullArguments() throws InvalidKeyException {
        PaymentIntentApiClient client = new PaymentIntentApiClient(TestConfig.COMMUNICATOR_CONFIGURATION);

        IllegalArgumentException merchantIdException = assertThrows(IllegalArgumentException.class,
                () -> client.getPaymentIntent(null, "payment-intent"));
        IllegalArgumentException paymentIntentIdException = assertThrows(IllegalArgumentException.class,
                () -> client.getPaymentIntent("merchant", null));

        assertEquals("Merchant ID is required", merchantIdException.getMessage());
        assertEquals("Payment Intent ID is required", paymentIntentIdException.getMessage());
    }

    @Test
    void getPaymentIntentThrowsApiErrorResponseException() throws InvalidKeyException, IOException {
        PaymentIntentApiClient client = spy(new PaymentIntentApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
        doReturn(ApiResponseMocks.createErrorResponse(400)).when(client).getResponse(any());

        ApiErrorResponseException exception = assertThrows(ApiErrorResponseException.class,
                () -> client.getPaymentIntent("merchant", "payment-intent"));

        assertEquals(400, exception.getStatusCode());
    }

    @Test
    void getPaymentIntentThrowsApiResponseRetrievalExceptionForEmptyError()
            throws InvalidKeyException, IOException {
        PaymentIntentApiClient client = spy(new PaymentIntentApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
        doReturn(ApiResponseMocks.createEmptyErrorResponse(500)).when(client).getResponse(any());

        ApiResponseRetrievalException exception = assertThrows(ApiResponseRetrievalException.class,
                () -> client.getPaymentIntent("merchant", "payment-intent"));

        assertEquals(500, exception.getStatusCode());
    }
}
