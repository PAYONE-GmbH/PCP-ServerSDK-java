package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The Complete-Order request is the last step to finalize the initial Order. It
 * requires the completePaymentMethodSpecificInput. The previously provided data
 * from the Commerce Case, Checkout and Order will automatically be loaded and
 * used for the completion of the Order.
 */
@JsonPropertyOrder({
    CompleteOrderRequest.JSON_PROPERTY_COMPLETE_PAYMENT_METHOD_SPECIFIC_INPUT
})
public class CompleteOrderRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_COMPLETE_PAYMENT_METHOD_SPECIFIC_INPUT = "completePaymentMethodSpecificInput";
  private CompletePaymentMethodSpecificInput completePaymentMethodSpecificInput;

  public CompleteOrderRequest() {
  }

  public CompleteOrderRequest completePaymentMethodSpecificInput(
      CompletePaymentMethodSpecificInput completePaymentMethodSpecificInput) {

    this.completePaymentMethodSpecificInput = completePaymentMethodSpecificInput;
    return this;
  }

  /**
   * Get completePaymentMethodSpecificInput
   * 
   * @return completePaymentMethodSpecificInput
   **/

  @JsonProperty(JSON_PROPERTY_COMPLETE_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CompletePaymentMethodSpecificInput getCompletePaymentMethodSpecificInput() {
    return completePaymentMethodSpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_COMPLETE_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletePaymentMethodSpecificInput(
      CompletePaymentMethodSpecificInput completePaymentMethodSpecificInput) {
    this.completePaymentMethodSpecificInput = completePaymentMethodSpecificInput;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompleteOrderRequest completeOrderRequest = (CompleteOrderRequest) o;
    return Objects.equals(this.completePaymentMethodSpecificInput,
        completeOrderRequest.completePaymentMethodSpecificInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completePaymentMethodSpecificInput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteOrderRequest {\n");
    sb.append("    completePaymentMethodSpecificInput: ").append(toIndentedString(completePaymentMethodSpecificInput))
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
