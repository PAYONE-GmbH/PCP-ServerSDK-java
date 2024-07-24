package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Detailed information regarding an occurred payment event.
 */
@JsonPropertyOrder({
    CartItemOrderStatus.JSON_PROPERTY_CART_ITEM_STATUS,
    CartItemOrderStatus.JSON_PROPERTY_QUANTITY
})
public class CartItemOrderStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CART_ITEM_STATUS = "cartItemStatus";
  private CartItemStatus cartItemStatus;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private Long quantity;

  public CartItemOrderStatus() {
  }

  public CartItemOrderStatus cartItemStatus(CartItemStatus cartItemStatus) {

    this.cartItemStatus = cartItemStatus;
    return this;
  }

  /**
   * Get cartItemStatus
   * 
   * @return cartItemStatus
   **/

  @JsonProperty(JSON_PROPERTY_CART_ITEM_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CartItemStatus getCartItemStatus() {
    return cartItemStatus;
  }

  @JsonProperty(JSON_PROPERTY_CART_ITEM_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCartItemStatus(CartItemStatus cartItemStatus) {
    this.cartItemStatus = cartItemStatus;
  }

  public CartItemOrderStatus quantity(Long quantity) {

    this.quantity = quantity;
    return this;
  }

  /**
   * Amount of units for which this status is applicable, should be greater than
   * zero
   * minimum: 0
   * maximum: 9999
   * 
   * @return quantity
   **/

  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getQuantity() {
    return quantity;
  }

  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartItemOrderStatus cartItemOrderStatus = (CartItemOrderStatus) o;
    return Objects.equals(this.cartItemStatus, cartItemOrderStatus.cartItemStatus) &&
        Objects.equals(this.quantity, cartItemOrderStatus.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartItemStatus, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartItemOrderStatus {\n");
    sb.append("    cartItemStatus: ").append(toIndentedString(cartItemStatus)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
