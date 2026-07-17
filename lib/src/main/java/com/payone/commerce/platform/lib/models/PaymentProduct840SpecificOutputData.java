package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ PaymentProduct840SpecificOutputData.JSON_PROPERTY_BILLING_ADDRESS,
    PaymentProduct840SpecificOutputData.JSON_PROPERTY_CUSTOMER_ACCOUNT,
    PaymentProduct840SpecificOutputData.JSON_PROPERTY_PAYPAL_TRANSACTION_ID })
public class PaymentProduct840SpecificOutputData implements Serializable {
  private static final long serialVersionUID = 1L;
  public static final String JSON_PROPERTY_BILLING_ADDRESS = "billingAddress";
  private Address billingAddress;
  public static final String JSON_PROPERTY_CUSTOMER_ACCOUNT = "customerAccount";
  private PaymentProduct840CustomerAccount customerAccount;
  public static final String JSON_PROPERTY_PAYPAL_TRANSACTION_ID = "payPalTransactionId";
  private String payPalTransactionId;

  public PaymentProduct840SpecificOutputData billingAddress(Address value) {
    billingAddress = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Address getBillingAddress() {
    return billingAddress;
  }

  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddress(Address value) {
    billingAddress = value;
  }

  public PaymentProduct840SpecificOutputData customerAccount(PaymentProduct840CustomerAccount value) {
    customerAccount = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_CUSTOMER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PaymentProduct840CustomerAccount getCustomerAccount() {
    return customerAccount;
  }

  @JsonProperty(JSON_PROPERTY_CUSTOMER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerAccount(PaymentProduct840CustomerAccount value) {
    customerAccount = value;
  }

  public PaymentProduct840SpecificOutputData payPalTransactionId(String value) {
    payPalTransactionId = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_PAYPAL_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPayPalTransactionId() {
    return payPalTransactionId;
  }

  @JsonProperty(JSON_PROPERTY_PAYPAL_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayPalTransactionId(String value) {
    payPalTransactionId = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    PaymentProduct840SpecificOutputData that = (PaymentProduct840SpecificOutputData) o;
    return Objects.equals(billingAddress, that.billingAddress) && Objects.equals(customerAccount, that.customerAccount)
        && Objects.equals(payPalTransactionId, that.payPalTransactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, customerAccount, payPalTransactionId);
  }

  @Override
  public String toString() {
    return "class PaymentProduct840SpecificOutputData {\n    billingAddress: " + toIndentedString(billingAddress)
        + "\n    customerAccount: " + toIndentedString(customerAccount) + "\n    payPalTransactionId: "
        + toIndentedString(payPalTransactionId) + "\n}";
  }

  private String toIndentedString(Object value) {
    return value == null ? "null" : value.toString().replace("\n", "\n    ");
  }
}
