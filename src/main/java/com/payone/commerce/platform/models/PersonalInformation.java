/*
 * Commerce Platform API
 * RESTful API for the creation of Commerce Cases with Checkouts and the execution of Payments. 
 *
 * The version of the OpenAPI document: 1.5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.payone.commerce.platform.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Object containing personal information like name, date of birth and gender.
 */
@JsonPropertyOrder({
  PersonalInformation.JSON_PROPERTY_DATE_OF_BIRTH,
  PersonalInformation.JSON_PROPERTY_GENDER,
  PersonalInformation.JSON_PROPERTY_NAME
})
public class PersonalInformation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATE_OF_BIRTH = "dateOfBirth";
  private String dateOfBirth;

  /**
   * The gender of the customer, possible values are:  * MALE  * FEMALE  * UNKNOWN
   */
  public enum GenderEnum {
    MALE("MALE"),
    
    FEMALE("FEMALE"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_GENDER = "gender";
  private GenderEnum gender;

  public static final String JSON_PROPERTY_NAME = "name";
  private PersonalName name;

  public PersonalInformation() {
  }

  public PersonalInformation dateOfBirth(String dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * The date of birth of the customer of the recipient of the loan. Format YYYYMMDD
   * @return dateOfBirth
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDateOfBirth() {
    return dateOfBirth;
  }


  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public PersonalInformation gender(GenderEnum gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * The gender of the customer, possible values are:  * MALE  * FEMALE  * UNKNOWN
   * @return gender
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GenderEnum getGender() {
    return gender;
  }


  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }


  public PersonalInformation name(PersonalName name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
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
    PersonalInformation personalInformation = (PersonalInformation) o;
    return Objects.equals(this.dateOfBirth, personalInformation.dateOfBirth) &&
        Objects.equals(this.gender, personalInformation.gender) &&
        Objects.equals(this.name, personalInformation.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfBirth, gender, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalInformation {\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `dateOfBirth` to the URL query string
    if (getDateOfBirth() != null) {
      try {
        joiner.add(String.format("%sdateOfBirth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDateOfBirth()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `gender` to the URL query string
    if (getGender() != null) {
      try {
        joiner.add(String.format("%sgender%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGender()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(getName().toUrlQueryString(prefix + "name" + suffix));
    }

    return joiner.toString();
  }

}

