/*
 * This source file was generated by the Gradle 'init' task
 */
package com.payone.commerce.platform.lib.endpoints;

import java.io.IOException;
import java.security.InvalidKeyException;

import com.payone.commerce.platform.lib.ApiResponseException;
import com.payone.commerce.platform.lib.CommunicatorConfiguration;
import com.payone.commerce.platform.lib.models.CancelRequest;
import com.payone.commerce.platform.lib.models.CancelResponse;
import com.payone.commerce.platform.lib.models.DeliverRequest;
import com.payone.commerce.platform.lib.models.DeliverResponse;
import com.payone.commerce.platform.lib.models.OrderRequest;
import com.payone.commerce.platform.lib.models.OrderResponse;
import com.payone.commerce.platform.lib.models.ReturnRequest;
import com.payone.commerce.platform.lib.models.ReturnResponse;

import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;

public class OrderManagementCheckoutActionsApiClient extends BaseApiClient {

    public OrderManagementCheckoutActionsApiClient(CommunicatorConfiguration config) throws InvalidKeyException {
        super(config);
    }

    public OrderResponse createOrder(String merchantId, String commerceCaseId,
            String checkoutId, OrderRequest payload)
            throws ApiResponseException, IOException {
        if (merchantId == null) {
            throw new IllegalArgumentException("Merchant ID is required");
        }
        if (commerceCaseId == null) {
            throw new IllegalArgumentException("Commerce Case ID is required");
        }
        if (checkoutId == null) {
            throw new IllegalArgumentException("Checkout ID is required");
        }
        if (payload == null) {
            throw new IllegalArgumentException("Payload is required");
        }

        HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host(this.getConfig().getHost())
                .addPathSegment("v1")
                .addPathSegment(merchantId)
                .addPathSegment("commerce-cases")
                .addPathSegment(commerceCaseId)
                .addPathSegment("checkouts")
                .addPathSegment(checkoutId)
                .addPathSegment("order")
                .build();

        String jsonString = getJsonMapper().writeValueAsString(payload);

        RequestBody formBody = RequestBody.create(jsonString, JSON);

        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .header("Content-Type", formBody.contentType().toString())
                .build();

        request = this.getRequestHeaderGenerator().generateAdditionalRequestHeaders(request);

        return this.makeApiCall(request, OrderResponse.class);

    }

    public DeliverResponse deliverOrder(String merchantId, String commerceCaseId,
            String checkoutId, DeliverRequest payload)
            throws ApiResponseException, IOException {
        if (merchantId == null) {
            throw new IllegalArgumentException("Merchant ID is required");
        }
        if (commerceCaseId == null) {
            throw new IllegalArgumentException("Commerce Case ID is required");
        }
        if (checkoutId == null) {
            throw new IllegalArgumentException("Checkout ID is required");
        }
        if (payload == null) {
            throw new IllegalArgumentException("Payload is required");
        }

        HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host(this.getConfig().getHost())
                .addPathSegment("v1")
                .addPathSegment(merchantId)
                .addPathSegment("commerce-cases")
                .addPathSegment(commerceCaseId)
                .addPathSegment("checkouts")
                .addPathSegment(checkoutId)
                .addPathSegment("deliver")
                .build();

        String jsonString = getJsonMapper().writeValueAsString(payload);

        RequestBody formBody = RequestBody.create(jsonString, JSON);

        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .header("Content-Type", formBody.contentType().toString())
                .build();

        request = this.getRequestHeaderGenerator().generateAdditionalRequestHeaders(request);

        return this.makeApiCall(request, DeliverResponse.class);

    }

    public ReturnResponse returnOrder(String merchantId, String commerceCaseId,
            String checkoutId, ReturnRequest payload)
            throws ApiResponseException, IOException {
        if (merchantId == null) {
            throw new IllegalArgumentException("Merchant ID is required");
        }
        if (commerceCaseId == null) {
            throw new IllegalArgumentException("Commerce Case ID is required");
        }
        if (checkoutId == null) {
            throw new IllegalArgumentException("Checkout ID is required");
        }
        if (payload == null) {
            throw new IllegalArgumentException("Payload is required");
        }

        HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host(this.getConfig().getHost())
                .addPathSegment("v1")
                .addPathSegment(merchantId)
                .addPathSegment("commerce-cases")
                .addPathSegment(commerceCaseId)
                .addPathSegment("checkouts")
                .addPathSegment(checkoutId)
                .addPathSegment("return")
                .build();

        String jsonString = getJsonMapper().writeValueAsString(payload);

        RequestBody formBody = RequestBody.create(jsonString, JSON);

        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .header("Content-Type", formBody.contentType().toString())
                .build();

        request = this.getRequestHeaderGenerator().generateAdditionalRequestHeaders(request);

        return this.makeApiCall(request, ReturnResponse.class);

    }

    public CancelResponse cancelOrder(String merchantId, String commerceCaseId,
            String checkoutId, CancelRequest payload)
            throws ApiResponseException, IOException {
        if (merchantId == null) {
            throw new IllegalArgumentException("Merchant ID is required");
        }
        if (commerceCaseId == null) {
            throw new IllegalArgumentException("Commerce Case ID is required");
        }
        if (checkoutId == null) {
            throw new IllegalArgumentException("Checkout ID is required");
        }
        if (payload == null) {
            throw new IllegalArgumentException("Payload is required");
        }

        HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host(this.getConfig().getHost())
                .addPathSegment("v1")
                .addPathSegment(merchantId)
                .addPathSegment("commerce-cases")
                .addPathSegment(commerceCaseId)
                .addPathSegment("checkouts")
                .addPathSegment(checkoutId)
                .addPathSegment("cancel")
                .build();

        String jsonString = getJsonMapper().writeValueAsString(payload);

        RequestBody formBody = RequestBody.create(jsonString, JSON);

        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .header("Content-Type", formBody.contentType().toString())
                .build();

        request = this.getRequestHeaderGenerator().generateAdditionalRequestHeaders(request);

        return this.makeApiCall(request, CancelResponse.class);

    }

}
