package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * This object has the numeric representation of the current Refund status,
 * timestamp of last status change and performable action on the current Refund
 * resource. In case of a rejected Refund, detailed error information is listed.
 */
@JsonPropertyOrder({
    RefundPaymentResponse.JSON_PROPERTY_REFUND_OUTPUT,
    RefundPaymentResponse.JSON_PROPERTY_STATUS,
    RefundPaymentResponse.JSON_PROPERTY_STATUS_OUTPUT,
    RefundPaymentResponse.JSON_PROPERTY_ID
})
public class RefundPaymentResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REFUND_OUTPUT = "refundOutput";
  private RefundOutput refundOutput;

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusValue status;

  public static final String JSON_PROPERTY_STATUS_OUTPUT = "statusOutput";
  private PaymentStatusOutput statusOutput;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public RefundPaymentResponse() {
  }

  public RefundPaymentResponse refundOutput(RefundOutput refundOutput) {

    this.refundOutput = refundOutput;
    return this;
  }

  /**
   * Get refundOutput
   * 
   * @return refundOutput
   **/

  @JsonProperty(JSON_PROPERTY_REFUND_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RefundOutput getRefundOutput() {
    return refundOutput;
  }

  @JsonProperty(JSON_PROPERTY_REFUND_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundOutput(RefundOutput refundOutput) {
    this.refundOutput = refundOutput;
  }

  public RefundPaymentResponse status(StatusValue status) {

    this.status = status;
    return this;
  }

  /**
   * Get status
   * 
   * @return status
   **/

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusValue getStatus() {
    return status;
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusValue status) {
    this.status = status;
  }

  public RefundPaymentResponse statusOutput(PaymentStatusOutput statusOutput) {

    this.statusOutput = statusOutput;
    return this;
  }

  /**
   * Get statusOutput
   * 
   * @return statusOutput
   **/

  @JsonProperty(JSON_PROPERTY_STATUS_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentStatusOutput getStatusOutput() {
    return statusOutput;
  }

  @JsonProperty(JSON_PROPERTY_STATUS_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusOutput(PaymentStatusOutput statusOutput) {
    this.statusOutput = statusOutput;
  }

  public RefundPaymentResponse id(String id) {

    this.id = id;
    return this;
  }

  /**
   * Unique payment transaction identifier of the payment gateway.
   * 
   * @return id
   **/

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundPaymentResponse refundPaymentResponse = (RefundPaymentResponse) o;
    return Objects.equals(this.refundOutput, refundPaymentResponse.refundOutput) &&
        Objects.equals(this.status, refundPaymentResponse.status) &&
        Objects.equals(this.statusOutput, refundPaymentResponse.statusOutput) &&
        Objects.equals(this.id, refundPaymentResponse.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refundOutput, status, statusOutput, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundPaymentResponse {\n");
    sb.append("    refundOutput: ").append(toIndentedString(refundOutput)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusOutput: ").append(toIndentedString(statusOutput)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
