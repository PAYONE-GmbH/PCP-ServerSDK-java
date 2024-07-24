package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing amount and ISO currency code attributes
 */
@JsonPropertyOrder({
    PositiveAmountOfMoney.JSON_PROPERTY_AMOUNT,
    PositiveAmountOfMoney.JSON_PROPERTY_CURRENCY_CODE
})
public class PositiveAmountOfMoney implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Long amount;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "currencyCode";
  private String currencyCode;

  public PositiveAmountOfMoney() {
  }

  public PositiveAmountOfMoney amount(Long amount) {

    this.amount = amount;
    return this;
  }

  /**
   * Amount in cents and always having 2 decimals
   * minimum: 1
   * maximum: 999999999999
   * 
   * @return amount
   **/

  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAmount() {
    return amount;
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public PositiveAmountOfMoney currencyCode(String currencyCode) {

    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Three-letter ISO currency code representing the currency for the amount
   * 
   * @return currencyCode
   **/

  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrencyCode() {
    return currencyCode;
  }

  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositiveAmountOfMoney positiveAmountOfMoney = (PositiveAmountOfMoney) o;
    return Objects.equals(this.amount, positiveAmountOfMoney.amount) &&
        Objects.equals(this.currencyCode, positiveAmountOfMoney.currencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositiveAmountOfMoney {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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
