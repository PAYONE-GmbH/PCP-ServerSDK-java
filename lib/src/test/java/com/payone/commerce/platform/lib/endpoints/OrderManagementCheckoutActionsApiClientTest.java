package com.payone.commerce.platform.lib.endpoints;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.security.InvalidKeyException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.payone.commerce.platform.lib.ApiResponseException;
import com.payone.commerce.platform.lib.models.CancelRequest;
import com.payone.commerce.platform.lib.models.CancelResponse;
import com.payone.commerce.platform.lib.models.DeliverRequest;
import com.payone.commerce.platform.lib.models.DeliverResponse;
import com.payone.commerce.platform.lib.models.OrderRequest;
import com.payone.commerce.platform.lib.models.OrderResponse;
import com.payone.commerce.platform.lib.models.ReturnRequest;
import com.payone.commerce.platform.lib.models.ReturnResponse;
import com.payone.commerce.platform.lib.testutils.ApiResponseMocks;
import com.payone.commerce.platform.lib.testutils.TestConfig;

import okhttp3.Response;

public class OrderManagementCheckoutActionsApiClientTest {

    @Nested
    @DisplayName("createOrder")
    class CreateOrderTests {
        @Test
        @DisplayName("given request was successful, then return response")
        void createOrderSuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            OrderManagementCheckoutActionsApiClient orderManagementCheckoutActionsApiClient = spy(
                    new OrderManagementCheckoutActionsApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            OrderResponse expected = new OrderResponse();
            Response response = ApiResponseMocks.createResponse(200, new OrderResponse());

            doReturn(response).when(orderManagementCheckoutActionsApiClient).getResponse(any());
            when(orderManagementCheckoutActionsApiClient.getResponse(any())).thenReturn(response);

            OrderRequest payload = new OrderRequest();
            OrderResponse res = orderManagementCheckoutActionsApiClient.createOrder("1", "2", "3", payload);

            assertEquals(expected, res);

        }

        @Test
        @DisplayName("given request was unsuccessful (400), then throw exception")
        void createOrderUnsuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            OrderManagementCheckoutActionsApiClient orderManagementCheckoutActionsApiClient = spy(
                    new OrderManagementCheckoutActionsApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(orderManagementCheckoutActionsApiClient).getResponse(any());

            OrderRequest payload = new OrderRequest();
            try {
                orderManagementCheckoutActionsApiClient.createOrder("1", "2", "3", payload);
            } catch (ApiResponseException e) {
                int s = e.getResponse().getErrors().get(0).getHttpStatusCode();
                assertEquals(400, s);
            }
        }

        @Test
        @DisplayName("given request was unsuccessful (500), then throw exception")
        void createOrderUnsuccessful500() throws InvalidKeyException, ApiResponseException, IOException {

            OrderManagementCheckoutActionsApiClient orderManagementCheckoutActionsApiClient = spy(
                    new OrderManagementCheckoutActionsApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(500);

            doReturn(response).when(orderManagementCheckoutActionsApiClient).getResponse(any());

            OrderRequest payload = new OrderRequest();
            try {
                orderManagementCheckoutActionsApiClient.createOrder("1", "2", "3", payload);
            } catch (RuntimeException e) {
                String m = e.getMessage();
                assertEquals("Api error: 500", m);
            }
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void createOrderNullParams() throws InvalidKeyException, ApiResponseException, IOException {

            OrderManagementCheckoutActionsApiClient orderManagementCheckoutActionsApiClient = spy(
                    new OrderManagementCheckoutActionsApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            OrderRequest payload = new OrderRequest();

            try {
                orderManagementCheckoutActionsApiClient.createOrder(null, "2", "3", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Merchant ID is required", m);
            }

            try {
                orderManagementCheckoutActionsApiClient.createOrder("1", null, "3", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Commerce Case ID is required", m);
            }

            try {
                orderManagementCheckoutActionsApiClient.createOrder("1", "2", null, payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Checkout ID is required", m);
            }

            try {
                orderManagementCheckoutActionsApiClient.createOrder("1", "2", "3", null);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Payload is required", m);
            }
        }
    }

    @Nested
    @DisplayName("deliverOrder")
    class DeliverOrderTests {
        @Test
        @DisplayName("given request was successful, then return response")
        void deliverOrderSuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            OrderManagementCheckoutActionsApiClient orderManagementCheckoutActionsApiClient = spy(
                    new OrderManagementCheckoutActionsApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            DeliverResponse expected = new DeliverResponse();
            Response response = ApiResponseMocks.createResponse(200, new DeliverResponse());

            doReturn(response).when(orderManagementCheckoutActionsApiClient).getResponse(any());
            when(orderManagementCheckoutActionsApiClient.getResponse(any())).thenReturn(response);

            DeliverRequest payload = new DeliverRequest();
            DeliverResponse res = orderManagementCheckoutActionsApiClient.deliverOrder("1", "2", "3", payload);

            assertEquals(expected, res);

        }

        @Test
        @DisplayName("given request was unsuccessful (400), then throw exception")
        void deliverOrderUnsuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            OrderManagementCheckoutActionsApiClient orderManagementCheckoutActionsApiClient = spy(
                    new OrderManagementCheckoutActionsApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(orderManagementCheckoutActionsApiClient).getResponse(any());

            DeliverRequest payload = new DeliverRequest();
            try {
                orderManagementCheckoutActionsApiClient.deliverOrder("1", "2", "3", payload);
            } catch (ApiResponseException e) {
                int s = e.getResponse().getErrors().get(0).getHttpStatusCode();
                assertEquals(400, s);
            }
        }

        @Test
        @DisplayName("given request was unsuccessful (500), then throw exception")
        void deliverOrderUnsuccessful500() throws InvalidKeyException, ApiResponseException, IOException {

            OrderManagementCheckoutActionsApiClient orderManagementCheckoutActionsApiClient = spy(
                    new OrderManagementCheckoutActionsApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(500);

            doReturn(response).when(orderManagementCheckoutActionsApiClient).getResponse(any());

            DeliverRequest payload = new DeliverRequest();
            try {
                orderManagementCheckoutActionsApiClient.deliverOrder("1", "2", "3", payload);
            } catch (RuntimeException e) {
                String m = e.getMessage();
                assertEquals("Api error: 500", m);
            }
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void deliverOrderNullParams() throws InvalidKeyException, ApiResponseException, IOException {

            OrderManagementCheckoutActionsApiClient orderManagementCheckoutActionsApiClient = spy(
                    new OrderManagementCheckoutActionsApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            DeliverRequest payload = new DeliverRequest();

            try {
                orderManagementCheckoutActionsApiClient.deliverOrder(null, "2", "3", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Merchant ID is required", m);
            }

            try {
                orderManagementCheckoutActionsApiClient.deliverOrder("1", null, "3", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Commerce Case ID is required", m);
            }

            try {
                orderManagementCheckoutActionsApiClient.deliverOrder("1", "2", null, payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Checkout ID is required", m);
            }

            try {
                orderManagementCheckoutActionsApiClient.deliverOrder("1", "2", "3", null);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Payload is required", m);
            }
        }
    }

    @Nested
    @DisplayName("returnOrder")
    class ReturnOrderTests {
        @Test
        @DisplayName("given request was successful, then return response")
        void returnOrderSuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            OrderManagementCheckoutActionsApiClient orderManagementCheckoutActionsApiClient = spy(
                    new OrderManagementCheckoutActionsApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            ReturnResponse expected = new ReturnResponse();
            Response response = ApiResponseMocks.createResponse(200, new ReturnResponse());

            doReturn(response).when(orderManagementCheckoutActionsApiClient).getResponse(any());
            when(orderManagementCheckoutActionsApiClient.getResponse(any())).thenReturn(response);

            ReturnRequest payload = new ReturnRequest();
            ReturnResponse res = orderManagementCheckoutActionsApiClient.returnOrder("1", "2", "3", payload);

            assertEquals(expected, res);

        }

        @Test
        @DisplayName("given request was unsuccessful (400), then throw exception")
        void returnOrderUnsuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            OrderManagementCheckoutActionsApiClient orderManagementCheckoutActionsApiClient = spy(
                    new OrderManagementCheckoutActionsApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(orderManagementCheckoutActionsApiClient).getResponse(any());

            ReturnRequest payload = new ReturnRequest();
            try {
                orderManagementCheckoutActionsApiClient.returnOrder("1", "2", "3", payload);
            } catch (ApiResponseException e) {
                int s = e.getResponse().getErrors().get(0).getHttpStatusCode();
                assertEquals(400, s);
            }
        }

        @Test
        @DisplayName("given request was unsuccessful (500), then throw exception")
        void returnOrderUnsuccessful500() throws InvalidKeyException, ApiResponseException, IOException {

            OrderManagementCheckoutActionsApiClient orderManagementCheckoutActionsApiClient = spy(
                    new OrderManagementCheckoutActionsApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(500);

            doReturn(response).when(orderManagementCheckoutActionsApiClient).getResponse(any());

            ReturnRequest payload = new ReturnRequest();
            try {
                orderManagementCheckoutActionsApiClient.returnOrder("1", "2", "3", payload);
            } catch (RuntimeException e) {
                String m = e.getMessage();
                assertEquals("Api error: 500", m);
            }
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void returnOrderNullParams() throws InvalidKeyException, ApiResponseException, IOException {

            OrderManagementCheckoutActionsApiClient orderManagementCheckoutActionsApiClient = spy(
                    new OrderManagementCheckoutActionsApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            ReturnRequest payload = new ReturnRequest();

            try {
                orderManagementCheckoutActionsApiClient.returnOrder(null, "2", "3", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Merchant ID is required", m);
            }

            try {
                orderManagementCheckoutActionsApiClient.returnOrder("1", null, "3", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Commerce Case ID is required", m);
            }

            try {
                orderManagementCheckoutActionsApiClient.returnOrder("1", "2", null, payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Checkout ID is required", m);
            }

            try {
                orderManagementCheckoutActionsApiClient.returnOrder("1", "2", "3", null);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Payload is required", m);
            }
        }
    }

    @Nested
    @DisplayName("cancelOrder")
    class CancelOrderTests {
        @Test
        @DisplayName("given request was successful, then return response")
        void cancelOrderSuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            OrderManagementCheckoutActionsApiClient orderManagementCheckoutActionsApiClient = spy(
                    new OrderManagementCheckoutActionsApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            CancelResponse expected = new CancelResponse();
            Response response = ApiResponseMocks.createResponse(200, new CancelResponse());

            doReturn(response).when(orderManagementCheckoutActionsApiClient).getResponse(any());
            when(orderManagementCheckoutActionsApiClient.getResponse(any())).thenReturn(response);

            CancelRequest payload = new CancelRequest();
            CancelResponse res = orderManagementCheckoutActionsApiClient.cancelOrder("1", "2", "3", payload);

            assertEquals(expected, res);

        }

        @Test
        @DisplayName("given request was unsuccessful (400), then throw exception")
        void cancelOrderUnsuccessful() throws InvalidKeyException, ApiResponseException, IOException {

            OrderManagementCheckoutActionsApiClient orderManagementCheckoutActionsApiClient = spy(
                    new OrderManagementCheckoutActionsApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(400);

            doReturn(response).when(orderManagementCheckoutActionsApiClient).getResponse(any());

            CancelRequest payload = new CancelRequest();
            try {
                orderManagementCheckoutActionsApiClient.cancelOrder("1", "2", "3", payload);
            } catch (ApiResponseException e) {
                int s = e.getResponse().getErrors().get(0).getHttpStatusCode();
                assertEquals(400, s);
            }
        }

        @Test
        @DisplayName("given request was unsuccessful (500), then throw exception")
        void cancelOrderUnsuccessful500() throws InvalidKeyException, ApiResponseException, IOException {

            OrderManagementCheckoutActionsApiClient orderManagementCheckoutActionsApiClient = spy(
                    new OrderManagementCheckoutActionsApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            Response response = ApiResponseMocks.createErrorResponse(500);

            doReturn(response).when(orderManagementCheckoutActionsApiClient).getResponse(any());

            CancelRequest payload = new CancelRequest();
            try {
                orderManagementCheckoutActionsApiClient.cancelOrder("1", "2", "3", payload);
            } catch (RuntimeException e) {
                String m = e.getMessage();
                assertEquals("Api error: 500", m);
            }
        }

        @Test
        @DisplayName("given some params are null, then throw exception")
        void cancelOrderNullParams() throws InvalidKeyException, ApiResponseException, IOException {

            OrderManagementCheckoutActionsApiClient orderManagementCheckoutActionsApiClient = spy(
                    new OrderManagementCheckoutActionsApiClient(TestConfig.COMMUNICATOR_CONFIGURATION));
            CancelRequest payload = new CancelRequest();

            try {
                orderManagementCheckoutActionsApiClient.cancelOrder(null, "2", "3", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Merchant ID is required", m);
            }

            try {
                orderManagementCheckoutActionsApiClient.cancelOrder("1", null, "3", payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Commerce Case ID is required", m);
            }

            try {
                orderManagementCheckoutActionsApiClient.cancelOrder("1", "2", null, payload);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Checkout ID is required", m);
            }

            try {
                orderManagementCheckoutActionsApiClient.cancelOrder("1", "2", "3", null);
            } catch (IllegalArgumentException e) {
                String m = e.getMessage();
                assertEquals("Payload is required", m);
            }
        }
    }

}
