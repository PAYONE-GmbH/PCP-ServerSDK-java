package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing the mobile payment method details.
 */
@JsonPropertyOrder({
    MobilePaymentMethodSpecificOutput.JSON_PROPERTY_PAYMENT_PRODUCT_ID,
    MobilePaymentMethodSpecificOutput.JSON_PROPERTY_AUTHORISATION_CODE,
    MobilePaymentMethodSpecificOutput.JSON_PROPERTY_FRAUD_RESULTS,
    MobilePaymentMethodSpecificOutput.JSON_PROPERTY_THREE_D_SECURE_RESULTS,
    MobilePaymentMethodSpecificOutput.JSON_PROPERTY_NETWORK
})
public class MobilePaymentMethodSpecificOutput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT_ID = "paymentProductId";
  private Integer paymentProductId;

  public static final String JSON_PROPERTY_AUTHORISATION_CODE = "authorisationCode";
  private String authorisationCode;

  public static final String JSON_PROPERTY_FRAUD_RESULTS = "fraudResults";
  private CardFraudResults fraudResults;

  public static final String JSON_PROPERTY_THREE_D_SECURE_RESULTS = "threeDSecureResults";
  private ThreeDSecureResults threeDSecureResults;

  public static final String JSON_PROPERTY_NETWORK = "network";
  private String network;

  public MobilePaymentMethodSpecificOutput() {
  }

  public MobilePaymentMethodSpecificOutput paymentProductId(Integer paymentProductId) {

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

  public MobilePaymentMethodSpecificOutput authorisationCode(String authorisationCode) {

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

  public MobilePaymentMethodSpecificOutput fraudResults(CardFraudResults fraudResults) {

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

  public MobilePaymentMethodSpecificOutput threeDSecureResults(ThreeDSecureResults threeDSecureResults) {

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

  public MobilePaymentMethodSpecificOutput network(String network) {

    this.network = network;
    return this;
  }

  /**
   * The card network that was used for a mobile payment method operation
   * 
   * @return network
   **/

  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNetwork() {
    return network;
  }

  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetwork(String network) {
    this.network = network;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobilePaymentMethodSpecificOutput mobilePaymentMethodSpecificOutput = (MobilePaymentMethodSpecificOutput) o;
    return Objects.equals(this.paymentProductId, mobilePaymentMethodSpecificOutput.paymentProductId) &&
        Objects.equals(this.authorisationCode, mobilePaymentMethodSpecificOutput.authorisationCode) &&
        Objects.equals(this.fraudResults, mobilePaymentMethodSpecificOutput.fraudResults) &&
        Objects.equals(this.threeDSecureResults, mobilePaymentMethodSpecificOutput.threeDSecureResults) &&
        Objects.equals(this.network, mobilePaymentMethodSpecificOutput.network);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentProductId, authorisationCode, fraudResults, threeDSecureResults, network);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobilePaymentMethodSpecificOutput {\n");
    sb.append("    paymentProductId: ").append(toIndentedString(paymentProductId)).append("\n");
    sb.append("    authorisationCode: ").append(toIndentedString(authorisationCode)).append("\n");
    sb.append("    fraudResults: ").append(toIndentedString(fraudResults)).append("\n");
    sb.append("    threeDSecureResults: ").append(toIndentedString(threeDSecureResults)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
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
