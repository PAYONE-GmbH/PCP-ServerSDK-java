package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * This object contains references of the seller of the cart item.
 */
@JsonPropertyOrder({
    CartItemSupplierReferences.JSON_PROPERTY_SUPPLIER_ID,
    CartItemSupplierReferences.JSON_PROPERTY_ORDER_REFERENCE
})
public class CartItemSupplierReferences implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SUPPLIER_ID = "supplierId";
  private String supplierId;

  public static final String JSON_PROPERTY_ORDER_REFERENCE = "orderReference";
  private String orderReference;

  public CartItemSupplierReferences() {
  }

  public CartItemSupplierReferences supplierId(String supplierId) {
    this.supplierId = supplierId;
    return this;
  }

  /**
   * Unique identifier for the supplier.
   *
   * @return supplierId
   */

  @JsonProperty(JSON_PROPERTY_SUPPLIER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSupplierId() {
    return supplierId;
  }

  @JsonProperty(JSON_PROPERTY_SUPPLIER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupplierId(String supplierId) {
    this.supplierId = supplierId;
  }

  public CartItemSupplierReferences orderReference(String orderReference) {
    this.orderReference = orderReference;
    return this;
  }

  /**
   * Reference of the order for the supplier.
   *
   * @return orderReference
   */

  @JsonProperty(JSON_PROPERTY_ORDER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrderReference() {
    return orderReference;
  }

  @JsonProperty(JSON_PROPERTY_ORDER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderReference(String orderReference) {
    this.orderReference = orderReference;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartItemSupplierReferences cartItemSupplierReferences = (CartItemSupplierReferences) o;
    return Objects.equals(this.supplierId, cartItemSupplierReferences.supplierId) &&
        Objects.equals(this.orderReference, cartItemSupplierReferences.orderReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supplierId, orderReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartItemSupplierReferences {\n");
    sb.append("    supplierId: ").append(toIndentedString(supplierId)).append("\n");
    sb.append("    orderReference: ").append(toIndentedString(orderReference)).append("\n");
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
