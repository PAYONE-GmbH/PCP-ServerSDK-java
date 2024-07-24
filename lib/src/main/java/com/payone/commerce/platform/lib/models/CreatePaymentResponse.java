package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing details on the created payment it has directly be executed.
 */
@JsonPropertyOrder({
    CreatePaymentResponse.JSON_PROPERTY_CREATION_OUTPUT,
    CreatePaymentResponse.JSON_PROPERTY_MERCHANT_ACTION,
    CreatePaymentResponse.JSON_PROPERTY_PAYMENT,
    CreatePaymentResponse.JSON_PROPERTY_PAYMENT_EXECUTION_ID
})
public class CreatePaymentResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CREATION_OUTPUT = "creationOutput";
  private PaymentCreationOutput creationOutput;

  public static final String JSON_PROPERTY_MERCHANT_ACTION = "merchantAction";
  private MerchantAction merchantAction;

  public static final String JSON_PROPERTY_PAYMENT = "payment";
  private PaymentResponse payment;

  public static final String JSON_PROPERTY_PAYMENT_EXECUTION_ID = "paymentExecutionId";
  private UUID paymentExecutionId;

  public CreatePaymentResponse() {
  }

  public CreatePaymentResponse creationOutput(PaymentCreationOutput creationOutput) {

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

  public CreatePaymentResponse merchantAction(MerchantAction merchantAction) {

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

  public CreatePaymentResponse payment(PaymentResponse payment) {

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

  public CreatePaymentResponse paymentExecutionId(UUID paymentExecutionId) {

    this.paymentExecutionId = paymentExecutionId;
    return this;
  }

  /**
   * reference to the paymentExecution.
   * 
   * @return paymentExecutionId
   **/

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePaymentResponse createPaymentResponse = (CreatePaymentResponse) o;
    return Objects.equals(this.creationOutput, createPaymentResponse.creationOutput) &&
        Objects.equals(this.merchantAction, createPaymentResponse.merchantAction) &&
        Objects.equals(this.payment, createPaymentResponse.payment) &&
        Objects.equals(this.paymentExecutionId, createPaymentResponse.paymentExecutionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationOutput, merchantAction, payment, paymentExecutionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePaymentResponse {\n");
    sb.append("    creationOutput: ").append(toIndentedString(creationOutput)).append("\n");
    sb.append("    merchantAction: ").append(toIndentedString(merchantAction)).append("\n");
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
