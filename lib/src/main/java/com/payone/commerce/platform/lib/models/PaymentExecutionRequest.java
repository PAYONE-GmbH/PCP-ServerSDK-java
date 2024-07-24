package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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

}
