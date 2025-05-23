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
  private AvsResult avsResult;

  public CardFraudResults() {
  }

  public CardFraudResults avsResult(AvsResult avsResult) {

    this.avsResult = avsResult;
    return this;
  }

  /**
   * Result of the Address Verification Service checks using standardized AVS
   * result codes.
   * See AvsResult enum for all possible values and their descriptions.
   * 
   * @return avsResult The AVS result code
   **/

  @JsonProperty(JSON_PROPERTY_AVS_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AvsResult getAvsResult() {
    return avsResult;
  }

  @JsonProperty(JSON_PROPERTY_AVS_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvsResult(AvsResult avsResult) {
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
