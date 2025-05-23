package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing details from the created payout.
 */
@JsonPropertyOrder({
    PayoutOutput.JSON_PROPERTY_AMOUNT_OF_MONEY,
    PayoutOutput.JSON_PROPERTY_REFERENCES,
    PayoutOutput.JSON_PROPERTY_PAYMENT_METHOD
})

public class PayoutOutput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AMOUNT_OF_MONEY = "amountOfMoney";

  private AmountOfMoney amountOfMoney;

  public static final String JSON_PROPERTY_REFERENCES = "references";

  private PaymentReferences references;

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "paymentMethod";

  private String paymentMethod;

  public PayoutOutput() {
  }

  public PayoutOutput amountOfMoney(AmountOfMoney amountOfMoney) {
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

  public PayoutOutput references(PaymentReferences references) {
    this.references = references;
    return this;
  }

  /**
   * Get references
   * 
   * @return references
   */

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

  public PayoutOutput paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Payment method identifier based on the paymentProductId.
   * 
   * @return paymentMethod
   */

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

  /**
   * Return true if this PayoutOutput object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutOutput payoutOutput = (PayoutOutput) o;
    return Objects.equals(this.amountOfMoney, payoutOutput.amountOfMoney) &&
        Objects.equals(this.references, payoutOutput.references) &&
        Objects.equals(this.paymentMethod, payoutOutput.paymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountOfMoney, references, paymentMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutOutput {\n");
    sb.append("    amountOfMoney: ").append(toIndentedString(amountOfMoney)).append("\n");
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
