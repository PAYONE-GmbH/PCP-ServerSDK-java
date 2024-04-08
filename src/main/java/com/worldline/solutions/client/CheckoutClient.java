package com.worldline.solutions.client;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.worldline.solutions.client.copy.DefaultAuthenticator;
import com.worldline.solutions.client.copy.RequestHeader;

import client.ApiClient;
import client.ApiException;
import client.api.CheckoutApi;
import client.models.CheckoutResponse;
import client.models.CheckoutsResponse;
import client.models.CreateCheckoutRequest;
import client.models.CreateCheckoutResponse;
import client.models.ExtendedCheckoutStatus;
import client.models.PatchCheckoutRequest;
import client.models.PaymentChannel;
import client.models.StatusCheckout;

public class CheckoutClient {

    private CheckoutApi checkoutApi;

    private DefaultAuthenticator defaultAuthenticator;

    public CheckoutClient(DefaultAuthenticator defaultAuthenticator) {
        this.checkoutApi = new CheckoutApi();
        this.defaultAuthenticator = defaultAuthenticator;
    }

    public CheckoutClient(ApiClient apiClient, DefaultAuthenticator defaultAuthenticator) {
        this.checkoutApi = new CheckoutApi(apiClient);
        this.defaultAuthenticator = defaultAuthenticator;
    }

    /**
     * Add a Checkout to an existing Commerce Case
     * This endpoint can be used to add a new Checkout in combination with an Order to an existing Commerce Case. The Order can either be directly executed or the paymentMethodSpecificInput can also be stored for a later execution over the OrderManagementCheckout Action or Payment Execution endpoint.
     *
     * @param merchantId            The merchantId identifies uniquely the merchant. A Checkout has exactly one merchant. (required)
     * @param commerceCaseId        Unique identifier of a Commerce Case. (required)
     * @param createCheckoutRequest (required)
     * @return CreateCheckoutResponse
     * @throws ApiException if fails to make API call
     */
    public CreateCheckoutResponse createCheckout(String merchantId, UUID commerceCaseId, CreateCheckoutRequest createCheckoutRequest) throws ApiException {
        //TODO create header
        Map<String, String> requestHeaders = new HashMap<>();
//        requestHeaders.put("Authorization", defaultAuthenticator);

//        String authenticationSignature = defaultAuthenticator.createSimpleAuthenticationSignature(httpMethod, uri, requestHeaders);
//        requestHeaders.put(new RequestHeader("Authorization", authenticationSignature));

        return checkoutApi.createCheckout(merchantId, commerceCaseId, createCheckoutRequest, requestHeaders);
    }


    /**
     * Add a Checkout to an existing Commerce Case
     * This endpoint can be used to add a new Checkout in combination with an Order to an existing Commerce Case. The Order can either be directly executed or the paymentMethodSpecificInput can also be stored for a later execution over the OrderManagementCheckout Action or Payment Execution endpoint.
     *
     * @param merchantId            The merchantId identifies uniquely the merchant. A Checkout has exactly one merchant. (required)
     * @param commerceCaseId        Unique identifier of a Commerce Case. (required)
     * @param createCheckoutRequest (required)
     * @param additionalHeaders     additionalHeaders for this call
     * @return CreateCheckoutResponse
     * @throws ApiException if fails to make API call
     */
    public CreateCheckoutResponse createCheckout(String merchantId, UUID commerceCaseId, CreateCheckoutRequest createCheckoutRequest, Map<String, String> additionalHeaders) throws ApiException {
        //TODO set header if not present
        return checkoutApi.createCheckout(merchantId, commerceCaseId, createCheckoutRequest, additionalHeaders);
    }

    /**
     * Delete a Checkout
     * This endpoint can be used to delete an unused Checkout.
     *
     * @param merchantId     The merchantId identifies uniquely the merchant. A Checkout has exactly one merchant. (required)
     * @param commerceCaseId Unique identifier of a Commerce Case. (required)
     * @param checkoutId     Unique identifier of a Checkout (required)
     * @throws ApiException if fails to make API call
     */
    public void deleteCheckout(String merchantId, UUID commerceCaseId, UUID checkoutId) throws ApiException {
        //TODO set header if not present
        checkoutApi.deleteCheckout(merchantId, commerceCaseId, checkoutId, Collections.emptyMap());
    }


    /**
     * Delete a Checkout
     * This endpoint can be used to delete an unused Checkout.
     *
     * @param merchantId        The merchantId identifies uniquely the merchant. A Checkout has exactly one merchant. (required)
     * @param commerceCaseId    Unique identifier of a Commerce Case. (required)
     * @param checkoutId        Unique identifier of a Checkout (required)
     * @param additionalHeaders additionalHeaders for this call
     * @throws ApiException if fails to make API call
     */
    public void deleteCheckout(String merchantId, UUID commerceCaseId, UUID checkoutId, Map<String, String> additionalHeaders) throws ApiException {
        //TODO set header if not present
        checkoutApi.deleteCheckout(merchantId, commerceCaseId, checkoutId, additionalHeaders);
    }

    /**
     * Get Checkout Details
     * This endpoint can be used to get a Checkout.
     *
     * @param merchantId     The merchantId identifies uniquely the merchant. A Checkout has exactly one merchant. (required)
     * @param commerceCaseId Unique identifier of a Commerce Case. (required)
     * @param checkoutId     Unique identifier of a Checkout (required)
     * @return CheckoutResponse
     * @throws ApiException if fails to make API call
     */
    public CheckoutResponse getCheckout(String merchantId, UUID commerceCaseId, UUID checkoutId) throws ApiException {
        //TODO set header if not present
        return checkoutApi.getCheckout(merchantId, commerceCaseId, checkoutId, Collections.emptyMap());
    }


    /**
     * Get Checkout Details
     * This endpoint can be used to get a Checkout.
     *
     * @param merchantId        The merchantId identifies uniquely the merchant. A Checkout has exactly one merchant. (required)
     * @param commerceCaseId    Unique identifier of a Commerce Case. (required)
     * @param checkoutId        Unique identifier of a Checkout (required)
     * @param additionalHeaders additionalHeaders for this call
     * @return CheckoutResponse
     * @throws ApiException if fails to make API call
     */
    public CheckoutResponse getCheckout(String merchantId, UUID commerceCaseId, UUID checkoutId, Map<String, String> additionalHeaders) throws ApiException {
        //TODO set header if not present
        return checkoutApi.getCheckout(merchantId, commerceCaseId, checkoutId, additionalHeaders);
    }

    /**
     * Get a list of Checkouts based on Search Parameters
     * This endpoint will provide a list of Checkouts based on the provided criteria. Not all parameters are required to be set. Results will be returned in descending creation time per default. Only up to the first 10,000 results will be returned.
     *
     * @param merchantId                    The merchantId identifies uniquely the merchant. A Checkout has exactly one merchant. (required)
     * @param offset                        The offset to load Checkouts starting with 0 (optional, default to 0)
     * @param size                          The number of Checkouts loaded per page (optional, default to 25)
     * @param fromDate                      Date and time in RFC3339 format after which Checkouts should be included in the request. Accepted formats are: * YYYY-MM-DD&#39;T&#39;HH:mm:ss&#39;Z&#39; * YYYY-MM-DD&#39;T&#39;HH:mm:ss+XX:XX * YYYY-MM-DD&#39;T&#39;HH:mm:ss-XX:XX * YYYY-MM-DD&#39;T&#39;HH:mm&#39;Z&#39; * YYYY-MM-DD&#39;T&#39;HH:mm+XX:XX * YYYY-MM-DD&#39;T&#39;HH:mm-XX:XX          All other formats may be ignored by the system.  (optional)
     * @param toDate                        Date and time in RFC3339 format after which Checkouts should be included in the request. Accepted formats are: * YYYY-MM-DD&#39;T&#39;HH:mm:ss&#39;Z&#39; * YYYY-MM-DD&#39;T&#39;HH:mm:ss+XX:XX * YYYY-MM-DD&#39;T&#39;HH:mm:ss-XX:XX * YYYY-MM-DD&#39;T&#39;HH:mm&#39;Z&#39; * YYYY-MM-DD&#39;T&#39;HH:mm+XX:XX * YYYY-MM-DD&#39;T&#39;HH:mm-XX:XX All other formats may be ignored by the system.  (optional)
     * @param fromCheckoutAmount            Minimum monetary value of the Checkouts that shall be included in the response. Amount in cents always having 2 decimals. (optional)
     * @param toCheckoutAmount              Maximum monetary value of the Checkouts that shall be included in the response. Amount in cents always having 2 decimals. (optional)
     * @param fromOpenAmount                Minimum open amount of the Checkouts that shall be included in the response. Amount in cents always having 2 decimals. (optional)
     * @param toOpenAmount                  Maximum open amount of the Checkouts that shall be included in the response. Amount in cents always having 2 decimals. (optional)
     * @param fromCollectedAmount           Minimum collected amount of the Checkouts that shall be included in the response. Amount in cents always having 2 decimals. (optional)
     * @param toCollectedAmount             Maximum collected amount of the Checkouts that shall be included in the response. Amount in cents always having 2 decimals. (optional)
     * @param fromCancelledAmount           Minimum cancelled amount of the Checkouts that shall be included in the response. Amount in cents always having 2 decimals. (optional)
     * @param toCancelledAmount             Maximum cancelled amount of the Checkouts that shall be included in the response. Amount in cents always having 2 decimals. (optional)
     * @param fromRefundAmount              Minimum refund amount of the Checkouts that shall be included in the response. Amount in cents always having 2 decimals. (optional)
     * @param toRefundAmount                Maximum refund amount of the Checkouts that shall be included in the response. Amount in cents always having 2 decimals. (optional)
     * @param fromChargebackAmount          Minimum chargeback amount of the Checkouts that shall be included in the response. Amount in cents always having 2 decimals. (optional)
     * @param toChargebackAmount            Maximum chargeback amount of the Checkouts that shall be included in the response. Amount in cents always having 2 decimals. (optional)
     * @param checkoutId                    Unique identifier of a Checkout (optional)
     * @param merchantReference             Unique reference of the Checkout that is also returned for reporting and reconciliation purposes. (optional)
     * @param merchantCustomerId            Unique identifier for the customer. (optional)
     * @param includePaymentProductId       Filter your results by payment product ID so that only Checkouts containing a Payment Execution with one of the specified payment product IDs are returned. (optional)
     * @param includeCheckoutStatus         Filter your results by Checkout status so that only Checkouts with the specified statuses are returned. (optional)
     * @param includeExtendedCheckoutStatus Filter your results by extended Checkout status so that only Commerce Cases with Checkouts with the specified statuses are returned. (optional)
     * @param includePaymentChannel         Filter your results by payment channel so that only Checkouts which reference transactions on the given channels are returned. (optional)
     * @param paymentReference              Filter your results by the merchantReference of the paymentExecution or paymentInformation. (optional)
     * @param paymentId                     Filter your results by the paymentExecutionId, paymentInformationId or the id of the payment. (optional)
     * @param firstName                     Filter your results by the customer first name. It is also possible to filter by the first name from the shipping address. (optional)
     * @param surname                       Filter your results by the customer surname. It is also possible to filter by the surname from the shipping address. (optional)
     * @param email                         Filter your results by the customer email address. (optional)
     * @param phoneNumber                   Filter your results by the customer phone number. (optional)
     * @param dateOfBirth                   Filter your results by the date of birth. Format YYYYMMDD (optional)
     * @param companyInformation            Filter your results by the name of the company. (optional)
     * @return CheckoutsResponse
     * @throws ApiException if fails to make API call
     */
    public CheckoutsResponse getCheckouts(String merchantId, Integer offset, Integer size, OffsetDateTime fromDate, OffsetDateTime toDate, Long fromCheckoutAmount, Long toCheckoutAmount, Long fromOpenAmount, Long toOpenAmount, Long fromCollectedAmount, Long toCollectedAmount, Long fromCancelledAmount, Long toCancelledAmount, Long fromRefundAmount, Long toRefundAmount, Long fromChargebackAmount, Long toChargebackAmount, UUID checkoutId, String merchantReference, String merchantCustomerId, List<Integer> includePaymentProductId, List<StatusCheckout> includeCheckoutStatus, List<ExtendedCheckoutStatus> includeExtendedCheckoutStatus, List<PaymentChannel> includePaymentChannel, String paymentReference, String paymentId, String firstName, String surname, String email, String phoneNumber, String dateOfBirth, String companyInformation) throws ApiException {
        //TODO set header if not present
        return checkoutApi.getCheckouts(merchantId, offset, size, fromDate, toDate, fromCheckoutAmount, toCheckoutAmount, fromOpenAmount, toOpenAmount, fromCollectedAmount, toCollectedAmount, fromCancelledAmount, toCancelledAmount, fromRefundAmount, toRefundAmount, fromChargebackAmount, toChargebackAmount, checkoutId, merchantReference, merchantCustomerId, includePaymentProductId, includeCheckoutStatus, includeExtendedCheckoutStatus, includePaymentChannel, paymentReference, paymentId, firstName, surname, email, phoneNumber, dateOfBirth, companyInformation, Collections.emptyMap());
    }


    /**
     * Get a list of Checkouts based on Search Parameters
     * This endpoint will provide a list of Checkouts based on the provided criteria. Not all parameters are required to be set. Results will be returned in descending creation time per default. Only up to the first 10,000 results will be returned.
     *
     * @param merchantId                    The merchantId identifies uniquely the merchant. A Checkout has exactly one merchant. (required)
     * @param offset                        The offset to load Checkouts starting with 0 (optional, default to 0)
     * @param size                          The number of Checkouts loaded per page (optional, default to 25)
     * @param fromDate                      Date and time in RFC3339 format after which Checkouts should be included in the request. Accepted formats are: * YYYY-MM-DD&#39;T&#39;HH:mm:ss&#39;Z&#39; * YYYY-MM-DD&#39;T&#39;HH:mm:ss+XX:XX * YYYY-MM-DD&#39;T&#39;HH:mm:ss-XX:XX * YYYY-MM-DD&#39;T&#39;HH:mm&#39;Z&#39; * YYYY-MM-DD&#39;T&#39;HH:mm+XX:XX * YYYY-MM-DD&#39;T&#39;HH:mm-XX:XX          All other formats may be ignored by the system.  (optional)
     * @param toDate                        Date and time in RFC3339 format after which Checkouts should be included in the request. Accepted formats are: * YYYY-MM-DD&#39;T&#39;HH:mm:ss&#39;Z&#39; * YYYY-MM-DD&#39;T&#39;HH:mm:ss+XX:XX * YYYY-MM-DD&#39;T&#39;HH:mm:ss-XX:XX * YYYY-MM-DD&#39;T&#39;HH:mm&#39;Z&#39; * YYYY-MM-DD&#39;T&#39;HH:mm+XX:XX * YYYY-MM-DD&#39;T&#39;HH:mm-XX:XX All other formats may be ignored by the system.  (optional)
     * @param fromCheckoutAmount            Minimum monetary value of the Checkouts that shall be included in the response. Amount in cents always having 2 decimals. (optional)
     * @param toCheckoutAmount              Maximum monetary value of the Checkouts that shall be included in the response. Amount in cents always having 2 decimals. (optional)
     * @param fromOpenAmount                Minimum open amount of the Checkouts that shall be included in the response. Amount in cents always having 2 decimals. (optional)
     * @param toOpenAmount                  Maximum open amount of the Checkouts that shall be included in the response. Amount in cents always having 2 decimals. (optional)
     * @param fromCollectedAmount           Minimum collected amount of the Checkouts that shall be included in the response. Amount in cents always having 2 decimals. (optional)
     * @param toCollectedAmount             Maximum collected amount of the Checkouts that shall be included in the response. Amount in cents always having 2 decimals. (optional)
     * @param fromCancelledAmount           Minimum cancelled amount of the Checkouts that shall be included in the response. Amount in cents always having 2 decimals. (optional)
     * @param toCancelledAmount             Maximum cancelled amount of the Checkouts that shall be included in the response. Amount in cents always having 2 decimals. (optional)
     * @param fromRefundAmount              Minimum refund amount of the Checkouts that shall be included in the response. Amount in cents always having 2 decimals. (optional)
     * @param toRefundAmount                Maximum refund amount of the Checkouts that shall be included in the response. Amount in cents always having 2 decimals. (optional)
     * @param fromChargebackAmount          Minimum chargeback amount of the Checkouts that shall be included in the response. Amount in cents always having 2 decimals. (optional)
     * @param toChargebackAmount            Maximum chargeback amount of the Checkouts that shall be included in the response. Amount in cents always having 2 decimals. (optional)
     * @param checkoutId                    Unique identifier of a Checkout (optional)
     * @param merchantReference             Unique reference of the Checkout that is also returned for reporting and reconciliation purposes. (optional)
     * @param merchantCustomerId            Unique identifier for the customer. (optional)
     * @param includePaymentProductId       Filter your results by payment product ID so that only Checkouts containing a Payment Execution with one of the specified payment product IDs are returned. (optional)
     * @param includeCheckoutStatus         Filter your results by Checkout status so that only Checkouts with the specified statuses are returned. (optional)
     * @param includeExtendedCheckoutStatus Filter your results by extended Checkout status so that only Commerce Cases with Checkouts with the specified statuses are returned. (optional)
     * @param includePaymentChannel         Filter your results by payment channel so that only Checkouts which reference transactions on the given channels are returned. (optional)
     * @param paymentReference              Filter your results by the merchantReference of the paymentExecution or paymentInformation. (optional)
     * @param paymentId                     Filter your results by the paymentExecutionId, paymentInformationId or the id of the payment. (optional)
     * @param firstName                     Filter your results by the customer first name. It is also possible to filter by the first name from the shipping address. (optional)
     * @param surname                       Filter your results by the customer surname. It is also possible to filter by the surname from the shipping address. (optional)
     * @param email                         Filter your results by the customer email address. (optional)
     * @param phoneNumber                   Filter your results by the customer phone number. (optional)
     * @param dateOfBirth                   Filter your results by the date of birth. Format YYYYMMDD (optional)
     * @param companyInformation            Filter your results by the name of the company. (optional)
     * @param additionalHeaders             additionalHeaders for this call
     * @return CheckoutsResponse
     * @throws ApiException if fails to make API call
     */
    public CheckoutsResponse getCheckouts(String merchantId, Integer offset, Integer size, OffsetDateTime fromDate, OffsetDateTime toDate, Long fromCheckoutAmount, Long toCheckoutAmount, Long fromOpenAmount, Long toOpenAmount, Long fromCollectedAmount, Long toCollectedAmount, Long fromCancelledAmount, Long toCancelledAmount, Long fromRefundAmount, Long toRefundAmount, Long fromChargebackAmount, Long toChargebackAmount, UUID checkoutId, String merchantReference, String merchantCustomerId, List<Integer> includePaymentProductId, List<StatusCheckout> includeCheckoutStatus, List<ExtendedCheckoutStatus> includeExtendedCheckoutStatus, List<PaymentChannel> includePaymentChannel, String paymentReference, String paymentId, String firstName, String surname, String email, String phoneNumber, String dateOfBirth, String companyInformation, Map<String, String> additionalHeaders) throws ApiException {
        //TODO set header if not present
        return checkoutApi.getCheckouts(merchantId, offset, size, fromDate, toDate, fromCheckoutAmount, toCheckoutAmount, fromOpenAmount, toOpenAmount, fromCollectedAmount, toCollectedAmount, fromCancelledAmount, toCancelledAmount, fromRefundAmount, toRefundAmount, fromChargebackAmount, toChargebackAmount, checkoutId, merchantReference, merchantCustomerId, includePaymentProductId, includeCheckoutStatus, includeExtendedCheckoutStatus, includePaymentChannel, paymentReference, paymentId, firstName, surname, email, phoneNumber, dateOfBirth, companyInformation, additionalHeaders);
    }

    /**
     * Modify a Checkout
     * This endpoint can be used to update or modify the data of a Checkout.
     *
     * @param merchantId           The merchantId identifies uniquely the merchant. A Checkout has exactly one merchant. (required)
     * @param commerceCaseId       Unique identifier of a Commerce Case. (required)
     * @param checkoutId           Unique identifier of a Checkout (required)
     * @param patchCheckoutRequest (required)
     * @throws ApiException if fails to make API call
     */
    public void updateCheckout(String merchantId, UUID commerceCaseId, UUID checkoutId, PatchCheckoutRequest patchCheckoutRequest) throws ApiException {
        //TODO set header if not present
        checkoutApi.updateCheckout(merchantId, commerceCaseId, checkoutId, patchCheckoutRequest, Collections.emptyMap());
    }


    /**
     * Modify a Checkout
     * This endpoint can be used to update or modify the data of a Checkout.
     *
     * @param merchantId           The merchantId identifies uniquely the merchant. A Checkout has exactly one merchant. (required)
     * @param commerceCaseId       Unique identifier of a Commerce Case. (required)
     * @param checkoutId           Unique identifier of a Checkout (required)
     * @param patchCheckoutRequest (required)
     * @param additionalHeaders    additionalHeaders for this call
     * @throws ApiException if fails to make API call
     */
    public void updateCheckout(String merchantId, UUID commerceCaseId, UUID checkoutId, PatchCheckoutRequest patchCheckoutRequest, Map<String, String> additionalHeaders) throws ApiException {
        //TODO set header if not present
        checkoutApi.updateCheckout(merchantId, commerceCaseId, checkoutId, patchCheckoutRequest, additionalHeaders);
    }

}
