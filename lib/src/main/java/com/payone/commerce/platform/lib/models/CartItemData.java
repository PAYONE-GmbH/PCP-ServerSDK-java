package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ CartItemData.JSON_PROPERTY_INVOICE_DATA, CartItemData.JSON_PROPERTY_ORDER_LINE_DETAILS })
public class CartItemData implements Serializable {
  private static final long serialVersionUID = 1L;
  public static final String JSON_PROPERTY_INVOICE_DATA = "invoiceData";
  private CartItemInvoiceData invoiceData;
  public static final String JSON_PROPERTY_ORDER_LINE_DETAILS = "orderLineDetails";
  private OrderLineDetailsInput orderLineDetails;

  public CartItemData() {
  }

  public CartItemData invoiceData(CartItemInvoiceData invoiceData) {
    this.invoiceData = invoiceData;
    return this;
  }

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

  public CartItemData orderLineDetails(OrderLineDetailsInput orderLineDetails) {
    this.orderLineDetails = orderLineDetails;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_ORDER_LINE_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OrderLineDetailsInput getOrderLineDetails() {
    return orderLineDetails;
  }

  @JsonProperty(JSON_PROPERTY_ORDER_LINE_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderLineDetails(OrderLineDetailsInput orderLineDetails) {
    this.orderLineDetails = orderLineDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    CartItemData that = (CartItemData) o;
    return Objects.equals(invoiceData, that.invoiceData) && Objects.equals(orderLineDetails, that.orderLineDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceData, orderLineDetails);
  }

  @Override
  public String toString() {
    return "class CartItemData {\n    invoiceData: " + toIndentedString(invoiceData) + "\n    orderLineDetails: "
        + toIndentedString(orderLineDetails) + "\n}";
  }

  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
