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
import com.payone.commerce.platform.lib.models.AmountOfMoney;
import com.payone.commerce.platform.lib.models.CreatePaymentIntentRequest;
import com.payone.commerce.platform.lib.models.CreatePaymentIntentResponse;
import com.payone.commerce.platform.lib.models.PatchPaymentIntentRequest;
import com.payone.commerce.platform.lib.models.PatchPaymentIntentResponse;
import com.payone.commerce.platform.lib.models.PaymentIntentOutput;
import com.payone.commerce.platform.lib.models.PaymentIntentResponse;
import com.payone.commerce.platform.lib.models.PaymentReferencesForPaymentIntent;
import com.payone.commerce.platform.lib.models.RedirectData;
import com.payone.commerce.platform.lib.models.RedirectPaymentMethodSpecificOutputForCreateIntent;
import com.payone.commerce.platform.lib.models.ShoppingCartData;
import com.payone.commerce.platform.lib.serializer.JsonSerializer;
import com.payone.commerce.platform.lib.testutils.ApiResponseMocks;
import com.payone.commerce.platform.lib.testutils.TestConfig;

import okhttp3.Request;
import okhttp3.Response;
import okio.Buffer;

public class PaymentIntentApiClientTest {
        @Test
        void patchPaymentIntentSendsPatchAndReadsUpdatedStructure()
                        throws InvalidKeyException, ApiException, IOException {
                PaymentIntentApiClient client = spy(new PaymentIntentApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
                PatchPaymentIntentResponse expected = new PatchPaymentIntentResponse()
                                .shoppingCart(new ShoppingCartData())
                                .paymentIntentOutput(new PaymentIntentOutput().redirectPaymentMethodSpecificOutput(
                                                new RedirectPaymentMethodSpecificOutputForCreateIntent()
                                                                .redirectData(new RedirectData()
                                                                                .redirectURL("https://example.com"))));
                ArgumentCaptor<Request> requestCaptor = ArgumentCaptor.forClass(Request.class);
                doReturn(ApiResponseMocks.createResponse(200, expected)).when(client)
                                .getResponse(requestCaptor.capture());

                PatchPaymentIntentResponse result = client.patchPaymentIntent("merchant", "intent-id",
                                new PatchPaymentIntentRequest().amountOfMoney(new AmountOfMoney().amount(123L)
                                                .currencyCode("EUR")).shoppingCart(new ShoppingCartData()));

                Request request = requestCaptor.getValue();
                assertEquals("PATCH", request.method());
                assertEquals("/v1/merchant/payment-intents/intent-id", request.url().encodedPath());
                assertEquals("application/json; charset=utf-8", request.header("Content-Type"));
                Buffer buffer = new Buffer();
                request.body().writeTo(buffer);
                assertEquals("{\"amountOfMoney\":{\"amount\":123,\"currencyCode\":\"EUR\"},\"shoppingCart\":{}}",
                                buffer.readUtf8());
                assertEquals(expected, result);
                assertEquals("https://example.com", result.getPaymentIntentOutput()
                                .getRedirectPaymentMethodSpecificOutput().getRedirectData().getRedirectURL());
        }

        @Test
        void patchPaymentIntentRejectsNullArguments() throws InvalidKeyException {
                PaymentIntentApiClient client = new PaymentIntentApiClient(TestConfig.COMMUNICATOR_CONFIGURATION);

                assertEquals("Merchant ID is required", assertThrows(IllegalArgumentException.class,
                                () -> client.patchPaymentIntent(null, "intent", new PatchPaymentIntentRequest()))
                                .getMessage());
                assertEquals("Payment Intent ID is required", assertThrows(IllegalArgumentException.class,
                                () -> client.patchPaymentIntent("merchant", null, new PatchPaymentIntentRequest()))
                                .getMessage());
                assertEquals("Payload is required", assertThrows(IllegalArgumentException.class,
                                () -> client.patchPaymentIntent("merchant", "intent", null)).getMessage());
        }

        @Test
        void patchPaymentIntentHandlesNotFound() throws InvalidKeyException, IOException {
                PaymentIntentApiClient client = spy(new PaymentIntentApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
                doReturn(ApiResponseMocks.createErrorResponse(404)).when(client).getResponse(any());

                ApiErrorResponseException error = assertThrows(ApiErrorResponseException.class,
                                () -> client.patchPaymentIntent("merchant", "intent", new PatchPaymentIntentRequest()));
                assertEquals(404, error.getStatusCode());
        }

        @Test
        void createIntentRedirectOutputUsesRedirectDataRatherThanRedirectionData() throws IOException {
                String json = "{\"paymentIntentOutput\":{\"redirectPaymentMethodSpecificOutput\":"
                                + "{\"redirectData\":{\"redirectURL\":\"https://example.com\"}}}}";
                CreatePaymentIntentResponse response = JsonSerializer.deserializeFromJson(json,
                                CreatePaymentIntentResponse.class);

                assertEquals("https://example.com", response.getPaymentIntentOutput()
                                .getRedirectPaymentMethodSpecificOutput().getRedirectData().getRedirectURL());
                assertEquals(json, JsonSerializer.serializeToJson(response));
        }

        @Test
        void createPaymentIntentSuccessful() throws InvalidKeyException, ApiException, IOException {
                PaymentIntentApiClient client = spy(new PaymentIntentApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
                Response response = ApiResponseMocks.createResponse(201, new CreatePaymentIntentResponse());
                ArgumentCaptor<Request> requestCaptor = ArgumentCaptor.forClass(Request.class);
                doReturn(response).when(client).getResponse(requestCaptor.capture());

                CreatePaymentIntentResponse result = client.createPaymentIntent("merchant",
                                new CreatePaymentIntentRequest().references(
                                                new PaymentReferencesForPaymentIntent()
                                                                .merchantReference("reference")));

                Request request = requestCaptor.getValue();
                assertEquals(new CreatePaymentIntentResponse(), result);
                assertEquals("POST", request.method());
                assertEquals("/v1/merchant/payment-intents", request.url().encodedPath());
                assertEquals("application/json; charset=utf-8", request.header("Content-Type"));
                Buffer buffer = new Buffer();
                request.body().writeTo(buffer);
                assertEquals("{\"references\":{\"merchantReference\":\"reference\"}}", buffer.readUtf8());
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
