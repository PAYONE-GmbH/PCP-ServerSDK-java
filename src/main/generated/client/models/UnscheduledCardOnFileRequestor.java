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


package client.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Indicates which party initiated the unscheduled recurring transaction. Allowed values:   * merchantInitiated - Merchant Initiated Transaction.   * cardholderInitiated - Cardholder Initiated Transaction. Note:   * When a customer has chosen to use a token on a hosted Checkout this property is set to \&quot;cardholderInitiated\&quot;.
 */
public enum UnscheduledCardOnFileRequestor {
  
  MERCHANTINITIATED("merchantInitiated"),
  
  CARDHOLDERINITIATED("cardholderInitiated");

  private String value;

  UnscheduledCardOnFileRequestor(String value) {
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
  public static UnscheduledCardOnFileRequestor fromValue(String value) {
    for (UnscheduledCardOnFileRequestor b : UnscheduledCardOnFileRequestor.values()) {
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

