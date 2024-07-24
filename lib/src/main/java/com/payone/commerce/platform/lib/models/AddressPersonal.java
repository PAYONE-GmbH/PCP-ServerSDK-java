package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing personal or shipping address information.
 */
@JsonPropertyOrder({
    AddressPersonal.JSON_PROPERTY_ADDITIONAL_INFO,
    AddressPersonal.JSON_PROPERTY_CITY,
    AddressPersonal.JSON_PROPERTY_COUNTRY_CODE,
    AddressPersonal.JSON_PROPERTY_HOUSE_NUMBER,
    AddressPersonal.JSON_PROPERTY_STATE,
    AddressPersonal.JSON_PROPERTY_STREET,
    AddressPersonal.JSON_PROPERTY_ZIP,
    AddressPersonal.JSON_PROPERTY_NAME
})
public class AddressPersonal implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
  private String additionalInfo;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "countryCode";
  private String countryCode;

  public static final String JSON_PROPERTY_HOUSE_NUMBER = "houseNumber";
  private String houseNumber;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_STREET = "street";
  private String street;

  public static final String JSON_PROPERTY_ZIP = "zip";
  private String zip;

  public static final String JSON_PROPERTY_NAME = "name";
  private PersonalName name;

  public AddressPersonal() {
  }

  public AddressPersonal additionalInfo(String additionalInfo) {

    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Second line of street or additional address information such as apartments
   * and suits
   * 
   * @return additionalInfo
   **/

  @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdditionalInfo() {
    return additionalInfo;
  }

  @JsonProperty(JSON_PROPERTY_ADDITIONAL_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public AddressPersonal city(String city) {

    this.city = city;
    return this;
  }

  /**
   * City
   * 
   * @return city
   **/

  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }

  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }

  public AddressPersonal countryCode(String countryCode) {

    this.countryCode = countryCode;
    return this;
  }

  /**
   * ISO 3166-1 alpha-2 country code
   * 
   * @return countryCode
   **/

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

  public AddressPersonal houseNumber(String houseNumber) {

    this.houseNumber = houseNumber;
    return this;
  }

  /**
   * House number
   * 
   * @return houseNumber
   **/

  @JsonProperty(JSON_PROPERTY_HOUSE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHouseNumber() {
    return houseNumber;
  }

  @JsonProperty(JSON_PROPERTY_HOUSE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  public AddressPersonal state(String state) {

    this.state = state;
    return this;
  }

  /**
   * Full name of the state or province
   * 
   * @return state
   **/

  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }

  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(String state) {
    this.state = state;
  }

  public AddressPersonal street(String street) {

    this.street = street;
    return this;
  }

  /**
   * Street name
   * 
   * @return street
   **/

  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreet() {
    return street;
  }

  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreet(String street) {
    this.street = street;
  }

  public AddressPersonal zip(String zip) {

    this.zip = zip;
    return this;
  }

  /**
   * Zip code
   * 
   * @return zip
   **/

  @JsonProperty(JSON_PROPERTY_ZIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getZip() {
    return zip;
  }

  @JsonProperty(JSON_PROPERTY_ZIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZip(String zip) {
    this.zip = zip;
  }

  public AddressPersonal name(PersonalName name) {

    this.name = name;
    return this;
  }

  /**
   * Get name
   * 
   * @return name
   **/

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PersonalName getName() {
    return name;
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(PersonalName name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressPersonal addressPersonal = (AddressPersonal) o;
    return Objects.equals(this.additionalInfo, addressPersonal.additionalInfo) &&
        Objects.equals(this.city, addressPersonal.city) &&
        Objects.equals(this.countryCode, addressPersonal.countryCode) &&
        Objects.equals(this.houseNumber, addressPersonal.houseNumber) &&
        Objects.equals(this.state, addressPersonal.state) &&
        Objects.equals(this.street, addressPersonal.street) &&
        Objects.equals(this.zip, addressPersonal.zip) &&
        Objects.equals(this.name, addressPersonal.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, city, countryCode, houseNumber, state, street, zip, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressPersonal {\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
