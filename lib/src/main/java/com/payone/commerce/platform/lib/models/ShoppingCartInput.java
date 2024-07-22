package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Shopping cart data, including items and specific amounts.
 */
@JsonPropertyOrder({
    ShoppingCartInput.JSON_PROPERTY_ITEMS
})
public class ShoppingCartInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<CartItemInput> items;

  public ShoppingCartInput() {
  }

  public ShoppingCartInput items(List<CartItemInput> items) {

    this.items = items;
    return this;
  }

  public ShoppingCartInput addItemsItem(CartItemInput itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * 
   * @return items
   **/

  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CartItemInput> getItems() {
    return items;
  }

  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<CartItemInput> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShoppingCartInput shoppingCartInput = (ShoppingCartInput) o;
    return Objects.equals(this.items, shoppingCartInput.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShoppingCartInput {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
