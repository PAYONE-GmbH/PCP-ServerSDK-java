package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing Refund details
 */
@JsonPropertyOrder({
    RefundOutput.JSON_PROPERTY_AMOUNT_OF_MONEY,
    RefundOutput.JSON_PROPERTY_MERCHANT_PARAMETERS,
    RefundOutput.JSON_PROPERTY_REFERENCES,
    RefundOutput.JSON_PROPERTY_PAYMENT_METHOD
})
public class RefundOutput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AMOUNT_OF_MONEY = "amountOfMoney";
  private AmountOfMoney amountOfMoney;

  public static final String JSON_PROPERTY_MERCHANT_PARAMETERS = "merchantParameters";
  private String merchantParameters;

  public static final String JSON_PROPERTY_REFERENCES = "references";
  private PaymentReferences references;

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "paymentMethod";
  private String paymentMethod;

  public RefundOutput() {
  }

  public RefundOutput amountOfMoney(AmountOfMoney amountOfMoney) {

    this.amountOfMoney = amountOfMoney;
    return this;
  }

  /**
   * Get amountOfMoney
   * 
   * @return amountOfMoney
   **/

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

  public RefundOutput merchantParameters(String merchantParameters) {

    this.merchantParameters = merchantParameters;
    return this;
  }

  /**
   * It allows you to store additional parameters for the transaction in JSON
   * format. This field must not contain any personal data.
   * 
   * @return merchantParameters
   **/

  @JsonProperty(JSON_PROPERTY_MERCHANT_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantParameters() {
    return merchantParameters;
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantParameters(String merchantParameters) {
    this.merchantParameters = merchantParameters;
  }

  public RefundOutput references(PaymentReferences references) {

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

  public RefundOutput paymentMethod(String paymentMethod) {

    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Payment method identifier used by the our payment engine.
   * 
   * @return paymentMethod
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentMethod() {
    return paymentMethod;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundOutput refundOutput = (RefundOutput) o;
    return Objects.equals(this.amountOfMoney, refundOutput.amountOfMoney) &&
        Objects.equals(this.merchantParameters, refundOutput.merchantParameters) &&
        Objects.equals(this.references, refundOutput.references) &&
        Objects.equals(this.paymentMethod, refundOutput.paymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountOfMoney, merchantParameters, references, paymentMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundOutput {\n");
    sb.append("    amountOfMoney: ").append(toIndentedString(amountOfMoney)).append("\n");
    sb.append("    merchantParameters: ").append(toIndentedString(merchantParameters)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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
