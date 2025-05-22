package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing the details of a customer.
 */
@JsonPropertyOrder({
    Customer.JSON_PROPERTY_COMPANY_INFORMATION,
    Customer.JSON_PROPERTY_MERCHANT_CUSTOMER_ID,
    Customer.JSON_PROPERTY_BILLING_ADDRESS,
    Customer.JSON_PROPERTY_CONTACT_DETAILS,
    Customer.JSON_PROPERTY_FISCAL_NUMBER,
    Customer.JSON_PROPERTY_BUSINESS_RELATION,
    Customer.JSON_PROPERTY_LOCALE,
    Customer.JSON_PROPERTY_PERSONAL_INFORMATION
})
public class Customer implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_COMPANY_INFORMATION = "companyInformation";
  private CompanyInformation companyInformation;

  public static final String JSON_PROPERTY_MERCHANT_CUSTOMER_ID = "merchantCustomerId";
  private String merchantCustomerId;

  public static final String JSON_PROPERTY_BILLING_ADDRESS = "billingAddress";
  private Address billingAddress;

  public static final String JSON_PROPERTY_CONTACT_DETAILS = "contactDetails";
  private ContactDetails contactDetails;

  public static final String JSON_PROPERTY_FISCAL_NUMBER = "fiscalNumber";
  private String fiscalNumber;

  public static final String JSON_PROPERTY_BUSINESS_RELATION = "businessRelation";
  private BusinessRelation businessRelation;

  public static final String JSON_PROPERTY_LOCALE = "locale";
  private String locale;

  public static final String JSON_PROPERTY_PERSONAL_INFORMATION = "personalInformation";
  private PersonalInformation personalInformation;

  public Customer() {
  }

  public Customer companyInformation(CompanyInformation companyInformation) {

    this.companyInformation = companyInformation;
    return this;
  }

  /**
   * Get companyInformation
   * 
   * @return companyInformation
   **/

  @JsonProperty(JSON_PROPERTY_COMPANY_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CompanyInformation getCompanyInformation() {
    return companyInformation;
  }

  @JsonProperty(JSON_PROPERTY_COMPANY_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyInformation(CompanyInformation companyInformation) {
    this.companyInformation = companyInformation;
  }

  public Customer merchantCustomerId(String merchantCustomerId) {

    this.merchantCustomerId = merchantCustomerId;
    return this;
  }

  /**
   * Unique identifier for the customer.
   * 
   * @return merchantCustomerId
   **/

  @JsonProperty(JSON_PROPERTY_MERCHANT_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantCustomerId() {
    return merchantCustomerId;
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantCustomerId(String merchantCustomerId) {
    this.merchantCustomerId = merchantCustomerId;
  }

  public Customer billingAddress(Address billingAddress) {

    this.billingAddress = billingAddress;
    return this;
  }

  /**
   * Get billingAddress
   * 
   * @return billingAddress
   **/

  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Address getBillingAddress() {
    return billingAddress;
  }

  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }

  public Customer contactDetails(ContactDetails contactDetails) {

    this.contactDetails = contactDetails;
    return this;
  }

  /**
   * Get contactDetails
   * 
   * @return contactDetails
   **/

  @JsonProperty(JSON_PROPERTY_CONTACT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContactDetails getContactDetails() {
    return contactDetails;
  }

  @JsonProperty(JSON_PROPERTY_CONTACT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactDetails(ContactDetails contactDetails) {
    this.contactDetails = contactDetails;
  }

  public Customer fiscalNumber(String fiscalNumber) {

    this.fiscalNumber = fiscalNumber;
    return this;
  }

  /**
   * Fiscal registration number of the customer or the tax registration number of
   * the company for a business customer. Please find below specifics per country:
   * * Brazil - Consumer (CPF) with a length of 11 digits * Brazil - Company
   * (CNPJ) with a length of 14 digits * Denmark - Consumer (CPR-nummer or
   * personnummer) with a length of 10 digits * Finland - Consumer (Finnish:
   * henkilötunnus (abbreviated as HETU), Swedish: personbeteckning) with a length
   * of 11 characters * Norway - Consumer (fødselsnummer) with a length of 11
   * digits * Sweden - Consumer (personnummer) with a length of 10 or 12 digits
   * 
   * @return fiscalNumber
   **/

  @JsonProperty(JSON_PROPERTY_FISCAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFiscalNumber() {
    return fiscalNumber;
  }

  @JsonProperty(JSON_PROPERTY_FISCAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiscalNumber(String fiscalNumber) {
    this.fiscalNumber = fiscalNumber;
  }

  public Customer businessRelation(BusinessRelation businessRelation) {

    this.businessRelation = businessRelation;
    return this;
  }

  /**
   * Business relation to the customer. See {@link BusinessRelation} for possible
   * values.
   * Mandatory for PAYONE Buy Now, Pay Later payment methods:
   * - 3390 - PAYONE Secured Invoice
   * - 3391 - PAYONE Secured Installment
   * - 3392 - PAYONE Secured Direct Debit
   * 
   * @return businessRelation The relationship between business and customer (B2B
   *         or B2C)
   **/

  @JsonProperty(JSON_PROPERTY_BUSINESS_RELATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BusinessRelation getBusinessRelation() {
    return businessRelation;
  }

  @JsonProperty(JSON_PROPERTY_BUSINESS_RELATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessRelation(BusinessRelation businessRelation) {
    this.businessRelation = businessRelation;
  }

  public Customer locale(String locale) {

    this.locale = locale;
    return this;
  }

  /**
   * The locale that the customer should be addressed in (for 3rd parties). Note:
   * Only the language code is supported.
   * 
   * @return locale
   **/

  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocale() {
    return locale;
  }

  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocale(String locale) {
    this.locale = locale;
  }

  public Customer personalInformation(PersonalInformation personalInformation) {

    this.personalInformation = personalInformation;
    return this;
  }

  /**
   * Get personalInformation
   * 
   * @return personalInformation
   **/

  @JsonProperty(JSON_PROPERTY_PERSONAL_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PersonalInformation getPersonalInformation() {
    return personalInformation;
  }

  @JsonProperty(JSON_PROPERTY_PERSONAL_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPersonalInformation(PersonalInformation personalInformation) {
    this.personalInformation = personalInformation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.companyInformation, customer.companyInformation) &&
        Objects.equals(this.merchantCustomerId, customer.merchantCustomerId) &&
        Objects.equals(this.billingAddress, customer.billingAddress) &&
        Objects.equals(this.contactDetails, customer.contactDetails) &&
        Objects.equals(this.fiscalNumber, customer.fiscalNumber) &&
        Objects.equals(this.businessRelation, customer.businessRelation) &&
        Objects.equals(this.locale, customer.locale) &&
        Objects.equals(this.personalInformation, customer.personalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyInformation, merchantCustomerId, billingAddress, contactDetails, fiscalNumber,
        businessRelation, locale, personalInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    sb.append("    companyInformation: ").append(toIndentedString(companyInformation)).append("\n");
    sb.append("    merchantCustomerId: ").append(toIndentedString(merchantCustomerId)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
    sb.append("    fiscalNumber: ").append(toIndentedString(fiscalNumber)).append("\n");
    sb.append("    businessRelation: ").append(toIndentedString(businessRelation)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    personalInformation: ").append(toIndentedString(personalInformation)).append("\n");
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
