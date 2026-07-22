package com.payone.commerce.platform.lib.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ AddressPersonal.JSON_PROPERTY_ADDITIONAL_INFO, AddressPersonal.JSON_PROPERTY_CITY,
    AddressPersonal.JSON_PROPERTY_COUNTRY_CODE, AddressPersonal.JSON_PROPERTY_HOUSE_NUMBER,
    AddressPersonal.JSON_PROPERTY_STATE, AddressPersonal.JSON_PROPERTY_STREET, AddressPersonal.JSON_PROPERTY_ZIP,
    AddressPersonal.JSON_PROPERTY_NAME, ShippingAddress.JSON_PROPERTY_COMPANY_NAME })
public class ShippingAddress extends AddressPersonal {
  private static final long serialVersionUID = 1L;
  public static final String JSON_PROPERTY_COMPANY_NAME = "companyName";
  private String companyName;

  @Override
  public ShippingAddress additionalInfo(String value) {
    super.additionalInfo(value);
    return this;
  }

  @Override
  public ShippingAddress city(String value) {
    super.city(value);
    return this;
  }

  @Override
  public ShippingAddress countryCode(String value) {
    super.countryCode(value);
    return this;
  }

  @Override
  public ShippingAddress houseNumber(String value) {
    super.houseNumber(value);
    return this;
  }

  @Override
  public ShippingAddress state(String value) {
    super.state(value);
    return this;
  }

  @Override
  public ShippingAddress street(String value) {
    super.street(value);
    return this;
  }

  @Override
  public ShippingAddress zip(String value) {
    super.zip(value);
    return this;
  }

  @Override
  public ShippingAddress name(PersonalName value) {
    super.name(value);
    return this;
  }

  public ShippingAddress companyName(String value) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    return Objects.equals(companyName, ((ShippingAddress) o).companyName) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, super.hashCode());
  }

  @Override
  public String toString() {
    return "class ShippingAddress {\n    additionalInfo: " + toIndentedString(getAdditionalInfo()) + "\n    city: "
        + toIndentedString(getCity()) + "\n    countryCode: " + toIndentedString(getCountryCode())
        + "\n    houseNumber: " + toIndentedString(getHouseNumber()) + "\n    state: " + toIndentedString(getState())
        + "\n    street: " + toIndentedString(getStreet()) + "\n    zip: " + toIndentedString(getZip()) + "\n    name: "
        + toIndentedString(getName()) + "\n    companyName: " + toIndentedString(companyName) + "\n}";
  }

  private String toIndentedString(Object value) {
    return value == null ? "null" : value.toString().replace("\n", "\n    ");
  }
}
