package com.payone.commerce.platform.lib.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ PaymentProduct840SpecificOutputData.JSON_PROPERTY_BILLING_ADDRESS,
    PaymentProduct840SpecificOutputData.JSON_PROPERTY_CUSTOMER_ACCOUNT,
    PaymentProduct840SpecificOutputData.JSON_PROPERTY_PAYPAL_TRANSACTION_ID,
    PaymentProduct840SpecificOutputForIntent.JSON_PROPERTY_SHIPPING_ADDRESS })
public class PaymentProduct840SpecificOutputForIntent extends PaymentProduct840SpecificOutputData {
  private static final long serialVersionUID = 1L;
  public static final String JSON_PROPERTY_SHIPPING_ADDRESS = "shippingAddress";
  private ShippingAddress shippingAddress;

  @Override
  public PaymentProduct840SpecificOutputForIntent billingAddress(Address value) {
    super.billingAddress(value);
    return this;
  }

  @Override
  public PaymentProduct840SpecificOutputForIntent customerAccount(PaymentProduct840CustomerAccount value) {
    super.customerAccount(value);
    return this;
  }

  @Override
  public PaymentProduct840SpecificOutputForIntent payPalTransactionId(String value) {
    super.payPalTransactionId(value);
    return this;
  }

  public PaymentProduct840SpecificOutputForIntent shippingAddress(ShippingAddress value) {
    shippingAddress = value;
    return this;
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
    return Objects.equals(shippingAddress, ((PaymentProduct840SpecificOutputForIntent) o).shippingAddress)
        && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingAddress, super.hashCode());
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
