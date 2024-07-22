package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing information about the end customer&#39;s bank account.
 */
@JsonPropertyOrder({
    BankAccountInformation.JSON_PROPERTY_IBAN,
    BankAccountInformation.JSON_PROPERTY_ACCOUNT_HOLDER
})
public class BankAccountInformation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IBAN = "iban";
  private String iban;

  public static final String JSON_PROPERTY_ACCOUNT_HOLDER = "accountHolder";
  private String accountHolder;

  public BankAccountInformation() {
  }

  public BankAccountInformation iban(String iban) {

    this.iban = iban;
    return this;
  }

  /**
   * IBAN of the end customer&#39;s bank account. The IBAN is the International
   * Bank Account Number. It is an internationally agreed format for the BBAN and
   * includes the ISO country code and two check digits.
   * 
   * @return iban
   **/

  @JsonProperty(JSON_PROPERTY_IBAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIban() {
    return iban;
  }

  @JsonProperty(JSON_PROPERTY_IBAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIban(String iban) {
    this.iban = iban;
  }

  public BankAccountInformation accountHolder(String accountHolder) {

    this.accountHolder = accountHolder;
    return this;
  }

  /**
   * Account holder of the bank account with the given IBAN. Does not necessarily
   * have to be the end customer (e.g. joint accounts).
   * 
   * @return accountHolder
   **/

  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccountHolder() {
    return accountHolder;
  }

  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAccountInformation bankAccountInformation = (BankAccountInformation) o;
    return Objects.equals(this.iban, bankAccountInformation.iban) &&
        Objects.equals(this.accountHolder, bankAccountInformation.accountHolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iban, accountHolder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccountInformation {\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    accountHolder: ").append(toIndentedString(accountHolder)).append("\n");
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
