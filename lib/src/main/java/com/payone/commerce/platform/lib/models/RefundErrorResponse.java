package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * RefundErrorResponse
 */
@JsonPropertyOrder({
    RefundErrorResponse.JSON_PROPERTY_ERROR_ID,
    RefundErrorResponse.JSON_PROPERTY_ERRORS
})
public class RefundErrorResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ERROR_ID = "errorId";
  private String errorId;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<APIError> errors;

  public RefundErrorResponse() {
  }

  public RefundErrorResponse errorId(String errorId) {

    this.errorId = errorId;
    return this;
  }

  /**
   * Unique reference, for debugging purposes, of this error response
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

  public RefundErrorResponse errors(List<APIError> errors) {

    this.errors = errors;
    return this;
  }

  public RefundErrorResponse addErrorsItem(APIError errorsItem) {
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
    RefundErrorResponse refundErrorResponse = (RefundErrorResponse) o;
    return Objects.equals(this.errorId, refundErrorResponse.errorId) &&
        Objects.equals(this.errors, refundErrorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorId, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundErrorResponse {\n");
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

}
