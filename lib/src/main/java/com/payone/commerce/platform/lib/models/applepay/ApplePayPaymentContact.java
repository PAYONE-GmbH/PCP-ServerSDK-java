package com.payone.commerce.platform.lib.models.applepay;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The result of authorizing a payment request that contains payment
 * information.
 * 
 * Data in PaymentToken is encrypted. Billing and shipping contact data are not
 * encrypted.
 */
@JsonPropertyOrder({
        ApplePayPaymentContact.JSON_PROPERTY_PHONE_NUMBER,
        ApplePayPaymentContact.JSON_PROPERTY_EMAIL_ADDRESS,
        ApplePayPaymentContact.JSON_PROPERTY_GIVEN_NAME,
        ApplePayPaymentContact.JSON_PROPERTY_FAMILY_NAME,
        ApplePayPaymentContact.JSON_PROPERTY_PHONETIC_GIVEN_NAME,
        ApplePayPaymentContact.JSON_PROPERTY_PHONETIC_FAMILY_NAME,
        ApplePayPaymentContact.JSON_PROPERTY_ADDRESS_LINES,
        ApplePayPaymentContact.JSON_PROPERTY_LOCALITY,
        ApplePayPaymentContact.JSON_PROPERTY_POSTAL_CODE,
        ApplePayPaymentContact.JSON_PROPERTY_ADMINISTRATIVE_AREA,
        ApplePayPaymentContact.JSON_PROPERTY_SUB_ADMINISTRATIVE_AREA,
        ApplePayPaymentContact.JSON_PROPERTY_COUNTRY,
        ApplePayPaymentContact.JSON_PROPERTY_COUNTRY_CODE
})
public class ApplePayPaymentContact implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String JSON_PROPERTY_PHONE_NUMBER = "phoneNumber";
    private String phoneNumber;

    public static final String JSON_PROPERTY_EMAIL_ADDRESS = "emailAddress";
    private String emailAddress;

    public static final String JSON_PROPERTY_GIVEN_NAME = "givenName";
    private String givenName;

    public static final String JSON_PROPERTY_FAMILY_NAME = "familyName";
    private String familyName;

    public static final String JSON_PROPERTY_PHONETIC_GIVEN_NAME = "phoneticGivenName";
    private String phoneticGivenName;

    public static final String JSON_PROPERTY_PHONETIC_FAMILY_NAME = "phoneticFamilyName";
    private String phoneticFamilyName;

    public static final String JSON_PROPERTY_ADDRESS_LINES = "addressLines";
    private List<String> addressLines;

    public static final String JSON_PROPERTY_LOCALITY = "locality";
    private String locality;

    public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
    private String postalCode;

    public static final String JSON_PROPERTY_ADMINISTRATIVE_AREA = "administrativeArea";
    private String administrativeArea;

    public static final String JSON_PROPERTY_SUB_ADMINISTRATIVE_AREA = "subAdministrativeArea";
    private String subAdministrativeArea;

    public static final String JSON_PROPERTY_COUNTRY = "country";
    private String country;

    public static final String JSON_PROPERTY_COUNTRY_CODE = "countryCode";
    private String countryCode;

    public ApplePayPaymentContact() {
    }

    public ApplePayPaymentContact(String phoneNumber, String emailAddress, String givenName, String familyName,
            String phoneticGivenName, String phoneticFamilyName, List<String> addressLines,
            String locality, String postalCode, String administrativeArea,
            String subAdministrativeArea, String country, String countryCode) {
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.givenName = givenName;
        this.familyName = familyName;
        this.phoneticGivenName = phoneticGivenName;
        this.phoneticFamilyName = phoneticFamilyName;
        this.addressLines = addressLines;
        this.locality = locality;
        this.postalCode = postalCode;
        this.administrativeArea = administrativeArea;
        this.subAdministrativeArea = subAdministrativeArea;
        this.country = country;
        this.countryCode = countryCode;
    }

    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getEmailAddress() {
        return emailAddress;
    }

    @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getGivenName() {
        return givenName;
    }

    @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getFamilyName() {
        return familyName;
    }

    @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @JsonProperty(JSON_PROPERTY_PHONETIC_GIVEN_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPhoneticGivenName() {
        return phoneticGivenName;
    }

    @JsonProperty(JSON_PROPERTY_PHONETIC_GIVEN_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPhoneticGivenName(String phoneticGivenName) {
        this.phoneticGivenName = phoneticGivenName;
    }

    @JsonProperty(JSON_PROPERTY_PHONETIC_FAMILY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPhoneticFamilyName() {
        return phoneticFamilyName;
    }

    @JsonProperty(JSON_PROPERTY_PHONETIC_FAMILY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPhoneticFamilyName(String phoneticFamilyName) {
        this.phoneticFamilyName = phoneticFamilyName;
    }

    @JsonProperty(JSON_PROPERTY_ADDRESS_LINES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getAddressLines() {
        return addressLines;
    }

    @JsonProperty(JSON_PROPERTY_ADDRESS_LINES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
    }

    @JsonProperty(JSON_PROPERTY_LOCALITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getLocality() {
        return locality;
    }

    @JsonProperty(JSON_PROPERTY_LOCALITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLocality(String locality) {
        this.locality = locality;
    }

    @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty(JSON_PROPERTY_ADMINISTRATIVE_AREA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAdministrativeArea() {
        return administrativeArea;
    }

    @JsonProperty(JSON_PROPERTY_ADMINISTRATIVE_AREA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAdministrativeArea(String administrativeArea) {
        this.administrativeArea = administrativeArea;
    }

    @JsonProperty(JSON_PROPERTY_SUB_ADMINISTRATIVE_AREA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSubAdministrativeArea() {
        return subAdministrativeArea;
    }

    @JsonProperty(JSON_PROPERTY_SUB_ADMINISTRATIVE_AREA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSubAdministrativeArea(String subAdministrativeArea) {
        this.subAdministrativeArea = subAdministrativeArea;
    }

    @JsonProperty(JSON_PROPERTY_COUNTRY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCountry() {
        return country;
    }

    @JsonProperty(JSON_PROPERTY_COUNTRY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplePayPaymentContact that = (ApplePayPaymentContact) o;
        return Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(emailAddress, that.emailAddress) &&
                Objects.equals(givenName, that.givenName) &&
                Objects.equals(familyName, that.familyName) &&
                Objects.equals(phoneticGivenName, that.phoneticGivenName) &&
                Objects.equals(phoneticFamilyName, that.phoneticFamilyName) &&
                Objects.equals(addressLines, that.addressLines) &&
                Objects.equals(locality, that.locality) &&
                Objects.equals(postalCode, that.postalCode) &&
                Objects.equals(administrativeArea, that.administrativeArea) &&
                Objects.equals(subAdministrativeArea, that.subAdministrativeArea) &&
                Objects.equals(country, that.country) &&
                Objects.equals(countryCode, that.countryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, emailAddress, givenName, familyName, phoneticGivenName, phoneticFamilyName,
                addressLines, locality, postalCode, administrativeArea, subAdministrativeArea, country, countryCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentContact {\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
        sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
        sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
        sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
        sb.append("    phoneticGivenName: ").append(toIndentedString(phoneticGivenName)).append("\n");
        sb.append("    phoneticFamilyName: ").append(toIndentedString(phoneticFamilyName)).append("\n");
        sb.append("    addressLines: ").append(toIndentedString(addressLines)).append("\n");
        sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
        sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
        sb.append("    subAdministrativeArea: ").append(toIndentedString(subAdministrativeArea)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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
