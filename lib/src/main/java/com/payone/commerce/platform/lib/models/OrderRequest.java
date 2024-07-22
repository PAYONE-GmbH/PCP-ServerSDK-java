package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Request to execute an Order for the corresponding Checkout for a specific
 * payment method. The provided data from the Commerce Case and the Checkout
 * regarding customer, shipping, and ShoppingCart will be automatically loaded
 * and used for the Payment Execution. In case the paymentMethodSpecificInput
 * has already been provided when creating the Commerce Case or Checkout, this
 * input will automatically be used. An Order can be created for a full or the
 * partial ShoppingCart of the Checkout. For a partial Order a list of items
 * must be provided. The platform will automatically calculate the respective
 * amount to trigger the payment execution.
 */
@JsonPropertyOrder({
    OrderRequest.JSON_PROPERTY_ORDER_TYPE,
    OrderRequest.JSON_PROPERTY_ORDER_REFERENCES,
    OrderRequest.JSON_PROPERTY_ITEMS,
    OrderRequest.JSON_PROPERTY_PAYMENT_METHOD_SPECIFIC_INPUT
})
public class OrderRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ORDER_TYPE = "orderType";
  private OrderType orderType;

  public static final String JSON_PROPERTY_ORDER_REFERENCES = "orderReferences";
  private References orderReferences;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<OrderItem> items;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_SPECIFIC_INPUT = "paymentMethodSpecificInput";
  private PaymentMethodSpecificInput paymentMethodSpecificInput;

  public OrderRequest() {
  }

  public OrderRequest orderType(OrderType orderType) {

    this.orderType = orderType;
    return this;
  }

  /**
   * Get orderType
   * 
   * @return orderType
   **/

  @JsonProperty(JSON_PROPERTY_ORDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrderType getOrderType() {
    return orderType;
  }

  @JsonProperty(JSON_PROPERTY_ORDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderType(OrderType orderType) {
    this.orderType = orderType;
  }

  public OrderRequest orderReferences(References orderReferences) {

    this.orderReferences = orderReferences;
    return this;
  }

  /**
   * Get orderReferences
   * 
   * @return orderReferences
   **/

  @JsonProperty(JSON_PROPERTY_ORDER_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public References getOrderReferences() {
    return orderReferences;
  }

  @JsonProperty(JSON_PROPERTY_ORDER_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderReferences(References orderReferences) {
    this.orderReferences = orderReferences;
  }

  public OrderRequest items(List<OrderItem> items) {

    this.items = items;
    return this;
  }

  public OrderRequest addItemsItem(OrderItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * 
   * @return items
   **/

  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OrderItem> getItems() {
    return items;
  }

  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<OrderItem> items) {
    this.items = items;
  }

  public OrderRequest paymentMethodSpecificInput(PaymentMethodSpecificInput paymentMethodSpecificInput) {

    this.paymentMethodSpecificInput = paymentMethodSpecificInput;
    return this;
  }

  /**
   * Get paymentMethodSpecificInput
   * 
   * @return paymentMethodSpecificInput
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentMethodSpecificInput getPaymentMethodSpecificInput() {
    return paymentMethodSpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethodSpecificInput(PaymentMethodSpecificInput paymentMethodSpecificInput) {
    this.paymentMethodSpecificInput = paymentMethodSpecificInput;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderRequest orderRequest = (OrderRequest) o;
    return Objects.equals(this.orderType, orderRequest.orderType) &&
        Objects.equals(this.orderReferences, orderRequest.orderReferences) &&
        Objects.equals(this.items, orderRequest.items) &&
        Objects.equals(this.paymentMethodSpecificInput, orderRequest.paymentMethodSpecificInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderType, orderReferences, items, paymentMethodSpecificInput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderRequest {\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    orderReferences: ").append(toIndentedString(orderReferences)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    paymentMethodSpecificInput: ").append(toIndentedString(paymentMethodSpecificInput)).append("\n");
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
