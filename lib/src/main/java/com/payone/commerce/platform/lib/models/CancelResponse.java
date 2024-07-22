package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CancelResponse
 */
@JsonPropertyOrder({
    CancelResponse.JSON_PROPERTY_CANCEL_PAYMENT_RESPONSE,
    CancelResponse.JSON_PROPERTY_SHOPPING_CART
})
public class CancelResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CANCEL_PAYMENT_RESPONSE = "cancelPaymentResponse";
  private CancelPaymentResponse cancelPaymentResponse;

  public static final String JSON_PROPERTY_SHOPPING_CART = "shoppingCart";
  private ShoppingCartResult shoppingCart;

  public CancelResponse() {
  }

  public CancelResponse cancelPaymentResponse(CancelPaymentResponse cancelPaymentResponse) {

    this.cancelPaymentResponse = cancelPaymentResponse;
    return this;
  }

  /**
   * Get cancelPaymentResponse
   * 
   * @return cancelPaymentResponse
   **/

  @JsonProperty(JSON_PROPERTY_CANCEL_PAYMENT_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CancelPaymentResponse getCancelPaymentResponse() {
    return cancelPaymentResponse;
  }

  @JsonProperty(JSON_PROPERTY_CANCEL_PAYMENT_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCancelPaymentResponse(CancelPaymentResponse cancelPaymentResponse) {
    this.cancelPaymentResponse = cancelPaymentResponse;
  }

  public CancelResponse shoppingCart(ShoppingCartResult shoppingCart) {

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

  public ShoppingCartResult getShoppingCart() {
    return shoppingCart;
  }

  @JsonProperty(JSON_PROPERTY_SHOPPING_CART)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShoppingCart(ShoppingCartResult shoppingCart) {
    this.shoppingCart = shoppingCart;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelResponse cancelResponse = (CancelResponse) o;
    return Objects.equals(this.cancelPaymentResponse, cancelResponse.cancelPaymentResponse) &&
        Objects.equals(this.shoppingCart, cancelResponse.shoppingCart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelPaymentResponse, shoppingCart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelResponse {\n");
    sb.append("    cancelPaymentResponse: ").append(toIndentedString(cancelPaymentResponse)).append("\n");
    sb.append("    shoppingCart: ").append(toIndentedString(shoppingCart)).append("\n");
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
