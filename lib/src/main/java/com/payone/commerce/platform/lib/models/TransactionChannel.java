package com.payone.commerce.platform.lib.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Indicates the channel via which the payment is created. Allowed values: *
 * ECOMMERCE - The transaction is a regular E-Commerce transaction. * MOTO - The
 * transaction is a Mail Order/Telephone Order. Defaults to ECOMMERCE.
 */
public enum TransactionChannel {

  ECOMMERCE("ECOMMERCE"),

  MOTO("MOTO");

  private String value;

  TransactionChannel(String value) {
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
  public static TransactionChannel fromValue(String value) {
    for (TransactionChannel b : TransactionChannel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");

  }
}
