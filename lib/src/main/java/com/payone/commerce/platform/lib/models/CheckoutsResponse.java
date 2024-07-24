package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object that holds the number of found Checkouts and the requested page of
 * Checkouts
 */
@JsonPropertyOrder({
    CheckoutsResponse.JSON_PROPERTY_NUMBER_OF_CHECKOUTS,
    CheckoutsResponse.JSON_PROPERTY_CHECKOUTS
})
public class CheckoutsResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NUMBER_OF_CHECKOUTS = "numberOfCheckouts";
  private Long numberOfCheckouts;

  public static final String JSON_PROPERTY_CHECKOUTS = "checkouts";
  private List<CheckoutResponse> checkouts;

  public CheckoutsResponse() {
  }

  public CheckoutsResponse numberOfCheckouts(Long numberOfCheckouts) {

    this.numberOfCheckouts = numberOfCheckouts;
    return this;
  }

  /**
   * Number of found Checkouts
   * minimum: 0
   * 
   * @return numberOfCheckouts
   **/

  @JsonProperty(JSON_PROPERTY_NUMBER_OF_CHECKOUTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfCheckouts() {
    return numberOfCheckouts;
  }

  @JsonProperty(JSON_PROPERTY_NUMBER_OF_CHECKOUTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfCheckouts(Long numberOfCheckouts) {
    this.numberOfCheckouts = numberOfCheckouts;
  }

  public CheckoutsResponse checkouts(List<CheckoutResponse> checkouts) {

    this.checkouts = checkouts;
    return this;
  }

  public CheckoutsResponse addCheckoutsItem(CheckoutResponse checkoutsItem) {
    if (this.checkouts == null) {
      this.checkouts = new ArrayList<>();
    }
    this.checkouts.add(checkoutsItem);
    return this;
  }

  /**
   * List of Checkouts
   * 
   * @return checkouts
   **/

  @JsonProperty(JSON_PROPERTY_CHECKOUTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CheckoutResponse> getCheckouts() {
    return checkouts;
  }

  @JsonProperty(JSON_PROPERTY_CHECKOUTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckouts(List<CheckoutResponse> checkouts) {
    this.checkouts = checkouts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutsResponse checkoutsResponse = (CheckoutsResponse) o;
    return Objects.equals(this.numberOfCheckouts, checkoutsResponse.numberOfCheckouts) &&
        Objects.equals(this.checkouts, checkoutsResponse.checkouts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfCheckouts, checkouts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutsResponse {\n");
    sb.append("    numberOfCheckouts: ").append(toIndentedString(numberOfCheckouts)).append("\n");
    sb.append("    checkouts: ").append(toIndentedString(checkouts)).append("\n");
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
