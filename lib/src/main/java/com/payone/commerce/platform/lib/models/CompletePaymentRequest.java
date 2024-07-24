package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The Complete request is the last step to finalize the initially created
 * Payment. It requires the completeFinancingPaymentMethodSpecificInput. The
 * data for the order object should not differ from the previously provided
 * information in Commerce Case, Checkout and Payment, but will not be validated
 * nor automatically loaded from the Commerce Platform.
 */
@JsonPropertyOrder({
    CompletePaymentRequest.JSON_PROPERTY_FINANCING_PAYMENT_METHOD_SPECIFIC_INPUT,
    CompletePaymentRequest.JSON_PROPERTY_ORDER,
    CompletePaymentRequest.JSON_PROPERTY_DEVICE
})
public class CompletePaymentRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FINANCING_PAYMENT_METHOD_SPECIFIC_INPUT = "financingPaymentMethodSpecificInput";
  private CompleteFinancingPaymentMethodSpecificInput financingPaymentMethodSpecificInput;

  public static final String JSON_PROPERTY_ORDER = "order";
  private Order order;

  public static final String JSON_PROPERTY_DEVICE = "device";
  private CustomerDevice device;

  public CompletePaymentRequest() {
  }

  public CompletePaymentRequest financingPaymentMethodSpecificInput(
      CompleteFinancingPaymentMethodSpecificInput financingPaymentMethodSpecificInput) {

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

  public CompleteFinancingPaymentMethodSpecificInput getFinancingPaymentMethodSpecificInput() {
    return financingPaymentMethodSpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_FINANCING_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinancingPaymentMethodSpecificInput(
      CompleteFinancingPaymentMethodSpecificInput financingPaymentMethodSpecificInput) {
    this.financingPaymentMethodSpecificInput = financingPaymentMethodSpecificInput;
  }

  public CompletePaymentRequest order(Order order) {

    this.order = order;
    return this;
  }

  /**
   * Get order
   * 
   * @return order
   **/

  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Order getOrder() {
    return order;
  }

  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(Order order) {
    this.order = order;
  }

  public CompletePaymentRequest device(CustomerDevice device) {

    this.device = device;
    return this;
  }

  /**
   * Get device
   * 
   * @return device
   **/

  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomerDevice getDevice() {
    return device;
  }

  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDevice(CustomerDevice device) {
    this.device = device;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompletePaymentRequest completePaymentRequest = (CompletePaymentRequest) o;
    return Objects.equals(this.financingPaymentMethodSpecificInput,
        completePaymentRequest.financingPaymentMethodSpecificInput) &&
        Objects.equals(this.order, completePaymentRequest.order) &&
        Objects.equals(this.device, completePaymentRequest.device);
  }

  @Override
  public int hashCode() {
    return Objects.hash(financingPaymentMethodSpecificInput, order, device);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletePaymentRequest {\n");
    sb.append("    financingPaymentMethodSpecificInput: ").append(toIndentedString(financingPaymentMethodSpecificInput))
        .append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
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
