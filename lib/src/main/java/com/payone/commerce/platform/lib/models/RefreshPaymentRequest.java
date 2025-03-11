package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Request to refresh the payment status of a specific payment.
 */
@JsonPropertyOrder({
    RefreshPaymentRequest.JSON_PROPERTY_REFRESH_TYPE
})
public class RefreshPaymentRequest implements Serializable {
  private static final long serialVersionUID = 1L;
  public static final String JSON_PROPERTY_REFRESH_TYPE = "refreshType";

  private RefreshType refreshType;

  public RefreshPaymentRequest() {
  }

  public RefreshPaymentRequest refreshType(RefreshType refreshType) {
    this.refreshType = refreshType;
    return this;
  }

  /**
   * Get refreshType
   * 
   * @return refreshType
   */

  @JsonProperty(JSON_PROPERTY_REFRESH_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public RefreshType getRefreshType() {
    return refreshType;
  }

  @JsonProperty(JSON_PROPERTY_REFRESH_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRefreshType(RefreshType refreshType) {
    this.refreshType = refreshType;
  }

  /**
   * Return true if this RefreshPaymentRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefreshPaymentRequest refreshPaymentRequest = (RefreshPaymentRequest) o;
    return Objects.equals(this.refreshType, refreshPaymentRequest.refreshType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefreshPaymentRequest {\n");
    sb.append("    refreshType: ").append(toIndentedString(refreshType)).append("\n");
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
