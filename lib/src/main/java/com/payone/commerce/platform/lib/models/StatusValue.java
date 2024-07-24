package com.payone.commerce.platform.lib.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Current high-level status of the payment in a human-readable form.
 */
public enum StatusValue {

  CREATED("CREATED"),

  CANCELLED("CANCELLED"),

  REJECTED("REJECTED"),

  REJECTED_CAPTURE("REJECTED_CAPTURE"),

  REDIRECTED("REDIRECTED"),

  PENDING_PAYMENT("PENDING_PAYMENT"),

  PENDING_COMPLETION("PENDING_COMPLETION"),

  PENDING_CAPTURE("PENDING_CAPTURE"),

  AUTHORIZATION_REQUESTED("AUTHORIZATION_REQUESTED"),

  CAPTURE_REQUESTED("CAPTURE_REQUESTED"),

  CAPTURED("CAPTURED"),

  REVERSED("REVERSED"),

  REFUND_REQUESTED("REFUND_REQUESTED"),

  REFUNDED("REFUNDED"),

  REJECTED_REFUND("REJECTED_REFUND"),

  CANCELLATION_REQUESTED("CANCELLATION_REQUESTED"),

  PAUSED("PAUSED"),

  CHARGEBACKED("CHARGEBACKED"),

  CHARGEBACK_REVERSED("CHARGEBACK_REVERSED"),

  ACCOUNT_CREDITED("ACCOUNT_CREDITED"),

  ACCOUNT_DEBITED("ACCOUNT_DEBITED");

  private String value;

  StatusValue(String value) {
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
  public static StatusValue fromValue(String value) {
    for (StatusValue b : StatusValue.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");

  }
}
