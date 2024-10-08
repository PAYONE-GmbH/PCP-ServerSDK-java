package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * An existing shopping cart of a Checkout will not be overwritten with the
 * Patch request. New items can be added to the shoppingCart by providing them
 * in the request. To change existing items (delete, modify or add), the
 * respective itemId must be provided. An item can be completely removed if
 * quantity &#x3D; 0 is provided. The price of an item can be changed as long as
 * no payment has happened for this item (i.e. as long as an item has no
 * specific status). Items with a status can no longer be removed entirely,
 * however the quantity can be increased or decreased (for items without
 * payment) by using the itemId. If no amountOfMoney for the Checkout is
 * provided, the platform will calculate the respective amount based on the
 * cartItem productPrice and productQuantity.
 */
@JsonPropertyOrder({
    PatchCheckoutRequest.JSON_PROPERTY_AMOUNT_OF_MONEY,
    PatchCheckoutRequest.JSON_PROPERTY_REFERENCES,
    PatchCheckoutRequest.JSON_PROPERTY_SHIPPING,
    PatchCheckoutRequest.JSON_PROPERTY_SHOPPING_CART,
    PatchCheckoutRequest.JSON_PROPERTY_PAYMENT_METHOD_SPECIFIC_INPUT,
    PatchCheckoutRequest.JSON_PROPERTY_PAYMENT_REFERENCES
})
public class PatchCheckoutRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AMOUNT_OF_MONEY = "amountOfMoney";
  private AmountOfMoney amountOfMoney;

  public static final String JSON_PROPERTY_REFERENCES = "references";
  private CheckoutReferences references;

  public static final String JSON_PROPERTY_SHIPPING = "shipping";
  private Shipping shipping;

  public static final String JSON_PROPERTY_SHOPPING_CART = "shoppingCart";
  private ShoppingCartPatch shoppingCart;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_SPECIFIC_INPUT = "paymentMethodSpecificInput";
  private PaymentMethodSpecificInput paymentMethodSpecificInput;

  public static final String JSON_PROPERTY_PAYMENT_REFERENCES = "paymentReferences";
  private References paymentReferences;

  public PatchCheckoutRequest() {
  }

  public PatchCheckoutRequest amountOfMoney(AmountOfMoney amountOfMoney) {

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

  public PatchCheckoutRequest references(CheckoutReferences references) {

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

  public CheckoutReferences getReferences() {
    return references;
  }

  @JsonProperty(JSON_PROPERTY_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferences(CheckoutReferences references) {
    this.references = references;
  }

  public PatchCheckoutRequest shipping(Shipping shipping) {

    this.shipping = shipping;
    return this;
  }

  /**
   * Get shipping
   * 
   * @return shipping
   **/

  @JsonProperty(JSON_PROPERTY_SHIPPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Shipping getShipping() {
    return shipping;
  }

  @JsonProperty(JSON_PROPERTY_SHIPPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShipping(Shipping shipping) {
    this.shipping = shipping;
  }

  public PatchCheckoutRequest shoppingCart(ShoppingCartPatch shoppingCart) {

    this.shoppingCart = shoppingCart;
    return this;
  }

  /**
   * Get shoppingCart
   * 
   * @return shoppingCart
   **/

  @JsonProperty(JSON_PROPERTY_SHOPPING_CART)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShoppingCartPatch getShoppingCart() {
    return shoppingCart;
  }

  @JsonProperty(JSON_PROPERTY_SHOPPING_CART)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShoppingCart(ShoppingCartPatch shoppingCart) {
    this.shoppingCart = shoppingCart;
  }

  public PatchCheckoutRequest paymentMethodSpecificInput(PaymentMethodSpecificInput paymentMethodSpecificInput) {

    this.paymentMethodSpecificInput = paymentMethodSpecificInput;
    return this;
  }

  /**
   * Get paymentMethodSpecificInput
   * 
   * @return paymentMethodSpecificInput
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentMethodSpecificInput getPaymentMethodSpecificInput() {
    return paymentMethodSpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethodSpecificInput(PaymentMethodSpecificInput paymentMethodSpecificInput) {
    this.paymentMethodSpecificInput = paymentMethodSpecificInput;
  }

  public PatchCheckoutRequest paymentReferences(References paymentReferences) {

    this.paymentReferences = paymentReferences;
    return this;
  }

  /**
   * Get paymentReferences
   * 
   * @return paymentReferences
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public References getPaymentReferences() {
    return paymentReferences;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentReferences(References paymentReferences) {
    this.paymentReferences = paymentReferences;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchCheckoutRequest patchCheckoutRequest = (PatchCheckoutRequest) o;
    return Objects.equals(this.amountOfMoney, patchCheckoutRequest.amountOfMoney) &&
        Objects.equals(this.references, patchCheckoutRequest.references) &&
        Objects.equals(this.shipping, patchCheckoutRequest.shipping) &&
        Objects.equals(this.shoppingCart, patchCheckoutRequest.shoppingCart) &&
        Objects.equals(this.paymentMethodSpecificInput, patchCheckoutRequest.paymentMethodSpecificInput) &&
        Objects.equals(this.paymentReferences, patchCheckoutRequest.paymentReferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountOfMoney, references, shipping, shoppingCart, paymentMethodSpecificInput,
        paymentReferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchCheckoutRequest {\n");
    sb.append("    amountOfMoney: ").append(toIndentedString(amountOfMoney)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    shoppingCart: ").append(toIndentedString(shoppingCart)).append("\n");
    sb.append("    paymentMethodSpecificInput: ").append(toIndentedString(paymentMethodSpecificInput)).append("\n");
    sb.append("    paymentReferences: ").append(toIndentedString(paymentReferences)).append("\n");
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
