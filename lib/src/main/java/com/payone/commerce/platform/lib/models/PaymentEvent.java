package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Detailed information regarding an occurred payment event.
 */
@JsonPropertyOrder({
    PaymentEvent.JSON_PROPERTY_PAYMENT_EVENT_ID,
    PaymentEvent.JSON_PROPERTY_CREATION_DATE_TIME,
    PaymentEvent.JSON_PROPERTY_TYPE,
    PaymentEvent.JSON_PROPERTY_AMOUNT_OF_MONEY,
    PaymentEvent.JSON_PROPERTY_PAYMENT_STATUS,
    PaymentEvent.JSON_PROPERTY_CANCELLATION_REASON,
    PaymentEvent.JSON_PROPERTY_RETURN_REASON,
    PaymentEvent.JSON_PROPERTY_PAYMENT_INSTRUCTIONS
})

public class PaymentEvent implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAYMENT_EVENT_ID = "paymentEventId";

  private UUID paymentEventId;

  public static final String JSON_PROPERTY_CREATION_DATE_TIME = "creationDateTime";

  private OffsetDateTime creationDateTime;

  public static final String JSON_PROPERTY_TYPE = "type";

  private PaymentType type;

  public static final String JSON_PROPERTY_AMOUNT_OF_MONEY = "amountOfMoney";

  private AmountOfMoney amountOfMoney;

  public static final String JSON_PROPERTY_PAYMENT_STATUS = "paymentStatus";

  private StatusValue paymentStatus;

  public static final String JSON_PROPERTY_CANCELLATION_REASON = "cancellationReason";

  private CancellationReason cancellationReason;

  public static final String JSON_PROPERTY_RETURN_REASON = "returnReason";

  private String returnReason;

  public static final String JSON_PROPERTY_PAYMENT_INSTRUCTIONS = "paymentInstructions";

  private PaymentInstructions paymentInstructions;

  public PaymentEvent() {
  }

  /**
   * Unique identifier of the payment event.
   * 
   * @return paymentEventId
   */

  @JsonProperty(JSON_PROPERTY_PAYMENT_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getPaymentEventId() {
    return paymentEventId;
  }

  /**
   * The date and time of the payment event. Format: YYYY-MM-DD&#39;T&#39;HH:mm:ss&#39;Z&#39; or
   * YYYY-MM-DD&#39;T&#39;HH:mm:ss+XX:XX or YYYY-MM-DD&#39;T&#39;HH:mm:ss-XX:XX
   * 
   * @return creationDateTime
   */

  @JsonProperty(JSON_PROPERTY_CREATION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }

  public PaymentEvent type(PaymentType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * 
   * @return type
   */

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PaymentType getType() {
    return type;
  }

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(PaymentType type) {
    this.type = type;
  }

  public PaymentEvent amountOfMoney(AmountOfMoney amountOfMoney) {
    this.amountOfMoney = amountOfMoney;
    return this;
  }

  /**
   * Get amountOfMoney
   * 
   * @return amountOfMoney
   */

  @JsonProperty(JSON_PROPERTY_AMOUNT_OF_MONEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AmountOfMoney getAmountOfMoney() {
    return amountOfMoney;
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT_OF_MONEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountOfMoney(AmountOfMoney amountOfMoney) {
    this.amountOfMoney = amountOfMoney;
  }

  public PaymentEvent paymentStatus(StatusValue paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }

  /**
   * Get paymentStatus
   * 
   * @return paymentStatus
   */

  @JsonProperty(JSON_PROPERTY_PAYMENT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StatusValue getPaymentStatus() {
    return paymentStatus;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentStatus(StatusValue paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  public PaymentEvent cancellationReason(CancellationReason cancellationReason) {
    this.cancellationReason = cancellationReason;
    return this;
  }

  /**
   * Get cancellationReason
   * 
   * @return cancellationReason
   */

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

  public PaymentEvent returnReason(String returnReason) {
    this.returnReason = returnReason;
    return this;
  }

  /**
   * Reason of the Refund (e.g. communicated by or to the costumer).
   * 
   * @maxLength 255
   * @example Customer complained
   * @return returnReason
   */

  @JsonProperty(JSON_PROPERTY_RETURN_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReturnReason() {
    return returnReason;
  }

  @JsonProperty(JSON_PROPERTY_RETURN_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnReason(String returnReason) {
    this.returnReason = returnReason;
  }

  public PaymentEvent paymentInstructions(PaymentInstructions paymentInstructions) {
    this.paymentInstructions = paymentInstructions;
    return this;
  }

  /**
   * Get paymentInstructions
   * 
   * @return paymentInstructions
   */

  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PaymentInstructions getPaymentInstructions() {
    return paymentInstructions;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentInstructions(PaymentInstructions paymentInstructions) {
    this.paymentInstructions = paymentInstructions;
  }

  /**
   * Return true if this PaymentEvent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentEvent paymentEvent = (PaymentEvent) o;
    return Objects.equals(this.paymentEventId, paymentEvent.paymentEventId) &&
        Objects.equals(this.creationDateTime, paymentEvent.creationDateTime) &&
        Objects.equals(this.type, paymentEvent.type) &&
        Objects.equals(this.amountOfMoney, paymentEvent.amountOfMoney) &&
        Objects.equals(this.paymentStatus, paymentEvent.paymentStatus) &&
        Objects.equals(this.cancellationReason, paymentEvent.cancellationReason) &&
        Objects.equals(this.returnReason, paymentEvent.returnReason) &&
        Objects.equals(this.paymentInstructions, paymentEvent.paymentInstructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentEventId, creationDateTime, type, amountOfMoney, paymentStatus, cancellationReason, returnReason, paymentInstructions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentEvent {\n");
    sb.append("    paymentEventId: ").append(toIndentedString(paymentEventId)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amountOfMoney: ").append(toIndentedString(amountOfMoney)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    returnReason: ").append(toIndentedString(returnReason)).append("\n");
    sb.append("    paymentInstructions: ").append(toIndentedString(paymentInstructions)).append("\n");
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
