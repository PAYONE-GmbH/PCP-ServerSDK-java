package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ PaymentMethodSpecificInputForIntent.JSON_PROPERTY_REDIRECT_PAYMENT_METHOD_SPECIFIC_INPUT })
public class PaymentMethodSpecificInputForIntent implements Serializable {
  private static final long serialVersionUID = 1L;
  public static final String JSON_PROPERTY_REDIRECT_PAYMENT_METHOD_SPECIFIC_INPUT = "redirectPaymentMethodSpecificInput";
  private RedirectPaymentMethodSpecificInputForIntent redirectPaymentMethodSpecificInput;

  public PaymentMethodSpecificInputForIntent() {
  }

  public PaymentMethodSpecificInputForIntent redirectPaymentMethodSpecificInput(
      RedirectPaymentMethodSpecificInputForIntent value) {
    this.redirectPaymentMethodSpecificInput = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_REDIRECT_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RedirectPaymentMethodSpecificInputForIntent getRedirectPaymentMethodSpecificInput() {
    return redirectPaymentMethodSpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_REDIRECT_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectPaymentMethodSpecificInput(RedirectPaymentMethodSpecificInputForIntent value) {
    this.redirectPaymentMethodSpecificInput = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    return Objects.equals(redirectPaymentMethodSpecificInput,
        ((PaymentMethodSpecificInputForIntent) o).redirectPaymentMethodSpecificInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectPaymentMethodSpecificInput);
  }

  @Override
  public String toString() {
    return "class PaymentMethodSpecificInputForIntent {\n    redirectPaymentMethodSpecificInput: "
        + toIndentedString(redirectPaymentMethodSpecificInput) + "\n}";
  }

  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
