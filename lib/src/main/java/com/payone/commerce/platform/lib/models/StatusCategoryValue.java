package com.payone.commerce.platform.lib.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Highlevel status of the payment, payout or Refund.
 */
public enum StatusCategoryValue {

  CREATED("CREATED"),

  UNSUCCESSFUL("UNSUCCESSFUL"),

  PENDING_PAYMENT("PENDING_PAYMENT"),

  PENDING_MERCHANT("PENDING_MERCHANT"),

  PENDING_CONNECT_OR_3RD_PARTY("PENDING_CONNECT_OR_3RD_PARTY"),

  COMPLETED("COMPLETED"),

  REVERSED("REVERSED"),

  REFUNDED("REFUNDED");

  private String value;

  StatusCategoryValue(String value) {
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
  public static StatusCategoryValue fromValue(String value) {
    for (StatusCategoryValue b : StatusCategoryValue.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");

  }
}
