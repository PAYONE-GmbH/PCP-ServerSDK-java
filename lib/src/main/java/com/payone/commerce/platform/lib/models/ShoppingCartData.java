package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ ShoppingCartData.JSON_PROPERTY_ITEMS })
public class ShoppingCartData implements Serializable {
  private static final long serialVersionUID = 1L;
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<CartItemData> items;

  public ShoppingCartData() {
  }

  public ShoppingCartData items(List<CartItemData> items) {
    this.items = items;
    return this;
  }

  public ShoppingCartData addItemsItem(CartItemData itemsItem) {
    if (items == null)
      items = new ArrayList<>();
    items.add(itemsItem);
    return this;
  }

  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<CartItemData> getItems() {
    return items;
  }

  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<CartItemData> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    return Objects.equals(items, ((ShoppingCartData) o).items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    return "class ShoppingCartData {\n    items: " + toIndentedString(items) + "\n}";
  }

  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
