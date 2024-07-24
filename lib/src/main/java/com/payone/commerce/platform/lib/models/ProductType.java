package com.payone.commerce.platform.lib.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum to classify items that are purchased * GOODS - Goods * SHIPMENT -
 * Shipping charges * HANDLING_FEE - Handling fee * DISCOUNT - Voucher /
 * discount
 */
public enum ProductType {

  GOODS("GOODS"),

  SHIPMENT("SHIPMENT"),

  HANDLING_FEE("HANDLING_FEE"),

  DISCOUNT("DISCOUNT");

  private String value;

  ProductType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductType fromValue(String value) {
    for (ProductType b : ProductType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");

  }
}
