package com.payone.commerce.platform.lib.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Indicates which payment endpoints can be used for the respective Checkout.
 * The systems offers two alternatives to trigger a payment and consecutive
 * events: OrderManagementCheckoutActions or the Payment Execution resource.
 * Both alternatives can be used simultaneously but once one of the Payment
 * Execution endpoints is used the Order Management endpoints can no longer be
 * used for that Checkout since it is no longer possible to match payment events
 * to items of the Checkout. There are two exceptions to this rule: The Complete
 * and Pause request do not limit the use of the OrderManagementCheckoutActions.
 */
public enum AllowedPaymentActions {

  ORDER_MANAGEMENT("ORDER_MANAGEMENT"),

  PAYMENT_EXECUTION("PAYMENT_EXECUTION");

  private String value;

  AllowedPaymentActions(String value) {
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
  public static AllowedPaymentActions fromValue(String value) {
    for (AllowedPaymentActions b : AllowedPaymentActions.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}
