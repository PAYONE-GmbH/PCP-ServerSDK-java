package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ CreatePaymentIntentResponse.JSON_PROPERTY_SHOPPING_CART,
    CreatePaymentIntentResponse.JSON_PROPERTY_PAYMENT_INTENT_OUTPUT })
public class CreatePaymentIntentResponse implements Serializable {
  private static final long serialVersionUID = 1L;
  public static final String JSON_PROPERTY_SHOPPING_CART = "shoppingCart";
  private ShoppingCartData shoppingCart;
  public static final String JSON_PROPERTY_PAYMENT_INTENT_OUTPUT = "paymentIntentOutput";
  private PaymentIntentOutput paymentIntentOutput;

  public CreatePaymentIntentResponse() {
  }

  public CreatePaymentIntentResponse shoppingCart(ShoppingCartData value) {
    shoppingCart = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_SHOPPING_CART)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ShoppingCartData getShoppingCart() {
    return shoppingCart;
  }

  @JsonProperty(JSON_PROPERTY_SHOPPING_CART)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShoppingCart(ShoppingCartData value) {
    shoppingCart = value;
  }

  public CreatePaymentIntentResponse paymentIntentOutput(PaymentIntentOutput value) {
    paymentIntentOutput = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_INTENT_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PaymentIntentOutput getPaymentIntentOutput() {
    return paymentIntentOutput;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_INTENT_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentIntentOutput(PaymentIntentOutput value) {
    paymentIntentOutput = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    CreatePaymentIntentResponse that = (CreatePaymentIntentResponse) o;
    return Objects.equals(shoppingCart, that.shoppingCart)
        && Objects.equals(paymentIntentOutput, that.paymentIntentOutput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shoppingCart, paymentIntentOutput);
  }

  @Override
  public String toString() {
    return "class CreatePaymentIntentResponse {\n    shoppingCart: " + toIndentedString(shoppingCart)
        + "\n    paymentIntentOutput: " + toIndentedString(paymentIntentOutput) + "\n}";
  }

  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
