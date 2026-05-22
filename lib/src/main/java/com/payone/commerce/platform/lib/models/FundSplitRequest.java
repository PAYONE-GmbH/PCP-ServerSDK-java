package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Request object for creating a fund split instruction for a chargeback event
 * in a marketplace transaction.
 * Contains the fund split details specifying how the chargeback amount should
 * be distributed among the
 * different sellers and/or the platform involved in the original marketplace
 * order.
 */
@JsonPropertyOrder({
    FundSplitRequest.JSON_PROPERTY_FUND_SPLIT
})
public class FundSplitRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FUND_SPLIT = "fundSplit";
  private FundSplit fundSplit;

  public FundSplitRequest() {
  }

  public FundSplitRequest fundSplit(FundSplit fundSplit) {
    this.fundSplit = fundSplit;
    return this;
  }

  /**
   * Get fundSplit
   *
   * @return fundSplit
   */
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
    FundSplitRequest fundSplitRequest = (FundSplitRequest) o;
    return Objects.equals(this.fundSplit, fundSplitRequest.fundSplit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundSplit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundSplitRequest {\n");
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
