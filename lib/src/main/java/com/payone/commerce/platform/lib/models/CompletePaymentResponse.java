package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CompletePaymentResponse
 */
@JsonPropertyOrder({
    CompletePaymentResponse.JSON_PROPERTY_CREATION_OUTPUT,
    CompletePaymentResponse.JSON_PROPERTY_MERCHANT_ACTION,
    CompletePaymentResponse.JSON_PROPERTY_PAYMENT
})
public class CompletePaymentResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CREATION_OUTPUT = "creationOutput";
  private PaymentCreationOutput creationOutput;

  public static final String JSON_PROPERTY_MERCHANT_ACTION = "merchantAction";
  private MerchantAction merchantAction;

  public static final String JSON_PROPERTY_PAYMENT = "payment";
  private PaymentResponse payment;

  public CompletePaymentResponse() {
  }

  public CompletePaymentResponse creationOutput(PaymentCreationOutput creationOutput) {

    this.creationOutput = creationOutput;
    return this;
  }

  /**
   * Get creationOutput
   * 
   * @return creationOutput
   **/

  @JsonProperty(JSON_PROPERTY_CREATION_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentCreationOutput getCreationOutput() {
    return creationOutput;
  }

  @JsonProperty(JSON_PROPERTY_CREATION_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreationOutput(PaymentCreationOutput creationOutput) {
    this.creationOutput = creationOutput;
  }

  public CompletePaymentResponse merchantAction(MerchantAction merchantAction) {

    this.merchantAction = merchantAction;
    return this;
  }

  /**
   * Get merchantAction
   * 
   * @return merchantAction
   **/

  @JsonProperty(JSON_PROPERTY_MERCHANT_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MerchantAction getMerchantAction() {
    return merchantAction;
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAction(MerchantAction merchantAction) {
    this.merchantAction = merchantAction;
  }

  public CompletePaymentResponse payment(PaymentResponse payment) {

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompletePaymentResponse completePaymentResponse = (CompletePaymentResponse) o;
    return Objects.equals(this.creationOutput, completePaymentResponse.creationOutput) &&
        Objects.equals(this.merchantAction, completePaymentResponse.merchantAction) &&
        Objects.equals(this.payment, completePaymentResponse.payment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationOutput, merchantAction, payment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletePaymentResponse {\n");
    sb.append("    creationOutput: ").append(toIndentedString(creationOutput)).append("\n");
    sb.append("    merchantAction: ").append(toIndentedString(merchantAction)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
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
