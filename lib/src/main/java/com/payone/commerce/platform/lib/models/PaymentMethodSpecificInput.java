/*
 * Commerce Platform API
 * RESTful API for the creation of Commerce Cases with Checkouts and the execution of Payments. 
 *
 * The version of the OpenAPI document: 1.5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.payone.commerce.platform.lib.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Input for the payment for a respective payment method. In case the
 * paymentMethodSpecificInput has already been provided when creating the
 * Commerce Case or Checkout, it will automatically be used for the Payment
 * Execution. If a new input will be provided, the existing input will be
 * updated.
 */
@JsonPropertyOrder({
    PaymentMethodSpecificInput.JSON_PROPERTY_CARD_PAYMENT_METHOD_SPECIFIC_INPUT,
    PaymentMethodSpecificInput.JSON_PROPERTY_MOBILE_PAYMENT_METHOD_SPECIFIC_INPUT,
    PaymentMethodSpecificInput.JSON_PROPERTY_REDIRECT_PAYMENT_METHOD_SPECIFIC_INPUT,
    PaymentMethodSpecificInput.JSON_PROPERTY_SEPA_DIRECT_DEBIT_PAYMENT_METHOD_SPECIFIC_INPUT,
    PaymentMethodSpecificInput.JSON_PROPERTY_FINANCING_PAYMENT_METHOD_SPECIFIC_INPUT,
    PaymentMethodSpecificInput.JSON_PROPERTY_CUSTOMER_DEVICE,
    PaymentMethodSpecificInput.JSON_PROPERTY_PAYMENT_CHANNEL
})
public class PaymentMethodSpecificInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CARD_PAYMENT_METHOD_SPECIFIC_INPUT = "cardPaymentMethodSpecificInput";
  private CardPaymentMethodSpecificInput cardPaymentMethodSpecificInput;

  public static final String JSON_PROPERTY_MOBILE_PAYMENT_METHOD_SPECIFIC_INPUT = "mobilePaymentMethodSpecificInput";
  private MobilePaymentMethodSpecificInput mobilePaymentMethodSpecificInput;

  public static final String JSON_PROPERTY_REDIRECT_PAYMENT_METHOD_SPECIFIC_INPUT = "redirectPaymentMethodSpecificInput";
  private RedirectPaymentMethodSpecificInput redirectPaymentMethodSpecificInput;

  public static final String JSON_PROPERTY_SEPA_DIRECT_DEBIT_PAYMENT_METHOD_SPECIFIC_INPUT = "sepaDirectDebitPaymentMethodSpecificInput";
  private SepaDirectDebitPaymentMethodSpecificInput sepaDirectDebitPaymentMethodSpecificInput;

  public static final String JSON_PROPERTY_FINANCING_PAYMENT_METHOD_SPECIFIC_INPUT = "financingPaymentMethodSpecificInput";
  private FinancingPaymentMethodSpecificInput financingPaymentMethodSpecificInput;

  public static final String JSON_PROPERTY_CUSTOMER_DEVICE = "customerDevice";
  private CustomerDevice customerDevice;

  public static final String JSON_PROPERTY_PAYMENT_CHANNEL = "paymentChannel";
  private PaymentChannel paymentChannel;

  public PaymentMethodSpecificInput() {
  }

  public PaymentMethodSpecificInput cardPaymentMethodSpecificInput(
      CardPaymentMethodSpecificInput cardPaymentMethodSpecificInput) {

    this.cardPaymentMethodSpecificInput = cardPaymentMethodSpecificInput;
    return this;
  }

  /**
   * Get cardPaymentMethodSpecificInput
   * 
   * @return cardPaymentMethodSpecificInput
   **/

  @JsonProperty(JSON_PROPERTY_CARD_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CardPaymentMethodSpecificInput getCardPaymentMethodSpecificInput() {
    return cardPaymentMethodSpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_CARD_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardPaymentMethodSpecificInput(CardPaymentMethodSpecificInput cardPaymentMethodSpecificInput) {
    this.cardPaymentMethodSpecificInput = cardPaymentMethodSpecificInput;
  }

  public PaymentMethodSpecificInput mobilePaymentMethodSpecificInput(
      MobilePaymentMethodSpecificInput mobilePaymentMethodSpecificInput) {

    this.mobilePaymentMethodSpecificInput = mobilePaymentMethodSpecificInput;
    return this;
  }

  /**
   * Get mobilePaymentMethodSpecificInput
   * 
   * @return mobilePaymentMethodSpecificInput
   **/

  @JsonProperty(JSON_PROPERTY_MOBILE_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MobilePaymentMethodSpecificInput getMobilePaymentMethodSpecificInput() {
    return mobilePaymentMethodSpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_MOBILE_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobilePaymentMethodSpecificInput(MobilePaymentMethodSpecificInput mobilePaymentMethodSpecificInput) {
    this.mobilePaymentMethodSpecificInput = mobilePaymentMethodSpecificInput;
  }

  public PaymentMethodSpecificInput redirectPaymentMethodSpecificInput(
      RedirectPaymentMethodSpecificInput redirectPaymentMethodSpecificInput) {

    this.redirectPaymentMethodSpecificInput = redirectPaymentMethodSpecificInput;
    return this;
  }

  /**
   * Get redirectPaymentMethodSpecificInput
   * 
   * @return redirectPaymentMethodSpecificInput
   **/

  @JsonProperty(JSON_PROPERTY_REDIRECT_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RedirectPaymentMethodSpecificInput getRedirectPaymentMethodSpecificInput() {
    return redirectPaymentMethodSpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_REDIRECT_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectPaymentMethodSpecificInput(
      RedirectPaymentMethodSpecificInput redirectPaymentMethodSpecificInput) {
    this.redirectPaymentMethodSpecificInput = redirectPaymentMethodSpecificInput;
  }

  public PaymentMethodSpecificInput sepaDirectDebitPaymentMethodSpecificInput(
      SepaDirectDebitPaymentMethodSpecificInput sepaDirectDebitPaymentMethodSpecificInput) {

    this.sepaDirectDebitPaymentMethodSpecificInput = sepaDirectDebitPaymentMethodSpecificInput;
    return this;
  }

  /**
   * Get sepaDirectDebitPaymentMethodSpecificInput
   * 
   * @return sepaDirectDebitPaymentMethodSpecificInput
   **/

  @JsonProperty(JSON_PROPERTY_SEPA_DIRECT_DEBIT_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SepaDirectDebitPaymentMethodSpecificInput getSepaDirectDebitPaymentMethodSpecificInput() {
    return sepaDirectDebitPaymentMethodSpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_SEPA_DIRECT_DEBIT_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSepaDirectDebitPaymentMethodSpecificInput(
      SepaDirectDebitPaymentMethodSpecificInput sepaDirectDebitPaymentMethodSpecificInput) {
    this.sepaDirectDebitPaymentMethodSpecificInput = sepaDirectDebitPaymentMethodSpecificInput;
  }

  public PaymentMethodSpecificInput financingPaymentMethodSpecificInput(
      FinancingPaymentMethodSpecificInput financingPaymentMethodSpecificInput) {

    this.financingPaymentMethodSpecificInput = financingPaymentMethodSpecificInput;
    return this;
  }

  /**
   * Get financingPaymentMethodSpecificInput
   * 
   * @return financingPaymentMethodSpecificInput
   **/

  @JsonProperty(JSON_PROPERTY_FINANCING_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FinancingPaymentMethodSpecificInput getFinancingPaymentMethodSpecificInput() {
    return financingPaymentMethodSpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_FINANCING_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinancingPaymentMethodSpecificInput(
      FinancingPaymentMethodSpecificInput financingPaymentMethodSpecificInput) {
    this.financingPaymentMethodSpecificInput = financingPaymentMethodSpecificInput;
  }

  public PaymentMethodSpecificInput customerDevice(CustomerDevice customerDevice) {

    this.customerDevice = customerDevice;
    return this;
  }

  /**
   * Get customerDevice
   * 
   * @return customerDevice
   **/

  @JsonProperty(JSON_PROPERTY_CUSTOMER_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomerDevice getCustomerDevice() {
    return customerDevice;
  }

  @JsonProperty(JSON_PROPERTY_CUSTOMER_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerDevice(CustomerDevice customerDevice) {
    this.customerDevice = customerDevice;
  }

  public PaymentMethodSpecificInput paymentChannel(PaymentChannel paymentChannel) {

    this.paymentChannel = paymentChannel;
    return this;
  }

  /**
   * Get paymentChannel
   * 
   * @return paymentChannel
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentChannel getPaymentChannel() {
    return paymentChannel;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentChannel(PaymentChannel paymentChannel) {
    this.paymentChannel = paymentChannel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodSpecificInput paymentMethodSpecificInput = (PaymentMethodSpecificInput) o;
    return Objects.equals(this.cardPaymentMethodSpecificInput,
        paymentMethodSpecificInput.cardPaymentMethodSpecificInput) &&
        Objects
            .equals(this.mobilePaymentMethodSpecificInput, paymentMethodSpecificInput.mobilePaymentMethodSpecificInput)
        &&
        Objects.equals(this.redirectPaymentMethodSpecificInput,
            paymentMethodSpecificInput.redirectPaymentMethodSpecificInput)
        &&
        Objects.equals(this.sepaDirectDebitPaymentMethodSpecificInput,
            paymentMethodSpecificInput.sepaDirectDebitPaymentMethodSpecificInput)
        &&
        Objects.equals(this.financingPaymentMethodSpecificInput,
            paymentMethodSpecificInput.financingPaymentMethodSpecificInput)
        &&
        Objects.equals(this.customerDevice, paymentMethodSpecificInput.customerDevice) &&
        Objects.equals(this.paymentChannel, paymentMethodSpecificInput.paymentChannel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardPaymentMethodSpecificInput, mobilePaymentMethodSpecificInput,
        redirectPaymentMethodSpecificInput, sepaDirectDebitPaymentMethodSpecificInput,
        financingPaymentMethodSpecificInput, customerDevice, paymentChannel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodSpecificInput {\n");
    sb.append("    cardPaymentMethodSpecificInput: ").append(toIndentedString(cardPaymentMethodSpecificInput))
        .append("\n");
    sb.append("    mobilePaymentMethodSpecificInput: ").append(toIndentedString(mobilePaymentMethodSpecificInput))
        .append("\n");
    sb.append("    redirectPaymentMethodSpecificInput: ").append(toIndentedString(redirectPaymentMethodSpecificInput))
        .append("\n");
    sb.append("    sepaDirectDebitPaymentMethodSpecificInput: ")
        .append(toIndentedString(sepaDirectDebitPaymentMethodSpecificInput)).append("\n");
    sb.append("    financingPaymentMethodSpecificInput: ").append(toIndentedString(financingPaymentMethodSpecificInput))
        .append("\n");
    sb.append("    customerDevice: ").append(toIndentedString(customerDevice)).append("\n");
    sb.append("    paymentChannel: ").append(toIndentedString(paymentChannel)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `cardPaymentMethodSpecificInput` to the URL query string
    if (getCardPaymentMethodSpecificInput() != null) {
      joiner.add(
          getCardPaymentMethodSpecificInput().toUrlQueryString(prefix + "cardPaymentMethodSpecificInput" + suffix));
    }

    // add `mobilePaymentMethodSpecificInput` to the URL query string
    if (getMobilePaymentMethodSpecificInput() != null) {
      joiner.add(
          getMobilePaymentMethodSpecificInput().toUrlQueryString(prefix + "mobilePaymentMethodSpecificInput" + suffix));
    }

    // add `redirectPaymentMethodSpecificInput` to the URL query string
    if (getRedirectPaymentMethodSpecificInput() != null) {
      joiner.add(getRedirectPaymentMethodSpecificInput()
          .toUrlQueryString(prefix + "redirectPaymentMethodSpecificInput" + suffix));
    }

    // add `sepaDirectDebitPaymentMethodSpecificInput` to the URL query string
    if (getSepaDirectDebitPaymentMethodSpecificInput() != null) {
      joiner.add(getSepaDirectDebitPaymentMethodSpecificInput()
          .toUrlQueryString(prefix + "sepaDirectDebitPaymentMethodSpecificInput" + suffix));
    }

    // add `financingPaymentMethodSpecificInput` to the URL query string
    if (getFinancingPaymentMethodSpecificInput() != null) {
      joiner.add(getFinancingPaymentMethodSpecificInput()
          .toUrlQueryString(prefix + "financingPaymentMethodSpecificInput" + suffix));
    }

    // add `customerDevice` to the URL query string
    if (getCustomerDevice() != null) {
      joiner.add(getCustomerDevice().toUrlQueryString(prefix + "customerDevice" + suffix));
    }

    // add `paymentChannel` to the URL query string
    if (getPaymentChannel() != null) {
      try {
        joiner.add(String.format("%spaymentChannel%s=%s", prefix, suffix,
            URLEncoder.encode(String.valueOf(getPaymentChannel()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}
