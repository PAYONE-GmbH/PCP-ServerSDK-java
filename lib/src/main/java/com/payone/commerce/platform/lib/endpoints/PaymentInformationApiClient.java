package com.payone.commerce.platform.lib.endpoints;

import java.io.IOException;
import java.security.InvalidKeyException;

import com.payone.commerce.platform.lib.errors.ApiException;
import com.payone.commerce.platform.lib.CommunicatorConfiguration;
import com.payone.commerce.platform.lib.models.PaymentInformationRequest;
import com.payone.commerce.platform.lib.models.PaymentInformationResponse;
import com.payone.commerce.platform.lib.serializer.JsonSerializer;

import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;

public class PaymentInformationApiClient extends BaseApiClient {

    public PaymentInformationApiClient(CommunicatorConfiguration config) throws InvalidKeyException {
        super(config);
    }

    public PaymentInformationResponse createPaymentInformation(String merchantId, String commerceCaseId,
            String checkoutId, PaymentInformationRequest payload)
            throws ApiException, IOException {
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
                .addPathSegment("payment-informations")
                .build();

        String jsonString = JsonSerializer.serializeToJson(payload);

        RequestBody formBody = RequestBody.create(jsonString, JSON);

        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .header(CONTENT_TYPE_HEADER_NAME, formBody.contentType().toString())
                .build();

        return this.makeApiCall(request, PaymentInformationResponse.class);

    }

    public PaymentInformationResponse getPaymentInformation(String merchantId, String commerceCaseId,
            String checkoutId, String paymentInformationId)
            throws ApiException, IOException {
        if (merchantId == null) {
            throw new IllegalArgumentException(MERCHANT_ID_REQUIRED_ERROR);
        }
        if (commerceCaseId == null) {
            throw new IllegalArgumentException(COMMERCE_CASE_ID_REQUIRED_ERROR);
        }
        if (checkoutId == null) {
            throw new IllegalArgumentException(CHECKOUT_ID_REQUIRED_ERROR);
        }
        if (paymentInformationId == null) {
            throw new IllegalArgumentException("Payment Information ID is required");
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
                .addPathSegment("payment-informations")
                .addPathSegment(paymentInformationId)
                .build();

        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        return this.makeApiCall(request, PaymentInformationResponse.class);

    }

}
