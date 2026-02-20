package com.payone.commerce.platform.lib.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Request to pause a payment for a specific payment method.
 */
@JsonPropertyOrder({})
public class PausePaymentRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public PausePaymentRequest() {
  }

  /**
   * Return true if this PausePaymentRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return getClass().hashCode();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PausePaymentRequest {\n");
    sb.append("}");
    return sb.toString();
  }
}
