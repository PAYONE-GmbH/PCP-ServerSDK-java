package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ RedirectPaymentMethodSpecificInputForIntent.JSON_PROPERTY_REQUIRES_APPROVAL,
    RedirectPaymentMethodSpecificInputForIntent.JSON_PROPERTY_PAYMENT_PRODUCT_ID,
    RedirectPaymentMethodSpecificInputForIntent.JSON_PROPERTY_PAYMENT_PRODUCT840_SPECIFIC_INPUT,
    RedirectPaymentMethodSpecificInputForIntent.JSON_PROPERTY_REDIRECTION_DATA })
public class RedirectPaymentMethodSpecificInputForIntent implements Serializable {
  private static final long serialVersionUID = 1L;
  public static final String JSON_PROPERTY_REQUIRES_APPROVAL = "requiresApproval";
  private Boolean requiresApproval;
  public static final String JSON_PROPERTY_PAYMENT_PRODUCT_ID = "paymentProductId";
  private Integer paymentProductId;
  public static final String JSON_PROPERTY_PAYMENT_PRODUCT840_SPECIFIC_INPUT = "paymentProduct840SpecificInput";
  private RedirectPaymentProduct840SpecificInputData paymentProduct840SpecificInput;
  public static final String JSON_PROPERTY_REDIRECTION_DATA = "redirectionData";
  private RedirectionData redirectionData;

  public RedirectPaymentMethodSpecificInputForIntent() {
  }

  public RedirectPaymentMethodSpecificInputForIntent requiresApproval(Boolean value) {
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

  public RedirectPaymentMethodSpecificInputForIntent paymentProductId(Integer value) {
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

  public RedirectPaymentMethodSpecificInputForIntent paymentProduct840SpecificInput(
      RedirectPaymentProduct840SpecificInputData value) {
    paymentProduct840SpecificInput = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT840_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RedirectPaymentProduct840SpecificInputData getPaymentProduct840SpecificInput() {
    return paymentProduct840SpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT840_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentProduct840SpecificInput(RedirectPaymentProduct840SpecificInputData value) {
    paymentProduct840SpecificInput = value;
  }

  public RedirectPaymentMethodSpecificInputForIntent redirectionData(RedirectionData value) {
    redirectionData = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_REDIRECTION_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RedirectionData getRedirectionData() {
    return redirectionData;
  }

  @JsonProperty(JSON_PROPERTY_REDIRECTION_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectionData(RedirectionData value) {
    redirectionData = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    RedirectPaymentMethodSpecificInputForIntent that = (RedirectPaymentMethodSpecificInputForIntent) o;
    return Objects.equals(requiresApproval, that.requiresApproval)
        && Objects.equals(paymentProductId, that.paymentProductId)
        && Objects.equals(paymentProduct840SpecificInput, that.paymentProduct840SpecificInput)
        && Objects.equals(redirectionData, that.redirectionData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiresApproval, paymentProductId, paymentProduct840SpecificInput, redirectionData);
  }

  @Override
  public String toString() {
    return "class RedirectPaymentMethodSpecificInputForIntent {\n    requiresApproval: "
        + toIndentedString(requiresApproval) + "\n    paymentProductId: " + toIndentedString(paymentProductId)
        + "\n    paymentProduct840SpecificInput: " + toIndentedString(paymentProduct840SpecificInput)
        + "\n    redirectionData: " + toIndentedString(redirectionData) + "\n}";
  }

  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
