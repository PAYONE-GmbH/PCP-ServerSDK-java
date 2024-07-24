package com.payone.commerce.platform.lib.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Current high-level status of the Checkout
 */
public enum StatusCheckout {

  OPEN("OPEN"),

  PENDING_COMPLETION("PENDING_COMPLETION"),

  COMPLETED("COMPLETED"),

  BILLED("BILLED"),

  CHARGEBACKED("CHARGEBACKED"),

  DELETED("DELETED");

  private String value;

  StatusCheckout(String value) {
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
  public static StatusCheckout fromValue(String value) {
    for (StatusCheckout b : StatusCheckout.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");

  }
}
