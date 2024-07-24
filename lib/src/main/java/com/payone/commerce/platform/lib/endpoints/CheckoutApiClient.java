package com.payone.commerce.platform.lib.endpoints;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.payone.commerce.platform.lib.CommunicatorConfiguration;
import com.payone.commerce.platform.lib.errors.ApiErrorResponseException;
import com.payone.commerce.platform.lib.errors.ApiResponseRetrievalException;
import com.payone.commerce.platform.lib.models.CheckoutResponse;
import com.payone.commerce.platform.lib.models.CreateCheckoutRequest;
import com.payone.commerce.platform.lib.models.CreateCheckoutResponse;
import com.payone.commerce.platform.lib.models.PatchCheckoutRequest;
import com.payone.commerce.platform.lib.queries.GetCheckoutsQuery;

import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;

public class CheckoutApiClient extends BaseApiClient {
    public CheckoutApiClient(CommunicatorConfiguration config) throws InvalidKeyException {
        super(config);
    }

    public CheckoutApiClient() throws InvalidKeyException {
        super();
    }

    public CreateCheckoutResponse createCheckoutRequest(String merchantId, String commerceCaseId,
            CreateCheckoutRequest payload)
            throws ApiErrorResponseException, ApiResponseRetrievalException, IOException {
        if (merchantId == null) {
            throw new IllegalArgumentException("Merchant ID is required");
        }
        if (commerceCaseId == null) {
            throw new IllegalArgumentException("Commerce Case ID is required");
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
                .build();

        String jsonString = null;

        jsonString = getJsonMapper().writeValueAsString(payload);

        Request request = new Request.Builder()
                .url(url)
                .post(RequestBody.create(jsonString, JSON))
                .header("Content-Type", JSON.toString())
                .build();

        return this.makeApiCall(request, CreateCheckoutResponse.class);

    }

    public CheckoutResponse getCheckoutRequest(String merchantId, String commerceCaseId, String checkoutId)
            throws ApiErrorResponseException, ApiResponseRetrievalException, IOException {
        if (merchantId == null) {
            throw new IllegalArgumentException("Merchant ID is required");
        }
        if (commerceCaseId == null) {
            throw new IllegalArgumentException("Commerce Case ID is required");
        }
        if (checkoutId == null) {
            throw new IllegalArgumentException("Checkout ID is required");
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
                .build();

        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        return this.makeApiCall(request, CheckoutResponse.class);

    }

    public List<CheckoutResponse> getCheckoutsRequest(String merchantID)
            throws ApiErrorResponseException, ApiResponseRetrievalException, IOException {
        return getCheckoutsRequest(merchantID, null);
    }

    public List<CheckoutResponse> getCheckoutsRequest(String merchantId, GetCheckoutsQuery queryParams)
            throws ApiErrorResponseException, ApiResponseRetrievalException, IOException {
        if (merchantId == null) {
            throw new IllegalArgumentException("Merchant ID is required");
        }

        HttpUrl.Builder urlBuilder = new HttpUrl.Builder()
                .scheme("https")
                .host(this.getConfig().getHost())
                .addPathSegment("v1")
                .addPathSegment(merchantId)
                .addPathSegment("checkouts");

        if (queryParams != null) {
            for (Map.Entry<String, String> entry : queryParams.toQueryMap().entrySet()) {
                urlBuilder.addQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        HttpUrl url = urlBuilder.build();

        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        return this.makeApiCall(request, new TypeReference<List<CheckoutResponse>>() {
        });
    }

    public void updateCheckoutRequest(String merchantId, String commerceCaseId, String checkoutId,
            PatchCheckoutRequest payload)
            throws ApiErrorResponseException, ApiResponseRetrievalException, IOException {
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
                .build();

        String jsonString = null;

        jsonString = getJsonMapper().writeValueAsString(payload);

        Request request = new Request.Builder()
                .url(url)
                .patch(RequestBody.create(jsonString, JSON))
                .header("Content-Type", JSON.toString())
                .build();

        this.makeApiCall(request);

    }

    public void removeCheckoutRequest(String merchantId, String commerceCaseId, String checkoutId)
            throws ApiErrorResponseException, ApiResponseRetrievalException, IOException {
        if (merchantId == null) {
            throw new IllegalArgumentException("Merchant ID is required");
        }
        if (commerceCaseId == null) {
            throw new IllegalArgumentException("Commerce Case ID is required");
        }
        if (checkoutId == null) {
            throw new IllegalArgumentException("Checkout ID is required");
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
                .build();

        Request request = new Request.Builder()
                .url(url)
                .delete()
                .build();

        this.makeApiCall(request);
    }
}
