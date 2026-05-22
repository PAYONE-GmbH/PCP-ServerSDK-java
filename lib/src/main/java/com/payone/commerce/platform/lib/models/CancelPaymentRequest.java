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
    CancelPaymentRequest.JSON_PROPERTY_CANCELLATION_REASON,
    CancelPaymentRequest.JSON_PROPERTY_AMOUNT
})
public class CancelPaymentRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CANCELLATION_REASON = "cancellationReason";
  private CancellationReason cancellationReason;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Long amount;

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

  public CancelPaymentRequest amount(Long amount) {

    this.amount = amount;
    return this;
  }

  /**
   * Here you can specify the amount that you want to cancel (specified in cents,
   * where single digit currencies
   * are presumed to have 2 digits). The amount can be lower than the amount that
   * was authorized, but not higher.
   * If left empty, the remaining open amount will be cancelled.
   * minimum: 1
   * maximum: 999999999999
   * 
   * @return amount
   **/

  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAmount() {
    return amount;
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Long amount) {
    this.amount = amount;
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
    return Objects.equals(this.cancellationReason, cancelPaymentRequest.cancellationReason) &&
        Objects.equals(this.amount, cancelPaymentRequest.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancellationReason, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelPaymentRequest {\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
