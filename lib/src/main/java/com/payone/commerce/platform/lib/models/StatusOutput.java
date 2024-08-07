package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Contains information about whether the payment of the Checkout has already
 * been completed and how much of the total sum has been collected already.
 */
@JsonPropertyOrder({
    StatusOutput.JSON_PROPERTY_PAYMENT_STATUS,
    StatusOutput.JSON_PROPERTY_IS_MODIFIABLE,
    StatusOutput.JSON_PROPERTY_OPEN_AMOUNT,
    StatusOutput.JSON_PROPERTY_COLLECTED_AMOUNT,
    StatusOutput.JSON_PROPERTY_CANCELLED_AMOUNT,
    StatusOutput.JSON_PROPERTY_REFUNDED_AMOUNT,
    StatusOutput.JSON_PROPERTY_CHARGEBACK_AMOUNT
})
public class StatusOutput implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * * WAITING_FOR_PAYMENT - There does not yet exist a PaymentExecution nor a
   * PaymentInformation for this Checkout. * PAYMENT_NOT_COMPLETED - There exists
   * a PaymentExecution or a PaymentInformation for this Checkout, but all or some
   * part of the total amount is still unpaid. * PAYMENT_COMPLETED - There exists
   * a PaymentExecution or a PaymentInformation for this Checkout and the total
   * amount is fully paid. * NO_PAYMENT - Checkout was created and deleted. No
   * Payment Execution and no other actions can be triggered on the Checkout.
   */
  public enum PaymentStatusEnum {
    WAITING_FOR_PAYMENT("WAITING_FOR_PAYMENT"),

    PAYMENT_NOT_COMPLETED("PAYMENT_NOT_COMPLETED"),

    PAYMENT_COMPLETED("PAYMENT_COMPLETED"),

    NO_PAYMENT("NO_PAYMENT");

    private String value;

    PaymentStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PaymentStatusEnum fromValue(String value) {
      for (PaymentStatusEnum b : PaymentStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PAYMENT_STATUS = "paymentStatus";
  private PaymentStatusEnum paymentStatus;

  public static final String JSON_PROPERTY_IS_MODIFIABLE = "isModifiable";
  private Boolean isModifiable;

  public static final String JSON_PROPERTY_OPEN_AMOUNT = "openAmount";
  private Long openAmount;

  public static final String JSON_PROPERTY_COLLECTED_AMOUNT = "collectedAmount";
  private Long collectedAmount;

  public static final String JSON_PROPERTY_CANCELLED_AMOUNT = "cancelledAmount";
  private Long cancelledAmount;

  public static final String JSON_PROPERTY_REFUNDED_AMOUNT = "refundedAmount";
  private Long refundedAmount;

  public static final String JSON_PROPERTY_CHARGEBACK_AMOUNT = "chargebackAmount";
  private Long chargebackAmount;

  public StatusOutput() {
  }

  public StatusOutput paymentStatus(PaymentStatusEnum paymentStatus) {

    this.paymentStatus = paymentStatus;
    return this;
  }

  /**
   * * WAITING_FOR_PAYMENT - There does not yet exist a PaymentExecution nor a
   * PaymentInformation for this Checkout. * PAYMENT_NOT_COMPLETED - There exists
   * a PaymentExecution or a PaymentInformation for this Checkout, but all or some
   * part of the total amount is still unpaid. * PAYMENT_COMPLETED - There exists
   * a PaymentExecution or a PaymentInformation for this Checkout and the total
   * amount is fully paid. * NO_PAYMENT - Checkout was created and deleted. No
   * Payment Execution and no other actions can be triggered on the Checkout.
   * 
   * @return paymentStatus
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentStatusEnum getPaymentStatus() {
    return paymentStatus;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentStatus(PaymentStatusEnum paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  public StatusOutput isModifiable(Boolean isModifiable) {

    this.isModifiable = isModifiable;
    return this;
  }

  /**
   * Indicates whether the Checkout can still be modified. False if any payment is
   * already in progress, true otherwise.
   * 
   * @return isModifiable
   **/

  @JsonProperty(JSON_PROPERTY_IS_MODIFIABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsModifiable() {
    return isModifiable;
  }

  @JsonProperty(JSON_PROPERTY_IS_MODIFIABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsModifiable(Boolean isModifiable) {
    this.isModifiable = isModifiable;
  }

  public StatusOutput openAmount(Long openAmount) {

    this.openAmount = openAmount;
    return this;
  }

  /**
   * Amount in cents always having 2 decimals. The amount yet to be paid.
   * minimum: 0
   * maximum: 999999999999
   * 
   * @return openAmount
   **/

  @JsonProperty(JSON_PROPERTY_OPEN_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getOpenAmount() {
    return openAmount;
  }

  @JsonProperty(JSON_PROPERTY_OPEN_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpenAmount(Long openAmount) {
    this.openAmount = openAmount;
  }

  public StatusOutput collectedAmount(Long collectedAmount) {

    this.collectedAmount = collectedAmount;
    return this;
  }

  /**
   * Amount in cents always having 2 decimals. The amount that has already been
   * collected.
   * minimum: 0
   * maximum: 999999999999
   * 
   * @return collectedAmount
   **/

  @JsonProperty(JSON_PROPERTY_COLLECTED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCollectedAmount() {
    return collectedAmount;
  }

  @JsonProperty(JSON_PROPERTY_COLLECTED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollectedAmount(Long collectedAmount) {
    this.collectedAmount = collectedAmount;
  }

  public StatusOutput cancelledAmount(Long cancelledAmount) {

    this.cancelledAmount = cancelledAmount;
    return this;
  }

  /**
   * Amount in cents always having 2 decimals. The amount that has already been
   * cancelled.
   * minimum: 0
   * maximum: 999999999999
   * 
   * @return cancelledAmount
   **/

  @JsonProperty(JSON_PROPERTY_CANCELLED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCancelledAmount() {
    return cancelledAmount;
  }

  @JsonProperty(JSON_PROPERTY_CANCELLED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCancelledAmount(Long cancelledAmount) {
    this.cancelledAmount = cancelledAmount;
  }

  public StatusOutput refundedAmount(Long refundedAmount) {

    this.refundedAmount = refundedAmount;
    return this;
  }

  /**
   * Amount in cents always having 2 decimals. Amount that has been collected but
   * was refunded to the customer.
   * minimum: 0
   * maximum: 999999999999
   * 
   * @return refundedAmount
   **/

  @JsonProperty(JSON_PROPERTY_REFUNDED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRefundedAmount() {
    return refundedAmount;
  }

  @JsonProperty(JSON_PROPERTY_REFUNDED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundedAmount(Long refundedAmount) {
    this.refundedAmount = refundedAmount;
  }

  public StatusOutput chargebackAmount(Long chargebackAmount) {

    this.chargebackAmount = chargebackAmount;
    return this;
  }

  /**
   * Amount in cents always having 2 decimals. Amount that has been collected but
   * was chargebacked by the customer.
   * minimum: 0
   * maximum: 999999999999
   * 
   * @return chargebackAmount
   **/

  @JsonProperty(JSON_PROPERTY_CHARGEBACK_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getChargebackAmount() {
    return chargebackAmount;
  }

  @JsonProperty(JSON_PROPERTY_CHARGEBACK_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChargebackAmount(Long chargebackAmount) {
    this.chargebackAmount = chargebackAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusOutput statusOutput = (StatusOutput) o;
    return Objects.equals(this.paymentStatus, statusOutput.paymentStatus) &&
        Objects.equals(this.isModifiable, statusOutput.isModifiable) &&
        Objects.equals(this.openAmount, statusOutput.openAmount) &&
        Objects.equals(this.collectedAmount, statusOutput.collectedAmount) &&
        Objects.equals(this.cancelledAmount, statusOutput.cancelledAmount) &&
        Objects.equals(this.refundedAmount, statusOutput.refundedAmount) &&
        Objects.equals(this.chargebackAmount, statusOutput.chargebackAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentStatus, isModifiable, openAmount, collectedAmount, cancelledAmount, refundedAmount,
        chargebackAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusOutput {\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    isModifiable: ").append(toIndentedString(isModifiable)).append("\n");
    sb.append("    openAmount: ").append(toIndentedString(openAmount)).append("\n");
    sb.append("    collectedAmount: ").append(toIndentedString(collectedAmount)).append("\n");
    sb.append("    cancelledAmount: ").append(toIndentedString(cancelledAmount)).append("\n");
    sb.append("    refundedAmount: ").append(toIndentedString(refundedAmount)).append("\n");
    sb.append("    chargebackAmount: ").append(toIndentedString(chargebackAmount)).append("\n");
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
