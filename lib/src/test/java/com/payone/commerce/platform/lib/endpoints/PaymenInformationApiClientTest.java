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

import com.payone.commerce.platform.lib.CommunicatorConfiguration;
import com.payone.commerce.platform.lib.ApiResponseException;
import com.payone.commerce.platform.lib.models.PaymentInformationRequest;
import com.payone.commerce.platform.lib.models.PaymentInformationResponse;
import com.payone.commerce.platform.lib.testutils.ApiResponseMocks;

import okhttp3.Response;

public class PaymenInformationApiClientTest {

    private final String TEST_KEY = "KEY";
    private final String TEST_SECRET = "Super duper Ethan Hunt level secret";
    private final CommunicatorConfiguration CONFIG = new CommunicatorConfiguration(TEST_KEY, TEST_SECRET,
            "awesome-api.com");

    @Nested
    @DisplayName("createPaymentInformation")
    class CreatePaymentInformationTests {
        @Test
        @DisplayName("given request was successful, then return response")
        void createPaymentInformationSuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            PaymentInformationApiClient paymentInformationApiClient = spy(new PaymentInformationApiClient(CONFIG));
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
        void createPaymentInformationUnsuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            PaymentInformationApiClient paymentInformationApiClient = spy(new PaymentInformationApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(paymentInformationApiClient).getResponse(any());
            when(paymentInformationApiClient.getResponse(any())).thenReturn(response);

            PaymentInformationRequest payload = new PaymentInformationRequest();
            try {
                paymentInformationApiClient.createPaymentInformation("1", "2", "3", payload);
            } catch (ApiResponseException e) {
                int code = e.getResponse().getErrors().get(0).getHttpStatusCode();
                assertEquals(400, code);
            }
        }

        @Test
        @DisplayName("given request was unsuccessful (500), then throw exception")
        void createPaymentInformationUnsuccessful500() throws InvalidKeyException, ApiResponseException, IOException {

            PaymentInformationApiClient paymentInformationApiClient = spy(new PaymentInformationApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(500);

            doReturn(response).when(paymentInformationApiClient).getResponse(any());
            when(paymentInformationApiClient.getResponse(any())).thenReturn(response);

            PaymentInformationRequest payload = new PaymentInformationRequest();
            try {
                paymentInformationApiClient.createPaymentInformation("1", "2", "3", payload);
            } catch (RuntimeException e) {
                String m = e.getMessage();
                assertEquals("Api error: 500", m);
            }
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void createPaymentInformationNullParams() throws InvalidKeyException, ApiResponseException, IOException {

            PaymentInformationApiClient paymentInformationApiClient = spy(new PaymentInformationApiClient(CONFIG));
            PaymentInformationRequest payload = new PaymentInformationRequest();
            try {
                paymentInformationApiClient.createPaymentInformation(null, "2", "3", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Merchant ID is required", m);
            }

            try {
                paymentInformationApiClient.createPaymentInformation("1", null, "3", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Commerce Case ID is required", m);
            }

            try {
                paymentInformationApiClient.createPaymentInformation("1", "2", null, payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Checkout ID is required", m);
            }

            try {
                paymentInformationApiClient.createPaymentInformation("1", "2", "checkout it out", null);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Payload is required", m);
            }
        }

        @Nested
        @DisplayName("getPaymentInformation")
        class GetPaymentInformation {
            @Test
            @DisplayName("given request was successful, then return response")
            void getPaymentInformationSuccessful() throws InvalidKeyException, ApiResponseException, IOException {

                PaymentInformationApiClient paymentInformationApiClient = spy(new PaymentInformationApiClient(CONFIG));
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
                    throws InvalidKeyException, ApiResponseException, IOException {

                PaymentInformationApiClient paymentInformationApiClient = spy(new PaymentInformationApiClient(CONFIG));
                Response response = ApiResponseMocks.createErrorResponse(400);

                doReturn(response).when(paymentInformationApiClient).getResponse(any());
                when(paymentInformationApiClient.getResponse(any())).thenReturn(response);

                try {
                    paymentInformationApiClient.getPaymentInformation("1", "2", "3", "4");
                } catch (ApiResponseException e) {
                    int code = e.getResponse().getErrors().get(0).getHttpStatusCode();
                    assertEquals(400, code);
                }
            }

            @Test
            @DisplayName("given request was unsuccessful (500), then throw exception")
            void getPaymentInformationRequestUnsuccessful500()
                    throws InvalidKeyException, ApiResponseException, IOException {

                PaymentInformationApiClient paymentInformationApiClient = spy(new PaymentInformationApiClient(CONFIG));
                Response response = ApiResponseMocks.createErrorResponse(500);

                doReturn(response).when(paymentInformationApiClient).getResponse(any());
                when(paymentInformationApiClient.getResponse(any())).thenReturn(response);

                try {
                    paymentInformationApiClient.getPaymentInformation("1", "2", "3", "4");
                } catch (RuntimeException e) {
                    String m = e.getMessage();
                    assertEquals("Api error: 500", m);
                }
            }

            @Test
            @DisplayName("given required params are null, then throw exception")
            void getPaymentInformationNullParams() throws InvalidKeyException, ApiResponseException, IOException {

                PaymentInformationApiClient paymentInformationApiClient = spy(new PaymentInformationApiClient(CONFIG));
                try {
                    paymentInformationApiClient.getPaymentInformation(null, "2", "3", "4");
                } catch (IllegalArgumentException e) {
                    String m = e.getMessage();
                    assertEquals("Merchant ID is required", m);
                }

                try {
                    paymentInformationApiClient.getPaymentInformation("1", null, "3", "4");
                } catch (IllegalArgumentException e) {
                    String m = e.getMessage();
                    assertEquals("Commerce Case ID is required", m);
                }

                try {
                    paymentInformationApiClient.getPaymentInformation("1", "2", null, "4");
                } catch (IllegalArgumentException e) {
                    String m = e.getMessage();
                    assertEquals("Checkout ID is required", m);
                }

                try {
                    paymentInformationApiClient.getPaymentInformation("1", "2", "check it out", null);
                } catch (IllegalArgumentException e) {
                    String m = e.getMessage();
                    assertEquals("Payment Information ID is required", m);
                }
            }
        }
    }
}
