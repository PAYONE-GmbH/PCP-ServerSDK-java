package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Response object returned after successfully creating a fund split
 * instruction. Contains the unique
 * identifier of the created fund split and the processing status.
 */
@JsonPropertyOrder({
    FundSplitResponse.JSON_PROPERTY_FUND_SPLIT_ID,
    FundSplitResponse.JSON_PROPERTY_PAYMENT_EXECUTION_ID,
    FundSplitResponse.JSON_PROPERTY_EVENT_ID,
    FundSplitResponse.JSON_PROPERTY_FUND_SPLIT
})
public class FundSplitResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FUND_SPLIT_ID = "fundSplitId";
  private UUID fundSplitId;

  public static final String JSON_PROPERTY_PAYMENT_EXECUTION_ID = "paymentExecutionId";
  private UUID paymentExecutionId;

  public static final String JSON_PROPERTY_EVENT_ID = "eventId";
  private UUID eventId;

  public static final String JSON_PROPERTY_FUND_SPLIT = "fundSplit";
  private FundSplit fundSplit;

  public FundSplitResponse() {
  }

  public FundSplitResponse fundSplitId(UUID fundSplitId) {
    this.fundSplitId = fundSplitId;
    return this;
  }

  /**
   * Unique identifier assigned to the created fund split instruction. This ID can
   * be used for tracking
   * and referencing the fund split in subsequent operations or inquiries.
   *
   * @example a1b2c3d4-e5f6-7890-abcd-ef1234567890
   * @return fundSplitId
   */
  @JsonProperty(JSON_PROPERTY_FUND_SPLIT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getFundSplitId() {
    return fundSplitId;
  }

  @JsonProperty(JSON_PROPERTY_FUND_SPLIT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFundSplitId(UUID fundSplitId) {
    this.fundSplitId = fundSplitId;
  }

  public FundSplitResponse paymentExecutionId(UUID paymentExecutionId) {
    this.paymentExecutionId = paymentExecutionId;
    return this;
  }

  /**
   * Unique identifier of the Payment Execution that this fund split is associated
   * with.
   *
   * @example f47ac10b-58cc-4372-a567-0e02b2c3d479
   * @return paymentExecutionId
   */
  @JsonProperty(JSON_PROPERTY_PAYMENT_EXECUTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getPaymentExecutionId() {
    return paymentExecutionId;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_EXECUTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentExecutionId(UUID paymentExecutionId) {
    this.paymentExecutionId = paymentExecutionId;
  }

  public FundSplitResponse eventId(UUID eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Unique identifier of the chargeback event that this fund split instruction
   * was created for.
   *
   * @example c56a4180-65aa-42ec-a945-5fd21dec0538
   * @return eventId
   */
  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getEventId() {
    return eventId;
  }

  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventId(UUID eventId) {
    this.eventId = eventId;
  }

  public FundSplitResponse fundSplit(FundSplit fundSplit) {
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
    FundSplitResponse fundSplitResponse = (FundSplitResponse) o;
    return Objects.equals(this.fundSplitId, fundSplitResponse.fundSplitId) &&
        Objects.equals(this.paymentExecutionId, fundSplitResponse.paymentExecutionId) &&
        Objects.equals(this.eventId, fundSplitResponse.eventId) &&
        Objects.equals(this.fundSplit, fundSplitResponse.fundSplit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundSplitId, paymentExecutionId, eventId, fundSplit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundSplitResponse {\n");
    sb.append("    fundSplitId: ").append(toIndentedString(fundSplitId)).append("\n");
    sb.append("    paymentExecutionId: ").append(toIndentedString(paymentExecutionId)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
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
