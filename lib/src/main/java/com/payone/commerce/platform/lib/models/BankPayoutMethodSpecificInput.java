package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing the specific input details for SEPA tranfers
 */
@JsonPropertyOrder({
    BankPayoutMethodSpecificInput.JSON_PROPERTY_PAYMENT_PRODUCT_ID,
    BankPayoutMethodSpecificInput.JSON_PROPERTY_PAYMENT_PRODUCT772_SPECIFIC_INPUT
})

public class BankPayoutMethodSpecificInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT_ID = "paymentProductId";

  private Integer paymentProductId;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT772_SPECIFIC_INPUT = "paymentProduct772SpecificInput";

  private SepaTransferPaymentProduct772SpecificInput paymentProduct772SpecificInput;

  public BankPayoutMethodSpecificInput() {
  }

  public BankPayoutMethodSpecificInput paymentProductId(Integer paymentProductId) {
    this.paymentProductId = paymentProductId;
    return this;
  }

  /**
   * Payment product identifier - please check product documentation for a full
   * overview of possible values.
   * minimum: 0
   * maximum: 99999
   * 
   * @return paymentProductId
   */

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

  public BankPayoutMethodSpecificInput paymentProduct772SpecificInput(
      SepaTransferPaymentProduct772SpecificInput paymentProduct772SpecificInput) {
    this.paymentProduct772SpecificInput = paymentProduct772SpecificInput;
    return this;
  }

  /**
   * Get paymentProduct772SpecificInput
   * 
   * @return paymentProduct772SpecificInput
   */

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT772_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SepaTransferPaymentProduct772SpecificInput getPaymentProduct772SpecificInput() {
    return paymentProduct772SpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT772_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentProduct772SpecificInput(
      SepaTransferPaymentProduct772SpecificInput paymentProduct772SpecificInput) {
    this.paymentProduct772SpecificInput = paymentProduct772SpecificInput;
  }

  /**
   * Return true if this BankPayoutMethodSpecificInput object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankPayoutMethodSpecificInput bankPayoutMethodSpecificInput = (BankPayoutMethodSpecificInput) o;
    return Objects.equals(this.paymentProductId, bankPayoutMethodSpecificInput.paymentProductId) &&
        Objects.equals(this.paymentProduct772SpecificInput,
            bankPayoutMethodSpecificInput.paymentProduct772SpecificInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentProductId, paymentProduct772SpecificInput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankPayoutMethodSpecificInput {\n");
    sb.append("    paymentProductId: ").append(toIndentedString(paymentProductId)).append("\n");
    sb.append("    paymentProduct772SpecificInput: ").append(toIndentedString(paymentProduct772SpecificInput))
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
