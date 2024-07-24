package com.payone.commerce.platform.lib.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Indicates which party initiated the unscheduled recurring transaction.
 * Allowed values: * merchantInitiated - Merchant Initiated Transaction. *
 * cardholderInitiated - Cardholder Initiated Transaction. Note: * When a
 * customer has chosen to use a token on a hosted Checkout this property is set
 * to \&quot;cardholderInitiated\&quot;.
 */
public enum UnscheduledCardOnFileRequestor {

  MERCHANTINITIATED("merchantInitiated"),

  CARDHOLDERINITIATED("cardholderInitiated");

  private String value;

  UnscheduledCardOnFileRequestor(String value) {
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
  public static UnscheduledCardOnFileRequestor fromValue(String value) {
    for (UnscheduledCardOnFileRequestor b : UnscheduledCardOnFileRequestor.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");

  }
}
