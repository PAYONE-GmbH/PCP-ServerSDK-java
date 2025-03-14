package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * PaymentInformationRefundResponse
 */
@JsonPropertyOrder({
    PaymentInformationRefundResponse.JSON_PROPERTY_PAYMENT,
    PaymentInformationRefundResponse.JSON_PROPERTY_PAYMENT_EXECUTION_ID
})

public class PaymentInformationRefundResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAYMENT = "payment";

  private PayoutResponse payment;

  public static final String JSON_PROPERTY_PAYMENT_EXECUTION_ID = "paymentExecutionId";

  private UUID paymentExecutionId;

  public PaymentInformationRefundResponse() {
  }

  public PaymentInformationRefundResponse payment(PayoutResponse payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * 
   * @return payment
   */

  @JsonProperty(JSON_PROPERTY_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PayoutResponse getPayment() {
    return payment;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayment(PayoutResponse payment) {
    this.payment = payment;
  }

  public PaymentInformationRefundResponse paymentExecutionId(UUID paymentExecutionId) {
    this.paymentExecutionId = paymentExecutionId;
    return this;
  }

  /**
   * reference to the paymentExecution.
   * 
   * @return paymentExecutionId
   */

  @JsonProperty(JSON_PROPERTY_PAYMENT_EXECUTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getPaymentExecutionId() {
    return paymentExecutionId;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_EXECUTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentExecutionId(UUID paymentExecutionId) {
    this.paymentExecutionId = paymentExecutionId;
  }

  /**
   * Return true if this PaymentInformationRefundResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInformationRefundResponse paymentInformationRefundResponse = (PaymentInformationRefundResponse) o;
    return Objects.equals(this.payment, paymentInformationRefundResponse.payment) &&
        Objects.equals(this.paymentExecutionId, paymentInformationRefundResponse.paymentExecutionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payment, paymentExecutionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInformationRefundResponse {\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    paymentExecutionId: ").append(toIndentedString(paymentExecutionId)).append("\n");
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
