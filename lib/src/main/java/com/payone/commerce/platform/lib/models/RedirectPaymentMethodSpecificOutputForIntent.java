package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ RedirectPaymentMethodSpecificOutputForIntent.JSON_PROPERTY_PAYMENT_PRODUCT_ID,
    RedirectPaymentMethodSpecificOutputForIntent.JSON_PROPERTY_PAYMENT_PRODUCT840_SPECIFIC_OUTPUT })
public class RedirectPaymentMethodSpecificOutputForIntent implements Serializable {
  private static final long serialVersionUID = 1L;
  public static final String JSON_PROPERTY_PAYMENT_PRODUCT_ID = "paymentProductId";
  private Integer paymentProductId;
  public static final String JSON_PROPERTY_PAYMENT_PRODUCT840_SPECIFIC_OUTPUT = "paymentProduct840SpecificOutput";
  private PaymentProduct840SpecificOutputForIntent paymentProduct840SpecificOutput;

  public RedirectPaymentMethodSpecificOutputForIntent() {
  }

  public RedirectPaymentMethodSpecificOutputForIntent paymentProductId(Integer value) {
    paymentProductId = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getPaymentProductId() {
    return paymentProductId;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentProductId(Integer value) {
    paymentProductId = value;
  }

  public RedirectPaymentMethodSpecificOutputForIntent paymentProduct840SpecificOutput(
      PaymentProduct840SpecificOutputForIntent value) {
    paymentProduct840SpecificOutput = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT840_SPECIFIC_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PaymentProduct840SpecificOutputForIntent getPaymentProduct840SpecificOutput() {
    return paymentProduct840SpecificOutput;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT840_SPECIFIC_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentProduct840SpecificOutput(PaymentProduct840SpecificOutputForIntent value) {
    paymentProduct840SpecificOutput = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    RedirectPaymentMethodSpecificOutputForIntent that = (RedirectPaymentMethodSpecificOutputForIntent) o;
    return Objects.equals(paymentProductId, that.paymentProductId)
        && Objects.equals(paymentProduct840SpecificOutput, that.paymentProduct840SpecificOutput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentProductId, paymentProduct840SpecificOutput);
  }

  @Override
  public String toString() {
    return "class RedirectPaymentMethodSpecificOutputForIntent {\n    paymentProductId: "
        + toIndentedString(paymentProductId) + "\n    paymentProduct840SpecificOutput: "
        + toIndentedString(paymentProduct840SpecificOutput) + "\n}";
  }

  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
