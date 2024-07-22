package com.payone.commerce.platform.lib.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Reason why an order was cancelled. Possible values: * CONSUMER_REQUEST - The
 * consumer requested a cancellation of the Order * UNDELIVERABLE - The merchant
 * cannot fulfill the Order * DUPLICATE - The Order was created twice
 * accidentally * FRAUDULENT- Consumer turned out to be a fraudster *
 * ORDER_SHIPPED_IN_FULL - The merchant shipped everything and wants to cancel
 * the remaining authorized amount of the Order * AUTOMATED_SHIPMENT_FAILED - A
 * technical error was thrown during an automated shipment API call rendering
 * the Order impossible to complete Mandatory for PAYONE Buy Now, Pay Later
 * (BNPL): * 3390 - PAYONE Secured Invoice * 3391 - PAYONE Secured Installment *
 * 3392 - PAYONE Secured Direct Debit
 */
public enum CancellationReason {

  CONSUMER_REQUEST("CONSUMER_REQUEST"),

  UNDELIVERABLE("UNDELIVERABLE"),

  DUPLICATE("DUPLICATE"),

  FRAUDULENT("FRAUDULENT"),

  ORDER_SHIPPED_IN_FULL("ORDER_SHIPPED_IN_FULL"),

  AUTOMATED_SHIPMENT_FAILED("AUTOMATED_SHIPMENT_FAILED");

  private String value;

  CancellationReason(String value) {
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
  public static CancellationReason fromValue(String value) {
    for (CancellationReason b : CancellationReason.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");

  }
}
