package com.payone.commerce.platform.lib.endpoints;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.payone.commerce.platform.lib.ApiResponseException;
import com.payone.commerce.platform.lib.CommunicatorConfiguration;
import com.payone.commerce.platform.lib.models.CheckoutResponse;
import com.payone.commerce.platform.lib.models.CreateCheckoutRequest;
import com.payone.commerce.platform.lib.models.CreateCheckoutResponse;
import com.payone.commerce.platform.lib.models.ErrorResponse;
import com.payone.commerce.platform.lib.models.PatchCheckoutRequest;
import com.payone.commerce.platform.lib.queries.GetCheckoutsQuery;

import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class CheckoutApiClient extends BaseApiClient {
    public CheckoutApiClient(CommunicatorConfiguration config) throws InvalidKeyException {
        super(config);
    }

    public CreateCheckoutResponse createCheckoutRequest(String merchantId, String commerceCaseId,
            CreateCheckoutRequest payload) throws ApiResponseException, IOException {
        if (merchantId == null) {
            throw new IllegalArgumentException("Merchant ID is required");
        }
        if (commerceCaseId == null) {
            throw new IllegalArgumentException("Commerce Case ID is required");
        }
        if (payload == null) {
            throw new IllegalArgumentException("Checkout is required");
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
        try {
            jsonString = getJsonMapper().writeValueAsString(payload);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to encode payload as json", e);
        }

        Request request = new Request.Builder()
                .url(url)
                .post(RequestBody.create(jsonString, JSON))
                .header("Content-Type", JSON.toString())
                .build();

        request = this.getRequestHeaderGenerator().generateAdditionalRequestHeaders(request);

        Response response = this.getClient().newCall(request).execute();

        try {
            if (!response.isSuccessful()) {
                if (response.code() != 400) {
                    throw new RuntimeException("Api error: " + response.code());
                }
                ErrorResponse error = getJsonMapper().readValue(response.body().string(), ErrorResponse.class);
                throw new ApiResponseException(error);
            }
            return getJsonMapper().readValue(response.body().string(), CreateCheckoutResponse.class);
        } catch (JsonMappingException e) {
            throw new RuntimeException("Excepted valid JSON response, but failed to parse", e);
        }
    }

    public CheckoutResponse getCheckoutRequest(String merchantId, String commerceCaseId, String checkoutId)
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

        request = this.getRequestHeaderGenerator().generateAdditionalRequestHeaders(request);
        Response response = this.getClient().newCall(request).execute();

        try {
            if (!response.isSuccessful()) {
                ErrorResponse error = getJsonMapper().readValue(response.body().string(), ErrorResponse.class);
                throw new ApiResponseException(error);
            }
            return getJsonMapper().readValue(response.body().string(), CheckoutResponse.class);
        } catch (JsonMappingException e) {
            throw new RuntimeException("Excepted valid JSON response, but failed to parse", e);
        }
    }

    public List<CheckoutResponse> getAllCheckouts(String merchantId, GetCheckoutsQuery query)
            throws ApiResponseException, IOException {
        throw new RuntimeException("Not implemented");
    }

    public void updateCheckoutRequest(String merchantId, String commerceCaseId, String checkoutId,
            PatchCheckoutRequest payload) throws ApiResponseException, IOException {
        if (merchantId == null) {
            throw new IllegalArgumentException("Merchant ID is required");
        }
        if (commerceCaseId == null) {
            throw new IllegalArgumentException("Commerce Case ID is required");
        }
        if (payload == null) {
            throw new IllegalArgumentException("Checkout is required");
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
        try {
            jsonString = getJsonMapper().writeValueAsString(payload);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to encode payload as json", e);
        }

        Request request = new Request.Builder()
                .url(url)
                .patch(RequestBody.create(jsonString, JSON))
                .header("Content-Type", JSON.toString())
                .build();

        request = this.getRequestHeaderGenerator().generateAdditionalRequestHeaders(request);

        Response response = this.getClient().newCall(request).execute();

        try {
            if (!response.isSuccessful()) {
                ErrorResponse error = getJsonMapper().readValue(response.body().string(), ErrorResponse.class);
                throw new ApiResponseException(error);
            }
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Excepted valid JSON response, but failed to parse", e);
        }
    }

    public void removeCheckoutRequest(String merchantId, String commerceCaseId, String checkoutId)
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

        request = this.getRequestHeaderGenerator().generateAdditionalRequestHeaders(request);
        Response response = this.getClient().newCall(request).execute();

        try {
            if (!response.isSuccessful()) {
                ErrorResponse error = getJsonMapper().readValue(response.body().string(), ErrorResponse.class);
                throw new ApiResponseException(error);
            }
        } catch (JsonMappingException e) {
            throw new RuntimeException("Excepted valid JSON response, but failed to parse", e);
        }
    }
}
