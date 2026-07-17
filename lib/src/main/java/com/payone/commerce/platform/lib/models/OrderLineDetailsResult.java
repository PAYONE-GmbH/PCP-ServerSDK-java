package com.payone.commerce.platform.lib.models;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ OrderLineDetailsInput.JSON_PROPERTY_PRODUCT_CODE,
    OrderLineDetailsInput.JSON_PROPERTY_PRODUCT_PRICE,
    OrderLineDetailsInput.JSON_PROPERTY_PRODUCT_TYPE, OrderLineDetailsInput.JSON_PROPERTY_QUANTITY,
    OrderLineDetailsInput.JSON_PROPERTY_TAX_AMOUNT, OrderLineDetailsInput.JSON_PROPERTY_TAX_AMOUNT_PER_UNIT,
    OrderLineDetailsInput.JSON_PROPERTY_PRODUCT_URL, OrderLineDetailsInput.JSON_PROPERTY_PRODUCT_IMAGE_URL,
    OrderLineDetailsInput.JSON_PROPERTY_PRODUCT_CATEGORY_PATH,
    OrderLineDetailsInput.JSON_PROPERTY_MERCHANT_SHOP_DELIVERY_REFERENCE,
    OrderLineDetailsInput.JSON_PROPERTY_PRODUCT_NAME,
    OrderLineDetailsResult.JSON_PROPERTY_ID, OrderLineDetailsResult.JSON_PROPERTY_STATUS })
public class OrderLineDetailsResult extends OrderLineDetailsInput {
  private static final long serialVersionUID = 1L;
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;
  public static final String JSON_PROPERTY_STATUS = "status";
  private List<CartItemOrderStatus> status;

  @Override
  public OrderLineDetailsResult productCode(String value) {
    super.productCode(value);
    return this;
  }

  @Override
  public OrderLineDetailsResult productPrice(Long value) {
    super.productPrice(value);
    return this;
  }

  @Override
  public OrderLineDetailsResult productType(ProductType value) {
    super.productType(value);
    return this;
  }

  @Override
  public OrderLineDetailsResult quantity(Long value) {
    super.quantity(value);
    return this;
  }

  @Override
  public OrderLineDetailsResult taxAmount(Long value) {
    super.taxAmount(value);
    return this;
  }

  @Override
  public OrderLineDetailsResult taxAmountPerUnit(Boolean value) {
    super.taxAmountPerUnit(value);
    return this;
  }

  @Override
  public OrderLineDetailsResult productUrl(URI value) {
    super.productUrl(value);
    return this;
  }

  @Override
  public OrderLineDetailsResult productImageUrl(URI value) {
    super.productImageUrl(value);
    return this;
  }

  @Override
  public OrderLineDetailsResult productCategoryPath(String value) {
    super.productCategoryPath(value);
    return this;
  }

  @Override
  public OrderLineDetailsResult merchantShopDeliveryReference(String value) {
    super.merchantShopDeliveryReference(value);
    return this;
  }

  @Override
  public OrderLineDetailsResult productName(String value) {
    super.productName(value);
    return this;
  }

  public OrderLineDetailsResult id(UUID value) {
    id = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getId() {
    return id;
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID value) {
    id = value;
  }

  public OrderLineDetailsResult status(List<CartItemOrderStatus> value) {
    status = value;
    return this;
  }

  public OrderLineDetailsResult addStatusItem(CartItemOrderStatus value) {
    if (status == null)
      status = new ArrayList<>();
    status.add(value);
    return this;
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<CartItemOrderStatus> getStatus() {
    return status;
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(List<CartItemOrderStatus> value) {
    status = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    OrderLineDetailsResult that = (OrderLineDetailsResult) o;
    return Objects.equals(id, that.id) && Objects.equals(status, that.status) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, super.hashCode());
  }

  @Override
  public String toString() {
    return "class OrderLineDetailsResult {\n    productCode: " + toIndentedString(getProductCode())
        + "\n    productPrice: " + toIndentedString(getProductPrice()) + "\n    productType: "
        + toIndentedString(getProductType()) + "\n    quantity: " + toIndentedString(getQuantity())
        + "\n    taxAmount: " + toIndentedString(getTaxAmount()) + "\n    taxAmountPerUnit: "
        + toIndentedString(getTaxAmountPerUnit()) + "\n    productUrl: " + toIndentedString(getProductUrl())
        + "\n    productImageUrl: " + toIndentedString(getProductImageUrl()) + "\n    productCategoryPath: "
        + toIndentedString(getProductCategoryPath()) + "\n    merchantShopDeliveryReference: "
        + toIndentedString(getMerchantShopDeliveryReference()) + "\n    productName: "
        + toIndentedString(getProductName()) + "\n    id: " + toIndentedString(id) + "\n    status: "
        + toIndentedString(status) + "\n}";
  }

  private String toIndentedString(Object value) {
    return value == null ? "null" : value.toString().replace("\n", "\n    ");
  }
}
