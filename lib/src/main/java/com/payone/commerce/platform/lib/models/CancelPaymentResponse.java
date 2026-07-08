package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CancelPaymentResponse
 */
@JsonPropertyOrder({
    CancelPaymentResponse.JSON_PROPERTY_PAYMENT,
    CancelPaymentResponse.JSON_PROPERTY_FUND_SPLIT
})
public class CancelPaymentResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAYMENT = "payment";
  private PaymentResponse payment;

  public static final String JSON_PROPERTY_FUND_SPLIT = "fundSplit";
  private FundSplit fundSplit;

  public CancelPaymentResponse() {
  }

  public CancelPaymentResponse payment(PaymentResponse payment) {

    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * 
   * @return payment
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentResponse getPayment() {
    return payment;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayment(PaymentResponse payment) {
    this.payment = payment;
  }

  public CancelPaymentResponse fundSplit(FundSplit fundSplit) {

    this.fundSplit = fundSplit;
    return this;
  }

  /**
   * Get fundSplit
   *
   * @return fundSplit
   **/

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelPaymentResponse cancelPaymentResponse = (CancelPaymentResponse) o;
    return Objects.equals(this.payment, cancelPaymentResponse.payment) &&
        Objects.equals(this.fundSplit, cancelPaymentResponse.fundSplit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payment, fundSplit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelPaymentResponse {\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
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
