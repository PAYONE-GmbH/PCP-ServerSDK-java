package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * This object contains information of all items in the cart. If a cart item is
 * provided, the productPrice and quantity is required.
 */
@JsonPropertyOrder({
    CartItemResult.JSON_PROPERTY_INVOICE_DATA,
    CartItemResult.JSON_PROPERTY_ORDER_LINE_DETAILS
})
public class CartItemResult implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_INVOICE_DATA = "invoiceData";
  private CartItemInvoiceData invoiceData;

  public static final String JSON_PROPERTY_ORDER_LINE_DETAILS = "orderLineDetails";
  private OrderLineDetailsResult orderLineDetails;

  public CartItemResult() {
  }

  public CartItemResult invoiceData(CartItemInvoiceData invoiceData) {

    this.invoiceData = invoiceData;
    return this;
  }

  /**
   * Get invoiceData
   * 
   * @return invoiceData
   **/

  @JsonProperty(JSON_PROPERTY_INVOICE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CartItemInvoiceData getInvoiceData() {
    return invoiceData;
  }

  @JsonProperty(JSON_PROPERTY_INVOICE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceData(CartItemInvoiceData invoiceData) {
    this.invoiceData = invoiceData;
  }

  public CartItemResult orderLineDetails(OrderLineDetailsResult orderLineDetails) {

    this.orderLineDetails = orderLineDetails;
    return this;
  }

  /**
   * Get orderLineDetails
   * 
   * @return orderLineDetails
   **/

  @JsonProperty(JSON_PROPERTY_ORDER_LINE_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrderLineDetailsResult getOrderLineDetails() {
    return orderLineDetails;
  }

  @JsonProperty(JSON_PROPERTY_ORDER_LINE_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderLineDetails(OrderLineDetailsResult orderLineDetails) {
    this.orderLineDetails = orderLineDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartItemResult cartItemResult = (CartItemResult) o;
    return Objects.equals(this.invoiceData, cartItemResult.invoiceData) &&
        Objects.equals(this.orderLineDetails, cartItemResult.orderLineDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceData, orderLineDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartItemResult {\n");
    sb.append("    invoiceData: ").append(toIndentedString(invoiceData)).append("\n");
    sb.append("    orderLineDetails: ").append(toIndentedString(orderLineDetails)).append("\n");
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
