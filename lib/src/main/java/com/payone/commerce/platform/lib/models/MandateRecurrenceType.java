package com.payone.commerce.platform.lib.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies whether the mandate is for one-off or recurring payments. Possible
 * values are: * UNIQUE * RECURRING
 */
public enum MandateRecurrenceType {

  UNIQUE("UNIQUE"),

  RECURRING("RECURRING");

  private String value;

  MandateRecurrenceType(String value) {
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
  public static MandateRecurrenceType fromValue(String value) {
    for (MandateRecurrenceType b : MandateRecurrenceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");

  }
}
