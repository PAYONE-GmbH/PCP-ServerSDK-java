package com.payone.commerce.platform.lib.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ CreatePaymentIntent.JSON_PROPERTY_AMOUNT_OF_MONEY, CreatePaymentIntent.JSON_PROPERTY_REFERENCES,
    CreatePaymentIntent.JSON_PROPERTY_SHOPPING_CART,
    CreatePaymentIntentRequest.JSON_PROPERTY_PAYMENT_METHOD_SPECIFIC_INPUT })
public class CreatePaymentIntentRequest extends CreatePaymentIntent {
  private static final long serialVersionUID = 1L;
  public static final String JSON_PROPERTY_PAYMENT_METHOD_SPECIFIC_INPUT = "paymentMethodSpecificInput";
  private PaymentMethodSpecificInputForIntent paymentMethodSpecificInput;

  @Override
  public CreatePaymentIntentRequest amountOfMoney(AmountOfMoney value) {
    super.amountOfMoney(value);
    return this;
  }

  @Override
  public CreatePaymentIntentRequest references(PaymentReferences value) {
    super.references(value);
    return this;
  }

  @Override
  public CreatePaymentIntentRequest shoppingCart(ShoppingCartData value) {
    super.shoppingCart(value);
    return this;
  }

  public CreatePaymentIntentRequest paymentMethodSpecificInput(PaymentMethodSpecificInputForIntent value) {
    paymentMethodSpecificInput = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PaymentMethodSpecificInputForIntent getPaymentMethodSpecificInput() {
    return paymentMethodSpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethodSpecificInput(PaymentMethodSpecificInputForIntent value) {
    paymentMethodSpecificInput = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    CreatePaymentIntentRequest that = (CreatePaymentIntentRequest) o;
    return Objects.equals(paymentMethodSpecificInput, that.paymentMethodSpecificInput) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethodSpecificInput, super.hashCode());
  }

  @Override
  public String toString() {
    return "class CreatePaymentIntentRequest {\n    amountOfMoney: " + toIndentedString(getAmountOfMoney())
        + "\n    references: " + toIndentedString(getReferences()) + "\n    shoppingCart: "
        + toIndentedString(getShoppingCart()) + "\n    paymentMethodSpecificInput: "
        + toIndentedString(paymentMethodSpecificInput) + "\n}";
  }

  private String toIndentedString(Object value) {
    return value == null ? "null" : value.toString().replace("\n", "\n    ");
  }
}
