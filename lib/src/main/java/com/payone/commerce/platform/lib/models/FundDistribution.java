package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Instructions for distributing funds to multiple sellers or partners in a marketplace context.
 */
@JsonPropertyOrder({
    FundDistribution.JSON_PROPERTY_ID,
    FundDistribution.JSON_PROPERTY_ACCOUNT_ID,
    FundDistribution.JSON_PROPERTY_DESCRIPTION,
    FundDistribution.JSON_PROPERTY_AMOUNT,
    FundDistribution.JSON_PROPERTY_TYPE,
    FundDistribution.JSON_PROPERTY_MERCHANT_REFERENCE,
    FundDistribution.JSON_PROPERTY_MERCHANT_PARAMETERS
})
public class FundDistribution implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Classification or purpose of the fund distribution to the receiving account within a given order.
   */
  public enum TypeEnum {
    SELLER_REVENUE(String.valueOf("SELLER_REVENUE")),

    COMMISSION_FEE(String.valueOf("COMMISSION_FEE")),

    SHIPPING_COSTS(String.valueOf("SHIPPING_COSTS")),

    TAX(String.valueOf("TAX")),

    PLATFORM_FEE(String.valueOf("PLATFORM_FEE")),

    OTHER(String.valueOf("OTHER"));

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private String accountId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Long amount;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_MERCHANT_REFERENCE = "merchantReference";
  private String merchantReference;

  public static final String JSON_PROPERTY_MERCHANT_PARAMETERS = "merchantParameters";
  private String merchantParameters;

  public FundDistribution() {
  }

  public FundDistribution id(UUID id) {
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

  public FundDistribution accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Unique identifier of the beneficiary (seller/partner/sub-account) to receive funds (e.g., payout account ID).
   *
   * @return accountId
   */

  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountId() {
    return accountId;
  }

  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public FundDistribution description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Human-readable description for reconciliation. Appears on reports.
   *
   * @return description
   */

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }

  public FundDistribution amount(Long amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount in cents and always having 2 decimals, in the currency of the original transaction.
   *
   * @return amount
   */

  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getAmount() {
    return amount;
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public FundDistribution type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Classification or purpose of the fund distribution to the receiving account within a given order.
   *
   * @return type
   */

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TypeEnum getType() {
    return type;
  }

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }

  public FundDistribution merchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
    return this;
  }

  /**
   * Unique reference of the part of the fund/payment to be distributed that is also returned for
   * reporting and reconciliation purposes.
   *
   * @return merchantReference
   */

  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantReference() {
    return merchantReference;
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }

  public FundDistribution merchantParameters(String merchantParameters) {
    this.merchantParameters = merchantParameters;
    return this;
  }

  /**
   * It allows you to store additional parameters for the transaction in JSON format.
   * This field must not contain any personal data.
   *
   * @return merchantParameters
   */

  @JsonProperty(JSON_PROPERTY_MERCHANT_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantParameters() {
    return merchantParameters;
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantParameters(String merchantParameters) {
    this.merchantParameters = merchantParameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundDistribution fundDistribution = (FundDistribution) o;
    return Objects.equals(this.id, fundDistribution.id) &&
        Objects.equals(this.accountId, fundDistribution.accountId) &&
        Objects.equals(this.description, fundDistribution.description) &&
        Objects.equals(this.amount, fundDistribution.amount) &&
        Objects.equals(this.type, fundDistribution.type) &&
        Objects.equals(this.merchantReference, fundDistribution.merchantReference) &&
        Objects.equals(this.merchantParameters, fundDistribution.merchantParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountId, description, amount, type, merchantReference, merchantParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundDistribution {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    merchantParameters: ").append(toIndentedString(merchantParameters)).append("\n");
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
