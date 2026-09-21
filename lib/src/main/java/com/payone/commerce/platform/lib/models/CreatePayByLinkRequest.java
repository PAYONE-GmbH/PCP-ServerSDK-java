package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/** Request object for pay-link generation. */
@JsonPropertyOrder({ CreatePayByLinkRequest.JSON_PROPERTY_PAYMENT_LINK_SPECIFIC_INPUT,
    CreatePayByLinkRequest.JSON_PROPERTY_ORDER_TYPE, CreatePayByLinkRequest.JSON_PROPERTY_ITEMS,
    CreatePayByLinkRequest.JSON_PROPERTY_ORDER_REFERENCES })
public class CreatePayByLinkRequest implements Serializable {
  private static final long serialVersionUID = 1L;
  public static final String JSON_PROPERTY_PAYMENT_LINK_SPECIFIC_INPUT = "paymentLinkSpecificInput";
  private PaymentLinkSpecificInput paymentLinkSpecificInput;
  public static final String JSON_PROPERTY_ORDER_TYPE = "orderType";
  private OrderType orderType;
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<OrderItem> items;
  public static final String JSON_PROPERTY_ORDER_REFERENCES = "orderReferences";
  private References orderReferences;

  public CreatePayByLinkRequest paymentLinkSpecificInput(PaymentLinkSpecificInput value) {
    paymentLinkSpecificInput = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_LINK_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public PaymentLinkSpecificInput getPaymentLinkSpecificInput() {
    return paymentLinkSpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_LINK_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentLinkSpecificInput(PaymentLinkSpecificInput value) {
    paymentLinkSpecificInput = value;
  }

  public CreatePayByLinkRequest orderType(OrderType value) {
    orderType = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_ORDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OrderType getOrderType() {
    return orderType;
  }

  @JsonProperty(JSON_PROPERTY_ORDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderType(OrderType value) {
    orderType = value;
  }

  public CreatePayByLinkRequest items(List<OrderItem> value) {
    items = value;
    return this;
  }

  public CreatePayByLinkRequest addItemsItem(OrderItem value) {
    if (items == null) {
      items = new ArrayList<>();
    }
    items.add(value);
    return this;
  }

  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<OrderItem> getItems() {
    return items;
  }

  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<OrderItem> value) {
    items = value;
  }

  public CreatePayByLinkRequest orderReferences(References value) {
    orderReferences = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_ORDER_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public References getOrderReferences() {
    return orderReferences;
  }

  @JsonProperty(JSON_PROPERTY_ORDER_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderReferences(References value) {
    orderReferences = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePayByLinkRequest that = (CreatePayByLinkRequest) o;
    return Objects.equals(paymentLinkSpecificInput, that.paymentLinkSpecificInput) && orderType == that.orderType
        && Objects.equals(items, that.items) && Objects.equals(orderReferences, that.orderReferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentLinkSpecificInput, orderType, items, orderReferences);
  }
}
