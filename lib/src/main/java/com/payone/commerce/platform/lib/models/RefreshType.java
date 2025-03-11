package com.payone.commerce.platform.lib.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The refreshType refers to the type of the payment status refresh. *
 * PAYMENT_EVENTS &#x3D; Refresh the payment status of the payment and return
 * the events. This is a synchronisation of the payment status with the payment
 * platform. This can be used in case of any possible inconsistencies between
 * the commerce platform and the payment platform. * PAYMENT_PROVIDER_DETAILS
 * &#x3D; Refresh the payment status of the payment and return the payment
 * provider details. This is a synchronisation of the payment with the external
 * payment provider. The current use case is to update the customer status of a
 * transaction using PAYONE Buy Now, Pay Later (BNPL) with the external provider
 * Payla.
 */
public enum RefreshType {

  PAYMENT_EVENTS("PAYMENT_EVENTS"),

  PAYMENT_PROVIDER_DETAILS("PAYMENT_PROVIDER_DETAILS");

  private String value;

  RefreshType(String value) {
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
  public static RefreshType fromValue(String value) {
    for (RefreshType b : RefreshType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}
