package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ PaymentIntentResponseData.JSON_PROPERTY_AMOUNT_OF_MONEY,
    PaymentIntentResponseData.JSON_PROPERTY_REFERENCES, PaymentIntentResponseData.JSON_PROPERTY_PAYMENT_INTENT_ID,
    PaymentIntentResponseData.JSON_PROPERTY_PAYMENT_ID })
public class PaymentIntentResponseData implements Serializable {
  private static final long serialVersionUID = 1L;
  public static final String JSON_PROPERTY_AMOUNT_OF_MONEY = "amountOfMoney";
  private AmountOfMoney amountOfMoney;
  public static final String JSON_PROPERTY_REFERENCES = "references";
  private PaymentReferences references;
  public static final String JSON_PROPERTY_PAYMENT_INTENT_ID = "paymentIntentId";
  private UUID paymentIntentId;
  public static final String JSON_PROPERTY_PAYMENT_ID = "paymentId";
  private UUID paymentId;

  public PaymentIntentResponseData() {
  }

  public PaymentIntentResponseData amountOfMoney(AmountOfMoney value) {
    amountOfMoney = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT_OF_MONEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AmountOfMoney getAmountOfMoney() {
    return amountOfMoney;
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT_OF_MONEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountOfMoney(AmountOfMoney value) {
    amountOfMoney = value;
  }

  public PaymentIntentResponseData references(PaymentReferences value) {
    references = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PaymentReferences getReferences() {
    return references;
  }

  @JsonProperty(JSON_PROPERTY_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferences(PaymentReferences value) {
    references = value;
  }

  public PaymentIntentResponseData paymentIntentId(UUID value) {
    paymentIntentId = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_INTENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getPaymentIntentId() {
    return paymentIntentId;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_INTENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentIntentId(UUID value) {
    paymentIntentId = value;
  }

  public PaymentIntentResponseData paymentId(UUID value) {
    paymentId = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getPaymentId() {
    return paymentId;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentId(UUID value) {
    paymentId = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    PaymentIntentResponseData that = (PaymentIntentResponseData) o;
    return Objects.equals(amountOfMoney, that.amountOfMoney) && Objects.equals(references, that.references)
        && Objects.equals(paymentIntentId, that.paymentIntentId) && Objects.equals(paymentId, that.paymentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountOfMoney, references, paymentIntentId, paymentId);
  }

  @Override
  public String toString() {
    return "class PaymentIntentResponseData {\n    amountOfMoney: " + toIndentedString(amountOfMoney)
        + "\n    references: " + toIndentedString(references) + "\n    paymentIntentId: "
        + toIndentedString(paymentIntentId) + "\n    paymentId: " + toIndentedString(paymentId) + "\n}";
  }

  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
