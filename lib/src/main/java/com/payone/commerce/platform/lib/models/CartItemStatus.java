package com.payone.commerce.platform.lib.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Indicates in which status the line item is
 */
public enum CartItemStatus {

  ORDERED("ORDERED"),

  DELIVERED("DELIVERED"),

  CANCELLED("CANCELLED"),

  RETURNED("RETURNED"),

  WAITING_FOR_PAYMENT("WAITING_FOR_PAYMENT");

  private String value;

  CartItemStatus(String value) {
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
  public static CartItemStatus fromValue(String value) {
    for (CartItemStatus b : CartItemStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");

  }
}
