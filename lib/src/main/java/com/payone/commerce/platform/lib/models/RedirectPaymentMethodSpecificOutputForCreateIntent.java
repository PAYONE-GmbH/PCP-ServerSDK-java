package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ RedirectPaymentMethodSpecificOutputForCreateIntent.JSON_PROPERTY_REQUIRES_APPROVAL,
    RedirectPaymentMethodSpecificOutputForCreateIntent.JSON_PROPERTY_PAYMENT_PRODUCT_ID,
    RedirectPaymentMethodSpecificOutputForCreateIntent.JSON_PROPERTY_PAYMENT_PRODUCT840_SPECIFIC_OUTPUT,
    RedirectPaymentMethodSpecificOutputForCreateIntent.JSON_PROPERTY_REDIRECT_DATA })
public class RedirectPaymentMethodSpecificOutputForCreateIntent implements Serializable {
  private static final long serialVersionUID = 1L;
  public static final String JSON_PROPERTY_REQUIRES_APPROVAL = "requiresApproval";
  private Boolean requiresApproval;
  public static final String JSON_PROPERTY_PAYMENT_PRODUCT_ID = "paymentProductId";
  private Integer paymentProductId;
  public static final String JSON_PROPERTY_PAYMENT_PRODUCT840_SPECIFIC_OUTPUT = "paymentProduct840SpecificOutput";
  private RedirectPaymentProduct840SpecificInputData paymentProduct840SpecificOutput;
  public static final String JSON_PROPERTY_REDIRECT_DATA = "redirectData";
  private RedirectData redirectData;

  public RedirectPaymentMethodSpecificOutputForCreateIntent() {
  }

  public RedirectPaymentMethodSpecificOutputForCreateIntent requiresApproval(Boolean value) {
    requiresApproval = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_REQUIRES_APPROVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRequiresApproval() {
    return requiresApproval;
  }

  @JsonProperty(JSON_PROPERTY_REQUIRES_APPROVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequiresApproval(Boolean value) {
    requiresApproval = value;
  }

  public RedirectPaymentMethodSpecificOutputForCreateIntent paymentProductId(Integer value) {
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

  public RedirectPaymentMethodSpecificOutputForCreateIntent paymentProduct840SpecificOutput(
      RedirectPaymentProduct840SpecificInputData value) {
    paymentProduct840SpecificOutput = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT840_SPECIFIC_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RedirectPaymentProduct840SpecificInputData getPaymentProduct840SpecificOutput() {
    return paymentProduct840SpecificOutput;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT840_SPECIFIC_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentProduct840SpecificOutput(RedirectPaymentProduct840SpecificInputData value) {
    paymentProduct840SpecificOutput = value;
  }

  public RedirectPaymentMethodSpecificOutputForCreateIntent redirectData(RedirectData value) {
    redirectData = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_REDIRECT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RedirectData getRedirectData() {
    return redirectData;
  }

  @JsonProperty(JSON_PROPERTY_REDIRECT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectData(RedirectData value) {
    redirectData = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    RedirectPaymentMethodSpecificOutputForCreateIntent that = (RedirectPaymentMethodSpecificOutputForCreateIntent) o;
    return Objects.equals(requiresApproval, that.requiresApproval)
        && Objects.equals(paymentProductId, that.paymentProductId)
        && Objects.equals(paymentProduct840SpecificOutput, that.paymentProduct840SpecificOutput)
        && Objects.equals(redirectData, that.redirectData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiresApproval, paymentProductId, paymentProduct840SpecificOutput, redirectData);
  }

  @Override
  public String toString() {
    return "class RedirectPaymentMethodSpecificOutputForCreateIntent {\n    requiresApproval: "
        + toIndentedString(requiresApproval) + "\n    paymentProductId: " + toIndentedString(paymentProductId)
        + "\n    paymentProduct840SpecificOutput: " + toIndentedString(paymentProduct840SpecificOutput)
        + "\n    redirectData: " + toIndentedString(redirectData) + "\n}";
  }

  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
