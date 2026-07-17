package com.payone.commerce.platform.lib.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * This object contains information of all items in the cart. If a cart item is
 * provided, the productPrice and quantity is required.
 */
@JsonPropertyOrder({
    CartItemData.JSON_PROPERTY_INVOICE_DATA,
    CartItemData.JSON_PROPERTY_ORDER_LINE_DETAILS,
    CartItemInput.JSON_PROPERTY_SUPPLIER_REFERENCES
})
public class CartItemInput extends CartItemData {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SUPPLIER_REFERENCES = "supplierReferences";
  private CartItemSupplierReferences supplierReferences;

  public CartItemInput() {
  }

  @Override
  public CartItemInput invoiceData(CartItemInvoiceData invoiceData) {
    super.invoiceData(invoiceData);
    return this;
  }

  @Override
  public CartItemInput orderLineDetails(OrderLineDetailsInput orderLineDetails) {
    super.orderLineDetails(orderLineDetails);
    return this;
  }

  public CartItemInput supplierReferences(CartItemSupplierReferences supplierReferences) {

    this.supplierReferences = supplierReferences;
    return this;
  }

  /**
   * Get supplierReferences
   *
   * @return supplierReferences
   **/

  @JsonProperty(JSON_PROPERTY_SUPPLIER_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CartItemSupplierReferences getSupplierReferences() {
    return supplierReferences;
  }

  @JsonProperty(JSON_PROPERTY_SUPPLIER_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupplierReferences(CartItemSupplierReferences supplierReferences) {
    this.supplierReferences = supplierReferences;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartItemInput cartItemInput = (CartItemInput) o;
    return Objects.equals(this.supplierReferences, cartItemInput.supplierReferences) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supplierReferences, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartItemInput {\n");
    sb.append("    invoiceData: ").append(toIndentedString(getInvoiceData())).append("\n");
    sb.append("    orderLineDetails: ").append(toIndentedString(getOrderLineDetails())).append("\n");
    sb.append("    supplierReferences: ").append(toIndentedString(supplierReferences)).append("\n");
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
