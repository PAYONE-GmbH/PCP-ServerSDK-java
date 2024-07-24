package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Fraud results contained in the CardFraudResults object.
 */
@JsonPropertyOrder({
    CardFraudResults.JSON_PROPERTY_AVS_RESULT
})
public class CardFraudResults implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AVS_RESULT = "avsResult";
  private String avsResult;

  public CardFraudResults() {
  }

  public CardFraudResults avsResult(String avsResult) {

    this.avsResult = avsResult;
    return this;
  }

  /**
   * Result of the Address Verification Service checks. Possible values are: * A -
   * Address (Street) matches, Zip does not * B - Street address match for
   * international transactions—Postal code not verified due to incompatible
   * formats * C - Street address and postal code not verified for international
   * transaction due to incompatible formats * D - Street address and postal code
   * match for international transaction, cardholder name is incorrect * E - AVS
   * error * F - Address does match and five digit ZIP code does match (UK only) *
   * G - Address information is unavailable; international transaction; non-AVS
   * participant * H - Billing address and postal code match, cardholder name is
   * incorrect (Amex) * I - Address information not verified for international
   * transaction * K - Cardholder name matches (Amex) * L - Cardholder name and
   * postal code match (Amex) * M - Cardholder name, street address, and postal
   * code match for international transaction * N - No Match on Address (Street)
   * or Zip * O - Cardholder name and address match (Amex) * P - Postal codes
   * match for international transaction—Street address not verified due to
   * incompatible formats * Q - Billing address matches, cardholder is incorrect
   * (Amex) * R - Retry, System unavailable or Timed out * S - Service not
   * supported by issuer * U - Address information is unavailable * W - 9 digit
   * Zip matches, Address (Street) does not * X - Exact AVS Match * Y - Address
   * (Street) and 5 digit Zip match * Z - 5 digit Zip matches, Address (Street)
   * does not * 0 - No service available
   * 
   * @return avsResult
   **/

  @JsonProperty(JSON_PROPERTY_AVS_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAvsResult() {
    return avsResult;
  }

  @JsonProperty(JSON_PROPERTY_AVS_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvsResult(String avsResult) {
    this.avsResult = avsResult;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardFraudResults cardFraudResults = (CardFraudResults) o;
    return Objects.equals(this.avsResult, cardFraudResults.avsResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avsResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardFraudResults {\n");
    sb.append("    avsResult: ").append(toIndentedString(avsResult)).append("\n");
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
