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
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.payone.commerce.platform.lib.errors.ApiErrorResponseException;
import com.payone.commerce.platform.lib.errors.ApiException;
import com.payone.commerce.platform.lib.errors.ApiResponseRetrievalException;
import com.payone.commerce.platform.lib.models.CommerceCaseResponse;
import com.payone.commerce.platform.lib.models.CreateCommerceCaseRequest;
import com.payone.commerce.platform.lib.models.CreateCommerceCaseResponse;
import com.payone.commerce.platform.lib.models.Customer;
import com.payone.commerce.platform.lib.testutils.ApiResponseMocks;
import com.payone.commerce.platform.lib.testutils.TestConfig;

import okhttp3.Response;

public class CommerceCaseApiClientTest {

    @Nested
    @DisplayName("createCommerceCaseRequest")
    class CreateCommerceCaseRequestTests {
        @Test
        @DisplayName("given request was successful, then return response")
        void createCommerceCaseRequestSuccessful() throws InvalidKeyException, ApiException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(
                    new CommerceCaseApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
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
        void createCommerceCaseRequestUnsuccessful() throws InvalidKeyException, ApiException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(
                    new CommerceCaseApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(commerceCaseApiClient).getResponse(any());

            ApiErrorResponseException e = assertThrows(ApiErrorResponseException.class, () -> {
                CreateCommerceCaseRequest payload = new CreateCommerceCaseRequest();
                commerceCaseApiClient.createCommerceCaseRequest("1", payload);
            });
            int s = e.getErrors().get(0).getHttpStatusCode();
            assertEquals(400, s);
        }

        @Test
        @DisplayName("given request was unsuccessful (500) with empty body, then throw exception")
        void createCommerceCaseRequestUnsuccessful500() throws InvalidKeyException, ApiException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(
                    new CommerceCaseApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createEmptyErrorResponse(500);

            doReturn(response).when(commerceCaseApiClient).getResponse(any());

            ApiResponseRetrievalException e = assertThrows(ApiResponseRetrievalException.class, () -> {
                CreateCommerceCaseRequest payload = new CreateCommerceCaseRequest();
                commerceCaseApiClient.createCommerceCaseRequest("1", payload);
            });
            int code = e.getStatusCode();
            assertEquals(500, code);
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void createCommerceCaseRequestNullParams() throws InvalidKeyException, ApiException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(
                    new CommerceCaseApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            CreateCommerceCaseRequest payload = new CreateCommerceCaseRequest();

            IllegalArgumentException e;
            String m;

            e = assertThrows(IllegalArgumentException.class, () -> {
                commerceCaseApiClient.createCommerceCaseRequest(null, payload);
            });
            m = e.getMessage();
            assertEquals("Merchant ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                commerceCaseApiClient.createCommerceCaseRequest("1", null);
            });
            m = e.getMessage();
            assertEquals("Payload is required", m);
        }
    }

    @Nested
    @DisplayName("getAllCommerceCaseRequest")
    class getAllCommerceCaseRequestTests {
        @Test
        @DisplayName("given request was successful, then return response")
        void getAllCommerceCaseRequestSuccessful() throws InvalidKeyException, ApiException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(
                    new CommerceCaseApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            List<CommerceCaseResponse> expected = Arrays.asList(new CommerceCaseResponse());
            Response response = ApiResponseMocks.createResponse(200, Arrays.asList(new CommerceCaseResponse()));

            doReturn(response).when(commerceCaseApiClient).getResponse(any());
            when(commerceCaseApiClient.getResponse(any())).thenReturn(response);

            List<CommerceCaseResponse> res = commerceCaseApiClient.getAllCommerceCaseRequest("1");

            assertEquals(expected, res);

        }

        @Test
        @DisplayName("given request was unsuccessful (400), then throw exception")
        void getAllCommerceCaseRequestUnsuccessful() throws InvalidKeyException, ApiException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(
                    new CommerceCaseApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(commerceCaseApiClient).getResponse(any());

            ApiErrorResponseException e = assertThrows(ApiErrorResponseException.class, () -> {
                commerceCaseApiClient.getAllCommerceCaseRequest("1");
            });
            int s = e.getStatusCode();
            assertEquals(400, s);
        }

        @Test
        @DisplayName("given request was unsuccessful (500), then throw exception")
        void getAllCommerceCaseRequestUnsuccessful500() throws InvalidKeyException, ApiException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(
                    new CommerceCaseApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createEmptyErrorResponse(500);

            doReturn(response).when(commerceCaseApiClient).getResponse(any());

            ApiResponseRetrievalException e = assertThrows(ApiResponseRetrievalException.class, () -> {
                commerceCaseApiClient.getAllCommerceCaseRequest("1");
            });
            int code = e.getStatusCode();
            assertEquals(500, code);
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void getAllCommerceCaseRequestNullParams() throws InvalidKeyException, ApiException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(
                    new CommerceCaseApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));

            IllegalArgumentException e;
            String m;

            e = assertThrows(IllegalArgumentException.class, () -> {
                commerceCaseApiClient.getAllCommerceCaseRequest(null);
            });
            m = e.getMessage();
            assertEquals("Merchant ID is required", m);
        }
    }

    @Nested
    @DisplayName("getCommerceCaseRequest")
    class GetCommerceCaseRequestTests {
        @Test
        @DisplayName("given request was successful, then return response")
        void getCommerceCaseRequestSuccessful() throws InvalidKeyException, ApiException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(
                    new CommerceCaseApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            CommerceCaseResponse expected = new CommerceCaseResponse();
            Response response = ApiResponseMocks.createResponse(200, new CommerceCaseResponse());

            doReturn(response).when(commerceCaseApiClient).getResponse(any());
            when(commerceCaseApiClient.getResponse(any())).thenReturn(response);

            CommerceCaseResponse res = commerceCaseApiClient.getCommerceCaseRequest("1", "2");

            assertEquals(expected, res);

        }

        @Test
        @DisplayName("given request was unsuccessful (400), then throw exception")
        void getCommerceCaseRequestUnsuccessful() throws InvalidKeyException, ApiException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(
                    new CommerceCaseApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(commerceCaseApiClient).getResponse(any());

            ApiErrorResponseException e = assertThrows(ApiErrorResponseException.class, () -> {
                commerceCaseApiClient.getCommerceCaseRequest("1", "2");
            });
            int s = e.getStatusCode();
            assertEquals(400, s);
        }

        @Test
        @DisplayName("given request was unsuccessful (500) with empty body, then throw exception")
        void getCommerceCaseRequestUnsuccessful500() throws InvalidKeyException, ApiException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(
                    new CommerceCaseApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createEmptyErrorResponse(500);

            doReturn(response).when(commerceCaseApiClient).getResponse(any());

            ApiResponseRetrievalException e = assertThrows(ApiResponseRetrievalException.class, () -> {
                commerceCaseApiClient.getCommerceCaseRequest("1", "2");
            });
            int code = e.getStatusCode();
            assertEquals(500, code);
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void getCommerceCaseRequestNullParams() throws InvalidKeyException, ApiException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(
                    new CommerceCaseApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));

            IllegalArgumentException e;
            String m;

            e = assertThrows(IllegalArgumentException.class, () -> {
                commerceCaseApiClient.getCommerceCaseRequest(null, "2");
            });
            m = e.getMessage();
            assertEquals("Merchant ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                commerceCaseApiClient.getCommerceCaseRequest("1", null);
            });
            m = e.getMessage();
            assertEquals("Commerce Case ID is required", m);
        }
    }

    @Nested
    @DisplayName("updateCommerceCaseRequest")
    class UpdateCommerceCaseRequestTests {
        @Test
        @DisplayName("given request was successful, then throw no exception")
        void updateCommerceCaseRequestSuccessful() throws InvalidKeyException, ApiException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(
                    new CommerceCaseApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createResponse(200);

            doReturn(response).when(commerceCaseApiClient).getResponse(any());
            when(commerceCaseApiClient.getResponse(any())).thenReturn(response);

            Customer payload = new Customer();

            assertDoesNotThrow(() -> commerceCaseApiClient.updateCommerceCaseRequest("1", "3", payload));

        }

        @Test
        @DisplayName("given request was unsuccessful (400), then throw exception")
        void updateCommerceCaseRequestUnsuccessful() throws InvalidKeyException, ApiException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(
                    new CommerceCaseApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(commerceCaseApiClient).getResponse(any());

            ApiErrorResponseException e = assertThrows(ApiErrorResponseException.class, () -> {
                Customer payload = new Customer();
                commerceCaseApiClient.updateCommerceCaseRequest("1", "3", payload);
            });
            int s = e.getErrors().get(0).getHttpStatusCode();
            assertEquals(400, s);
        }

        @Test
        @DisplayName("given request was unsuccessful (500) with empty body, then throw exception")
        void updateCommerceCaseRequestUnsuccessful500() throws InvalidKeyException, ApiException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(
                    new CommerceCaseApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createEmptyErrorResponse(500);

            doReturn(response).when(commerceCaseApiClient).getResponse(any());

            ApiResponseRetrievalException e = assertThrows(ApiResponseRetrievalException.class, () -> {
                Customer payload = new Customer();
                commerceCaseApiClient.updateCommerceCaseRequest("1", "3", payload);
            });
            int code = e.getStatusCode();
            assertEquals(500, code);
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void updateCommerceCaseRequestNullParams() throws InvalidKeyException, ApiException, IOException {

            CommerceCaseApiClient commerceCaseApiClient = spy(
                    new CommerceCaseApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));

            IllegalArgumentException e;
            String m;

            e = assertThrows(IllegalArgumentException.class, () -> {
                Customer payload = new Customer();
                commerceCaseApiClient.updateCommerceCaseRequest(null, "2", payload);
            });
            m = e.getMessage();
            assertEquals("Merchant ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                Customer payload = new Customer();
                commerceCaseApiClient.updateCommerceCaseRequest("1", null, payload);
            });
            m = e.getMessage();
            assertEquals("Commerce Case ID is required", m);

            e = assertThrows(IllegalArgumentException.class, () -> {
                commerceCaseApiClient.updateCommerceCaseRequest("1", "2", null);
            });
            m = e.getMessage();
            assertEquals("Payload is required", m);
        }
    }

}
