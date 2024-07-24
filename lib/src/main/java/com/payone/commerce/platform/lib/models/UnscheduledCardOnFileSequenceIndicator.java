package com.payone.commerce.platform.lib.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * * first &#x3D; This transaction is the first of a series of unscheduled
 * recurring transactions * subsequent &#x3D; This transaction is a subsequent
 * transaction in a series of unscheduled recurring transactions Note: this
 * property is not allowed if isRecurring is true.
 */
public enum UnscheduledCardOnFileSequenceIndicator {

  FIRST("first"),

  SUBSEQUENT("subsequent");

  private String value;

  UnscheduledCardOnFileSequenceIndicator(String value) {
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
  public static UnscheduledCardOnFileSequenceIndicator fromValue(String value) {
    for (UnscheduledCardOnFileSequenceIndicator b : UnscheduledCardOnFileSequenceIndicator.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");

  }
}
