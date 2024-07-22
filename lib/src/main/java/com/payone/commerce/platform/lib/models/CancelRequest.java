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
 * Request to mark items as of the respective Checkout as cancelled and to
 * automatically reverse the associated payment. A Cancel can be created for a
 * full or the partial ShoppingCart of the Checkout. The platform will
 * automatically calculate the respective amount to trigger the Cancel. For a
 * partial Cancel a list of items must be provided. The cancellationReason is
 * mandatory for BNPL payment methods (paymentProductId 3390, 3391 and 3392).
 * For other payment methods the cancellationReason is not mandatory but can be
 * used for reporting and reconciliation purposes.
 */
@JsonPropertyOrder({
    CancelRequest.JSON_PROPERTY_CANCEL_TYPE,
    CancelRequest.JSON_PROPERTY_CANCELLATION_REASON,
    CancelRequest.JSON_PROPERTY_CANCEL_ITEMS
})
public class CancelRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CANCEL_TYPE = "cancelType";
  private CancelType cancelType;

  public static final String JSON_PROPERTY_CANCELLATION_REASON = "cancellationReason";
  private CancellationReason cancellationReason;

  public static final String JSON_PROPERTY_CANCEL_ITEMS = "cancelItems";
  private List<CancelItem> cancelItems;

  public CancelRequest() {
  }

  public CancelRequest cancelType(CancelType cancelType) {

    this.cancelType = cancelType;
    return this;
  }

  /**
   * Get cancelType
   * 
   * @return cancelType
   **/

  @JsonProperty(JSON_PROPERTY_CANCEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CancelType getCancelType() {
    return cancelType;
  }

  @JsonProperty(JSON_PROPERTY_CANCEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCancelType(CancelType cancelType) {
    this.cancelType = cancelType;
  }

  public CancelRequest cancellationReason(CancellationReason cancellationReason) {

    this.cancellationReason = cancellationReason;
    return this;
  }

  /**
   * Get cancellationReason
   * 
   * @return cancellationReason
   **/

  @JsonProperty(JSON_PROPERTY_CANCELLATION_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CancellationReason getCancellationReason() {
    return cancellationReason;
  }

  @JsonProperty(JSON_PROPERTY_CANCELLATION_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCancellationReason(CancellationReason cancellationReason) {
    this.cancellationReason = cancellationReason;
  }

  public CancelRequest cancelItems(List<CancelItem> cancelItems) {

    this.cancelItems = cancelItems;
    return this;
  }

  public CancelRequest addCancelItemsItem(CancelItem cancelItemsItem) {
    if (this.cancelItems == null) {
      this.cancelItems = new ArrayList<>();
    }
    this.cancelItems.add(cancelItemsItem);
    return this;
  }

  /**
   * Get cancelItems
   * 
   * @return cancelItems
   **/

  @JsonProperty(JSON_PROPERTY_CANCEL_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CancelItem> getCancelItems() {
    return cancelItems;
  }

  @JsonProperty(JSON_PROPERTY_CANCEL_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCancelItems(List<CancelItem> cancelItems) {
    this.cancelItems = cancelItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelRequest cancelRequest = (CancelRequest) o;
    return Objects.equals(this.cancelType, cancelRequest.cancelType) &&
        Objects.equals(this.cancellationReason, cancelRequest.cancellationReason) &&
        Objects.equals(this.cancelItems, cancelRequest.cancelItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelType, cancellationReason, cancelItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelRequest {\n");
    sb.append("    cancelType: ").append(toIndentedString(cancelType)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    cancelItems: ").append(toIndentedString(cancelItems)).append("\n");
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

    // add `cancelType` to the URL query string
    if (getCancelType() != null) {
      try {
        joiner.add(String.format("%scancelType%s=%s", prefix, suffix,
            URLEncoder.encode(String.valueOf(getCancelType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `cancellationReason` to the URL query string
    if (getCancellationReason() != null) {
      try {
        joiner.add(String.format("%scancellationReason%s=%s", prefix, suffix,
            URLEncoder.encode(String.valueOf(getCancellationReason()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `cancelItems` to the URL query string
    if (getCancelItems() != null) {
      for (int i = 0; i < getCancelItems().size(); i++) {
        if (getCancelItems().get(i) != null) {
          joiner.add(getCancelItems().get(i).toUrlQueryString(String.format("%scancelItems%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}
