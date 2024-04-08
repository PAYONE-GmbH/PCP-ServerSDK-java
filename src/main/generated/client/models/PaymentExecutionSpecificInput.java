/*
 * Commerce Platform API
 * RESTful API for the creation of Commerce Cases with Checkouts and the execution of Payments. 
 *
 * The version of the OpenAPI document: 1.5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package client.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.StringJoiner;

/**
 * The amount of the paymentSpecificInput might differ from the Checkout amount in case of partial payments but cannot be higher. Additionally, the total amount of the provided shopping cart cannot exceed the Checkout amount.  If a different currency is provided than in the Checkout, the payment execution will be declined. Provided details of the customer and shipping from the Checkout will be automatically loaded and used in the Payment Execution request. The ShoppingCart might differ from the one provided in the Checkout (e.g., for partial payments) and might be required by the payment provider (e.g., BNPL). If the ShoppingCart elements differ from the data provided in the Checkout, the existing data will not be overwritten. 
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
   * @return amountOfMoney
  **/
  @jakarta.annotation.Nullable
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
   * @return shoppingCart
  **/
  @jakarta.annotation.Nullable
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
   * @return paymentReferences
  **/
  @jakarta.annotation.Nonnull
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `amountOfMoney` to the URL query string
    if (getAmountOfMoney() != null) {
      joiner.add(getAmountOfMoney().toUrlQueryString(prefix + "amountOfMoney" + suffix));
    }

    // add `shoppingCart` to the URL query string
    if (getShoppingCart() != null) {
      joiner.add(getShoppingCart().toUrlQueryString(prefix + "shoppingCart" + suffix));
    }

    // add `paymentReferences` to the URL query string
    if (getPaymentReferences() != null) {
      joiner.add(getPaymentReferences().toUrlQueryString(prefix + "paymentReferences" + suffix));
    }

    return joiner.toString();
  }

}

