package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/** Details for updating a payment intent. */
@JsonPropertyOrder({ PatchPaymentIntentRequest.JSON_PROPERTY_AMOUNT_OF_MONEY,
    PatchPaymentIntentRequest.JSON_PROPERTY_SHOPPING_CART })
public class PatchPaymentIntentRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AMOUNT_OF_MONEY = "amountOfMoney";
  private AmountOfMoney amountOfMoney;

  public static final String JSON_PROPERTY_SHOPPING_CART = "shoppingCart";
  private ShoppingCartData shoppingCart;

  public PatchPaymentIntentRequest amountOfMoney(AmountOfMoney value) {
    amountOfMoney = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT_OF_MONEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AmountOfMoney getAmountOfMoney() {
    return amountOfMoney;
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT_OF_MONEY)
  public void setAmountOfMoney(AmountOfMoney value) {
    amountOfMoney = value;
  }

  public PatchPaymentIntentRequest shoppingCart(ShoppingCartData value) {
    shoppingCart = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_SHOPPING_CART)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ShoppingCartData getShoppingCart() {
    return shoppingCart;
  }

  @JsonProperty(JSON_PROPERTY_SHOPPING_CART)
  public void setShoppingCart(ShoppingCartData value) {
    shoppingCart = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    PatchPaymentIntentRequest that = (PatchPaymentIntentRequest) o;
    return Objects.equals(amountOfMoney, that.amountOfMoney)
        && Objects.equals(shoppingCart, that.shoppingCart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountOfMoney, shoppingCart);
  }

  @Override
  public String toString() {
    return "class PatchPaymentIntentRequest {\n    amountOfMoney: " + amountOfMoney
        + "\n    shoppingCart: " + shoppingCart + "\n}";
  }
}
