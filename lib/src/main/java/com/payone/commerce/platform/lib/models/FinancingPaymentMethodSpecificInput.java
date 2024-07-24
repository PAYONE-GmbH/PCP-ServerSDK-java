package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing the specific input details for financing payment methods
 * (Buy Now Pay Later)
 */
@JsonPropertyOrder({
    FinancingPaymentMethodSpecificInput.JSON_PROPERTY_PAYMENT_PRODUCT_ID,
    FinancingPaymentMethodSpecificInput.JSON_PROPERTY_REQUIRES_APPROVAL,
    FinancingPaymentMethodSpecificInput.JSON_PROPERTY_PAYMENT_PRODUCT3392_SPECIFIC_INPUT
})
public class FinancingPaymentMethodSpecificInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT_ID = "paymentProductId";
  private Integer paymentProductId;

  public static final String JSON_PROPERTY_REQUIRES_APPROVAL = "requiresApproval";
  private Boolean requiresApproval;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT3392_SPECIFIC_INPUT = "paymentProduct3392SpecificInput";
  private PaymentProduct3392SpecificInput paymentProduct3392SpecificInput;

  public FinancingPaymentMethodSpecificInput() {
  }

  public FinancingPaymentMethodSpecificInput paymentProductId(Integer paymentProductId) {

    this.paymentProductId = paymentProductId;
    return this;
  }

  /**
   * Payment product identifier - please check product documentation for a full
   * overview of possible values. Currently supported payment methods * 3390 -
   * PAYONE Secured Invoice * 3391 - PAYONE Secured Installment * 3392 - PAYONE
   * Secured Direct Debit
   * minimum: 0
   * maximum: 99999
   * 
   * @return paymentProductId
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPaymentProductId() {
    return paymentProductId;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentProductId(Integer paymentProductId) {
    this.paymentProductId = paymentProductId;
  }

  public FinancingPaymentMethodSpecificInput requiresApproval(Boolean requiresApproval) {

    this.requiresApproval = requiresApproval;
    return this;
  }

  /**
   * * true &#x3D; the payment requires approval before the funds will be captured
   * using the Approve payment or Capture payment API * false &#x3D; the payment
   * does not require approval, and the funds will be captured automatically If
   * the parameter is not provided in the request, the default value will be true
   * 
   * @return requiresApproval
   **/

  @JsonProperty(JSON_PROPERTY_REQUIRES_APPROVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequiresApproval() {
    return requiresApproval;
  }

  @JsonProperty(JSON_PROPERTY_REQUIRES_APPROVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequiresApproval(Boolean requiresApproval) {
    this.requiresApproval = requiresApproval;
  }

  public FinancingPaymentMethodSpecificInput paymentProduct3392SpecificInput(
      PaymentProduct3392SpecificInput paymentProduct3392SpecificInput) {

    this.paymentProduct3392SpecificInput = paymentProduct3392SpecificInput;
    return this;
  }

  /**
   * Get paymentProduct3392SpecificInput
   * 
   * @return paymentProduct3392SpecificInput
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT3392_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentProduct3392SpecificInput getPaymentProduct3392SpecificInput() {
    return paymentProduct3392SpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT3392_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentProduct3392SpecificInput(PaymentProduct3392SpecificInput paymentProduct3392SpecificInput) {
    this.paymentProduct3392SpecificInput = paymentProduct3392SpecificInput;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancingPaymentMethodSpecificInput financingPaymentMethodSpecificInput = (FinancingPaymentMethodSpecificInput) o;
    return Objects.equals(this.paymentProductId, financingPaymentMethodSpecificInput.paymentProductId) &&
        Objects.equals(this.requiresApproval, financingPaymentMethodSpecificInput.requiresApproval) &&
        Objects.equals(this.paymentProduct3392SpecificInput,
            financingPaymentMethodSpecificInput.paymentProduct3392SpecificInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentProductId, requiresApproval, paymentProduct3392SpecificInput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancingPaymentMethodSpecificInput {\n");
    sb.append("    paymentProductId: ").append(toIndentedString(paymentProductId)).append("\n");
    sb.append("    requiresApproval: ").append(toIndentedString(requiresApproval)).append("\n");
    sb.append("    paymentProduct3392SpecificInput: ").append(toIndentedString(paymentProduct3392SpecificInput))
        .append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
