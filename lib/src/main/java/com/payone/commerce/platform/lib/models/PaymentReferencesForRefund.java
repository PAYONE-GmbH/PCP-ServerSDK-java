package com.payone.commerce.platform.lib.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object that holds all reference properties that are linked to this refund
 * transaction.
 */
@JsonPropertyOrder({
    PaymentReferencesForRefund.JSON_PROPERTY_MERCHANT_REFERENCE,
    PaymentReferencesForRefund.JSON_PROPERTY_CAPTURE_REFERENCE
})
public class PaymentReferencesForRefund extends PaymentReferences {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CAPTURE_REFERENCE = "captureReference";
  private String captureReference;

  public PaymentReferencesForRefund() {
  }

  @Override
  public PaymentReferencesForRefund merchantReference(String merchantReference) {
    super.merchantReference(merchantReference);
    return this;
  }

  public PaymentReferencesForRefund captureReference(String captureReference) {
    this.captureReference = captureReference;
    return this;
  }

  /**
   * Reference to the capture for which the refund is requested.
   *
   * @return captureReference
   **/

  @JsonProperty(JSON_PROPERTY_CAPTURE_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCaptureReference() {
    return captureReference;
  }

  @JsonProperty(JSON_PROPERTY_CAPTURE_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCaptureReference(String captureReference) {
    this.captureReference = captureReference;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentReferencesForRefund paymentReferencesForRefund = (PaymentReferencesForRefund) o;
    return Objects.equals(this.captureReference, paymentReferencesForRefund.captureReference) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(captureReference, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentReferencesForRefund {\n");
    sb.append("    merchantReference: ").append(toIndentedString(getMerchantReference())).append("\n");
    sb.append("    captureReference: ").append(toIndentedString(captureReference)).append("\n");
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
