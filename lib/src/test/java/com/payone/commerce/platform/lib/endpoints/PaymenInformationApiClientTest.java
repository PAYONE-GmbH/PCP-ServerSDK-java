package com.payone.commerce.platform.lib.endpoints;

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
import com.payone.commerce.platform.lib.models.PaymentInformationRequest;
import com.payone.commerce.platform.lib.models.PaymentInformationResponse;
import com.payone.commerce.platform.lib.testutils.ApiResponseMocks;
import com.payone.commerce.platform.lib.testutils.TestConfig;

import okhttp3.Response;

public class PaymenInformationApiClientTest {

    @Nested
    @DisplayName("createPaymentInformation")
    class CreatePaymentInformationTests {
        @Test
        @DisplayName("given request was successful, then return response")
        void createPaymentInformationSuccessful() throws InvalidKeyException, ApiException, IOException {

            PaymentInformationApiClient paymentInformationApiClient = spy(
                    new PaymentInformationApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            PaymentInformationResponse expected = new PaymentInformationResponse();
            Response response = ApiResponseMocks.createResponse(201, new PaymentInformationResponse());

            doReturn(response).when(paymentInformationApiClient).getResponse(any());
            when(paymentInformationApiClient.getResponse(any())).thenReturn(response);

            PaymentInformationRequest payload = new PaymentInformationRequest();
            PaymentInformationResponse res = paymentInformationApiClient.createPaymentInformation("1", "2", "3",
                    payload);

            assertEquals(expected, res);
        }

        @Test
        @DisplayName("given request was unsuccessful (400), then throw exception")
        void createPaymentInformationUnsuccessful() throws InvalidKeyException, ApiException, IOException {

            PaymentInformationApiClient paymentInformationApiClient = spy(
                    new PaymentInformationApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(paymentInformationApiClient).getResponse(any());
            when(paymentInformationApiClient.getResponse(any())).thenReturn(response);

            PaymentInformationRequest payload = new PaymentInformationRequest();
            ApiErrorResponseException e = assertThrows(ApiErrorResponseException.class, () -> {
                paymentInformationApiClient.createPaymentInformation("1", "2", "3", payload);
            });
            int code = e.getErrors().get(0).getHttpStatusCode();
            assertEquals(400, code);
        }

        @Test
        @DisplayName("given request was unsuccessful (500) with empty body, then throw exception")
        void createPaymentInformationUnsuccessful500() throws InvalidKeyException, ApiException, IOException {

            PaymentInformationApiClient paymentInformationApiClient = spy(
                    new PaymentInformationApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createEmptyErrorResponse(500);

            doReturn(response).when(paymentInformationApiClient).getResponse(any());
            when(paymentInformationApiClient.getResponse(any())).thenReturn(response);

            ApiResponseRetrievalException e = assertThrows(ApiResponseRetrievalException.class, () -> {
                PaymentInformationRequest payload = new PaymentInformationRequest();
                paymentInformationApiClient.createPaymentInformation("1", "2", "3", payload);
            });
            int code = e.getStatusCode();
            assertEquals(500, code);
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void createPaymentInformationNullParams() throws InvalidKeyException, ApiException, IOException {

            PaymentInformationApiClient paymentInformationApiClient = spy(
                    new PaymentInformationApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            PaymentInformationRequest payload = new PaymentInformationRequest();

            IllegalArgumentException e;
            String m;

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentInformationApiClient.createPaymentInformation(null, "2", "3", payload);
            });
            m = e.getMessage();
            assertEquals("Merchant ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentInformationApiClient.createPaymentInformation("1", null, "3", payload);
            });
            m = e.getMessage();
            assertEquals("Commerce Case ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentInformationApiClient.createPaymentInformation("1", "2", null, payload);
            });
            m = e.getMessage();
            assertEquals("Checkout ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                paymentInformationApiClient.createPaymentInformation("1", "2", "checkout it out", null);
            });
            m = e.getMessage();
            assertEquals("Payload is required", m);
        }

        @Nested
        @DisplayName("getPaymentInformation")
        class GetPaymentInformation {
            @Test
            @DisplayName("given request was successful, then return response")
            void getPaymentInformationSuccessful() throws InvalidKeyException, ApiException, IOException {

                PaymentInformationApiClient paymentInformationApiClient = spy(
                        new PaymentInformationApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
                PaymentInformationResponse expected = new PaymentInformationResponse();
                Response response = ApiResponseMocks.createResponse(200, new PaymentInformationResponse());

                doReturn(response).when(paymentInformationApiClient).getResponse(any());
                when(paymentInformationApiClient.getResponse(any())).thenReturn(response);

                PaymentInformationResponse res = paymentInformationApiClient.getPaymentInformation("1", "2", "3", "4");

                assertEquals(expected, res);
            }

            @Test
            @DisplayName("given request was unsuccessful (400), then throw exception")
            void getPaymentInformationRequestUnsuccessful400()
                    throws InvalidKeyException, ApiException, IOException {

                PaymentInformationApiClient paymentInformationApiClient = spy(
                        new PaymentInformationApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
                Response response = ApiResponseMocks.createErrorResponse(400);

                doReturn(response).when(paymentInformationApiClient).getResponse(any());
                when(paymentInformationApiClient.getResponse(any())).thenReturn(response);

                ApiErrorResponseException e = assertThrows(ApiErrorResponseException.class, () -> {
                    paymentInformationApiClient.getPaymentInformation("1", "2", "3", "4");
                });
                int code = e.getErrors().get(0).getHttpStatusCode();
                assertEquals(400, code);
            }

            @Test
            @DisplayName("given request was unsuccessful (500) with empty body, then throw exception")
            void getPaymentInformationRequestUnsuccessful500()
                    throws InvalidKeyException, ApiException, IOException {

                PaymentInformationApiClient paymentInformationApiClient = spy(
                        new PaymentInformationApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
                Response response = ApiResponseMocks.createEmptyErrorResponse(500);

                doReturn(response).when(paymentInformationApiClient).getResponse(any());
                when(paymentInformationApiClient.getResponse(any())).thenReturn(response);

                ApiResponseRetrievalException e = assertThrows(ApiResponseRetrievalException.class, () -> {
                    paymentInformationApiClient.getPaymentInformation("1", "2", "3", "4");
                });
                int code = e.getStatusCode();
                assertEquals(500, code);
            }

            @Test
            @DisplayName("given required params are null, then throw exception")
            void getPaymentInformationNullParams() throws InvalidKeyException, ApiException, IOException {

                PaymentInformationApiClient paymentInformationApiClient = spy(
                        new PaymentInformationApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));

                IllegalArgumentException e;
                String m;

                e = assertThrows(IllegalArgumentException.class, () -> {
                    paymentInformationApiClient.getPaymentInformation(null, "2", "3", "4");
                });
                m = e.getMessage();
                assertEquals("Merchant ID is required", m);

                e = assertThrows(IllegalArgumentException.class, () -> {
                    paymentInformationApiClient.getPaymentInformation("1", null, "3", "4");
                });
                m = e.getMessage();
                assertEquals("Commerce Case ID is required", m);

                e = assertThrows(IllegalArgumentException.class, () -> {
                    paymentInformationApiClient.getPaymentInformation("1", "2", null, "4");
                });
                m = e.getMessage();
                assertEquals("Checkout ID is required", m);

                e = assertThrows(IllegalArgumentException.class, () -> {
                    paymentInformationApiClient.getPaymentInformation("1", "2", "check it out", null);
                });
                m = e.getMessage();
                assertEquals("Payment Information ID is required", m);
            }
        }
    }
}
