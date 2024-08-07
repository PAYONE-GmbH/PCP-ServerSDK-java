package com.payone.commerce.platform.lib.endpoints;

import java.io.IOException;
import java.security.InvalidKeyException;

import com.payone.commerce.platform.lib.errors.ApiErrorResponseException;
import com.payone.commerce.platform.lib.errors.ApiResponseRetrievalException;
import com.payone.commerce.platform.lib.CommunicatorConfiguration;
import com.payone.commerce.platform.lib.models.CancelPaymentRequest;
import com.payone.commerce.platform.lib.models.CancelPaymentResponse;
import com.payone.commerce.platform.lib.models.CapturePaymentRequest;
import com.payone.commerce.platform.lib.models.CapturePaymentResponse;
import com.payone.commerce.platform.lib.models.CompletePaymentRequest;
import com.payone.commerce.platform.lib.models.CompletePaymentResponse;
import com.payone.commerce.platform.lib.models.CreatePaymentResponse;
import com.payone.commerce.platform.lib.models.PaymentExecutionRequest;
import com.payone.commerce.platform.lib.models.RefundPaymentResponse;
import com.payone.commerce.platform.lib.models.RefundRequest;
import com.payone.commerce.platform.lib.serializer.JsonSerializer;

import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;

public class PaymentExecutionApiClient extends BaseApiClient {

    public PaymentExecutionApiClient(CommunicatorConfiguration config) throws InvalidKeyException {
        super(config);
    }

    public CreatePaymentResponse createPayment(String merchantId, String commerceCaseId,
            String checkoutId, PaymentExecutionRequest payload)
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
                .addPathSegment("payment-executions")
                .build();

        String jsonString = JsonSerializer.serializeToJson(payload);

        RequestBody formBody = RequestBody.create(jsonString, JSON);

        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .header("Content-Type", formBody.contentType().toString())
                .build();

        return this.makeApiCall(request, CreatePaymentResponse.class);

    }

    public CapturePaymentResponse capturePayment(String merchantId, String commerceCaseId,
            String checkoutId, String paymentExecutionId, CapturePaymentRequest payload)
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
        if (paymentExecutionId == null) {
            throw new IllegalArgumentException("Payment Execution ID is required");
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
                .addPathSegment("payment-executions")
                .addPathSegment(paymentExecutionId)
                .addPathSegment("capture")
                .build();

        String jsonString = JsonSerializer.serializeToJson(payload);

        RequestBody formBody = RequestBody.create(jsonString, JSON);

        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .header("Content-Type", formBody.contentType().toString())
                .build();

        return this.makeApiCall(request, CapturePaymentResponse.class);

    }

    public CancelPaymentResponse cancelPayment(String merchantId, String commerceCaseId,
            String checkoutId, String paymentExecutionId, CancelPaymentRequest payload)
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
        if (paymentExecutionId == null) {
            throw new IllegalArgumentException("Payment Execution ID is required");
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
                .addPathSegment("payment-executions")
                .addPathSegment(paymentExecutionId)
                .addPathSegment("cancel")
                .build();

        String jsonString = JsonSerializer.serializeToJson(payload);

        RequestBody formBody = RequestBody.create(jsonString, JSON);

        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .header("Content-Type", formBody.contentType().toString())
                .build();

        return this.makeApiCall(request, CancelPaymentResponse.class);

    }

    public RefundPaymentResponse refundPayment(String merchantId, String commerceCaseId,
            String checkoutId, String paymentExecutionId, RefundRequest payload)
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
        if (paymentExecutionId == null) {
            throw new IllegalArgumentException("Payment Execution ID is required");
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
                .addPathSegment("payment-executions")
                .addPathSegment(paymentExecutionId)
                .addPathSegment("refund")
                .build();

        String jsonString = JsonSerializer.serializeToJson(payload);

        RequestBody formBody = RequestBody.create(jsonString, JSON);

        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .header("Content-Type", formBody.contentType().toString())
                .build();

        return this.makeApiCall(request, RefundPaymentResponse.class);

    }

    public CompletePaymentResponse completePayment(String merchantId, String commerceCaseId,
            String checkoutId, String paymentExecutionId, CompletePaymentRequest payload)
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
        if (paymentExecutionId == null) {
            throw new IllegalArgumentException("Payment Execution ID is required");
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
                .addPathSegment("payment-executions")
                .addPathSegment(paymentExecutionId)
                .addPathSegment("complete")
                .build();

        String jsonString = JsonSerializer.serializeToJson(payload);

        RequestBody formBody = RequestBody.create(jsonString, JSON);

        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .header("Content-Type", formBody.contentType().toString())
                .build();

        return this.makeApiCall(request, CompletePaymentResponse.class);

    }

}
