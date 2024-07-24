package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing the specific output details for financing payment methods
 * (Buy Now Pay Later)
 */
@JsonPropertyOrder({
    FinancingPaymentMethodSpecificOutput.JSON_PROPERTY_PAYMENT_PRODUCT_ID,
    FinancingPaymentMethodSpecificOutput.JSON_PROPERTY_PAYMENT_PRODUCT3391_SPECIFIC_OUTPUT
})
public class FinancingPaymentMethodSpecificOutput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT_ID = "paymentProductId";
  private Integer paymentProductId;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT3391_SPECIFIC_OUTPUT = "paymentProduct3391SpecificOutput";
  private PaymentProduct3391SpecificOutput paymentProduct3391SpecificOutput;

  public FinancingPaymentMethodSpecificOutput() {
  }

  public FinancingPaymentMethodSpecificOutput paymentProductId(Integer paymentProductId) {

    this.paymentProductId = paymentProductId;
    return this;
  }

  /**
   * Payment product identifier - please check product documentation for a full
   * overview of possible values. Currently supported payment methods * 3390 -
   * PAYONE Secured Invoice * 3391 - PAYONE Secured Installment * 3392 - PAYONE
   * Secured Direct Debit
   * minimum: 0
   * maximum: 99999
   * 
   * @return paymentProductId
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPaymentProductId() {
    return paymentProductId;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentProductId(Integer paymentProductId) {
    this.paymentProductId = paymentProductId;
  }

  public FinancingPaymentMethodSpecificOutput paymentProduct3391SpecificOutput(
      PaymentProduct3391SpecificOutput paymentProduct3391SpecificOutput) {

    this.paymentProduct3391SpecificOutput = paymentProduct3391SpecificOutput;
    return this;
  }

  /**
   * Get paymentProduct3391SpecificOutput
   * 
   * @return paymentProduct3391SpecificOutput
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT3391_SPECIFIC_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentProduct3391SpecificOutput getPaymentProduct3391SpecificOutput() {
    return paymentProduct3391SpecificOutput;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT3391_SPECIFIC_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentProduct3391SpecificOutput(PaymentProduct3391SpecificOutput paymentProduct3391SpecificOutput) {
    this.paymentProduct3391SpecificOutput = paymentProduct3391SpecificOutput;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancingPaymentMethodSpecificOutput financingPaymentMethodSpecificOutput = (FinancingPaymentMethodSpecificOutput) o;
    return Objects.equals(this.paymentProductId, financingPaymentMethodSpecificOutput.paymentProductId) &&
        Objects.equals(this.paymentProduct3391SpecificOutput,
            financingPaymentMethodSpecificOutput.paymentProduct3391SpecificOutput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentProductId, paymentProduct3391SpecificOutput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancingPaymentMethodSpecificOutput {\n");
    sb.append("    paymentProductId: ").append(toIndentedString(paymentProductId)).append("\n");
    sb.append("    paymentProduct3391SpecificOutput: ").append(toIndentedString(paymentProduct3391SpecificOutput))
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
