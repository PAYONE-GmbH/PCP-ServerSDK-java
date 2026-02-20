package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Request to initiate refund for a Payment Information of Checkout. It is
 * possible to initiate multiple partial refunds by providing an amount that is
 * lower than the total captured amount of the Payment Information.
 */
@JsonPropertyOrder({
    PaymentInformationRefundRequest.JSON_PROPERTY_AMOUNT_OF_MONEY,
    PaymentInformationRefundRequest.JSON_PROPERTY_REFERENCES,
    PaymentInformationRefundRequest.JSON_PROPERTY_ACCOUNT_HOLDER
})

public class PaymentInformationRefundRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AMOUNT_OF_MONEY = "amountOfMoney";

  private PositiveAmountOfMoney amountOfMoney;

  public static final String JSON_PROPERTY_REFERENCES = "references";

  private PaymentReferences references;

  public static final String JSON_PROPERTY_ACCOUNT_HOLDER = "accountHolder";

  private String accountHolder;

  public PaymentInformationRefundRequest() {
  }

  public PaymentInformationRefundRequest amountOfMoney(PositiveAmountOfMoney amountOfMoney) {
    this.amountOfMoney = amountOfMoney;
    return this;
  }

  /**
   * Get amountOfMoney
   * 
   * @return amountOfMoney
   */

  @JsonProperty(JSON_PROPERTY_AMOUNT_OF_MONEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public PositiveAmountOfMoney getAmountOfMoney() {
    return amountOfMoney;
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT_OF_MONEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmountOfMoney(PositiveAmountOfMoney amountOfMoney) {
    this.amountOfMoney = amountOfMoney;
  }

  public PaymentInformationRefundRequest references(PaymentReferences references) {
    this.references = references;
    return this;
  }

  /**
   * Get references
   * 
   * @return references
   */

  @JsonProperty(JSON_PROPERTY_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PaymentReferences getReferences() {
    return references;
  }

  @JsonProperty(JSON_PROPERTY_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferences(PaymentReferences references) {
    this.references = references;
  }

  public PaymentInformationRefundRequest accountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
    return this;
  }

  /**
   * Account holder of the bank account. Does not necessarily have to be the
   * customer (e.g. joint accounts). The name of the account holder is required
   * for payment methods that will use a credit transfer for the refund (e.g.
   * girocard, SEPA Direct Debit)
   * 
   * @return accountHolder
   */

  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountHolder() {
    return accountHolder;
  }

  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
  }

  /**
   * Return true if this PaymentInformationRefundRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInformationRefundRequest paymentInformationRefundRequest = (PaymentInformationRefundRequest) o;
    return Objects.equals(this.amountOfMoney, paymentInformationRefundRequest.amountOfMoney) &&
        Objects.equals(this.references, paymentInformationRefundRequest.references) &&
        Objects.equals(this.accountHolder, paymentInformationRefundRequest.accountHolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountOfMoney, references, accountHolder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInformationRefundRequest {\n");
    sb.append("    amountOfMoney: ").append(toIndentedString(amountOfMoney)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
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
