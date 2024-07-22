package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * If the shopping cart is specified, a Capture is made with the amount of the
 * shopping cart for the items that are specified.
 */
@JsonPropertyOrder({
    CapturePaymentRequest.JSON_PROPERTY_AMOUNT,
    CapturePaymentRequest.JSON_PROPERTY_IS_FINAL,
    CapturePaymentRequest.JSON_PROPERTY_CANCELLATION_REASON,
    CapturePaymentRequest.JSON_PROPERTY_REFERENCES,
    CapturePaymentRequest.JSON_PROPERTY_DELIVERY
})
public class CapturePaymentRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Long amount;

  public static final String JSON_PROPERTY_IS_FINAL = "isFinal";
  private Boolean isFinal = false;

  public static final String JSON_PROPERTY_CANCELLATION_REASON = "cancellationReason";
  private CancellationReason cancellationReason;

  public static final String JSON_PROPERTY_REFERENCES = "references";
  private PaymentReferences references;

  public static final String JSON_PROPERTY_DELIVERY = "delivery";
  private DeliveryInformation delivery;

  public CapturePaymentRequest() {
  }

  public CapturePaymentRequest amount(Long amount) {

    this.amount = amount;
    return this;
  }

  /**
   * Here you can specify the amount that you want to capture (specified in cents,
   * where single digit currencies are presumed to have 2 digits). The amount can
   * be lower than the amount that was authorized, but not higher. If left empty,
   * the full amount will be captured and the request will be final. If the full
   * amount is captured, the request will also be final.
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

  public CapturePaymentRequest isFinal(Boolean isFinal) {

    this.isFinal = isFinal;
    return this;
  }

  /**
   * This property indicates whether this will be the final operation. If the full
   * amount should not captured but the property is set to true, the remaining
   * amount will automatically be cancelled.
   * 
   * @return isFinal
   **/

  @JsonProperty(JSON_PROPERTY_IS_FINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsFinal() {
    return isFinal;
  }

  @JsonProperty(JSON_PROPERTY_IS_FINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsFinal(Boolean isFinal) {
    this.isFinal = isFinal;
  }

  public CapturePaymentRequest cancellationReason(CancellationReason cancellationReason) {

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

  public CapturePaymentRequest references(PaymentReferences references) {

    this.references = references;
    return this;
  }

  /**
   * Get references
   * 
   * @return references
   **/

  @JsonProperty(JSON_PROPERTY_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentReferences getReferences() {
    return references;
  }

  @JsonProperty(JSON_PROPERTY_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferences(PaymentReferences references) {
    this.references = references;
  }

  public CapturePaymentRequest delivery(DeliveryInformation delivery) {

    this.delivery = delivery;
    return this;
  }

  /**
   * Get delivery
   * 
   * @return delivery
   **/

  @JsonProperty(JSON_PROPERTY_DELIVERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DeliveryInformation getDelivery() {
    return delivery;
  }

  @JsonProperty(JSON_PROPERTY_DELIVERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDelivery(DeliveryInformation delivery) {
    this.delivery = delivery;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapturePaymentRequest capturePaymentRequest = (CapturePaymentRequest) o;
    return Objects.equals(this.amount, capturePaymentRequest.amount) &&
        Objects.equals(this.isFinal, capturePaymentRequest.isFinal) &&
        Objects.equals(this.cancellationReason, capturePaymentRequest.cancellationReason) &&
        Objects.equals(this.references, capturePaymentRequest.references) &&
        Objects.equals(this.delivery, capturePaymentRequest.delivery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, isFinal, cancellationReason, references, delivery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapturePaymentRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    isFinal: ").append(toIndentedString(isFinal)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
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
