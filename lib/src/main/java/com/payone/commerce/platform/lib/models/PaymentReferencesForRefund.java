package com.payone.commerce.platform.lib.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object that holds all reference properties that are linked to this refund
 * transaction.
 * Extends the standard PaymentReferences with an additional captureReference
 * field to support
 * scenarios where a Checkout may contain multiple partial captures from
 * different sellers.
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
   * Merchant-provided reference of the capture that this refund should be applied
   * to.
   * A single Checkout can contain multiple partial captures.
   * By supplying the captureReference the merchant ensures the refund is
   * allocated to the correct
   * capture.
   * 
   * This value must match the merchantReference that was provided in the
   * PaymentReferences of the
   * original capture request.
   *
   * @maxLength 20
   * @example your-order-6372
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
