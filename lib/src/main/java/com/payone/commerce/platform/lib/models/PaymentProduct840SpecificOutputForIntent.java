package com.payone.commerce.platform.lib.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ PaymentProduct840SpecificOutputForIntent.JSON_PROPERTY_BILLING_ADDRESS,
    PaymentProduct840SpecificOutputForIntent.JSON_PROPERTY_CUSTOMER_ACCOUNT,
    PaymentProduct840SpecificOutputForIntent.JSON_PROPERTY_PAYPAL_TRANSACTION_ID,
    PaymentProduct840SpecificOutputForIntent.JSON_PROPERTY_SHIPPING_ADDRESS })
public class PaymentProduct840SpecificOutputForIntent implements java.io.Serializable {
  private static final long serialVersionUID = 1L;
  public static final String JSON_PROPERTY_BILLING_ADDRESS = "billingAddress";
  private Address billingAddress;
  public static final String JSON_PROPERTY_CUSTOMER_ACCOUNT = "customerAccount";
  private PaymentProduct840CustomerAccountForIntent customerAccount;
  public static final String JSON_PROPERTY_PAYPAL_TRANSACTION_ID = "payPalTransactionId";
  private String payPalTransactionId;
  public static final String JSON_PROPERTY_SHIPPING_ADDRESS = "shippingAddress";
  private ShippingAddress shippingAddress;

  public PaymentProduct840SpecificOutputForIntent billingAddress(Address value) {
    billingAddress = value;
    return this;
  }

  public PaymentProduct840SpecificOutputForIntent customerAccount(PaymentProduct840CustomerAccountForIntent value) {
    customerAccount = value;
    return this;
  }

  public PaymentProduct840SpecificOutputForIntent payPalTransactionId(String value) {
    payPalTransactionId = value;
    return this;
  }

  public PaymentProduct840SpecificOutputForIntent shippingAddress(ShippingAddress value) {
    shippingAddress = value;
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

  @JsonProperty(JSON_PROPERTY_CUSTOMER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PaymentProduct840CustomerAccountForIntent getCustomerAccount() {
    return customerAccount;
  }

  @JsonProperty(JSON_PROPERTY_CUSTOMER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerAccount(PaymentProduct840CustomerAccountForIntent value) {
    customerAccount = value;
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

  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ShippingAddress getShippingAddress() {
    return shippingAddress;
  }

  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingAddress(ShippingAddress value) {
    shippingAddress = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    PaymentProduct840SpecificOutputForIntent that = (PaymentProduct840SpecificOutputForIntent) o;
    return Objects.equals(billingAddress, that.billingAddress) && Objects.equals(customerAccount, that.customerAccount)
        && Objects.equals(payPalTransactionId, that.payPalTransactionId)
        && Objects.equals(shippingAddress, that.shippingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, customerAccount, payPalTransactionId, shippingAddress);
  }

  @Override
  public String toString() {
    return "class PaymentProduct840SpecificOutputForIntent {\n    billingAddress: "
        + toIndentedString(getBillingAddress()) + "\n    customerAccount: " + toIndentedString(getCustomerAccount())
        + "\n    payPalTransactionId: " + toIndentedString(getPayPalTransactionId()) + "\n    shippingAddress: "
        + toIndentedString(shippingAddress) + "\n}";
  }

  private String toIndentedString(Object value) {
    return value == null ? "null" : value.toString().replace("\n", "\n    ");
  }
}
