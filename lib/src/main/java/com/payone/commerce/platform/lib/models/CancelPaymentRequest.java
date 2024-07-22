package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CancelPaymentRequest
 */
@JsonPropertyOrder({
    CancelPaymentRequest.JSON_PROPERTY_CANCELLATION_REASON
})
public class CancelPaymentRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CANCELLATION_REASON = "cancellationReason";
  private CancellationReason cancellationReason;

  public CancelPaymentRequest() {
  }

  public CancelPaymentRequest cancellationReason(CancellationReason cancellationReason) {

    this.cancellationReason = cancellationReason;
    return this;
  }

  /**
   * Get cancellationReason
   * 
   * @return cancellationReason
   **/

  @JsonProperty(JSON_PROPERTY_CANCELLATION_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CancellationReason getCancellationReason() {
    return cancellationReason;
  }

  @JsonProperty(JSON_PROPERTY_CANCELLATION_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCancellationReason(CancellationReason cancellationReason) {
    this.cancellationReason = cancellationReason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelPaymentRequest cancelPaymentRequest = (CancelPaymentRequest) o;
    return Objects.equals(this.cancellationReason, cancelPaymentRequest.cancellationReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellationReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelPaymentRequest {\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
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
