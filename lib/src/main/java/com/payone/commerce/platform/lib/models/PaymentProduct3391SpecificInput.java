package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing specific information for PAYONE Secured Installments.
 */
@JsonPropertyOrder({
    PaymentProduct3391SpecificInput.JSON_PROPERTY_INSTALLMENT_OPTION_ID,
    PaymentProduct3391SpecificInput.JSON_PROPERTY_BANK_ACCOUNT_INFORMATION
})
public class PaymentProduct3391SpecificInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_INSTALLMENT_OPTION_ID = "installmentOptionId";
  private String installmentOptionId;

  public static final String JSON_PROPERTY_BANK_ACCOUNT_INFORMATION = "bankAccountInformation";
  private BankAccountInformation bankAccountInformation;

  public PaymentProduct3391SpecificInput() {
  }

  public PaymentProduct3391SpecificInput installmentOptionId(String installmentOptionId) {

    this.installmentOptionId = installmentOptionId;
    return this;
  }

  /**
   * ID of the selected installment option. Will be provided in the response of
   * the Order / Payment Execution request.
   * 
   * @return installmentOptionId
   **/

  @JsonProperty(JSON_PROPERTY_INSTALLMENT_OPTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInstallmentOptionId() {
    return installmentOptionId;
  }

  @JsonProperty(JSON_PROPERTY_INSTALLMENT_OPTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInstallmentOptionId(String installmentOptionId) {
    this.installmentOptionId = installmentOptionId;
  }

  public PaymentProduct3391SpecificInput bankAccountInformation(BankAccountInformation bankAccountInformation) {

    this.bankAccountInformation = bankAccountInformation;
    return this;
  }

  /**
   * Get bankAccountInformation
   * 
   * @return bankAccountInformation
   **/

  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankAccountInformation getBankAccountInformation() {
    return bankAccountInformation;
  }

  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankAccountInformation(BankAccountInformation bankAccountInformation) {
    this.bankAccountInformation = bankAccountInformation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProduct3391SpecificInput paymentProduct3391SpecificInput = (PaymentProduct3391SpecificInput) o;
    return Objects.equals(this.installmentOptionId, paymentProduct3391SpecificInput.installmentOptionId) &&
        Objects.equals(this.bankAccountInformation, paymentProduct3391SpecificInput.bankAccountInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installmentOptionId, bankAccountInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProduct3391SpecificInput {\n");
    sb.append("    installmentOptionId: ").append(toIndentedString(installmentOptionId)).append("\n");
    sb.append("    bankAccountInformation: ").append(toIndentedString(bankAccountInformation)).append("\n");
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
