package com.payone.commerce.platform.lib.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The cancelType refers to the ShoppingCart items of the Checkout. cancelType
 * &#x3D; FULL should be provided if all items should be marked as cancelled and
 * the payment for the entire ShoppingCart should be reversed. cancelType &#x3D;
 * PARTIAL should be provided if only certain items should be marked as
 * cancelled and the Cancel should not be made for the entire ShoppingCart. For
 * this type the list of items has to be provided. Please note that a reversal
 * for a partial payment will not reverse the respective amount from the
 * authorization but only reduces the openAmount that is ready for collecting.
 * Following conditions apply to the Cancel request: * items must be in status
 * ORDERED * there was no Capture, Refund or Cancel triggered over the Payment
 * Execution resource * for the cancelType FULL no items are provided in the
 * request Note: If a DISCOUNT productType is among the ShoppingCart items, only
 * cancelType FULL is possible.
 */
public enum CancelType {

  FULL("FULL"),

  PARTIAL("PARTIAL");

  private String value;

  CancelType(String value) {
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
  public static CancelType fromValue(String value) {
    for (CancelType b : CancelType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");

  }
}
