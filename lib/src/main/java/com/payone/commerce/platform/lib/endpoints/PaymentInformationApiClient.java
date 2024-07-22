package com.payone.commerce.platform.lib.endpoints;

import java.io.IOException;
import java.security.InvalidKeyException;

import com.payone.commerce.platform.lib.ApiResponseException;
import com.payone.commerce.platform.lib.CommunicatorConfiguration;
import com.payone.commerce.platform.lib.models.PaymentInformationRequest;
import com.payone.commerce.platform.lib.models.PaymentInformationResponse;

import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;

public class PaymentInformationApiClient extends BaseApiClient {

    public PaymentInformationApiClient(CommunicatorConfiguration config) throws InvalidKeyException {
        super(config);
    }

    public PaymentInformationResponse createPaymentInformation(String merchantId, String commerceCaseId,
            String checkoutId, PaymentInformationRequest payload)
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
                .addPathSegment("payment-informations")
                .build();

        String jsonString = getJsonMapper().writeValueAsString(payload);

        RequestBody formBody = RequestBody.create(jsonString, JSON);

        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .header("Content-Type", formBody.contentType().toString())
                .build();

        request = this.getRequestHeaderGenerator().generateAdditionalRequestHeaders(request);

        return this.makeApiCall(request, PaymentInformationResponse.class);

    }

    public PaymentInformationResponse getPaymentInformation(String merchantId, String commerceCaseId,
            String checkoutId, String paymentInformationId)
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
        if (paymentInformationId == null) {
            throw new IllegalArgumentException("Payment Information ID is required");
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
                .addPathSegment("payment-informations")
                .addPathSegment(paymentInformationId)
                .build();

        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        request = this.getRequestHeaderGenerator().generateAdditionalRequestHeaders(request);

        return this.makeApiCall(request, PaymentInformationResponse.class);

    }

}
