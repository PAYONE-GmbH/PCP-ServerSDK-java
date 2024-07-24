package com.payone.commerce.platform.lib.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The returnType refers to the ShoppingCart items of the Checkout. returnType
 * &#x3D; FULL should be provided if all items should be marked as returned and
 * the payment for the entire ShoppingCart should be refunded. returnType &#x3D;
 * PARTIAL should be provided if only certain items should be marked as returned
 * and the Refund should not be made for the entire ShoppingCart. For this type
 * the list of items has to be provided. Following conditions apply to the
 * Return request: * items must be in status DELIVERED * there was no Capture,
 * Refund or Cancel triggered over the Payment Execution resource * for the
 * deliverType FULL no items are provided in the request Note: If a DISCOUNT
 * productType is among the ShoppingCart items, only returnType FULL is
 * possible.
 */
public enum ReturnType {

  FULL("FULL"),

  PARTIAL("PARTIAL");

  private String value;

  ReturnType(String value) {
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
  public static ReturnType fromValue(String value) {
    for (ReturnType b : ReturnType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");

  }
}
