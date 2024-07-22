package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CapturePaymentResponse
 */
@JsonPropertyOrder({
    CapturePaymentResponse.JSON_PROPERTY_CAPTURE_OUTPUT,
    CapturePaymentResponse.JSON_PROPERTY_STATUS,
    CapturePaymentResponse.JSON_PROPERTY_STATUS_OUTPUT,
    CapturePaymentResponse.JSON_PROPERTY_ID
})
public class CapturePaymentResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CAPTURE_OUTPUT = "captureOutput";
  private CaptureOutput captureOutput;

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusValue status;

  public static final String JSON_PROPERTY_STATUS_OUTPUT = "statusOutput";
  private PaymentStatusOutput statusOutput;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public CapturePaymentResponse() {
  }

  public CapturePaymentResponse captureOutput(CaptureOutput captureOutput) {

    this.captureOutput = captureOutput;
    return this;
  }

  /**
   * Get captureOutput
   * 
   * @return captureOutput
   **/

  @JsonProperty(JSON_PROPERTY_CAPTURE_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CaptureOutput getCaptureOutput() {
    return captureOutput;
  }

  @JsonProperty(JSON_PROPERTY_CAPTURE_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCaptureOutput(CaptureOutput captureOutput) {
    this.captureOutput = captureOutput;
  }

  public CapturePaymentResponse status(StatusValue status) {

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

  public CapturePaymentResponse statusOutput(PaymentStatusOutput statusOutput) {

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

  public CapturePaymentResponse id(String id) {

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
    CapturePaymentResponse capturePaymentResponse = (CapturePaymentResponse) o;
    return Objects.equals(this.captureOutput, capturePaymentResponse.captureOutput) &&
        Objects.equals(this.status, capturePaymentResponse.status) &&
        Objects.equals(this.statusOutput, capturePaymentResponse.statusOutput) &&
        Objects.equals(this.id, capturePaymentResponse.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(captureOutput, status, statusOutput, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapturePaymentResponse {\n");
    sb.append("    captureOutput: ").append(toIndentedString(captureOutput)).append("\n");
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
