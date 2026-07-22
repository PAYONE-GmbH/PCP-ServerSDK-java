package com.payone.commerce.platform.lib.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ PaymentIntentResponseData.JSON_PROPERTY_AMOUNT_OF_MONEY,
    PaymentIntentResponseData.JSON_PROPERTY_REFERENCES, PaymentIntentResponseData.JSON_PROPERTY_PAYMENT_INTENT_ID,
    PaymentIntentResponseData.JSON_PROPERTY_PAYMENT_ID,
    PaymentIntentOutput.JSON_PROPERTY_REDIRECT_PAYMENT_METHOD_SPECIFIC_OUTPUT })
public class PaymentIntentOutput extends PaymentIntentResponseData {
  private static final long serialVersionUID = 1L;
  public static final String JSON_PROPERTY_REDIRECT_PAYMENT_METHOD_SPECIFIC_OUTPUT = "redirectPaymentMethodSpecificOutput";
  private RedirectPaymentMethodSpecificOutputForCreateIntent redirectPaymentMethodSpecificOutput;

  @Override
  public PaymentIntentOutput amountOfMoney(AmountOfMoney value) {
    super.amountOfMoney(value);
    return this;
  }

  @Override
  public PaymentIntentOutput references(PaymentReferences value) {
    super.references(value);
    return this;
  }

  @Override
  public PaymentIntentOutput paymentIntentId(java.util.UUID value) {
    super.paymentIntentId(value);
    return this;
  }

  @Override
  public PaymentIntentOutput paymentId(java.util.UUID value) {
    super.paymentId(value);
    return this;
  }

  public PaymentIntentOutput redirectPaymentMethodSpecificOutput(
      RedirectPaymentMethodSpecificOutputForCreateIntent value) {
    redirectPaymentMethodSpecificOutput = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_REDIRECT_PAYMENT_METHOD_SPECIFIC_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RedirectPaymentMethodSpecificOutputForCreateIntent getRedirectPaymentMethodSpecificOutput() {
    return redirectPaymentMethodSpecificOutput;
  }

  @JsonProperty(JSON_PROPERTY_REDIRECT_PAYMENT_METHOD_SPECIFIC_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectPaymentMethodSpecificOutput(RedirectPaymentMethodSpecificOutputForCreateIntent value) {
    redirectPaymentMethodSpecificOutput = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    return Objects.equals(redirectPaymentMethodSpecificOutput,
        ((PaymentIntentOutput) o).redirectPaymentMethodSpecificOutput) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectPaymentMethodSpecificOutput, super.hashCode());
  }

  @Override
  public String toString() {
    return "class PaymentIntentOutput {\n    amountOfMoney: " + toIndentedString(getAmountOfMoney())
        + "\n    references: " + toIndentedString(getReferences()) + "\n    paymentIntentId: "
        + toIndentedString(getPaymentIntentId()) + "\n    paymentId: " + toIndentedString(getPaymentId())
        + "\n    redirectPaymentMethodSpecificOutput: " + toIndentedString(redirectPaymentMethodSpecificOutput) + "\n}";
  }

  private String toIndentedString(Object value) {
    return value == null ? "null" : value.toString().replace("\n", "\n    ");
  }
}
