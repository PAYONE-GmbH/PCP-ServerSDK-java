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
import com.payone.commerce.platform.lib.models.PausePaymentRequest;
import com.payone.commerce.platform.lib.models.PausePaymentResponse;
import com.payone.commerce.platform.lib.models.PaymentExecution;
import com.payone.commerce.platform.lib.models.PaymentExecutionRequest;
import com.payone.commerce.platform.lib.models.RefreshPaymentRequest;
import com.payone.commerce.platform.lib.models.RefundPaymentResponse;
import com.payone.commerce.platform.lib.models.RefundRequest;
import com.payone.commerce.platform.lib.serializer.JsonSerializer;

import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;

public class PaymentExecutionApiClient extends BaseApiClient {
    private static final String PAYMENT_EXECUTION_ID_REQUIRED_ERROR = "Payment Execution ID is required";
    private static final String PCP_PATH_SEGMENT_PAYMENT_EXECUTIONS = "payment-executions";

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
                .scheme(HTTPS_SCHEME)
                .host(this.getConfig().getHost())
                .addPathSegment(PCP_PATH_SEGMENT_VERSION)
                .addPathSegment(merchantId)
                .addPathSegment(PCP_PATH_SEGMENT_COMMERCE_CASES)
                .addPathSegment(commerceCaseId)
                .addPathSegment(PCP_PATH_SEGMENT_CHECKOUTS)
                .addPathSegment(checkoutId)
                .addPathSegment(PCP_PATH_SEGMENT_PAYMENT_EXECUTIONS)
                .build();

        String jsonString = JsonSerializer.serializeToJson(payload);

        RequestBody formBody = RequestBody.create(jsonString, JSON);

        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .header(CONTENT_TYPE_HEADER_NAME, formBody.contentType().toString())
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
            throw new IllegalArgumentException(PAYMENT_EXECUTION_ID_REQUIRED_ERROR);
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
                .addPathSegment(PCP_PATH_SEGMENT_PAYMENT_EXECUTIONS)
                .addPathSegment(paymentExecutionId)
                .addPathSegment("capture")
                .build();

        String jsonString = JsonSerializer.serializeToJson(payload);

        RequestBody formBody = RequestBody.create(jsonString, JSON);

        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .header(CONTENT_TYPE_HEADER_NAME, formBody.contentType().toString())
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
            throw new IllegalArgumentException(PAYMENT_EXECUTION_ID_REQUIRED_ERROR);
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
                .addPathSegment(PCP_PATH_SEGMENT_PAYMENT_EXECUTIONS)
                .addPathSegment(paymentExecutionId)
                .addPathSegment("cancel")
                .build();

        String jsonString = JsonSerializer.serializeToJson(payload);

        RequestBody formBody = RequestBody.create(jsonString, JSON);

        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .header(CONTENT_TYPE_HEADER_NAME, formBody.contentType().toString())
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
            throw new IllegalArgumentException(PAYMENT_EXECUTION_ID_REQUIRED_ERROR);
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
                .addPathSegment(PCP_PATH_SEGMENT_PAYMENT_EXECUTIONS)
                .addPathSegment(paymentExecutionId)
                .addPathSegment("refund")
                .build();

        String jsonString = JsonSerializer.serializeToJson(payload);

        RequestBody formBody = RequestBody.create(jsonString, JSON);

        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .header(CONTENT_TYPE_HEADER_NAME, formBody.contentType().toString())
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
            throw new IllegalArgumentException(PAYMENT_EXECUTION_ID_REQUIRED_ERROR);
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
                .addPathSegment(PCP_PATH_SEGMENT_PAYMENT_EXECUTIONS)
                .addPathSegment(paymentExecutionId)
                .addPathSegment("complete")
                .build();

        String jsonString = JsonSerializer.serializeToJson(payload);

        RequestBody formBody = RequestBody.create(jsonString, JSON);

        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .header(CONTENT_TYPE_HEADER_NAME, formBody.contentType().toString())
                .build();

        return this.makeApiCall(request, CompletePaymentResponse.class);

    }

    public PausePaymentResponse pausePayment(String merchantId, String commerceCaseId,
            String checkoutId, String paymentExecutionId, PausePaymentRequest payload)
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
            throw new IllegalArgumentException(PAYMENT_EXECUTION_ID_REQUIRED_ERROR);
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
                .addPathSegment(PCP_PATH_SEGMENT_PAYMENT_EXECUTIONS)
                .addPathSegment(paymentExecutionId)
                .addPathSegment("pause")
                .build();

        String jsonString = JsonSerializer.serializeToJson(payload);

        RequestBody formBody = RequestBody.create(jsonString, JSON);

        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .header(CONTENT_TYPE_HEADER_NAME, formBody.contentType().toString())
                .build();

        return this.makeApiCall(request, PausePaymentResponse.class);

    }

    public PaymentExecution refreshPayment(String merchantId, String commerceCaseId,
            String checkoutId, String paymentExecutionId, RefreshPaymentRequest payload)
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
            throw new IllegalArgumentException(PAYMENT_EXECUTION_ID_REQUIRED_ERROR);
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
                .addPathSegment(PCP_PATH_SEGMENT_PAYMENT_EXECUTIONS)
                .addPathSegment(paymentExecutionId)
                .addPathSegment("refresh")
                .build();

        String jsonString = JsonSerializer.serializeToJson(payload);

        RequestBody formBody = RequestBody.create(jsonString, JSON);

        Request request = new Request.Builder()
                .url(url)
                .post(formBody)
                .header(CONTENT_TYPE_HEADER_NAME, formBody.contentType().toString())
                .build();

        return this.makeApiCall(request, PaymentExecution.class);

    }

}
