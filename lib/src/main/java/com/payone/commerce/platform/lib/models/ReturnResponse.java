package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ReturnResponse
 */
@JsonPropertyOrder({
    ReturnResponse.JSON_PROPERTY_RETURN_PAYMENT_RESPONSE,
    ReturnResponse.JSON_PROPERTY_SHOPPING_CART
})
public class ReturnResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RETURN_PAYMENT_RESPONSE = "returnPaymentResponse";
  private RefundPaymentResponse returnPaymentResponse;

  public static final String JSON_PROPERTY_SHOPPING_CART = "shoppingCart";
  private ShoppingCartResult shoppingCart;

  public ReturnResponse() {
  }

  public ReturnResponse returnPaymentResponse(RefundPaymentResponse returnPaymentResponse) {

    this.returnPaymentResponse = returnPaymentResponse;
    return this;
  }

  /**
   * Get returnPaymentResponse
   * 
   * @return returnPaymentResponse
   **/

  @JsonProperty(JSON_PROPERTY_RETURN_PAYMENT_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RefundPaymentResponse getReturnPaymentResponse() {
    return returnPaymentResponse;
  }

  @JsonProperty(JSON_PROPERTY_RETURN_PAYMENT_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnPaymentResponse(RefundPaymentResponse returnPaymentResponse) {
    this.returnPaymentResponse = returnPaymentResponse;
  }

  public ReturnResponse shoppingCart(ShoppingCartResult shoppingCart) {

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
    ReturnResponse returnResponse = (ReturnResponse) o;
    return Objects.equals(this.returnPaymentResponse, returnResponse.returnPaymentResponse) &&
        Objects.equals(this.shoppingCart, returnResponse.shoppingCart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnPaymentResponse, shoppingCart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnResponse {\n");
    sb.append("    returnPaymentResponse: ").append(toIndentedString(returnPaymentResponse)).append("\n");
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
