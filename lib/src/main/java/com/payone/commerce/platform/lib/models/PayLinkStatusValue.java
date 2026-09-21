package com.payone.commerce.platform.lib.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Pay-link status. */
public enum PayLinkStatusValue {
  ACTIVE("ACTIVE"),
  PAID("PAID"),
  EXPIRED("EXPIRED"),
  REDIRECTED("REDIRECTED");

  private final String value;

  PayLinkStatusValue(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return value;
  }

  @JsonCreator
  public static PayLinkStatusValue fromValue(String value) {
    for (PayLinkStatusValue status : values()) {
      if (status.value.equals(value)) {
        return status;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
