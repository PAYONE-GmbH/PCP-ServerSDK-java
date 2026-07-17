package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ CreatePaymentIntent.JSON_PROPERTY_AMOUNT_OF_MONEY, CreatePaymentIntent.JSON_PROPERTY_REFERENCES,
    CreatePaymentIntent.JSON_PROPERTY_SHOPPING_CART })
public class CreatePaymentIntent implements Serializable {
  private static final long serialVersionUID = 1L;
  public static final String JSON_PROPERTY_AMOUNT_OF_MONEY = "amountOfMoney";
  private AmountOfMoney amountOfMoney;
  public static final String JSON_PROPERTY_REFERENCES = "references";
  private PaymentReferences references;
  public static final String JSON_PROPERTY_SHOPPING_CART = "shoppingCart";
  private ShoppingCartData shoppingCart;

  public CreatePaymentIntent() {
  }

  public CreatePaymentIntent amountOfMoney(AmountOfMoney amountOfMoney) {
    this.amountOfMoney = amountOfMoney;
    return this;
  }

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

  public CreatePaymentIntent references(PaymentReferences references) {
    this.references = references;
    return this;
  }

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

  public CreatePaymentIntent shoppingCart(ShoppingCartData shoppingCart) {
    this.shoppingCart = shoppingCart;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_SHOPPING_CART)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ShoppingCartData getShoppingCart() {
    return shoppingCart;
  }

  @JsonProperty(JSON_PROPERTY_SHOPPING_CART)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShoppingCart(ShoppingCartData shoppingCart) {
    this.shoppingCart = shoppingCart;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    CreatePaymentIntent that = (CreatePaymentIntent) o;
    return Objects.equals(amountOfMoney, that.amountOfMoney) && Objects.equals(references, that.references)
        && Objects.equals(shoppingCart, that.shoppingCart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountOfMoney, references, shoppingCart);
  }

  @Override
  public String toString() {
    return "class CreatePaymentIntent {\n    amountOfMoney: " + toIndentedString(amountOfMoney) + "\n    references: "
        + toIndentedString(references) + "\n    shoppingCart: " + toIndentedString(shoppingCart) + "\n}";
  }

  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
