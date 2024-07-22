package com.payone.commerce.platform.lib.endpoints;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.payone.commerce.platform.lib.ApiResponseException;
import com.payone.commerce.platform.lib.CommunicatorConfiguration;
import com.payone.commerce.platform.lib.models.CommerceCaseResponse;
import com.payone.commerce.platform.lib.models.CreateCommerceCaseRequest;
import com.payone.commerce.platform.lib.models.CreateCommerceCaseResponse;
import com.payone.commerce.platform.lib.models.Customer;
import com.payone.commerce.platform.lib.testutils.ApiResponseMocks;

import okhttp3.Response;

public class CommerceCaseApiClientTest {

    private final String TEST_KEY = "KEY";
    private final String TEST_SECRET = "Super duper Ethan Hunt level secret";
    private final CommunicatorConfiguration CONFIG = new CommunicatorConfiguration(TEST_KEY, TEST_SECRET,
            "awesome-api.com");

    @Nested
    @DisplayName("createCommerceCaseRequest")
    class CreateCommerceCaseRequestTests {
        @Test
        @DisplayName("given request was successful, then return response")
        void createCommerceCaseRequestSuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(new CommerceCaseApiClient(CONFIG));
            CreateCommerceCaseResponse expected = new CreateCommerceCaseResponse();
            Response response = ApiResponseMocks.createResponse(200, new CreateCommerceCaseResponse());

            doReturn(response).when(commerceCaseApiClient).getResponse(any());
            when(commerceCaseApiClient.getResponse(any())).thenReturn(response);

            CreateCommerceCaseRequest payload = new CreateCommerceCaseRequest();
            CreateCommerceCaseResponse res = commerceCaseApiClient.createCommerceCaseRequest("1", payload);

            assertEquals(expected, res);

        }

        @Test
        @DisplayName("given request was unsuccessful (400), then throw exception")
        void createCommerceCaseRequestUnsuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(new CommerceCaseApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(commerceCaseApiClient).getResponse(any());

            CreateCommerceCaseRequest payload = new CreateCommerceCaseRequest();
            try {
                commerceCaseApiClient.createCommerceCaseRequest("1", payload);
            } catch (ApiResponseException e) {
                int s = e.getResponse().getErrors().get(0).getHttpStatusCode();
                assertEquals(400, s);
            }
        }

        @Test
        @DisplayName("given request was unsuccessful (500), then throw exception")
        void createCommerceCaseRequestUnsuccessful500() throws InvalidKeyException, ApiResponseException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(new CommerceCaseApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(500);

            doReturn(response).when(commerceCaseApiClient).getResponse(any());

            CreateCommerceCaseRequest payload = new CreateCommerceCaseRequest();
            try {
                commerceCaseApiClient.createCommerceCaseRequest("1", payload);
            } catch (RuntimeException e) {
                String m = e.getMessage();
                assertEquals("Api error: 500", m);
            }
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void createCommerceCaseRequestNullParams() throws InvalidKeyException, ApiResponseException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(new CommerceCaseApiClient(CONFIG));
            CreateCommerceCaseRequest payload = new CreateCommerceCaseRequest();

            try {
                commerceCaseApiClient.createCommerceCaseRequest(null, payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Merchant ID is required", m);
            }

            try {
                commerceCaseApiClient.createCommerceCaseRequest("1", null);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Payload is required", m);
            }
        }
    }

    @Nested
    @DisplayName("getAllCommerceCaseRequest")
    class getAllCommerceCaseRequestTests {
        @Test
        @DisplayName("given request was successful, then return response")
        void getAllCommerceCaseRequestSuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(new CommerceCaseApiClient(CONFIG));
            List<CommerceCaseResponse> expected = List.of(new CommerceCaseResponse());
            Response response = ApiResponseMocks.createResponse(200, List.of(new CommerceCaseResponse()));

            doReturn(response).when(commerceCaseApiClient).getResponse(any());
            when(commerceCaseApiClient.getResponse(any())).thenReturn(response);

            List<CommerceCaseResponse> res = commerceCaseApiClient.getAllCommerceCaseRequest("1");

            assertEquals(expected, res);

        }

        @Test
        @DisplayName("given request was unsuccessful (400), then throw exception")
        void getAllCommerceCaseRequestUnsuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(new CommerceCaseApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(commerceCaseApiClient).getResponse(any());

            try {
                commerceCaseApiClient.getAllCommerceCaseRequest("1");
            } catch (ApiResponseException e) {
                int s = e.getResponse().getErrors().get(0).getHttpStatusCode();
                assertEquals(400, s);
            }
        }

        @Test
        @DisplayName("given request was unsuccessful (500), then throw exception")
        void getAllCommerceCaseRequestUnsuccessful500() throws InvalidKeyException, ApiResponseException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(new CommerceCaseApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(500);

            doReturn(response).when(commerceCaseApiClient).getResponse(any());

            try {
                commerceCaseApiClient.getAllCommerceCaseRequest("1");
            } catch (RuntimeException e) {
                String m = e.getMessage();
                assertEquals("Api error: 500", m);
            }
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void getAllCommerceCaseRequestNullParams() throws InvalidKeyException, ApiResponseException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(new CommerceCaseApiClient(CONFIG));

            try {
                commerceCaseApiClient.getAllCommerceCaseRequest(null);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Merchant ID is required", m);
            }

        }
    }

    @Nested
    @DisplayName("getCommerceCaseRequest")
    class GetCommerceCaseRequestTests {
        @Test
        @DisplayName("given request was successful, then return response")
        void getCommerceCaseRequestSuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(new CommerceCaseApiClient(CONFIG));
            CommerceCaseResponse expected = new CommerceCaseResponse();
            Response response = ApiResponseMocks.createResponse(200, new CommerceCaseResponse());

            doReturn(response).when(commerceCaseApiClient).getResponse(any());
            when(commerceCaseApiClient.getResponse(any())).thenReturn(response);

            CommerceCaseResponse res = commerceCaseApiClient.getCommerceCaseRequest("1", "2");

            assertEquals(expected, res);

        }

        @Test
        @DisplayName("given request was unsuccessful (400), then throw exception")
        void getCommerceCaseRequestUnsuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(new CommerceCaseApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(commerceCaseApiClient).getResponse(any());

            try {
                commerceCaseApiClient.getCommerceCaseRequest("1", "2");
            } catch (ApiResponseException e) {
                int s = e.getResponse().getErrors().get(0).getHttpStatusCode();
                assertEquals(400, s);
            }
        }

        @Test
        @DisplayName("given request was unsuccessful (500), then throw exception")
        void getCommerceCaseRequestUnsuccessful500() throws InvalidKeyException, ApiResponseException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(new CommerceCaseApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(500);

            doReturn(response).when(commerceCaseApiClient).getResponse(any());

            try {
                commerceCaseApiClient.getCommerceCaseRequest("1", "2");
            } catch (RuntimeException e) {
                String m = e.getMessage();
                assertEquals("Api error: 500", m);
            }
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void getCommerceCaseRequestNullParams() throws InvalidKeyException, ApiResponseException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(new CommerceCaseApiClient(CONFIG));

            try {
                commerceCaseApiClient.getCommerceCaseRequest(null, "2");
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Merchant ID is required", m);
            }

            try {
                commerceCaseApiClient.getCommerceCaseRequest("1", null);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Commerce Case ID is required", m);
            }
        }
    }

    @Nested
    @DisplayName("updateCommerceCaseRequest")
    class UpdateCommerceCaseRequestTests {
        @Test
        @DisplayName("given request was successful, then throw no exception")
        void updateCommerceCaseRequestSuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(new CommerceCaseApiClient(CONFIG));
            Response response = ApiResponseMocks.createResponse(200);

            doReturn(response).when(commerceCaseApiClient).getResponse(any());
            when(commerceCaseApiClient.getResponse(any())).thenReturn(response);

            Customer payload = new Customer();

            assertDoesNotThrow(() -> commerceCaseApiClient.updateCommerceCaseRequest("1", "3", payload));

        }

        @Test
        @DisplayName("given request was unsuccessful (400), then throw exception")
        void updateCommerceCaseRequestUnsuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(new CommerceCaseApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(commerceCaseApiClient).getResponse(any());

            try {

                Customer payload = new Customer();
                commerceCaseApiClient.updateCommerceCaseRequest("1", "3", payload);
            } catch (ApiResponseException e) {
                int s = e.getResponse().getErrors().get(0).getHttpStatusCode();
                assertEquals(400, s);
            }
        }

        @Test
        @DisplayName("given request was unsuccessful (500), then throw exception")
        void updateCommerceCaseRequestUnsuccessful500() throws InvalidKeyException, ApiResponseException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(new CommerceCaseApiClient(CONFIG));
            Response response = ApiResponseMocks.createErrorResponse(500);

            doReturn(response).when(commerceCaseApiClient).getResponse(any());

            try {
                Customer payload = new Customer();
                commerceCaseApiClient.updateCommerceCaseRequest("1", "3", payload);
            } catch (RuntimeException e) {
                String m = e.getMessage();
                assertEquals("Api error: 500", m);
            }
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void updateCommerceCaseRequestNullParams() throws InvalidKeyException, ApiResponseException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(new CommerceCaseApiClient(CONFIG));

            try {
                Customer payload = new Customer();
                commerceCaseApiClient.updateCommerceCaseRequest(null, "2", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Merchant ID is required", m);
            }

            try {
                Customer payload = new Customer();
                commerceCaseApiClient.updateCommerceCaseRequest("1", null, payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Commerce Case ID is required", m);
            }

            try {
                commerceCaseApiClient.updateCommerceCaseRequest("1", "2", null);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Payload is required", m);
            }
        }
    }

}
