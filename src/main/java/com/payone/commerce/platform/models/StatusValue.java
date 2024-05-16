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
 * Current high-level status of the payment in a human-readable form.
 */
public enum StatusValue {
  
  CREATED("CREATED"),
  
  CANCELLED("CANCELLED"),
  
  REJECTED("REJECTED"),
  
  REJECTED_CAPTURE("REJECTED_CAPTURE"),
  
  REDIRECTED("REDIRECTED"),
  
  PENDING_PAYMENT("PENDING_PAYMENT"),
  
  PENDING_COMPLETION("PENDING_COMPLETION"),
  
  PENDING_CAPTURE("PENDING_CAPTURE"),
  
  AUTHORIZATION_REQUESTED("AUTHORIZATION_REQUESTED"),
  
  CAPTURE_REQUESTED("CAPTURE_REQUESTED"),
  
  CAPTURED("CAPTURED"),
  
  REVERSED("REVERSED"),
  
  REFUND_REQUESTED("REFUND_REQUESTED"),
  
  REFUNDED("REFUNDED"),
  
  REJECTED_REFUND("REJECTED_REFUND"),
  
  CANCELLATION_REQUESTED("CANCELLATION_REQUESTED"),
  
  PAUSED("PAUSED"),
  
  CHARGEBACKED("CHARGEBACKED"),
  
  CHARGEBACK_REVERSED("CHARGEBACK_REVERSED"),
  
  ACCOUNT_CREDITED("ACCOUNT_CREDITED"),
  
  ACCOUNT_DEBITED("ACCOUNT_DEBITED");

  private String value;

  StatusValue(String value) {
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
  public static StatusValue fromValue(String value) {
    for (StatusValue b : StatusValue.values()) {
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

