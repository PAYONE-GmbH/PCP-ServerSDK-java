package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * This object has the numeric representation of the current payment status,
 * timestamp of last status change and performable action on the current payment
 * resource. In case of failed payments and negative scenarios, detailed error
 * information is listed.
 */
@JsonPropertyOrder({
    PaymentStatusOutput.JSON_PROPERTY_IS_CANCELLABLE,
    PaymentStatusOutput.JSON_PROPERTY_STATUS_CATEGORY,
    PaymentStatusOutput.JSON_PROPERTY_IS_AUTHORIZED,
    PaymentStatusOutput.JSON_PROPERTY_IS_REFUNDABLE
})
public class PaymentStatusOutput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IS_CANCELLABLE = "isCancellable";
  private Boolean isCancellable;

  public static final String JSON_PROPERTY_STATUS_CATEGORY = "statusCategory";
  private StatusCategoryValue statusCategory;

  public static final String JSON_PROPERTY_IS_AUTHORIZED = "isAuthorized";
  private Boolean isAuthorized;

  public static final String JSON_PROPERTY_IS_REFUNDABLE = "isRefundable";
  private Boolean isRefundable;

  public PaymentStatusOutput() {
  }

  public PaymentStatusOutput isCancellable(Boolean isCancellable) {

    this.isCancellable = isCancellable;
    return this;
  }

  /**
   * Flag indicating if the payment can be cancelled
   * 
   * @return isCancellable
   **/

  @JsonProperty(JSON_PROPERTY_IS_CANCELLABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsCancellable() {
    return isCancellable;
  }

  @JsonProperty(JSON_PROPERTY_IS_CANCELLABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsCancellable(Boolean isCancellable) {
    this.isCancellable = isCancellable;
  }

  public PaymentStatusOutput statusCategory(StatusCategoryValue statusCategory) {

    this.statusCategory = statusCategory;
    return this;
  }

  /**
   * Get statusCategory
   * 
   * @return statusCategory
   **/

  @JsonProperty(JSON_PROPERTY_STATUS_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusCategoryValue getStatusCategory() {
    return statusCategory;
  }

  @JsonProperty(JSON_PROPERTY_STATUS_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusCategory(StatusCategoryValue statusCategory) {
    this.statusCategory = statusCategory;
  }

  public PaymentStatusOutput isAuthorized(Boolean isAuthorized) {

    this.isAuthorized = isAuthorized;
    return this;
  }

  /**
   * Indicates if the transaction has been authorized
   * 
   * @return isAuthorized
   **/

  @JsonProperty(JSON_PROPERTY_IS_AUTHORIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsAuthorized() {
    return isAuthorized;
  }

  @JsonProperty(JSON_PROPERTY_IS_AUTHORIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsAuthorized(Boolean isAuthorized) {
    this.isAuthorized = isAuthorized;
  }

  public PaymentStatusOutput isRefundable(Boolean isRefundable) {

    this.isRefundable = isRefundable;
    return this;
  }

  /**
   * Flag indicating if the payment can be refunded
   * 
   * @return isRefundable
   **/

  @JsonProperty(JSON_PROPERTY_IS_REFUNDABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsRefundable() {
    return isRefundable;
  }

  @JsonProperty(JSON_PROPERTY_IS_REFUNDABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRefundable(Boolean isRefundable) {
    this.isRefundable = isRefundable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentStatusOutput paymentStatusOutput = (PaymentStatusOutput) o;
    return Objects.equals(this.isCancellable, paymentStatusOutput.isCancellable) &&
        Objects.equals(this.statusCategory, paymentStatusOutput.statusCategory) &&
        Objects.equals(this.isAuthorized, paymentStatusOutput.isAuthorized) &&
        Objects.equals(this.isRefundable, paymentStatusOutput.isRefundable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isCancellable, statusCategory, isAuthorized, isRefundable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentStatusOutput {\n");
    sb.append("    isCancellable: ").append(toIndentedString(isCancellable)).append("\n");
    sb.append("    statusCategory: ").append(toIndentedString(statusCategory)).append("\n");
    sb.append("    isAuthorized: ").append(toIndentedString(isAuthorized)).append("\n");
    sb.append("    isRefundable: ").append(toIndentedString(isRefundable)).append("\n");
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
