package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing all details that are linked to the Checkout.
 */
@JsonPropertyOrder({
    CheckoutReferences.JSON_PROPERTY_MERCHANT_REFERENCE,
    CheckoutReferences.JSON_PROPERTY_MERCHANT_SHOP_REFERENCE
})
public class CheckoutReferences implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MERCHANT_REFERENCE = "merchantReference";
  private String merchantReference;

  public static final String JSON_PROPERTY_MERCHANT_SHOP_REFERENCE = "merchantShopReference";
  private String merchantShopReference;

  public CheckoutReferences() {
  }

  public CheckoutReferences merchantReference(String merchantReference) {

    this.merchantReference = merchantReference;
    return this;
  }

  /**
   * Unique reference of the Checkout that is also returned for reporting and
   * reconciliation purposes.
   * 
   * @return merchantReference
   **/

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

  public CheckoutReferences merchantShopReference(String merchantShopReference) {

    this.merchantShopReference = merchantShopReference;
    return this;
  }

  /**
   * Optional parameter to define the shop or touchpoint where a sale has been
   * realized (e.g. different stores).
   * 
   * @return merchantShopReference
   **/

  @JsonProperty(JSON_PROPERTY_MERCHANT_SHOP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantShopReference() {
    return merchantShopReference;
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_SHOP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantShopReference(String merchantShopReference) {
    this.merchantShopReference = merchantShopReference;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutReferences checkoutReferences = (CheckoutReferences) o;
    return Objects.equals(this.merchantReference, checkoutReferences.merchantReference) &&
        Objects.equals(this.merchantShopReference, checkoutReferences.merchantShopReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantReference, merchantShopReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutReferences {\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    merchantShopReference: ").append(toIndentedString(merchantShopReference)).append("\n");
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
