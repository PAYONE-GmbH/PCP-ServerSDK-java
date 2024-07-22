package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Request to mark items of the respective Checkout as delivered and to
 * automatically execute a Capture. A Deliver can be created for a full or the
 * partial ShoppingCart of the Checkout. The platform will automatically
 * calculate the respective amount to trigger the Capture. For a partial Deliver
 * a list of items must be provided. The item details for the Capture will be
 * automatically loaded from the Checkout. The cancellationReason must be
 * provided if deliverType is set to PARTIAL and isFinal is set to true for BNPL
 * payment methods (paymentProductId 3390, 3391 and 3392). For other payment
 * methods the cancellationReason is not mandatory in this case but can be used
 * for reporting and reconciliation purposes.
 */
@JsonPropertyOrder({
    DeliverRequest.JSON_PROPERTY_DELIVER_TYPE,
    DeliverRequest.JSON_PROPERTY_IS_FINAL,
    DeliverRequest.JSON_PROPERTY_CANCELLATION_REASON,
    DeliverRequest.JSON_PROPERTY_DELIVER_ITEMS
})
public class DeliverRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DELIVER_TYPE = "deliverType";
  private DeliverType deliverType;

  public static final String JSON_PROPERTY_IS_FINAL = "isFinal";
  private Boolean isFinal = false;

  public static final String JSON_PROPERTY_CANCELLATION_REASON = "cancellationReason";
  private CancellationReason cancellationReason;

  public static final String JSON_PROPERTY_DELIVER_ITEMS = "deliverItems";
  private List<DeliverItem> deliverItems;

  public DeliverRequest() {
  }

  public DeliverRequest deliverType(DeliverType deliverType) {

    this.deliverType = deliverType;
    return this;
  }

  /**
   * Get deliverType
   * 
   * @return deliverType
   **/

  @JsonProperty(JSON_PROPERTY_DELIVER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DeliverType getDeliverType() {
    return deliverType;
  }

  @JsonProperty(JSON_PROPERTY_DELIVER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliverType(DeliverType deliverType) {
    this.deliverType = deliverType;
  }

  public DeliverRequest isFinal(Boolean isFinal) {

    this.isFinal = isFinal;
    return this;
  }

  /**
   * This property indicates whether this will be the final operation. For
   * deliverType FULL, it is always the final operation. If deliverType PARTIAL is
   * provided and the property is set to true, the remaining amount of the items
   * will be cancelled and the items are marked as CANCELLED.
   * 
   * @return isFinal
   **/

  @JsonProperty(JSON_PROPERTY_IS_FINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsFinal() {
    return isFinal;
  }

  @JsonProperty(JSON_PROPERTY_IS_FINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsFinal(Boolean isFinal) {
    this.isFinal = isFinal;
  }

  public DeliverRequest cancellationReason(CancellationReason cancellationReason) {

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

  public DeliverRequest deliverItems(List<DeliverItem> deliverItems) {

    this.deliverItems = deliverItems;
    return this;
  }

  public DeliverRequest addDeliverItemsItem(DeliverItem deliverItemsItem) {
    if (this.deliverItems == null) {
      this.deliverItems = new ArrayList<>();
    }
    this.deliverItems.add(deliverItemsItem);
    return this;
  }

  /**
   * Get deliverItems
   * 
   * @return deliverItems
   **/

  @JsonProperty(JSON_PROPERTY_DELIVER_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DeliverItem> getDeliverItems() {
    return deliverItems;
  }

  @JsonProperty(JSON_PROPERTY_DELIVER_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliverItems(List<DeliverItem> deliverItems) {
    this.deliverItems = deliverItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliverRequest deliverRequest = (DeliverRequest) o;
    return Objects.equals(this.deliverType, deliverRequest.deliverType) &&
        Objects.equals(this.isFinal, deliverRequest.isFinal) &&
        Objects.equals(this.cancellationReason, deliverRequest.cancellationReason) &&
        Objects.equals(this.deliverItems, deliverRequest.deliverItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliverType, isFinal, cancellationReason, deliverItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliverRequest {\n");
    sb.append("    deliverType: ").append(toIndentedString(deliverType)).append("\n");
    sb.append("    isFinal: ").append(toIndentedString(isFinal)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    deliverItems: ").append(toIndentedString(deliverItems)).append("\n");
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
