package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * To complete the Payment the completeFinancingMethodSpecificInput has to be
 * provided. At the moment it is only available for PAYONE Secured Installments
 * (paymentProductId 3391).
 */
@JsonPropertyOrder({
    CompleteFinancingPaymentMethodSpecificInput.JSON_PROPERTY_PAYMENT_PRODUCT_ID,
    CompleteFinancingPaymentMethodSpecificInput.JSON_PROPERTY_REQUIRES_APPROVAL,
    CompleteFinancingPaymentMethodSpecificInput.JSON_PROPERTY_PAYMENT_PRODUCT3391_SPECIFIC_INPUT
})
public class CompleteFinancingPaymentMethodSpecificInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT_ID = "paymentProductId";
  private Integer paymentProductId;

  public static final String JSON_PROPERTY_REQUIRES_APPROVAL = "requiresApproval";
  private Boolean requiresApproval;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT3391_SPECIFIC_INPUT = "paymentProduct3391SpecificInput";
  private PaymentProduct3391SpecificInput paymentProduct3391SpecificInput;

  public CompleteFinancingPaymentMethodSpecificInput() {
  }

  public CompleteFinancingPaymentMethodSpecificInput paymentProductId(Integer paymentProductId) {

    this.paymentProductId = paymentProductId;
    return this;
  }

  /**
   * Payment product identifier. Currently supported payment methods: * 3391 -
   * PAYONE Secured Installment
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

  public CompleteFinancingPaymentMethodSpecificInput requiresApproval(Boolean requiresApproval) {

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

  public CompleteFinancingPaymentMethodSpecificInput paymentProduct3391SpecificInput(
      PaymentProduct3391SpecificInput paymentProduct3391SpecificInput) {

    this.paymentProduct3391SpecificInput = paymentProduct3391SpecificInput;
    return this;
  }

  /**
   * Get paymentProduct3391SpecificInput
   * 
   * @return paymentProduct3391SpecificInput
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT3391_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentProduct3391SpecificInput getPaymentProduct3391SpecificInput() {
    return paymentProduct3391SpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT3391_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentProduct3391SpecificInput(PaymentProduct3391SpecificInput paymentProduct3391SpecificInput) {
    this.paymentProduct3391SpecificInput = paymentProduct3391SpecificInput;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompleteFinancingPaymentMethodSpecificInput completeFinancingPaymentMethodSpecificInput = (CompleteFinancingPaymentMethodSpecificInput) o;
    return Objects.equals(this.paymentProductId, completeFinancingPaymentMethodSpecificInput.paymentProductId) &&
        Objects.equals(this.requiresApproval, completeFinancingPaymentMethodSpecificInput.requiresApproval) &&
        Objects.equals(this.paymentProduct3391SpecificInput,
            completeFinancingPaymentMethodSpecificInput.paymentProduct3391SpecificInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentProductId, requiresApproval, paymentProduct3391SpecificInput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteFinancingPaymentMethodSpecificInput {\n");
    sb.append("    paymentProductId: ").append(toIndentedString(paymentProductId)).append("\n");
    sb.append("    requiresApproval: ").append(toIndentedString(requiresApproval)).append("\n");
    sb.append("    paymentProduct3391SpecificInput: ").append(toIndentedString(paymentProduct3391SpecificInput))
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
