package com.payone.commerce.platform.lib.endpoints;

import java.io.IOException;
import java.security.InvalidKeyException;

import com.payone.commerce.platform.lib.CommunicatorConfiguration;
import com.payone.commerce.platform.lib.errors.ApiErrorResponseException;
import com.payone.commerce.platform.lib.errors.ApiResponseRetrievalException;
import com.payone.commerce.platform.lib.models.CreatePayByLinkRequest;
import com.payone.commerce.platform.lib.models.CreatePayByLinkResponse;
import com.payone.commerce.platform.lib.serializer.JsonSerializer;

import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;

public class PayByLinkApiClient extends BaseApiClient {
    public PayByLinkApiClient(CommunicatorConfiguration config) throws InvalidKeyException {
        super(config);
    }

    public PayByLinkApiClient() throws InvalidKeyException {
        super();
    }

    public CreatePayByLinkResponse createPayByLink(String merchantId, String commerceCaseId, String checkoutId,
            CreatePayByLinkRequest payload)
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
                .scheme(HTTPS_SCHEME)
                .host(this.getConfig().getHost())
                .addPathSegment(PCP_PATH_SEGMENT_VERSION)
                .addPathSegment(merchantId)
                .addPathSegment(PCP_PATH_SEGMENT_COMMERCE_CASES)
                .addPathSegment(commerceCaseId)
                .addPathSegment(PCP_PATH_SEGMENT_CHECKOUTS)
                .addPathSegment(checkoutId)
                .addPathSegment("pay-by-link")
                .build();

        String jsonString = JsonSerializer.serializeToJson(payload);
        Request request = new Request.Builder()
                .url(url)
                .post(RequestBody.create(jsonString, JSON))
                .header(CONTENT_TYPE_HEADER_NAME, JSON.toString())
                .build();

        return this.makeApiCall(request, CreatePayByLinkResponse.class);
    }
}
