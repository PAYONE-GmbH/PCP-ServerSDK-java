package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing the details of the PayPal account.
 */
@JsonPropertyOrder({
    PaymentProduct840CustomerAccount.JSON_PROPERTY_COMPANY_NAME,
    PaymentProduct840CustomerAccount.JSON_PROPERTY_FIRST_NAME,
    PaymentProduct840CustomerAccount.JSON_PROPERTY_PAYER_ID,
    PaymentProduct840CustomerAccount.JSON_PROPERTY_SURNAME
})
public class PaymentProduct840CustomerAccount implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_COMPANY_NAME = "companyName";
  private String companyName;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_PAYER_ID = "payerId";
  private String payerId;

  public static final String JSON_PROPERTY_SURNAME = "surname";
  private String surname;

  public PaymentProduct840CustomerAccount() {
  }

  public PaymentProduct840CustomerAccount companyName(String companyName) {

    this.companyName = companyName;
    return this;
  }

  /**
   * Name of the company in case the PayPal account is owned by a business
   * 
   * @return companyName
   **/

  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyName() {
    return companyName;
  }

  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public PaymentProduct840CustomerAccount firstName(String firstName) {

    this.firstName = firstName;
    return this;
  }

  /**
   * First name of the PayPal account holder
   * 
   * @return firstName
   **/

  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }

  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PaymentProduct840CustomerAccount payerId(String payerId) {

    this.payerId = payerId;
    return this;
  }

  /**
   * The unique identifier of a PayPal account and will never change in the life
   * cycle of a PayPal account.
   * 
   * @return payerId
   **/

  @JsonProperty(JSON_PROPERTY_PAYER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayerId() {
    return payerId;
  }

  @JsonProperty(JSON_PROPERTY_PAYER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayerId(String payerId) {
    this.payerId = payerId;
  }

  public PaymentProduct840CustomerAccount surname(String surname) {

    this.surname = surname;
    return this;
  }

  /**
   * Surname of the PayPal account holder
   * 
   * @return surname
   **/

  @JsonProperty(JSON_PROPERTY_SURNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSurname() {
    return surname;
  }

  @JsonProperty(JSON_PROPERTY_SURNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSurname(String surname) {
    this.surname = surname;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProduct840CustomerAccount paymentProduct840CustomerAccount = (PaymentProduct840CustomerAccount) o;
    return Objects.equals(this.companyName, paymentProduct840CustomerAccount.companyName) &&
        Objects.equals(this.firstName, paymentProduct840CustomerAccount.firstName) &&
        Objects.equals(this.payerId, paymentProduct840CustomerAccount.payerId) &&
        Objects.equals(this.surname, paymentProduct840CustomerAccount.surname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, firstName, payerId, surname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProduct840CustomerAccount {\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    payerId: ").append(toIndentedString(payerId)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
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
