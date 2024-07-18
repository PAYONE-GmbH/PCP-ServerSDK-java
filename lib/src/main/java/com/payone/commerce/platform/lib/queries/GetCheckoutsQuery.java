package com.payone.commerce.platform.lib.queries;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import com.payone.commerce.platform.lib.models.ExtendedCheckoutStatus;
import com.payone.commerce.platform.lib.models.PaymentChannel;
import com.payone.commerce.platform.lib.models.StatusCheckout;
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
  private List<Integer> includePaymentProductId;
  private List<StatusCheckout> includeCheckoutStatus;
  private List<ExtendedCheckoutStatus> includeExtendedCheckoutStatus;
  private List<PaymentChannel> includePaymentChannel;
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

  public GetCheckoutsQuery setOffset(Integer offset) {
    this.offset = offset;
    return this;
  }

  public GetCheckoutsQuery setSize(Integer size) {
    this.size = size;
    return this;
  }

  public GetCheckoutsQuery setFromDate(String fromDate) {
    this.fromDate = fromDate;
    return this;
  }

  public GetCheckoutsQuery setToDate(String toDate) {
    this.toDate = toDate;
    return this;
  }

  public GetCheckoutsQuery setFromCheckoutAmount(Integer fromCheckoutAmount) {
    this.fromCheckoutAmount = fromCheckoutAmount;
    return this;
  }

  public GetCheckoutsQuery setToCheckoutAmount(Integer toCheckoutAmount) {
    this.toCheckoutAmount = toCheckoutAmount;
    return this;
  }

  public GetCheckoutsQuery setFromOpenAmount(Integer fromOpenAmount) {
    this.fromOpenAmount = fromOpenAmount;
    return this;
  }

  public GetCheckoutsQuery setToOpenAmount(Integer toOpenAmount) {
    this.toOpenAmount = toOpenAmount;
    return this;
  }

  public GetCheckoutsQuery setFromCollectedAmount(Integer fromCollectedAmount) {
    this.fromCollectedAmount = fromCollectedAmount;
    return this;
  }

  public GetCheckoutsQuery setToCollectedAmount(Integer toCollectedAmount) {
    this.toCollectedAmount = toCollectedAmount;
    return this;
  }

  public GetCheckoutsQuery setFromCancelledAmount(Integer fromCancelledAmount) {
    this.fromCancelledAmount = fromCancelledAmount;
    return this;
  }

  public GetCheckoutsQuery setToCancelledAmount(Integer toCancelledAmount) {
    this.toCancelledAmount = toCancelledAmount;
    return this;
  }

  public GetCheckoutsQuery setFromRefundAmount(Integer fromRefundAmount) {
    this.fromRefundAmount = fromRefundAmount;
    return this;
  }

  public GetCheckoutsQuery setToRefundAmount(Integer toRefundAmount) {
    this.toRefundAmount = toRefundAmount;
    return this;
  }

  public GetCheckoutsQuery setFromChargebackAmount(Integer fromChargebackAmount) {
    this.fromChargebackAmount = fromChargebackAmount;
    return this;
  }

  public GetCheckoutsQuery setToChargebackAmount(Integer toChargebackAmount) {
    this.toChargebackAmount = toChargebackAmount;
    return this;
  }

  public GetCheckoutsQuery setCheckoutId(String checkoutId) {
    this.checkoutId = checkoutId;
    return this;
  }

  public GetCheckoutsQuery setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
    return this;
  }

  public GetCheckoutsQuery setMerchantCustomerId(String merchantCustomerId) {
    this.merchantCustomerId = merchantCustomerId;
    return this;
  }

  public GetCheckoutsQuery setIncludePaymentProductId(List<Integer> includePaymentProductId) {
    this.includePaymentProductId = includePaymentProductId;
    return this;
  }

  public GetCheckoutsQuery setIncludeCheckoutStatus(List<StatusCheckout> includeCheckoutStatus) {
    this.includeCheckoutStatus = includeCheckoutStatus;
    return this;
  }

  public GetCheckoutsQuery setIncludeExtendedCheckoutStatus(
      List<ExtendedCheckoutStatus> includeExtendedCheckoutStatus) {
    this.includeExtendedCheckoutStatus = includeExtendedCheckoutStatus;
    return this;
  }

  public GetCheckoutsQuery setIncludePaymentChannel(List<PaymentChannel> includePaymentChannel) {
    this.includePaymentChannel = includePaymentChannel;
    return this;
  }

  public GetCheckoutsQuery setPaymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
    return this;
  }

  public GetCheckoutsQuery setPaymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  public GetCheckoutsQuery setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public GetCheckoutsQuery setSurname(String surname) {
    this.surname = surname;
    return this;
  }

  public GetCheckoutsQuery setEmail(String email) {
    this.email = email;
    return this;
  }

  public GetCheckoutsQuery setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  public GetCheckoutsQuery setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  public GetCheckoutsQuery setCompanyInformation(String companyInformation) {
    this.companyInformation = companyInformation;
    return this;
  }

  public Integer getOffset() {
    return this.offset;
  }

  public Integer getSize() {
    return this.size;
  }

  public String getFromDate() {
    return this.fromDate;
  }

  public String getToDate() {
    return this.toDate;
  }

  public Integer getFromCheckoutAmount() {
    return this.fromCheckoutAmount;
  }

  public Integer getToCheckoutAmount() {
    return this.toCheckoutAmount;
  }

  public Integer getFromOpenAmount() {
    return this.fromOpenAmount;
  }

  public Integer getToOpenAmount() {
    return this.toOpenAmount;
  }

  public Integer getFromCollectedAmount() {
    return this.fromCollectedAmount;
  }

  public Integer getToCollectedAmount() {
    return this.toCollectedAmount;
  }

  public Integer getFromCancelledAmount() {
    return this.fromCancelledAmount;
  }

  public Integer getToCancelledAmount() {
    return this.toCancelledAmount;
  }

  public Integer getFromRefundAmount() {
    return this.fromRefundAmount;
  }

  public Integer getToRefundAmount() {
    return this.toRefundAmount;
  }

  public Integer getFromChargebackAmount() {
    return this.fromChargebackAmount;
  }

  public Integer getToChargebackAmount() {
    return this.toChargebackAmount;
  }

  public String getCheckoutId() {
    return this.checkoutId;
  }

  public String getMerchantReference() {
    return this.merchantReference;
  }

  public String getMerchantCustomerId() {
    return this.merchantCustomerId;
  }

  public List<Integer> getIncludePaymentProductId() {
    return this.includePaymentProductId;
  }

  public List<StatusCheckout> getIncludeCheckoutStatus() {
    return this.includeCheckoutStatus;
  }

  public List<ExtendedCheckoutStatus> getIncludeExtendedCheckoutStatus() {
    return this.includeExtendedCheckoutStatus;
  }

  public List<PaymentChannel> getIncludePaymentChannel() {
    return this.includePaymentChannel;
  }

  public String getPaymentReference() {
    return this.paymentReference;
  }

  public String getPaymentId() {
    return this.paymentId;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getSurname() {
    return this.surname;
  }

  public String getEmail() {
    return this.email;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public String getDateOfBirth() {
    return this.dateOfBirth;
  }

  public String getCompanyInformation() {
    return this.companyInformation;
  }

  public Map<String, String> toQueryMap() {
    Map<String, String> query = new HashMap<>();

    if (this.offset != null) {
      query.put("offset", this.offset.toString());
    }
    if (this.size != null) {
      query.put("size", this.size.toString());
    }
    if (this.fromDate != null) {
      query.put("fromDate", this.fromDate);
    }
    if (this.toDate != null) {
      query.put("toDate", this.toDate);
    }
    if (this.fromCheckoutAmount != null) {
      query.put("fromCheckoutAmount", this.fromCheckoutAmount.toString());
    }
    if (this.toCheckoutAmount != null) {
      query.put("toCheckoutAmount", this.toCheckoutAmount.toString());
    }
    if (this.fromOpenAmount != null) {
      query.put("fromOpenAmount", this.fromOpenAmount.toString());
    }
    if (this.toOpenAmount != null) {
      query.put("toOpenAmount", this.toOpenAmount.toString());
    }
    if (this.fromCollectedAmount != null) {
      query.put("fromCollectedAmount", this.fromCollectedAmount.toString());
    }
    if (this.toCollectedAmount != null) {
      query.put("toCollectedAmount", this.toCollectedAmount.toString());
    }
    if (this.fromCancelledAmount != null) {
      query.put("fromCancelledAmount", this.fromCancelledAmount.toString());
    }
    if (this.toCancelledAmount != null) {
      query.put("toCancelledAmount", this.toCancelledAmount.toString());
    }
    if (this.fromRefundAmount != null) {
      query.put("fromRefundAmount", this.fromRefundAmount.toString());
    }
    if (this.toRefundAmount != null) {
      query.put("toRefundAmount", this.toRefundAmount.toString());
    }
    if (this.fromChargebackAmount != null) {
      query.put("fromChargebackAmount", this.fromChargebackAmount.toString());
    }
    if (this.toChargebackAmount != null) {
      query.put("toChargebackAmount", this.toChargebackAmount.toString());
    }
    if (this.checkoutId != null) {
      query.put("checkoutId", this.checkoutId);
    }
    if (this.merchantReference != null) {
      query.put("merchantReference", this.merchantReference);
    }
    if (this.merchantCustomerId != null) {
      query.put("merchantCustomerId", this.merchantCustomerId);
    }
    if (includePaymentProductId != null) {
      List<String> productIdList = new ArrayList<>();
      for (Integer productId : includePaymentProductId) {
        productIdList.add(productId.toString());
      }
      query.put("includePaymentProductId", String.join(",", productIdList));
    }
    if (includeCheckoutStatus != null) {
      List<String> statusList = new ArrayList<>();
      for (StatusCheckout status : includeCheckoutStatus) {
        statusList.add(status.getValue());
      }
      query.put("includeCheckoutStatus", String.join(",", statusList));
    }
    if (includeExtendedCheckoutStatus != null) {
      List<String> statusList = new ArrayList<>();
      for (ExtendedCheckoutStatus status : includeExtendedCheckoutStatus) {
        statusList.add(status.getValue());
      }
      query.put("includeExtendedCheckoutStatus", String.join(",", statusList));
    }
    if (includePaymentChannel != null) {
      List<String> channelList = new ArrayList<>();
      for (PaymentChannel channel : includePaymentChannel) {
        channelList.add(channel.getValue());
      }
      query.put("includePaymentChannel", String.join(",", channelList));
    }
    if (this.paymentReference != null) {
      query.put("paymentReference", this.paymentReference);
    }
    if (this.paymentId != null) {
      query.put("paymentId", this.paymentId);
    }
    if (this.firstName != null) {
      query.put("firstName", this.firstName);
    }
    if (this.surname != null) {
      query.put("surname", this.surname);
    }
    if (this.email != null) {
      query.put("email", this.email);
    }
    if (this.phoneNumber != null) {
      query.put("phoneNumber", this.phoneNumber);
    }
    if (this.dateOfBirth != null) {
      query.put("dateOfBirth", this.dateOfBirth);
    }
    if (this.companyInformation != null) {
      query.put("companyInformation", this.companyInformation);
    }
    return query;
  }
}
