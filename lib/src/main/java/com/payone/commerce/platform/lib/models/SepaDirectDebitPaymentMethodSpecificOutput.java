package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing the SEPA direct debit details.
 */
@JsonPropertyOrder({
    SepaDirectDebitPaymentMethodSpecificOutput.JSON_PROPERTY_PAYMENT_PRODUCT_ID,
    SepaDirectDebitPaymentMethodSpecificOutput.JSON_PROPERTY_PAYMENT_PRODUCT771_SPECIFIC_OUTPUT
})
public class SepaDirectDebitPaymentMethodSpecificOutput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT_ID = "paymentProductId";
  private Integer paymentProductId;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT771_SPECIFIC_OUTPUT = "paymentProduct771SpecificOutput";
  private PaymentProduct771SpecificOutput paymentProduct771SpecificOutput;

  public SepaDirectDebitPaymentMethodSpecificOutput() {
  }

  public SepaDirectDebitPaymentMethodSpecificOutput paymentProductId(Integer paymentProductId) {

    this.paymentProductId = paymentProductId;
    return this;
  }

  /**
   * Payment product identifier - please check product documentation for a full
   * overview of possible values.
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

  public SepaDirectDebitPaymentMethodSpecificOutput paymentProduct771SpecificOutput(
      PaymentProduct771SpecificOutput paymentProduct771SpecificOutput) {

    this.paymentProduct771SpecificOutput = paymentProduct771SpecificOutput;
    return this;
  }

  /**
   * Get paymentProduct771SpecificOutput
   * 
   * @return paymentProduct771SpecificOutput
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT771_SPECIFIC_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentProduct771SpecificOutput getPaymentProduct771SpecificOutput() {
    return paymentProduct771SpecificOutput;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT771_SPECIFIC_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentProduct771SpecificOutput(PaymentProduct771SpecificOutput paymentProduct771SpecificOutput) {
    this.paymentProduct771SpecificOutput = paymentProduct771SpecificOutput;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SepaDirectDebitPaymentMethodSpecificOutput sepaDirectDebitPaymentMethodSpecificOutput = (SepaDirectDebitPaymentMethodSpecificOutput) o;
    return Objects.equals(this.paymentProductId, sepaDirectDebitPaymentMethodSpecificOutput.paymentProductId) &&
        Objects.equals(this.paymentProduct771SpecificOutput,
            sepaDirectDebitPaymentMethodSpecificOutput.paymentProduct771SpecificOutput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentProductId, paymentProduct771SpecificOutput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SepaDirectDebitPaymentMethodSpecificOutput {\n");
    sb.append("    paymentProductId: ").append(toIndentedString(paymentProductId)).append("\n");
    sb.append("    paymentProduct771SpecificOutput: ").append(toIndentedString(paymentProduct771SpecificOutput))
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
