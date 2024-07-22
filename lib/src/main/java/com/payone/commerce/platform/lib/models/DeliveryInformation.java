package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Delivery object contains additional information about the delivery/shipment,
 * which is the basis for the Capture. The amountOfMoney in the cartItem will
 * not be used in the request.
 */
@JsonPropertyOrder({
    DeliveryInformation.JSON_PROPERTY_ITEMS
})
public class DeliveryInformation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<CartItemInput> items;

  public DeliveryInformation() {
  }

  public DeliveryInformation items(List<CartItemInput> items) {

    this.items = items;
    return this;
  }

  public DeliveryInformation addItemsItem(CartItemInput itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Items delivered.
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
    DeliveryInformation deliveryInformation = (DeliveryInformation) o;
    return Objects.equals(this.items, deliveryInformation.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryInformation {\n");
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
