package com.payone.commerce.platform.lib.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines the respective payment type.
 */
public enum PaymentType {

  SALE("SALE"),

  RESERVATION("RESERVATION"),

  CAPTURE("CAPTURE"),

  REFUND("REFUND"),

  REVERSAL("REVERSAL"),

  CHARGEBACK_REVERSAL("CHARGEBACK_REVERSAL"),

  CREDIT_NOTE("CREDIT_NOTE"),

  DEBIT_NOTE("DEBIT_NOTE");

  private String value;

  PaymentType(String value) {
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
  public static PaymentType fromValue(String value) {
    for (PaymentType b : PaymentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");

  }
}
