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

import java.util.StringJoiner;

/**
 * Request to trigger a payment for a respective Checkout providing the input
 * for a specific payment method. The data from the Commerce case and the
 * Checkout will not be loaded automatically and there is no validation between
 * the data input in place. Depending on the payment method, information of the
 * customer and / or the shopping cart might be required. For more details
 * regarding payment method specific input please check the documentation.
 */
@JsonPropertyOrder({
    PaymentExecutionRequest.JSON_PROPERTY_PAYMENT_METHOD_SPECIFIC_INPUT,
    PaymentExecutionRequest.JSON_PROPERTY_PAYMENT_EXECUTION_SPECIFIC_INPUT
})
public class PaymentExecutionRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_SPECIFIC_INPUT = "paymentMethodSpecificInput";
  private PaymentMethodSpecificInput paymentMethodSpecificInput;

  public static final String JSON_PROPERTY_PAYMENT_EXECUTION_SPECIFIC_INPUT = "paymentExecutionSpecificInput";
  private PaymentExecutionSpecificInput paymentExecutionSpecificInput;

  public PaymentExecutionRequest() {
  }

  public PaymentExecutionRequest paymentMethodSpecificInput(PaymentMethodSpecificInput paymentMethodSpecificInput) {

    this.paymentMethodSpecificInput = paymentMethodSpecificInput;
    return this;
  }

  /**
   * Get paymentMethodSpecificInput
   * 
   * @return paymentMethodSpecificInput
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentMethodSpecificInput getPaymentMethodSpecificInput() {
    return paymentMethodSpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethodSpecificInput(PaymentMethodSpecificInput paymentMethodSpecificInput) {
    this.paymentMethodSpecificInput = paymentMethodSpecificInput;
  }

  public PaymentExecutionRequest paymentExecutionSpecificInput(
      PaymentExecutionSpecificInput paymentExecutionSpecificInput) {

    this.paymentExecutionSpecificInput = paymentExecutionSpecificInput;
    return this;
  }

  /**
   * Get paymentExecutionSpecificInput
   * 
   * @return paymentExecutionSpecificInput
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_EXECUTION_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentExecutionSpecificInput getPaymentExecutionSpecificInput() {
    return paymentExecutionSpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_EXECUTION_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentExecutionSpecificInput(PaymentExecutionSpecificInput paymentExecutionSpecificInput) {
    this.paymentExecutionSpecificInput = paymentExecutionSpecificInput;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentExecutionRequest paymentExecutionRequest = (PaymentExecutionRequest) o;
    return Objects.equals(this.paymentMethodSpecificInput, paymentExecutionRequest.paymentMethodSpecificInput) &&
        Objects.equals(this.paymentExecutionSpecificInput, paymentExecutionRequest.paymentExecutionSpecificInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethodSpecificInput, paymentExecutionSpecificInput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentExecutionRequest {\n");
    sb.append("    paymentMethodSpecificInput: ").append(toIndentedString(paymentMethodSpecificInput)).append("\n");
    sb.append("    paymentExecutionSpecificInput: ").append(toIndentedString(paymentExecutionSpecificInput))
        .append("\n");
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

    // add `paymentMethodSpecificInput` to the URL query string
    if (getPaymentMethodSpecificInput() != null) {
      joiner.add(getPaymentMethodSpecificInput().toUrlQueryString(prefix + "paymentMethodSpecificInput" + suffix));
    }

    // add `paymentExecutionSpecificInput` to the URL query string
    if (getPaymentExecutionSpecificInput() != null) {
      joiner
          .add(getPaymentExecutionSpecificInput().toUrlQueryString(prefix + "paymentExecutionSpecificInput" + suffix));
    }

    return joiner.toString();
  }

}
