package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ PaymentProduct840CustomerAccountForIntent.JSON_PROPERTY_COMPANY_NAME,
    PaymentProduct840CustomerAccountForIntent.JSON_PROPERTY_FIRST_NAME,
    PaymentProduct840CustomerAccountForIntent.JSON_PROPERTY_SURNAME,
    PaymentProduct840CustomerAccountForIntent.JSON_PROPERTY_EMAIL_ADDRESS })
public class PaymentProduct840CustomerAccountForIntent implements Serializable {
  private static final long serialVersionUID = 1L;
  public static final String JSON_PROPERTY_COMPANY_NAME = "companyName";
  private String companyName;
  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;
  public static final String JSON_PROPERTY_SURNAME = "surname";
  private String surname;
  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "emailAddress";
  private String emailAddress;

  public PaymentProduct840CustomerAccountForIntent companyName(String value) {
    companyName = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCompanyName() {
    return companyName;
  }

  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyName(String value) {
    companyName = value;
  }

  public PaymentProduct840CustomerAccountForIntent firstName(String value) {
    firstName = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFirstName() {
    return firstName;
  }

  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(String value) {
    firstName = value;
  }

  public PaymentProduct840CustomerAccountForIntent surname(String value) {
    surname = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_SURNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSurname() {
    return surname;
  }

  @JsonProperty(JSON_PROPERTY_SURNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSurname(String value) {
    surname = value;
  }

  public PaymentProduct840CustomerAccountForIntent emailAddress(String value) {
    emailAddress = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEmailAddress() {
    return emailAddress;
  }

  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailAddress(String value) {
    emailAddress = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProduct840CustomerAccountForIntent that = (PaymentProduct840CustomerAccountForIntent) o;
    return Objects.equals(companyName, that.companyName) && Objects.equals(firstName, that.firstName)
        && Objects.equals(surname, that.surname) && Objects.equals(emailAddress, that.emailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, firstName, surname, emailAddress);
  }

  @Override
  public String toString() {
    return "class PaymentProduct840CustomerAccountForIntent {\n    companyName: " + companyName
        + "\n    firstName: " + firstName + "\n    surname: " + surname + "\n    emailAddress: " + emailAddress
        + "\n}";
  }
}
