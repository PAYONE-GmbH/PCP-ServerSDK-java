package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The amount of the paymentSpecificInput might differ from the Checkout amount
 * in case of partial payments but cannot be higher. Additionally, the total
 * amount of the provided shopping cart cannot exceed the Checkout amount. If a
 * different currency is provided than in the Checkout, the payment execution
 * will be declined. Provided details of the customer and shipping from the
 * Checkout will be automatically loaded and used in the Payment Execution
 * request. The ShoppingCart might differ from the one provided in the Checkout
 * (e.g., for partial payments) and might be required by the payment provider
 * (e.g., BNPL). If the ShoppingCart elements differ from the data provided in
 * the Checkout, the existing data will not be overwritten.
 */
@JsonPropertyOrder({
    PaymentExecutionSpecificInput.JSON_PROPERTY_AMOUNT_OF_MONEY,
    PaymentExecutionSpecificInput.JSON_PROPERTY_SHOPPING_CART,
    PaymentExecutionSpecificInput.JSON_PROPERTY_PAYMENT_REFERENCES
})
public class PaymentExecutionSpecificInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AMOUNT_OF_MONEY = "amountOfMoney";
  private AmountOfMoney amountOfMoney;

  public static final String JSON_PROPERTY_SHOPPING_CART = "shoppingCart";
  private ShoppingCartInput shoppingCart;

  public static final String JSON_PROPERTY_PAYMENT_REFERENCES = "paymentReferences";
  private References paymentReferences;

  public PaymentExecutionSpecificInput() {
  }

  public PaymentExecutionSpecificInput amountOfMoney(AmountOfMoney amountOfMoney) {

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

  public PaymentExecutionSpecificInput shoppingCart(ShoppingCartInput shoppingCart) {

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

  public ShoppingCartInput getShoppingCart() {
    return shoppingCart;
  }

  @JsonProperty(JSON_PROPERTY_SHOPPING_CART)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShoppingCart(ShoppingCartInput shoppingCart) {
    this.shoppingCart = shoppingCart;
  }

  public PaymentExecutionSpecificInput paymentReferences(References paymentReferences) {

    this.paymentReferences = paymentReferences;
    return this;
  }

  /**
   * Get paymentReferences
   * 
   * @return paymentReferences
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public References getPaymentReferences() {
    return paymentReferences;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
    PaymentExecutionSpecificInput paymentExecutionSpecificInput = (PaymentExecutionSpecificInput) o;
    return Objects.equals(this.amountOfMoney, paymentExecutionSpecificInput.amountOfMoney) &&
        Objects.equals(this.shoppingCart, paymentExecutionSpecificInput.shoppingCart) &&
        Objects.equals(this.paymentReferences, paymentExecutionSpecificInput.paymentReferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountOfMoney, shoppingCart, paymentReferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentExecutionSpecificInput {\n");
    sb.append("    amountOfMoney: ").append(toIndentedString(amountOfMoney)).append("\n");
    sb.append("    shoppingCart: ").append(toIndentedString(shoppingCart)).append("\n");
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
