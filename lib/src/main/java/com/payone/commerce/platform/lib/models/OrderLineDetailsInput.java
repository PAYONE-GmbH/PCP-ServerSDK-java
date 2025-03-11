package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.net.URI;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing additional information that when supplied can have a
 * beneficial effect on the discountrates.
 */
@JsonPropertyOrder({
    OrderLineDetailsInput.JSON_PROPERTY_PRODUCT_CODE,
    OrderLineDetailsInput.JSON_PROPERTY_PRODUCT_PRICE,
    OrderLineDetailsInput.JSON_PROPERTY_PRODUCT_TYPE,
    OrderLineDetailsInput.JSON_PROPERTY_QUANTITY,
    OrderLineDetailsInput.JSON_PROPERTY_TAX_AMOUNT,
    OrderLineDetailsInput.JSON_PROPERTY_TAX_AMOUNT_PER_UNIT,
    OrderLineDetailsInput.JSON_PROPERTY_PRODUCT_URL,
    OrderLineDetailsInput.JSON_PROPERTY_PRODUCT_IMAGE_URL,
    OrderLineDetailsInput.JSON_PROPERTY_PRODUCT_CATEGORY_PATH,
    OrderLineDetailsInput.JSON_PROPERTY_MERCHANT_SHOP_DELIVERY_REFERENCE
})

public class OrderLineDetailsInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PRODUCT_CODE = "productCode";

  private String productCode;

  public static final String JSON_PROPERTY_PRODUCT_PRICE = "productPrice";

  private Long productPrice;

  public static final String JSON_PROPERTY_PRODUCT_TYPE = "productType";

  private ProductType productType;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";

  private Long quantity;

  public static final String JSON_PROPERTY_TAX_AMOUNT = "taxAmount";

  private Long taxAmount;

  public static final String JSON_PROPERTY_TAX_AMOUNT_PER_UNIT = "taxAmountPerUnit";

  private Boolean taxAmountPerUnit = false;

  public static final String JSON_PROPERTY_PRODUCT_URL = "productUrl";

  private URI productUrl;

  public static final String JSON_PROPERTY_PRODUCT_IMAGE_URL = "productImageUrl";

  private URI productImageUrl;

  public static final String JSON_PROPERTY_PRODUCT_CATEGORY_PATH = "productCategoryPath";

  private String productCategoryPath;

  public static final String JSON_PROPERTY_MERCHANT_SHOP_DELIVERY_REFERENCE = "merchantShopDeliveryReference";

  private String merchantShopDeliveryReference;

  public OrderLineDetailsInput() {
  }

  public OrderLineDetailsInput productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

  /**
   * Product or UPC Code
   * 
   * @return productCode
   */

  @JsonProperty(JSON_PROPERTY_PRODUCT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProductCode() {
    return productCode;
  }

  @JsonProperty(JSON_PROPERTY_PRODUCT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public OrderLineDetailsInput productPrice(Long productPrice) {
    this.productPrice = productPrice;
    return this;
  }

  /**
   * The price of one unit of the product, the value should be zero or greater.
   * minimum: 0
   * maximum: 2147483647
   * 
   * @return productPrice
   */

  @JsonProperty(JSON_PROPERTY_PRODUCT_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getProductPrice() {
    return productPrice;
  }

  @JsonProperty(JSON_PROPERTY_PRODUCT_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProductPrice(Long productPrice) {
    this.productPrice = productPrice;
  }

  public OrderLineDetailsInput productType(ProductType productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Get productType
   * 
   * @return productType
   */

  @JsonProperty(JSON_PROPERTY_PRODUCT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductType getProductType() {
    return productType;
  }

  @JsonProperty(JSON_PROPERTY_PRODUCT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductType(ProductType productType) {
    this.productType = productType;
  }

  public OrderLineDetailsInput quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity of the units being purchased, should be greater than zero Note: Must
   * not be all spaces or all zeros
   * minimum: 0
   * maximum: 9999
   * 
   * @return quantity
   */

  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getQuantity() {
    return quantity;
  }

  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public OrderLineDetailsInput taxAmount(Long taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  /**
   * Tax on the line item, with the last two digits implied as decimal places.
   * minimum: 0
   * maximum: 2147483647
   * 
   * @return taxAmount
   */

  @JsonProperty(JSON_PROPERTY_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTaxAmount() {
    return taxAmount;
  }

  @JsonProperty(JSON_PROPERTY_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxAmount(Long taxAmount) {
    this.taxAmount = taxAmount;
  }

  public OrderLineDetailsInput taxAmountPerUnit(Boolean taxAmountPerUnit) {
    this.taxAmountPerUnit = taxAmountPerUnit;
    return this;
  }

  /**
   * If this is set to true, &#x60;taxAmount&#x60; will be interpreted as the tax
   * amount per unit as opposed to the tax amount per line item.
   * 
   * @return taxAmountPerUnit
   */

  @JsonProperty(JSON_PROPERTY_TAX_AMOUNT_PER_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getTaxAmountPerUnit() {
    return taxAmountPerUnit;
  }

  @JsonProperty(JSON_PROPERTY_TAX_AMOUNT_PER_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxAmountPerUnit(Boolean taxAmountPerUnit) {
    this.taxAmountPerUnit = taxAmountPerUnit;
  }

  public OrderLineDetailsInput productUrl(URI productUrl) {
    this.productUrl = productUrl;
    return this;
  }

  /**
   * URL of the product in shop. Used for PAYONE Buy Now, Pay Later (BNPL).
   * 
   * @return productUrl
   */

  @JsonProperty(JSON_PROPERTY_PRODUCT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public URI getProductUrl() {
    return productUrl;
  }

  @JsonProperty(JSON_PROPERTY_PRODUCT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductUrl(URI productUrl) {
    this.productUrl = productUrl;
  }

  public OrderLineDetailsInput productImageUrl(URI productImageUrl) {
    this.productImageUrl = productImageUrl;
    return this;
  }

  /**
   * URL of a product image. Used for PAYONE Buy Now, Pay Later (BNPL).
   * 
   * @return productImageUrl
   */

  @JsonProperty(JSON_PROPERTY_PRODUCT_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public URI getProductImageUrl() {
    return productImageUrl;
  }

  @JsonProperty(JSON_PROPERTY_PRODUCT_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductImageUrl(URI productImageUrl) {
    this.productImageUrl = productImageUrl;
  }

  public OrderLineDetailsInput productCategoryPath(String productCategoryPath) {
    this.productCategoryPath = productCategoryPath;
    return this;
  }

  /**
   * Category path of the item. Used for PAYONE Buy Now, Pay Later (BNPL).
   * 
   * @return productCategoryPath
   */

  @JsonProperty(JSON_PROPERTY_PRODUCT_CATEGORY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProductCategoryPath() {
    return productCategoryPath;
  }

  @JsonProperty(JSON_PROPERTY_PRODUCT_CATEGORY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductCategoryPath(String productCategoryPath) {
    this.productCategoryPath = productCategoryPath;
  }

  public OrderLineDetailsInput merchantShopDeliveryReference(String merchantShopDeliveryReference) {
    this.merchantShopDeliveryReference = merchantShopDeliveryReference;
    return this;
  }

  /**
   * Optional parameter to define the delivery shop or touchpoint where an item
   * has been collected (e.g. for Click &amp; Collect or Click &amp; Reserve).
   * 
   * @return merchantShopDeliveryReference
   */

  @JsonProperty(JSON_PROPERTY_MERCHANT_SHOP_DELIVERY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantShopDeliveryReference() {
    return merchantShopDeliveryReference;
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_SHOP_DELIVERY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantShopDeliveryReference(String merchantShopDeliveryReference) {
    this.merchantShopDeliveryReference = merchantShopDeliveryReference;
  }

  /**
   * Return true if this OrderLineDetailsInput object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderLineDetailsInput orderLineDetailsInput = (OrderLineDetailsInput) o;
    return Objects.equals(this.productCode, orderLineDetailsInput.productCode) &&
        Objects.equals(this.productPrice, orderLineDetailsInput.productPrice) &&
        Objects.equals(this.productType, orderLineDetailsInput.productType) &&
        Objects.equals(this.quantity, orderLineDetailsInput.quantity) &&
        Objects.equals(this.taxAmount, orderLineDetailsInput.taxAmount) &&
        Objects.equals(this.taxAmountPerUnit, orderLineDetailsInput.taxAmountPerUnit) &&
        Objects.equals(this.productUrl, orderLineDetailsInput.productUrl) &&
        Objects.equals(this.productImageUrl, orderLineDetailsInput.productImageUrl) &&
        Objects.equals(this.productCategoryPath, orderLineDetailsInput.productCategoryPath) &&
        Objects.equals(this.merchantShopDeliveryReference, orderLineDetailsInput.merchantShopDeliveryReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productCode, productPrice, productType, quantity, taxAmount, taxAmountPerUnit, productUrl,
        productImageUrl, productCategoryPath, merchantShopDeliveryReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLineDetailsInput {\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    productPrice: ").append(toIndentedString(productPrice)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxAmountPerUnit: ").append(toIndentedString(taxAmountPerUnit)).append("\n");
    sb.append("    productUrl: ").append(toIndentedString(productUrl)).append("\n");
    sb.append("    productImageUrl: ").append(toIndentedString(productImageUrl)).append("\n");
    sb.append("    productCategoryPath: ").append(toIndentedString(productCategoryPath)).append("\n");
    sb.append("    merchantShopDeliveryReference: ").append(toIndentedString(merchantShopDeliveryReference))
        .append("\n");
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
