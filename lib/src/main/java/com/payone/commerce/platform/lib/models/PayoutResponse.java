package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object that holds the payment related properties for the refund of a Payment
 * Information.
 */
@JsonPropertyOrder({
    PayoutResponse.JSON_PROPERTY_PAYOUT_OUTPUT,
    PayoutResponse.JSON_PROPERTY_STATUS,
    PayoutResponse.JSON_PROPERTY_STATUS_CATEGORY,
    PayoutResponse.JSON_PROPERTY_ID
})

public class PayoutResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAYOUT_OUTPUT = "payoutOutput";

  private PayoutOutput payoutOutput;

  public static final String JSON_PROPERTY_STATUS = "status";

  private StatusValue status;

  public static final String JSON_PROPERTY_STATUS_CATEGORY = "statusCategory";

  private StatusCategoryValue statusCategory;

  public static final String JSON_PROPERTY_ID = "id";

  private String id;

  public PayoutResponse() {
  }

  public PayoutResponse payoutOutput(PayoutOutput payoutOutput) {
    this.payoutOutput = payoutOutput;
    return this;
  }

  /**
   * Get payoutOutput
   * 
   * @return payoutOutput
   */

  @JsonProperty(JSON_PROPERTY_PAYOUT_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PayoutOutput getPayoutOutput() {
    return payoutOutput;
  }

  @JsonProperty(JSON_PROPERTY_PAYOUT_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayoutOutput(PayoutOutput payoutOutput) {
    this.payoutOutput = payoutOutput;
  }

  public PayoutResponse status(StatusValue status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * 
   * @return status
   */

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public StatusValue getStatus() {
    return status;
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusValue status) {
    this.status = status;
  }

  public PayoutResponse statusCategory(StatusCategoryValue statusCategory) {
    this.statusCategory = statusCategory;
    return this;
  }

  /**
   * Get statusCategory
   * 
   * @return statusCategory
   */

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

  public PayoutResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique payment transaction identifier of the payment gateway.
   * 
   * @return id
   */

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

  /**
   * Return true if this PayoutResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutResponse payoutResponse = (PayoutResponse) o;
    return Objects.equals(this.payoutOutput, payoutResponse.payoutOutput) &&
        Objects.equals(this.status, payoutResponse.status) &&
        Objects.equals(this.statusCategory, payoutResponse.statusCategory) &&
        Objects.equals(this.id, payoutResponse.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payoutOutput, status, statusCategory, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutResponse {\n");
    sb.append("    payoutOutput: ").append(toIndentedString(payoutOutput)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusCategory: ").append(toIndentedString(statusCategory)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
