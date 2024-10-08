package com.payone.commerce.platform.lib.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The orderType refers to the ShoppingCart of the Checkout. orderType &#x3D;
 * FULL should be provided if a payment for the entire ShoppingCart should be
 * created. orderType &#x3D; PARTIAL should be provided if the payment should be
 * created only for certain items of the ShoppingCart. For this type the list of
 * items has to be provided. Following conditions apply to the Order request: *
 * amount of the Checkout can not be zero * the ShoppingCart cannot be empty *
 * for orderType &#x3D; FULL the Checkout status is OPEN, there is no other
 * order and/or Payment Execution and no items should be provided in the body *
 * if no paymentMethodSpecificInput has been provided in the creation of the
 * Commerce Case or Checkout it has to be provided in this request
 */
public enum OrderType {

  FULL("FULL"),

  PARTIAL("PARTIAL");

  private String value;

  OrderType(String value) {
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
  public static OrderType fromValue(String value) {
    for (OrderType b : OrderType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");

  }
}
