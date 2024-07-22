package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing specific information for PAYONE Secured Direct. Debit.
 */
@JsonPropertyOrder({
    PaymentProduct3392SpecificInput.JSON_PROPERTY_BANK_ACCOUNT_INFORMATION
})
public class PaymentProduct3392SpecificInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_BANK_ACCOUNT_INFORMATION = "bankAccountInformation";
  private BankAccountInformation bankAccountInformation;

  public PaymentProduct3392SpecificInput() {
  }

  public PaymentProduct3392SpecificInput bankAccountInformation(BankAccountInformation bankAccountInformation) {

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
    PaymentProduct3392SpecificInput paymentProduct3392SpecificInput = (PaymentProduct3392SpecificInput) o;
    return Objects.equals(this.bankAccountInformation, paymentProduct3392SpecificInput.bankAccountInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccountInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProduct3392SpecificInput {\n");
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
