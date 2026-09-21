package com.payone.commerce.platform.lib.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Object that holds the required reference properties for a payment intent. */
public class PaymentReferencesForPaymentIntent extends PaymentReferences {
  private static final long serialVersionUID = 1L;

  @Override
  public PaymentReferencesForPaymentIntent merchantReference(String value) {
    super.merchantReference(value);
    return this;
  }

  @Override
  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMerchantReference() {
    return super.getMerchantReference();
  }

  @Override
  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchantReference(String value) {
    super.setMerchantReference(value);
  }
}
