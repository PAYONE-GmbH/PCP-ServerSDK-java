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

package com.payone.commerce.platform.lib.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ErrorResponse
 */
@JsonPropertyOrder({
    ErrorResponse.JSON_PROPERTY_ERROR_ID,
    ErrorResponse.JSON_PROPERTY_ERRORS
})
public class ErrorResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ERROR_ID = "errorId";
  private String errorId;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<APIError> errors;

  public ErrorResponse() {
  }

  public ErrorResponse errorId(String errorId) {

    this.errorId = errorId;
    return this;
  }

  /**
   * Unique reference of this error response for debugging purposes
   * 
   * @return errorId
   **/

  @JsonProperty(JSON_PROPERTY_ERROR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorId() {
    return errorId;
  }

  @JsonProperty(JSON_PROPERTY_ERROR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorId(String errorId) {
    this.errorId = errorId;
  }

  public ErrorResponse errors(List<APIError> errors) {

    this.errors = errors;
    return this;
  }

  public ErrorResponse addErrorsItem(APIError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * 
   * @return errors
   **/

  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<APIError> getErrors() {
    return errors;
  }

  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(List<APIError> errors) {
    this.errors = errors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.errorId, errorResponse.errorId) &&
        Objects.equals(this.errors, errorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorId, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    sb.append("    errorId: ").append(toIndentedString(errorId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

    // add `errorId` to the URL query string
    if (getErrorId() != null) {
      try {
        joiner.add(String.format("%serrorId%s=%s", prefix, suffix,
            URLEncoder.encode(String.valueOf(getErrorId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `errors` to the URL query string
    if (getErrors() != null) {
      for (int i = 0; i < getErrors().size(); i++) {
        if (getErrors().get(i) != null) {
          joiner.add(getErrors().get(i).toUrlQueryString(String.format("%serrors%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}
