package com.payone.commerce.platform.lib.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GetCommerceCasesQuery {
    private Integer offset = null;
    private String size = null;
    private String fromDate = null;
    private String toDate = null;
    private String commerceCaseId = null;
    private String merchantReference = null;
    private String merchantCustomerId = null;
    private Set<StatusCheckout> includeCheckoutStatus = null;
    private Set<PaymentChannel> includePaymentChannel = null;

    public GetCommerceCasesQuery() {

    }

    public GetCommerceCasesQuery setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public GetCommerceCasesQuery setSize(String size) {
        this.size = size;
        return this;
    }

    public GetCommerceCasesQuery setFromDate(String fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    public GetCommerceCasesQuery setToDate(String toDate) {
        this.toDate = toDate;
        return this;
    }

    public GetCommerceCasesQuery setCommerceCaseId(String commerceCaseId) {
        this.commerceCaseId = commerceCaseId;
        return this;
    }

    public GetCommerceCasesQuery setMerchantReference(String merchantReference) {
        this.merchantReference = merchantReference;
        return this;
    }

    public GetCommerceCasesQuery setMerchantCustomerId(String merchantCustomerId) {
        this.merchantCustomerId = merchantCustomerId;
        return this;
    }

    public GetCommerceCasesQuery setIncludeCheckoutStatus(Set<StatusCheckout> includeCheckoutStatus) {
        this.includeCheckoutStatus = includeCheckoutStatus;
        return this;
    }

    public GetCommerceCasesQuery setIncludePaymentChannel(Set<PaymentChannel> includePaymentChannel) {
        this.includePaymentChannel = includePaymentChannel;
        return this;
    }

    public Integer getOffset() {
        return offset;
    }

    public String getSize() {
        return size;
    }

    public String getFromDate() {
        return fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public String getCommerceCaseId() {
        return commerceCaseId;
    }

    public String getMerchantReference() {
        return merchantReference;
    }

    public String getMerchantCustomerId() {
        return merchantCustomerId;
    }

    public Set<StatusCheckout> getIncludeCheckoutStatus() {
        return includeCheckoutStatus;
    }

    public Set<PaymentChannel> getIncludePaymentChannel() {
        return includePaymentChannel;
    }

    public Map<String, String> toQueryMap() {
        Map<String, String> query = new HashMap<>();

        if (offset != null) {
            query.put("offset", offset.toString());
        }
        if (size != null) {
            query.put("size", size);
        }
        if (fromDate != null) {
            query.put("fromDate", fromDate);
        }
        if (toDate != null) {
            query.put("toDate", toDate);
        }
        if (commerceCaseId != null) {
            query.put("commerceCaseId", commerceCaseId);
        }
        if (merchantReference != null) {
            query.put("merchantReference", merchantReference);
        }
        if (merchantCustomerId != null) {
            query.put("merchantCustomerId", merchantCustomerId);
        }
        if (includeCheckoutStatus != null) {
            List<String> statusList = new ArrayList<>();
            for (StatusCheckout status : includeCheckoutStatus) {
                statusList.add(status.getValue());
            }
            query.put("includeCheckoutStatus", String.join(",", statusList));
        }
        if (includePaymentChannel != null) {
            List<String> channelList = new ArrayList<>();
            for (PaymentChannel channel : includePaymentChannel) {
                channelList.add(channel.getValue());
            }
            query.put("includePaymentChannel", String.join(",", channelList));
        }
        return query;

    }
}
