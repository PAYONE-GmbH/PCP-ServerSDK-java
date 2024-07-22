package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing the name details of the customer
 */
@JsonPropertyOrder({
    PersonalName.JSON_PROPERTY_FIRST_NAME,
    PersonalName.JSON_PROPERTY_SURNAME,
    PersonalName.JSON_PROPERTY_TITLE
})
public class PersonalName implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_SURNAME = "surname";
  private String surname;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public PersonalName() {
  }

  public PersonalName firstName(String firstName) {

    this.firstName = firstName;
    return this;
  }

  /**
   * Given name(s) or first name(s) of the customer
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

  public PersonalName surname(String surname) {

    this.surname = surname;
    return this;
  }

  /**
   * Surname(s) or last name(s) of the customer
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

  public PersonalName title(String title) {

    this.title = title;
    return this;
  }

  /**
   * Title of customer
   * 
   * @return title
   **/

  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalName personalName = (PersonalName) o;
    return Objects.equals(this.firstName, personalName.firstName) &&
        Objects.equals(this.surname, personalName.surname) &&
        Objects.equals(this.title, personalName.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, surname, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalName {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
