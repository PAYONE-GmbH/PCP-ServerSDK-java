package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Instructions for distributing funds to multiple sellers or partners in a marketplace context.
 */
@JsonPropertyOrder({
    FundSplit.JSON_PROPERTY_ID,
    FundSplit.JSON_PROPERTY_PAYMENT_EVENT_ID,
    FundSplit.JSON_PROPERTY_FUND_DISTRIBUTIONS
})
public class FundSplit implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_PAYMENT_EVENT_ID = "paymentEventId";
  private UUID paymentEventId;

  public static final String JSON_PROPERTY_FUND_DISTRIBUTIONS = "fundDistributions";
  private List<FundDistribution> fundDistributions;

  public FundSplit() {
  }

  public FundSplit id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   */

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getId() {
    return id;
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }

  public FundSplit paymentEventId(UUID paymentEventId) {
    this.paymentEventId = paymentEventId;
    return this;
  }

  /**
   * Get paymentEventId
   *
   * @return paymentEventId
   */

  @JsonProperty(JSON_PROPERTY_PAYMENT_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getPaymentEventId() {
    return paymentEventId;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentEventId(UUID paymentEventId) {
    this.paymentEventId = paymentEventId;
  }

  public FundSplit fundDistributions(List<FundDistribution> fundDistributions) {
    this.fundDistributions = fundDistributions;
    return this;
  }

  public FundSplit addFundDistributionsItem(FundDistribution fundDistributionsItem) {
    if (this.fundDistributions == null) {
      this.fundDistributions = new ArrayList<>();
    }
    this.fundDistributions.add(fundDistributionsItem);
    return this;
  }

  /**
   * Get fundDistributions
   *
   * @return fundDistributions
   */

  @JsonProperty(JSON_PROPERTY_FUND_DISTRIBUTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<FundDistribution> getFundDistributions() {
    return fundDistributions;
  }

  @JsonProperty(JSON_PROPERTY_FUND_DISTRIBUTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFundDistributions(List<FundDistribution> fundDistributions) {
    this.fundDistributions = fundDistributions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundSplit fundSplit = (FundSplit) o;
    return Objects.equals(this.id, fundSplit.id) &&
        Objects.equals(this.paymentEventId, fundSplit.paymentEventId) &&
        Objects.equals(this.fundDistributions, fundSplit.fundDistributions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, paymentEventId, fundDistributions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundSplit {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentEventId: ").append(toIndentedString(paymentEventId)).append("\n");
    sb.append("    fundDistributions: ").append(toIndentedString(fundDistributions)).append("\n");
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
