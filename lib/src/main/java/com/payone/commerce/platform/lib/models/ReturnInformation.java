package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Return object contains additional information about the return/shipment,
 * which is the basis for the Refund. The amountOfMoney in the cartItem will not
 * be used in the request.
 */
@JsonPropertyOrder({
    ReturnInformation.JSON_PROPERTY_RETURN_REASON,
    ReturnInformation.JSON_PROPERTY_ITEMS,
    ReturnInformation.JSON_PROPERTY_FUND_SPLIT
})
public class ReturnInformation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RETURN_REASON = "returnReason";
  private String returnReason;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<CartItemInput> items;

  public static final String JSON_PROPERTY_FUND_SPLIT = "fundSplit";
  private FundSplit fundSplit;

  public ReturnInformation() {
  }

  public ReturnInformation returnReason(String returnReason) {

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

  public ReturnInformation items(List<CartItemInput> items) {

    this.items = items;
    return this;
  }

  public ReturnInformation addItemsItem(CartItemInput itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Items returned.
   * 
   * @return items
   **/

  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CartItemInput> getItems() {
    return items;
  }

  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<CartItemInput> items) {
    this.items = items;
  }

  public ReturnInformation fundSplit(FundSplit fundSplit) {

    this.fundSplit = fundSplit;
    return this;
  }

  /**
   * Get fundSplit
   *
   * @return fundSplit
   **/

  @JsonProperty(JSON_PROPERTY_FUND_SPLIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FundSplit getFundSplit() {
    return fundSplit;
  }

  @JsonProperty(JSON_PROPERTY_FUND_SPLIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFundSplit(FundSplit fundSplit) {
    this.fundSplit = fundSplit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnInformation returnInformation = (ReturnInformation) o;
    return Objects.equals(this.returnReason, returnInformation.returnReason) &&
        Objects.equals(this.items, returnInformation.items) &&
        Objects.equals(this.fundSplit, returnInformation.fundSplit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnReason, items, fundSplit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnInformation {\n");
    sb.append("    returnReason: ").append(toIndentedString(returnReason)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    fundSplit: ").append(toIndentedString(fundSplit)).append("\n");
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
