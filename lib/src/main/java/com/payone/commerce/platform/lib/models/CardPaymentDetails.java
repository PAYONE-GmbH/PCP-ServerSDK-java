package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Information for card payments realized at a POS.
 */
@JsonPropertyOrder({
    CardPaymentDetails.JSON_PROPERTY_MASKED_CARD_NUMBER,
    CardPaymentDetails.JSON_PROPERTY_PAYMENT_PROCESSING_TOKEN,
    CardPaymentDetails.JSON_PROPERTY_REPORTING_TOKEN
})
public class CardPaymentDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MASKED_CARD_NUMBER = "maskedCardNumber";
  private String maskedCardNumber;

  public static final String JSON_PROPERTY_PAYMENT_PROCESSING_TOKEN = "paymentProcessingToken";
  private String paymentProcessingToken;

  public static final String JSON_PROPERTY_REPORTING_TOKEN = "reportingToken";
  private String reportingToken;

  public CardPaymentDetails() {
  }

  public CardPaymentDetails maskedCardNumber(String maskedCardNumber) {

    this.maskedCardNumber = maskedCardNumber;
    return this;
  }

  /**
   * Reference to the card of the transaction.
   * 
   * @return maskedCardNumber
   **/

  @JsonProperty(JSON_PROPERTY_MASKED_CARD_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMaskedCardNumber() {
    return maskedCardNumber;
  }

  @JsonProperty(JSON_PROPERTY_MASKED_CARD_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaskedCardNumber(String maskedCardNumber) {
    this.maskedCardNumber = maskedCardNumber;
  }

  public CardPaymentDetails paymentProcessingToken(String paymentProcessingToken) {

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

  public CardPaymentDetails reportingToken(String reportingToken) {

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
    CardPaymentDetails cardPaymentDetails = (CardPaymentDetails) o;
    return Objects.equals(this.maskedCardNumber, cardPaymentDetails.maskedCardNumber) &&
        Objects.equals(this.paymentProcessingToken, cardPaymentDetails.paymentProcessingToken) &&
        Objects.equals(this.reportingToken, cardPaymentDetails.reportingToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maskedCardNumber, paymentProcessingToken, reportingToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardPaymentDetails {\n");
    sb.append("    maskedCardNumber: ").append(toIndentedString(maskedCardNumber)).append("\n");
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
