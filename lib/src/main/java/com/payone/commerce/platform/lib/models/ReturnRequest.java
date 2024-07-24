package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Request to mark items of the respective Checkout as returned and to
 * automatically refund a payment for those items. A Return can be created for a
 * full or the partial ShoppingCart of the Checkout. The platform will
 * automatically calculate the respective amount to trigger the Refund. For a
 * partial Return a list of items must be provided. The item details for the
 * Refund will be automatically loaded from the Checkout. The returnReason can
 * be provided for reporting and reconciliation purposes but is not mandatory.
 */
@JsonPropertyOrder({
    ReturnRequest.JSON_PROPERTY_RETURN_TYPE,
    ReturnRequest.JSON_PROPERTY_RETURN_REASON,
    ReturnRequest.JSON_PROPERTY_RETURN_ITEMS
})
public class ReturnRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RETURN_TYPE = "returnType";
  private ReturnType returnType;

  public static final String JSON_PROPERTY_RETURN_REASON = "returnReason";
  private String returnReason;

  public static final String JSON_PROPERTY_RETURN_ITEMS = "returnItems";
  private List<ReturnItem> returnItems;

  public ReturnRequest() {
  }

  public ReturnRequest returnType(ReturnType returnType) {

    this.returnType = returnType;
    return this;
  }

  /**
   * Get returnType
   * 
   * @return returnType
   **/

  @JsonProperty(JSON_PROPERTY_RETURN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReturnType getReturnType() {
    return returnType;
  }

  @JsonProperty(JSON_PROPERTY_RETURN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnType(ReturnType returnType) {
    this.returnType = returnType;
  }

  public ReturnRequest returnReason(String returnReason) {

    this.returnReason = returnReason;
    return this;
  }

  /**
   * Reason of the Refund (e.g. communicated by or to the consumer).
   * 
   * @return returnReason
   **/

  @JsonProperty(JSON_PROPERTY_RETURN_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReturnReason() {
    return returnReason;
  }

  @JsonProperty(JSON_PROPERTY_RETURN_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnReason(String returnReason) {
    this.returnReason = returnReason;
  }

  public ReturnRequest returnItems(List<ReturnItem> returnItems) {

    this.returnItems = returnItems;
    return this;
  }

  public ReturnRequest addReturnItemsItem(ReturnItem returnItemsItem) {
    if (this.returnItems == null) {
      this.returnItems = new ArrayList<>();
    }
    this.returnItems.add(returnItemsItem);
    return this;
  }

  /**
   * Get returnItems
   * 
   * @return returnItems
   **/

  @JsonProperty(JSON_PROPERTY_RETURN_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReturnItem> getReturnItems() {
    return returnItems;
  }

  @JsonProperty(JSON_PROPERTY_RETURN_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnItems(List<ReturnItem> returnItems) {
    this.returnItems = returnItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnRequest returnRequest = (ReturnRequest) o;
    return Objects.equals(this.returnType, returnRequest.returnType) &&
        Objects.equals(this.returnReason, returnRequest.returnReason) &&
        Objects.equals(this.returnItems, returnRequest.returnItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnType, returnReason, returnItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnRequest {\n");
    sb.append("    returnType: ").append(toIndentedString(returnType)).append("\n");
    sb.append("    returnReason: ").append(toIndentedString(returnReason)).append("\n");
    sb.append("    returnItems: ").append(toIndentedString(returnItems)).append("\n");
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
