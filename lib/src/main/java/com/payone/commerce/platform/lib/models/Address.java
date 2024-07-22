package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing billing address details
 */
@JsonPropertyOrder({
    Address.JSON_PROPERTY_ADDITIONAL_INFO,
    Address.JSON_PROPERTY_CITY,
    Address.JSON_PROPERTY_COUNTRY_CODE,
    Address.JSON_PROPERTY_HOUSE_NUMBER,
    Address.JSON_PROPERTY_STATE,
    Address.JSON_PROPERTY_STREET,
    Address.JSON_PROPERTY_ZIP
})
public class Address implements Serializable {
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

  public Address() {
  }

  public Address additionalInfo(String additionalInfo) {

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

  public Address city(String city) {

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

  public Address countryCode(String countryCode) {

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

  public Address houseNumber(String houseNumber) {

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

  public Address state(String state) {

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

  public Address street(String street) {

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

  public Address zip(String zip) {

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.additionalInfo, address.additionalInfo) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.countryCode, address.countryCode) &&
        Objects.equals(this.houseNumber, address.houseNumber) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.street, address.street) &&
        Objects.equals(this.zip, address.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, city, countryCode, houseNumber, state, street, zip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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
