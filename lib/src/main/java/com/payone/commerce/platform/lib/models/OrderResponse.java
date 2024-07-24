package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object that contains details on the created payment in case one has been
 * created.
 */
@JsonPropertyOrder({
    OrderResponse.JSON_PROPERTY_CREATE_PAYMENT_RESPONSE,
    OrderResponse.JSON_PROPERTY_SHOPPING_CART
})
public class OrderResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CREATE_PAYMENT_RESPONSE = "createPaymentResponse";
  private CreatePaymentResponse createPaymentResponse;

  public static final String JSON_PROPERTY_SHOPPING_CART = "shoppingCart";
  private ShoppingCartResult shoppingCart;

  public OrderResponse() {
  }

  public OrderResponse createPaymentResponse(CreatePaymentResponse createPaymentResponse) {

    this.createPaymentResponse = createPaymentResponse;
    return this;
  }

  /**
   * Get createPaymentResponse
   * 
   * @return createPaymentResponse
   **/

  @JsonProperty(JSON_PROPERTY_CREATE_PAYMENT_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreatePaymentResponse getCreatePaymentResponse() {
    return createPaymentResponse;
  }

  @JsonProperty(JSON_PROPERTY_CREATE_PAYMENT_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatePaymentResponse(CreatePaymentResponse createPaymentResponse) {
    this.createPaymentResponse = createPaymentResponse;
  }

  public OrderResponse shoppingCart(ShoppingCartResult shoppingCart) {

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
    OrderResponse orderResponse = (OrderResponse) o;
    return Objects.equals(this.createPaymentResponse, orderResponse.createPaymentResponse) &&
        Objects.equals(this.shoppingCart, orderResponse.shoppingCart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createPaymentResponse, shoppingCart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderResponse {\n");
    sb.append("    createPaymentResponse: ").append(toIndentedString(createPaymentResponse)).append("\n");
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
