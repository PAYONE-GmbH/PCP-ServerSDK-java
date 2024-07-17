package com.payone.commerce.platform.lib.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.payone.commerce.platform.lib.utils.QueryConfig;

public class GetCheckoutsQuery implements QueryConfig {
    private Integer offset;
    private Integer size;
    private String fromDate;
    private String toDate;
    private Integer fromCheckoutAmount;
    private Integer toCheckoutAmount;
    private Integer fromOpenAmount;
    private Integer toOpenAmount;
    private Integer fromCollectedAmount;
    private Integer toCollectedAmount;
    private Integer fromCancelledAmount;
    private Integer toCancelledAmount;
    private Integer fromRefundAmount;
    private Integer toRefundAmount;
    private Integer fromChargebackAmount;
    private Integer toChargebackAmount;
    private String checkoutId;
    private String merchantReference;
    private String merchantCustomerId;
    private Set<Integer> includePaymentProductId;
    private Set<StatusCheckout> includeCheckoutStatus;
    private Set<ExtendedCheckoutStatus> includeExtendedCheckoutStatus;
    private Set<PaymentChannel> includePaymentChannel;
    private String paymentReference;
    private String paymentId;
    private String firstName;
    private String surname;
    private String email;
    private String phoneNumber;
    private String dateOfBirth;
    private String companyInformation;

    public GetCheckoutsQuery() {
    }

    public Map<String, String> toQueryMap() {
        // Map<String, String> queryMap = new HashMap<>();
        // return queryMap;
        throw new RuntimeException("Not implemented");
    }
}
