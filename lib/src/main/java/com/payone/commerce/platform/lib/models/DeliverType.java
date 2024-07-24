package com.payone.commerce.platform.lib.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The deliverType refers to the ShoppingCart items of the Checkout. deliverType
 * &#x3D; FULL should be provided if all items should be marked as delivered and
 * the payment for the entire ShoppingCart should be captured. deliverType
 * &#x3D; PARTIAL should be provided if only certain items should be marked as
 * delivered and the Capture should not be made for the entire ShoppingCart. For
 * this type the list of items has to be provided. Following conditions apply to
 * the Deliver request: * items must be in status ORDERED * there was no
 * Capture, Refund or Cancel triggered over the Payment Execution resource * for
 * the deliverType FULL no items are provided in the request Note: If a DISCOUNT
 * productType is among the ShoppingCart items, only deliverType FULL is
 * possible.
 */
public enum DeliverType {

  FULL("FULL"),

  PARTIAL("PARTIAL");

  private String value;

  DeliverType(String value) {
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
  public static DeliverType fromValue(String value) {
    for (DeliverType b : DeliverType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");

  }
}
