package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing the specific input details for SEPA credit transfers
 * excluding cross-border ones
 */
@JsonPropertyOrder({
    SepaTransferPaymentProduct772SpecificInput.JSON_PROPERTY_BANK_ACCOUNT_INFORMATION
})

public class SepaTransferPaymentProduct772SpecificInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_BANK_ACCOUNT_INFORMATION = "bankAccountInformation";

  private BankAccountInformation bankAccountInformation;

  public SepaTransferPaymentProduct772SpecificInput() {
  }

  public SepaTransferPaymentProduct772SpecificInput bankAccountInformation(
      BankAccountInformation bankAccountInformation) {
    this.bankAccountInformation = bankAccountInformation;
    return this;
  }

  /**
   * Get bankAccountInformation
   * 
   * @return bankAccountInformation
   */

  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BankAccountInformation getBankAccountInformation() {
    return bankAccountInformation;
  }

  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankAccountInformation(BankAccountInformation bankAccountInformation) {
    this.bankAccountInformation = bankAccountInformation;
  }

  /**
   * Return true if this SepaTransferPaymentProduct772SpecificInput object is
   * equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SepaTransferPaymentProduct772SpecificInput sepaTransferPaymentProduct772SpecificInput = (SepaTransferPaymentProduct772SpecificInput) o;
    return Objects.equals(this.bankAccountInformation,
        sepaTransferPaymentProduct772SpecificInput.bankAccountInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccountInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SepaTransferPaymentProduct772SpecificInput {\n");
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
