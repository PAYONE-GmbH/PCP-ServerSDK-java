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
    PaymentInformationRefundResponse.JSON_PROPERTY_PAYMENT_EXECUTION_ID,
    PaymentInformationRefundResponse.JSON_PROPERTY_FUND_SPLIT
})

public class PaymentInformationRefundResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAYMENT = "payment";

  private PayoutResponse payment;

  public static final String JSON_PROPERTY_PAYMENT_EXECUTION_ID = "paymentExecutionId";

  private UUID paymentExecutionId;

  public static final String JSON_PROPERTY_FUND_SPLIT = "fundSplit";

  private FundSplit fundSplit;

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

  public PaymentInformationRefundResponse fundSplit(FundSplit fundSplit) {
    this.fundSplit = fundSplit;
    return this;
  }

  /**
   * Get fundSplit
   *
   * @return fundSplit
   */

  @JsonProperty(JSON_PROPERTY_FUND_SPLIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public FundSplit getFundSplit() {
    return fundSplit;
  }

  @JsonProperty(JSON_PROPERTY_FUND_SPLIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFundSplit(FundSplit fundSplit) {
    this.fundSplit = fundSplit;
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
        Objects.equals(this.paymentExecutionId, paymentInformationRefundResponse.paymentExecutionId) &&
        Objects.equals(this.fundSplit, paymentInformationRefundResponse.fundSplit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payment, paymentExecutionId, fundSplit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInformationRefundResponse {\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    paymentExecutionId: ").append(toIndentedString(paymentExecutionId)).append("\n");
    sb.append("    fundSplit: ").append(toIndentedString(fundSplit)).append("\n");
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
