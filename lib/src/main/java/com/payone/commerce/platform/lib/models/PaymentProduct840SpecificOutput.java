package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * PayPal (payment product 840) specific details.
 */
@JsonPropertyOrder({
    PaymentProduct840SpecificOutput.JSON_PROPERTY_BILLING_ADDRESS,
    PaymentProduct840SpecificOutput.JSON_PROPERTY_CUSTOMER_ACCOUNT,
    PaymentProduct840SpecificOutput.JSON_PROPERTY_SHIPPING_ADDRESS
})
public class PaymentProduct840SpecificOutput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_BILLING_ADDRESS = "billingAddress";
  private Address billingAddress;

  public static final String JSON_PROPERTY_CUSTOMER_ACCOUNT = "customerAccount";
  private PaymentProduct840CustomerAccount customerAccount;

  public static final String JSON_PROPERTY_SHIPPING_ADDRESS = "shippingAddress";
  private Address shippingAddress;

  public PaymentProduct840SpecificOutput() {
  }

  public PaymentProduct840SpecificOutput billingAddress(Address billingAddress) {

    this.billingAddress = billingAddress;
    return this;
  }

  /**
   * Get billingAddress
   * 
   * @return billingAddress
   **/

  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Address getBillingAddress() {
    return billingAddress;
  }

  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }

  public PaymentProduct840SpecificOutput customerAccount(PaymentProduct840CustomerAccount customerAccount) {

    this.customerAccount = customerAccount;
    return this;
  }

  /**
   * Get customerAccount
   * 
   * @return customerAccount
   **/

  @JsonProperty(JSON_PROPERTY_CUSTOMER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentProduct840CustomerAccount getCustomerAccount() {
    return customerAccount;
  }

  @JsonProperty(JSON_PROPERTY_CUSTOMER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerAccount(PaymentProduct840CustomerAccount customerAccount) {
    this.customerAccount = customerAccount;
  }

  public PaymentProduct840SpecificOutput shippingAddress(Address shippingAddress) {

    this.shippingAddress = shippingAddress;
    return this;
  }

  /**
   * Get shippingAddress
   * 
   * @return shippingAddress
   **/

  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Address getShippingAddress() {
    return shippingAddress;
  }

  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProduct840SpecificOutput paymentProduct840SpecificOutput = (PaymentProduct840SpecificOutput) o;
    return Objects.equals(this.billingAddress, paymentProduct840SpecificOutput.billingAddress) &&
        Objects.equals(this.customerAccount, paymentProduct840SpecificOutput.customerAccount) &&
        Objects.equals(this.shippingAddress, paymentProduct840SpecificOutput.shippingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, customerAccount, shippingAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProduct840SpecificOutput {\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    customerAccount: ").append(toIndentedString(customerAccount)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
