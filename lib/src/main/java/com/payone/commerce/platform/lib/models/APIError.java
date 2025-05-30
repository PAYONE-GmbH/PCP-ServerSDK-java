package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Contains detailed information on one single error.
 */
@JsonPropertyOrder({
    APIError.JSON_PROPERTY_ERROR_CODE,
    APIError.JSON_PROPERTY_CATEGORY,
    APIError.JSON_PROPERTY_HTTP_STATUS_CODE,
    APIError.JSON_PROPERTY_ID,
    APIError.JSON_PROPERTY_MESSAGE,
    APIError.JSON_PROPERTY_PROPERTY_NAME
})
public class APIError implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
  private String errorCode;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_HTTP_STATUS_CODE = "httpStatusCode";
  private Integer httpStatusCode;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_PROPERTY_NAME = "propertyName";
  private String propertyName;

  public APIError() {
  }

  public APIError errorCode(String errorCode) {

    this.errorCode = errorCode;
    return this;
  }

  /**
   * Error code
   * 
   * @return errorCode
   **/

  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getErrorCode() {
    return errorCode;
  }

  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public APIError category(String category) {

    this.category = category;
    return this;
  }

  /**
   * Category the error belongs to. The category should give an indication of the
   * type of error you are dealing with. Do not expect a finite set of possible
   * categories, as they are subject to change. Common values are:
   * * DIRECT_PLATFORM_ERROR - indicating that a functional error has occurred in
   * the platform.
   * * PAYMENT_PLATFORM_ERROR - indicating that a functional error has occurred in
   * the payment platform.
   * * IO_ERROR - indicating that a technical error has occurred within the
   * payment platform or between the payment platform and
   * third party systems.
   * * COMMERCE_PLATFORM_ERROR - indicating an error originating from the Commerce
   * Platform.
   * * COMMERCE_PORTAL_BACKEND_ERROR - indicating an error originating from the
   * Commerce Portal Backend.
   * 
   * @return category
   **/

  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCategory() {
    return category;
  }

  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(String category) {
    this.category = category;
  }

  public APIError httpStatusCode(Integer httpStatusCode) {

    this.httpStatusCode = httpStatusCode;
    return this;
  }

  /**
   * HTTP status code for this error that can be used to determine the type of
   * error
   * 
   * @return httpStatusCode
   **/

  @JsonProperty(JSON_PROPERTY_HTTP_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHttpStatusCode() {
    return httpStatusCode;
  }

  @JsonProperty(JSON_PROPERTY_HTTP_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHttpStatusCode(Integer httpStatusCode) {
    this.httpStatusCode = httpStatusCode;
  }

  public APIError id(String id) {

    this.id = id;
    return this;
  }

  /**
   * ID of the error. This is a short human-readable message that briefly
   * describes the error.
   * 
   * @return id
   **/

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }

  public APIError message(String message) {

    this.message = message;
    return this;
  }

  /**
   * Human-readable error message that is not meant to be relayed to customer as
   * it might tip off people who are trying to commit fraud
   * 
   * @return message
   **/

  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }

  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }

  public APIError propertyName(String propertyName) {

    this.propertyName = propertyName;
    return this;
  }

  /**
   * Returned only if the error relates to a value that was missing or incorrect.
   * Contains a location path to the value as a JSonata query. Some common
   * examples: * a.b selects the value of property b of root property a, * a[1]
   * selects the first element of the array in root property a, *
   * a[b&#x3D;&#39;some value&#39;] selects all elements of the array in root
   * property a that have a property b with value &#39;some value&#39;.
   * 
   * @return propertyName
   **/

  @JsonProperty(JSON_PROPERTY_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPropertyName() {
    return propertyName;
  }

  @JsonProperty(JSON_PROPERTY_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIError apIError = (APIError) o;
    return Objects.equals(this.errorCode, apIError.errorCode) &&
        Objects.equals(this.category, apIError.category) &&
        Objects.equals(this.httpStatusCode, apIError.httpStatusCode) &&
        Objects.equals(this.id, apIError.id) &&
        Objects.equals(this.message, apIError.message) &&
        Objects.equals(this.propertyName, apIError.propertyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, category, httpStatusCode, id, message, propertyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIError {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
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
