package com.payone.commerce.platform.lib.endpoints;

import java.io.IOException;
import java.security.InvalidKeyException;

import com.payone.commerce.platform.lib.CommunicatorConfiguration;
import com.payone.commerce.platform.lib.errors.ApiException;
import com.payone.commerce.platform.lib.models.CreatePaymentIntentRequest;
import com.payone.commerce.platform.lib.models.CreatePaymentIntentResponse;
import com.payone.commerce.platform.lib.models.PaymentIntentResponse;
import com.payone.commerce.platform.lib.serializer.JsonSerializer;

import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;

public class PaymentIntentApiClient extends BaseApiClient {
    private static final String PAYMENT_INTENT_ID_REQUIRED_ERROR = "Payment Intent ID is required";

    public PaymentIntentApiClient(CommunicatorConfiguration config) throws InvalidKeyException {
        super(config);
    }

    public CreatePaymentIntentResponse createPaymentIntent(String merchantId, CreatePaymentIntentRequest payload)
            throws ApiException, IOException {
        if (merchantId == null) {
            throw new IllegalArgumentException(MERCHANT_ID_REQUIRED_ERROR);
        }
        if (payload == null) {
            throw new IllegalArgumentException(PAYLOAD_REQUIRED_ERROR);
        }

        HttpUrl url = new HttpUrl.Builder()
                .scheme(HTTPS_SCHEME)
                .host(this.getConfig().getHost())
                .addPathSegment(PCP_PATH_SEGMENT_VERSION)
                .addPathSegment(merchantId)
                .addPathSegment(PCP_PATH_SEGMENT_PAYMENT_INTENTS)
                .build();

        String jsonString = JsonSerializer.serializeToJson(payload);
        RequestBody requestBody = RequestBody.create(jsonString, JSON);
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .header(CONTENT_TYPE_HEADER_NAME, requestBody.contentType().toString())
                .build();

        return this.makeApiCall(request, CreatePaymentIntentResponse.class);
    }

    public PaymentIntentResponse getPaymentIntent(String merchantId, String paymentIntentId)
            throws ApiException, IOException {
        if (merchantId == null) {
            throw new IllegalArgumentException(MERCHANT_ID_REQUIRED_ERROR);
        }
        if (paymentIntentId == null) {
            throw new IllegalArgumentException(PAYMENT_INTENT_ID_REQUIRED_ERROR);
        }

        HttpUrl url = new HttpUrl.Builder()
                .scheme(HTTPS_SCHEME)
                .host(this.getConfig().getHost())
                .addPathSegment(PCP_PATH_SEGMENT_VERSION)
                .addPathSegment(merchantId)
                .addPathSegment(PCP_PATH_SEGMENT_PAYMENT_INTENTS)
                .addPathSegment(paymentIntentId)
                .build();

        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        return this.makeApiCall(request, PaymentIntentResponse.class);
    }
}
