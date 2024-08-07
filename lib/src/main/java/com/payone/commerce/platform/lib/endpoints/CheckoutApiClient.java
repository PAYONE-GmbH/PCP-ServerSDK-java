package com.payone.commerce.platform.lib.endpoints;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.util.Map;

import com.payone.commerce.platform.lib.CommunicatorConfiguration;
import com.payone.commerce.platform.lib.errors.ApiErrorResponseException;
import com.payone.commerce.platform.lib.errors.ApiResponseRetrievalException;
import com.payone.commerce.platform.lib.models.CheckoutResponse;
import com.payone.commerce.platform.lib.models.CheckoutsResponse;
import com.payone.commerce.platform.lib.models.CreateCheckoutRequest;
import com.payone.commerce.platform.lib.models.CreateCheckoutResponse;
import com.payone.commerce.platform.lib.models.PatchCheckoutRequest;
import com.payone.commerce.platform.lib.queries.GetCheckoutsQuery;
import com.payone.commerce.platform.lib.serializer.JsonSerializer;

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
            throw new IllegalArgumentException(MERCHANT_ID_REQUIRED_ERROR);
        }
        if (commerceCaseId == null) {
            throw new IllegalArgumentException(COMMERCE_CASE_ID_REQUIRED_ERROR);
        }
        if (payload == null) {
            throw new IllegalArgumentException(PAYLOAD_REQUIRED_ERROR);
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

        jsonString = JsonSerializer.serializeToJson(payload);

        Request request = new Request.Builder()
                .url(url)
                .post(RequestBody.create(jsonString, JSON))
                .header(CONTENT_TYPE_HEADER_NAME, JSON.toString())
                .build();

        return this.makeApiCall(request, CreateCheckoutResponse.class);

    }

    public CheckoutResponse getCheckoutRequest(String merchantId, String commerceCaseId, String checkoutId)
            throws ApiErrorResponseException, ApiResponseRetrievalException, IOException {
        if (merchantId == null) {
            throw new IllegalArgumentException(MERCHANT_ID_REQUIRED_ERROR);
        }
        if (commerceCaseId == null) {
            throw new IllegalArgumentException(COMMERCE_CASE_ID_REQUIRED_ERROR);
        }
        if (checkoutId == null) {
            throw new IllegalArgumentException(CHECKOUT_ID_REQUIRED_ERROR);
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

    public CheckoutsResponse getCheckoutsRequest(String merchantID)
            throws ApiErrorResponseException, ApiResponseRetrievalException, IOException {
        return getCheckoutsRequest(merchantID, null);
    }

    public CheckoutsResponse getCheckoutsRequest(String merchantId, GetCheckoutsQuery queryParams)
            throws ApiErrorResponseException, ApiResponseRetrievalException, IOException {
        if (merchantId == null) {
            throw new IllegalArgumentException(MERCHANT_ID_REQUIRED_ERROR);
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

        return this.makeApiCall(request, CheckoutsResponse.class);
    }

    public void updateCheckoutRequest(String merchantId, String commerceCaseId, String checkoutId,
            PatchCheckoutRequest payload)
            throws ApiErrorResponseException, ApiResponseRetrievalException, IOException {
        if (merchantId == null) {
            throw new IllegalArgumentException(MERCHANT_ID_REQUIRED_ERROR);
        }
        if (commerceCaseId == null) {
            throw new IllegalArgumentException(COMMERCE_CASE_ID_REQUIRED_ERROR);
        }
        if (checkoutId == null) {
            throw new IllegalArgumentException(CHECKOUT_ID_REQUIRED_ERROR);
        }
        if (payload == null) {
            throw new IllegalArgumentException(PAYLOAD_REQUIRED_ERROR);
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

        String jsonString = JsonSerializer.serializeToJson(payload);

        Request request = new Request.Builder()
                .url(url)
                .patch(RequestBody.create(jsonString, JSON))
                .header(CONTENT_TYPE_HEADER_NAME, JSON.toString())
                .build();

        this.makeApiCall(request);

    }

    public void removeCheckoutRequest(String merchantId, String commerceCaseId, String checkoutId)
            throws ApiErrorResponseException, ApiResponseRetrievalException, IOException {
        if (merchantId == null) {
            throw new IllegalArgumentException(MERCHANT_ID_REQUIRED_ERROR);
        }
        if (commerceCaseId == null) {
            throw new IllegalArgumentException(COMMERCE_CASE_ID_REQUIRED_ERROR);
        }
        if (checkoutId == null) {
            throw new IllegalArgumentException(CHECKOUT_ID_REQUIRED_ERROR);
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
