package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ PaymentLinkOrder.JSON_PROPERTY_MERCHANT_REFERENCE, PaymentLinkOrder.JSON_PROPERTY_AMOUNT })
public class PaymentLinkOrder implements Serializable {
  private static final long serialVersionUID = 1L;
  public static final String JSON_PROPERTY_MERCHANT_REFERENCE = "merchantReference";
  private String merchantReference;
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private AmountOfMoney amount;

  public PaymentLinkOrder merchantReference(String value) {
    merchantReference = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantReference() {
    return merchantReference;
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantReference(String value) {
    merchantReference = value;
  }

  public PaymentLinkOrder amount(AmountOfMoney value) {
    amount = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AmountOfMoney getAmount() {
    return amount;
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(AmountOfMoney value) {
    amount = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentLinkOrder that = (PaymentLinkOrder) o;
    return Objects.equals(merchantReference, that.merchantReference) && Objects.equals(amount, that.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantReference, amount);
  }

  @Override
  public String toString() {
    return "class PaymentLinkOrder {\n    merchantReference: " + merchantReference + "\n    amount: " + amount
        + "\n}";
  }
}
