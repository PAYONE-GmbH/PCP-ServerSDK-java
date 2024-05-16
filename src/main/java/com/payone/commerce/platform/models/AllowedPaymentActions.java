/*
 * Commerce Platform API
 * RESTful API for the creation of Commerce Cases with Checkouts and the execution of Payments. 
 *
 * The version of the OpenAPI document: 1.5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.payone.commerce.platform.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Indicates which payment endpoints can be used for the respective Checkout. The systems offers two alternatives to trigger a payment and consecutive events: OrderManagementCheckoutActions or the Payment Execution resource. Both alternatives can be used simultaneously but once one of the Payment Execution endpoints is used the Order Management endpoints can no longer be used for that Checkout since it is no longer possible to match payment events to items of the Checkout. There are two exceptions to this rule: The Complete and Pause request do not limit the use of the OrderManagementCheckoutActions. 
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

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    if (prefix == null) {
      prefix = "";
    }

    return String.format("%s=%s", prefix, this.toString());
  }
}

