package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing the specific input details for payments that involve
 * redirects to 3rd parties to complete, like iDeal and PayPal
 */
@JsonPropertyOrder({
    RedirectPaymentMethodSpecificInput.JSON_PROPERTY_REQUIRES_APPROVAL,
    RedirectPaymentMethodSpecificInput.JSON_PROPERTY_PAYMENT_PROCESSING_TOKEN,
    RedirectPaymentMethodSpecificInput.JSON_PROPERTY_REPORTING_TOKEN,
    RedirectPaymentMethodSpecificInput.JSON_PROPERTY_TOKENIZE,
    RedirectPaymentMethodSpecificInput.JSON_PROPERTY_PAYMENT_PRODUCT_ID,
    RedirectPaymentMethodSpecificInput.JSON_PROPERTY_PAYMENT_PRODUCT840_SPECIFIC_INPUT,
    RedirectPaymentMethodSpecificInput.JSON_PROPERTY_REDIRECTION_DATA
})
public class RedirectPaymentMethodSpecificInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REQUIRES_APPROVAL = "requiresApproval";
  private Boolean requiresApproval;

  public static final String JSON_PROPERTY_PAYMENT_PROCESSING_TOKEN = "paymentProcessingToken";
  private String paymentProcessingToken;

  public static final String JSON_PROPERTY_REPORTING_TOKEN = "reportingToken";
  private String reportingToken;

  public static final String JSON_PROPERTY_TOKENIZE = "tokenize";
  private Boolean tokenize;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT_ID = "paymentProductId";
  private Integer paymentProductId;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT840_SPECIFIC_INPUT = "paymentProduct840SpecificInput";
  private RedirectPaymentProduct840SpecificInput paymentProduct840SpecificInput;

  public static final String JSON_PROPERTY_REDIRECTION_DATA = "redirectionData";
  private RedirectionData redirectionData;

  public RedirectPaymentMethodSpecificInput() {
  }

  @JsonCreator
  public RedirectPaymentMethodSpecificInput(
      @JsonProperty(JSON_PROPERTY_REPORTING_TOKEN) String reportingToken) {
    this();
    this.reportingToken = reportingToken;
  }

  public RedirectPaymentMethodSpecificInput requiresApproval(Boolean requiresApproval) {

    this.requiresApproval = requiresApproval;
    return this;
  }

  /**
   * * true &#x3D; the payment requires approval before the funds will be captured
   * using the Approve payment or Capture payment API * false &#x3D; the payment
   * does not require approval, and the funds will be captured automatically If
   * the parameter is not provided in the request, the default value will be true
   * 
   * @return requiresApproval
   **/

  @JsonProperty(JSON_PROPERTY_REQUIRES_APPROVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequiresApproval() {
    return requiresApproval;
  }

  @JsonProperty(JSON_PROPERTY_REQUIRES_APPROVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequiresApproval(Boolean requiresApproval) {
    this.requiresApproval = requiresApproval;
  }

  public RedirectPaymentMethodSpecificInput paymentProcessingToken(String paymentProcessingToken) {

    this.paymentProcessingToken = paymentProcessingToken;
    return this;
  }

  /**
   * ID of the token to use to create the payment.
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

  public RedirectPaymentMethodSpecificInput tokenize(Boolean tokenize) {

    this.tokenize = tokenize;
    return this;
  }

  /**
   * Indicates if this transaction should be tokenized * true - Tokenize the
   * transaction. * false - Do not tokenize the transaction, unless it would be
   * tokenized by other means such as auto- tokenization of recurring payments.
   * example: false
   * 
   * @return tokenize
   **/

  @JsonProperty(JSON_PROPERTY_TOKENIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTokenize() {
    return tokenize;
  }

  @JsonProperty(JSON_PROPERTY_TOKENIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenize(Boolean tokenize) {
    this.tokenize = tokenize;
  }

  public RedirectPaymentMethodSpecificInput paymentProductId(Integer paymentProductId) {

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

  public RedirectPaymentMethodSpecificInput paymentProduct840SpecificInput(
      RedirectPaymentProduct840SpecificInput paymentProduct840SpecificInput) {

    this.paymentProduct840SpecificInput = paymentProduct840SpecificInput;
    return this;
  }

  /**
   * Get paymentProduct840SpecificInput
   * 
   * @return paymentProduct840SpecificInput
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT840_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RedirectPaymentProduct840SpecificInput getPaymentProduct840SpecificInput() {
    return paymentProduct840SpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT840_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentProduct840SpecificInput(RedirectPaymentProduct840SpecificInput paymentProduct840SpecificInput) {
    this.paymentProduct840SpecificInput = paymentProduct840SpecificInput;
  }

  public RedirectPaymentMethodSpecificInput redirectionData(RedirectionData redirectionData) {

    this.redirectionData = redirectionData;
    return this;
  }

  /**
   * Get redirectionData
   * 
   * @return redirectionData
   **/

  @JsonProperty(JSON_PROPERTY_REDIRECTION_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RedirectionData getRedirectionData() {
    return redirectionData;
  }

  @JsonProperty(JSON_PROPERTY_REDIRECTION_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectionData(RedirectionData redirectionData) {
    this.redirectionData = redirectionData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedirectPaymentMethodSpecificInput redirectPaymentMethodSpecificInput = (RedirectPaymentMethodSpecificInput) o;
    return Objects.equals(this.requiresApproval, redirectPaymentMethodSpecificInput.requiresApproval) &&
        Objects.equals(this.paymentProcessingToken, redirectPaymentMethodSpecificInput.paymentProcessingToken) &&
        Objects.equals(this.reportingToken, redirectPaymentMethodSpecificInput.reportingToken) &&
        Objects.equals(this.tokenize, redirectPaymentMethodSpecificInput.tokenize) &&
        Objects.equals(this.paymentProductId, redirectPaymentMethodSpecificInput.paymentProductId) &&
        Objects.equals(this.paymentProduct840SpecificInput,
            redirectPaymentMethodSpecificInput.paymentProduct840SpecificInput)
        &&
        Objects.equals(this.redirectionData, redirectPaymentMethodSpecificInput.redirectionData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiresApproval, paymentProcessingToken, reportingToken, tokenize, paymentProductId,
        paymentProduct840SpecificInput, redirectionData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedirectPaymentMethodSpecificInput {\n");
    sb.append("    requiresApproval: ").append(toIndentedString(requiresApproval)).append("\n");
    sb.append("    paymentProcessingToken: ").append(toIndentedString(paymentProcessingToken)).append("\n");
    sb.append("    reportingToken: ").append(toIndentedString(reportingToken)).append("\n");
    sb.append("    tokenize: ").append(toIndentedString(tokenize)).append("\n");
    sb.append("    paymentProductId: ").append(toIndentedString(paymentProductId)).append("\n");
    sb.append("    paymentProduct840SpecificInput: ").append(toIndentedString(paymentProduct840SpecificInput))
        .append("\n");
    sb.append("    redirectionData: ").append(toIndentedString(redirectionData)).append("\n");
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
