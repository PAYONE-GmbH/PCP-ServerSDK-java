package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing the card payment method details.
 */
@JsonPropertyOrder({
    CardPaymentMethodSpecificOutput.JSON_PROPERTY_PAYMENT_PRODUCT_ID,
    CardPaymentMethodSpecificOutput.JSON_PROPERTY_AUTHORISATION_CODE,
    CardPaymentMethodSpecificOutput.JSON_PROPERTY_FRAUD_RESULTS,
    CardPaymentMethodSpecificOutput.JSON_PROPERTY_THREE_D_SECURE_RESULTS
})
public class CardPaymentMethodSpecificOutput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT_ID = "paymentProductId";
  private Integer paymentProductId;

  public static final String JSON_PROPERTY_AUTHORISATION_CODE = "authorisationCode";
  private String authorisationCode;

  public static final String JSON_PROPERTY_FRAUD_RESULTS = "fraudResults";
  private CardFraudResults fraudResults;

  public static final String JSON_PROPERTY_THREE_D_SECURE_RESULTS = "threeDSecureResults";
  private ThreeDSecureResults threeDSecureResults;

  public CardPaymentMethodSpecificOutput() {
  }

  public CardPaymentMethodSpecificOutput paymentProductId(Integer paymentProductId) {

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

  public CardPaymentMethodSpecificOutput authorisationCode(String authorisationCode) {

    this.authorisationCode = authorisationCode;
    return this;
  }

  /**
   * Card Authorization code as returned by the acquirer
   * 
   * @return authorisationCode
   **/

  @JsonProperty(JSON_PROPERTY_AUTHORISATION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthorisationCode() {
    return authorisationCode;
  }

  @JsonProperty(JSON_PROPERTY_AUTHORISATION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorisationCode(String authorisationCode) {
    this.authorisationCode = authorisationCode;
  }

  public CardPaymentMethodSpecificOutput fraudResults(CardFraudResults fraudResults) {

    this.fraudResults = fraudResults;
    return this;
  }

  /**
   * Get fraudResults
   * 
   * @return fraudResults
   **/

  @JsonProperty(JSON_PROPERTY_FRAUD_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CardFraudResults getFraudResults() {
    return fraudResults;
  }

  @JsonProperty(JSON_PROPERTY_FRAUD_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFraudResults(CardFraudResults fraudResults) {
    this.fraudResults = fraudResults;
  }

  public CardPaymentMethodSpecificOutput threeDSecureResults(ThreeDSecureResults threeDSecureResults) {

    this.threeDSecureResults = threeDSecureResults;
    return this;
  }

  /**
   * Get threeDSecureResults
   * 
   * @return threeDSecureResults
   **/

  @JsonProperty(JSON_PROPERTY_THREE_D_SECURE_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ThreeDSecureResults getThreeDSecureResults() {
    return threeDSecureResults;
  }

  @JsonProperty(JSON_PROPERTY_THREE_D_SECURE_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDSecureResults(ThreeDSecureResults threeDSecureResults) {
    this.threeDSecureResults = threeDSecureResults;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardPaymentMethodSpecificOutput cardPaymentMethodSpecificOutput = (CardPaymentMethodSpecificOutput) o;
    return Objects.equals(this.paymentProductId, cardPaymentMethodSpecificOutput.paymentProductId) &&
        Objects.equals(this.authorisationCode, cardPaymentMethodSpecificOutput.authorisationCode) &&
        Objects.equals(this.fraudResults, cardPaymentMethodSpecificOutput.fraudResults) &&
        Objects.equals(this.threeDSecureResults, cardPaymentMethodSpecificOutput.threeDSecureResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentProductId, authorisationCode, fraudResults, threeDSecureResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardPaymentMethodSpecificOutput {\n");
    sb.append("    paymentProductId: ").append(toIndentedString(paymentProductId)).append("\n");
    sb.append("    authorisationCode: ").append(toIndentedString(authorisationCode)).append("\n");
    sb.append("    fraudResults: ").append(toIndentedString(fraudResults)).append("\n");
    sb.append("    threeDSecureResults: ").append(toIndentedString(threeDSecureResults)).append("\n");
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
