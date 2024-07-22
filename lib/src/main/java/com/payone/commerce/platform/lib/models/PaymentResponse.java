package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object that holds the payment related properties.
 */
@JsonPropertyOrder({
    PaymentResponse.JSON_PROPERTY_PAYMENT_OUTPUT,
    PaymentResponse.JSON_PROPERTY_STATUS,
    PaymentResponse.JSON_PROPERTY_STATUS_OUTPUT,
    PaymentResponse.JSON_PROPERTY_ID
})
public class PaymentResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAYMENT_OUTPUT = "paymentOutput";
  private PaymentOutput paymentOutput;

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusValue status;

  public static final String JSON_PROPERTY_STATUS_OUTPUT = "statusOutput";
  private PaymentStatusOutput statusOutput;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public PaymentResponse() {
  }

  public PaymentResponse paymentOutput(PaymentOutput paymentOutput) {

    this.paymentOutput = paymentOutput;
    return this;
  }

  /**
   * Get paymentOutput
   * 
   * @return paymentOutput
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentOutput getPaymentOutput() {
    return paymentOutput;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentOutput(PaymentOutput paymentOutput) {
    this.paymentOutput = paymentOutput;
  }

  public PaymentResponse status(StatusValue status) {

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

  public PaymentResponse statusOutput(PaymentStatusOutput statusOutput) {

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

  public PaymentResponse id(String id) {

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
    PaymentResponse paymentResponse = (PaymentResponse) o;
    return Objects.equals(this.paymentOutput, paymentResponse.paymentOutput) &&
        Objects.equals(this.status, paymentResponse.status) &&
        Objects.equals(this.statusOutput, paymentResponse.statusOutput) &&
        Objects.equals(this.id, paymentResponse.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentOutput, status, statusOutput, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentResponse {\n");
    sb.append("    paymentOutput: ").append(toIndentedString(paymentOutput)).append("\n");
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
