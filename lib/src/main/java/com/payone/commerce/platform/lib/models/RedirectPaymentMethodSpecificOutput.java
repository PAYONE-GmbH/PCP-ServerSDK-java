package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing the redirect payment product details.
 */
@JsonPropertyOrder({
    RedirectPaymentMethodSpecificOutput.JSON_PROPERTY_PAYMENT_PRODUCT_ID,
    RedirectPaymentMethodSpecificOutput.JSON_PROPERTY_PAYMENT_PRODUCT840_SPECIFIC_OUTPUT,
    RedirectPaymentMethodSpecificOutput.JSON_PROPERTY_PAYMENT_PROCESSING_TOKEN,
    RedirectPaymentMethodSpecificOutput.JSON_PROPERTY_REPORTING_TOKEN
})
public class RedirectPaymentMethodSpecificOutput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT_ID = "paymentProductId";
  private Integer paymentProductId;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT840_SPECIFIC_OUTPUT = "paymentProduct840SpecificOutput";
  private PaymentProduct840SpecificOutput paymentProduct840SpecificOutput;

  public static final String JSON_PROPERTY_PAYMENT_PROCESSING_TOKEN = "paymentProcessingToken";
  private String paymentProcessingToken;

  public static final String JSON_PROPERTY_REPORTING_TOKEN = "reportingToken";
  private String reportingToken;

  public RedirectPaymentMethodSpecificOutput() {
  }

  public RedirectPaymentMethodSpecificOutput paymentProductId(Integer paymentProductId) {

    this.paymentProductId = paymentProductId;
    return this;
  }

  /**
   * &lt;- Payment product identifier - please check product documentation for a
   * full overview of possible values.
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

  public RedirectPaymentMethodSpecificOutput paymentProduct840SpecificOutput(
      PaymentProduct840SpecificOutput paymentProduct840SpecificOutput) {

    this.paymentProduct840SpecificOutput = paymentProduct840SpecificOutput;
    return this;
  }

  /**
   * Get paymentProduct840SpecificOutput
   * 
   * @return paymentProduct840SpecificOutput
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT840_SPECIFIC_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentProduct840SpecificOutput getPaymentProduct840SpecificOutput() {
    return paymentProduct840SpecificOutput;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT840_SPECIFIC_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentProduct840SpecificOutput(PaymentProduct840SpecificOutput paymentProduct840SpecificOutput) {
    this.paymentProduct840SpecificOutput = paymentProduct840SpecificOutput;
  }

  public RedirectPaymentMethodSpecificOutput paymentProcessingToken(String paymentProcessingToken) {

    this.paymentProcessingToken = paymentProcessingToken;
    return this;
  }

  /**
   * ID of the token. This property is populated when the payment was done with a
   * token.
   * 
   * @return paymentProcessingToken
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_PROCESSING_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentProcessingToken() {
    return paymentProcessingToken;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_PROCESSING_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentProcessingToken(String paymentProcessingToken) {
    this.paymentProcessingToken = paymentProcessingToken;
  }

  public RedirectPaymentMethodSpecificOutput reportingToken(String reportingToken) {

    this.reportingToken = reportingToken;
    return this;
  }

  /**
   * Token to identify the card in the reporting.
   * 
   * @return reportingToken
   **/

  @JsonProperty(JSON_PROPERTY_REPORTING_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReportingToken() {
    return reportingToken;
  }

  @JsonProperty(JSON_PROPERTY_REPORTING_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportingToken(String reportingToken) {
    this.reportingToken = reportingToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedirectPaymentMethodSpecificOutput redirectPaymentMethodSpecificOutput = (RedirectPaymentMethodSpecificOutput) o;
    return Objects.equals(this.paymentProductId, redirectPaymentMethodSpecificOutput.paymentProductId) &&
        Objects.equals(this.paymentProduct840SpecificOutput,
            redirectPaymentMethodSpecificOutput.paymentProduct840SpecificOutput)
        &&
        Objects.equals(this.paymentProcessingToken, redirectPaymentMethodSpecificOutput.paymentProcessingToken) &&
        Objects.equals(this.reportingToken, redirectPaymentMethodSpecificOutput.reportingToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentProductId, paymentProduct840SpecificOutput, paymentProcessingToken, reportingToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedirectPaymentMethodSpecificOutput {\n");
    sb.append("    paymentProductId: ").append(toIndentedString(paymentProductId)).append("\n");
    sb.append("    paymentProduct840SpecificOutput: ").append(toIndentedString(paymentProduct840SpecificOutput))
        .append("\n");
    sb.append("    paymentProcessingToken: ").append(toIndentedString(paymentProcessingToken)).append("\n");
    sb.append("    reportingToken: ").append(toIndentedString(reportingToken)).append("\n");
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
