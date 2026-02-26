package com.payone.commerce.platform.lib.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Network/Scheme of the card used for the payment.
 * * MASTERCARD
 * * VISA
 * * AMEX
 * * GIROCARD
 * * DISCOVER (not supported yet)
 * * JCB (not supported yet)
 */
public enum MobilePaymentNetwork {

  MASTERCARD("MASTERCARD"),

  VISA("VISA"),

  AMEX("AMEX"),

  GIROCARD("GIROCARD"),

  DISCOVER("DISCOVER"),

  JCB("JCB");

  private String value;

  MobilePaymentNetwork(String value) {
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
  public static MobilePaymentNetwork fromValue(String value) {
    for (MobilePaymentNetwork b : MobilePaymentNetwork.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
