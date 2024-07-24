package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * InstallmentOption
 */
@JsonPropertyOrder({
    InstallmentOption.JSON_PROPERTY_INSTALLMENT_OPTION_ID,
    InstallmentOption.JSON_PROPERTY_NUMBER_OF_PAYMENTS,
    InstallmentOption.JSON_PROPERTY_MONTHLY_AMOUNT,
    InstallmentOption.JSON_PROPERTY_LAST_RATE_AMOUNT,
    InstallmentOption.JSON_PROPERTY_EFFECTIVE_INTEREST_RATE,
    InstallmentOption.JSON_PROPERTY_NOMINAL_INTEREST_RATE,
    InstallmentOption.JSON_PROPERTY_TOTAL_AMOUNT,
    InstallmentOption.JSON_PROPERTY_FIRST_RATE_DATE,
    InstallmentOption.JSON_PROPERTY_CREDIT_INFORMATION
})
public class InstallmentOption implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_INSTALLMENT_OPTION_ID = "installmentOptionId";
  private String installmentOptionId;

  public static final String JSON_PROPERTY_NUMBER_OF_PAYMENTS = "numberOfPayments";
  private Integer numberOfPayments;

  public static final String JSON_PROPERTY_MONTHLY_AMOUNT = "monthlyAmount";
  private AmountOfMoney monthlyAmount;

  public static final String JSON_PROPERTY_LAST_RATE_AMOUNT = "lastRateAmount";
  private AmountOfMoney lastRateAmount;

  public static final String JSON_PROPERTY_EFFECTIVE_INTEREST_RATE = "effectiveInterestRate";
  private Integer effectiveInterestRate;

  public static final String JSON_PROPERTY_NOMINAL_INTEREST_RATE = "nominalInterestRate";
  private Integer nominalInterestRate;

  public static final String JSON_PROPERTY_TOTAL_AMOUNT = "totalAmount";
  private AmountOfMoney totalAmount;

  public static final String JSON_PROPERTY_FIRST_RATE_DATE = "firstRateDate";
  private String firstRateDate;

  public static final String JSON_PROPERTY_CREDIT_INFORMATION = "creditInformation";
  private LinkInformation creditInformation;

  public InstallmentOption() {
  }

  public InstallmentOption installmentOptionId(String installmentOptionId) {

    this.installmentOptionId = installmentOptionId;
    return this;
  }

  /**
   * Installment option Identifier. Use this in the Complete Payment for the
   * selected installment option.
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

  public InstallmentOption numberOfPayments(Integer numberOfPayments) {

    this.numberOfPayments = numberOfPayments;
    return this;
  }

  /**
   * The number of monthly payments for this installment.
   * 
   * @return numberOfPayments
   **/

  @JsonProperty(JSON_PROPERTY_NUMBER_OF_PAYMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getNumberOfPayments() {
    return numberOfPayments;
  }

  @JsonProperty(JSON_PROPERTY_NUMBER_OF_PAYMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNumberOfPayments(Integer numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
  }

  public InstallmentOption monthlyAmount(AmountOfMoney monthlyAmount) {

    this.monthlyAmount = monthlyAmount;
    return this;
  }

  /**
   * Monthly rate amount.
   * 
   * @return monthlyAmount
   **/

  @JsonProperty(JSON_PROPERTY_MONTHLY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AmountOfMoney getMonthlyAmount() {
    return monthlyAmount;
  }

  @JsonProperty(JSON_PROPERTY_MONTHLY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMonthlyAmount(AmountOfMoney monthlyAmount) {
    this.monthlyAmount = monthlyAmount;
  }

  public InstallmentOption lastRateAmount(AmountOfMoney lastRateAmount) {

    this.lastRateAmount = lastRateAmount;
    return this;
  }

  /**
   * Last rate amount.
   * 
   * @return lastRateAmount
   **/

  @JsonProperty(JSON_PROPERTY_LAST_RATE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AmountOfMoney getLastRateAmount() {
    return lastRateAmount;
  }

  @JsonProperty(JSON_PROPERTY_LAST_RATE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastRateAmount(AmountOfMoney lastRateAmount) {
    this.lastRateAmount = lastRateAmount;
  }

  public InstallmentOption effectiveInterestRate(Integer effectiveInterestRate) {

    this.effectiveInterestRate = effectiveInterestRate;
    return this;
  }

  /**
   * Effective interest amount in percent with two decimals.
   * 
   * @return effectiveInterestRate
   **/

  @JsonProperty(JSON_PROPERTY_EFFECTIVE_INTEREST_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getEffectiveInterestRate() {
    return effectiveInterestRate;
  }

  @JsonProperty(JSON_PROPERTY_EFFECTIVE_INTEREST_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEffectiveInterestRate(Integer effectiveInterestRate) {
    this.effectiveInterestRate = effectiveInterestRate;
  }

  public InstallmentOption nominalInterestRate(Integer nominalInterestRate) {

    this.nominalInterestRate = nominalInterestRate;
    return this;
  }

  /**
   * Nominal interest amount in percent with two decimals.
   * 
   * @return nominalInterestRate
   **/

  @JsonProperty(JSON_PROPERTY_NOMINAL_INTEREST_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getNominalInterestRate() {
    return nominalInterestRate;
  }

  @JsonProperty(JSON_PROPERTY_NOMINAL_INTEREST_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNominalInterestRate(Integer nominalInterestRate) {
    this.nominalInterestRate = nominalInterestRate;
  }

  public InstallmentOption totalAmount(AmountOfMoney totalAmount) {

    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Total rate amount.
   * 
   * @return totalAmount
   **/

  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AmountOfMoney getTotalAmount() {
    return totalAmount;
  }

  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalAmount(AmountOfMoney totalAmount) {
    this.totalAmount = totalAmount;
  }

  public InstallmentOption firstRateDate(String firstRateDate) {

    this.firstRateDate = firstRateDate;
    return this;
  }

  /**
   * Due date of first rate. Format: YYYYMMDD
   * 
   * @return firstRateDate
   **/

  @JsonProperty(JSON_PROPERTY_FIRST_RATE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFirstRateDate() {
    return firstRateDate;
  }

  @JsonProperty(JSON_PROPERTY_FIRST_RATE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFirstRateDate(String firstRateDate) {
    this.firstRateDate = firstRateDate;
  }

  public InstallmentOption creditInformation(LinkInformation creditInformation) {

    this.creditInformation = creditInformation;
    return this;
  }

  /**
   * Link with credit information.
   * 
   * @return creditInformation
   **/

  @JsonProperty(JSON_PROPERTY_CREDIT_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LinkInformation getCreditInformation() {
    return creditInformation;
  }

  @JsonProperty(JSON_PROPERTY_CREDIT_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreditInformation(LinkInformation creditInformation) {
    this.creditInformation = creditInformation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallmentOption installmentOption = (InstallmentOption) o;
    return Objects.equals(this.installmentOptionId, installmentOption.installmentOptionId) &&
        Objects.equals(this.numberOfPayments, installmentOption.numberOfPayments) &&
        Objects.equals(this.monthlyAmount, installmentOption.monthlyAmount) &&
        Objects.equals(this.lastRateAmount, installmentOption.lastRateAmount) &&
        Objects.equals(this.effectiveInterestRate, installmentOption.effectiveInterestRate) &&
        Objects.equals(this.nominalInterestRate, installmentOption.nominalInterestRate) &&
        Objects.equals(this.totalAmount, installmentOption.totalAmount) &&
        Objects.equals(this.firstRateDate, installmentOption.firstRateDate) &&
        Objects.equals(this.creditInformation, installmentOption.creditInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installmentOptionId, numberOfPayments, monthlyAmount, lastRateAmount, effectiveInterestRate,
        nominalInterestRate, totalAmount, firstRateDate, creditInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentOption {\n");
    sb.append("    installmentOptionId: ").append(toIndentedString(installmentOptionId)).append("\n");
    sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
    sb.append("    monthlyAmount: ").append(toIndentedString(monthlyAmount)).append("\n");
    sb.append("    lastRateAmount: ").append(toIndentedString(lastRateAmount)).append("\n");
    sb.append("    effectiveInterestRate: ").append(toIndentedString(effectiveInterestRate)).append("\n");
    sb.append("    nominalInterestRate: ").append(toIndentedString(nominalInterestRate)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    firstRateDate: ").append(toIndentedString(firstRateDate)).append("\n");
    sb.append("    creditInformation: ").append(toIndentedString(creditInformation)).append("\n");
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
