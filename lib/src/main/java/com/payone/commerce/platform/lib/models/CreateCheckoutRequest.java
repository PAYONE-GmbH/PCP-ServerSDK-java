package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Request to create a Checkout for a Commerce Case. The payment for the
 * Checkout can be directly executed if autoExecuteOrder &#x3D; true. In this
 * case, the paymentMethodSpecificInput must be provided and only a full order
 * is possible. If no amountOfMoney is provided, the platform will calculate the
 * respective Checkout amount based on the cartItem productPrice and quantity.
 * In case of a payment error, the payment can be retried by providing the
 * respective commerceCaseId and checkoutId to the the Order or Payment
 * Execution endpoint.
 */
@JsonPropertyOrder({
    CreateCheckoutRequest.JSON_PROPERTY_AMOUNT_OF_MONEY,
    CreateCheckoutRequest.JSON_PROPERTY_REFERENCES,
    CreateCheckoutRequest.JSON_PROPERTY_SHIPPING,
    CreateCheckoutRequest.JSON_PROPERTY_SHOPPING_CART,
    CreateCheckoutRequest.JSON_PROPERTY_ORDER_REQUEST,
    CreateCheckoutRequest.JSON_PROPERTY_CREATION_DATE_TIME,
    CreateCheckoutRequest.JSON_PROPERTY_AUTO_EXECUTE_ORDER
})
public class CreateCheckoutRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AMOUNT_OF_MONEY = "amountOfMoney";
  private AmountOfMoney amountOfMoney;

  public static final String JSON_PROPERTY_REFERENCES = "references";
  private CheckoutReferences references;

  public static final String JSON_PROPERTY_SHIPPING = "shipping";
  private Shipping shipping;

  public static final String JSON_PROPERTY_SHOPPING_CART = "shoppingCart";
  private ShoppingCartInput shoppingCart;

  public static final String JSON_PROPERTY_ORDER_REQUEST = "orderRequest";
  private OrderRequest orderRequest;

  public static final String JSON_PROPERTY_CREATION_DATE_TIME = "creationDateTime";
  private OffsetDateTime creationDateTime;

  public static final String JSON_PROPERTY_AUTO_EXECUTE_ORDER = "autoExecuteOrder";
  private Boolean autoExecuteOrder = false;

  public CreateCheckoutRequest() {
  }

  public CreateCheckoutRequest amountOfMoney(AmountOfMoney amountOfMoney) {

    this.amountOfMoney = amountOfMoney;
    return this;
  }

  /**
   * Get amountOfMoney
   * 
   * @return amountOfMoney
   **/

  @JsonProperty(JSON_PROPERTY_AMOUNT_OF_MONEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AmountOfMoney getAmountOfMoney() {
    return amountOfMoney;
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT_OF_MONEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountOfMoney(AmountOfMoney amountOfMoney) {
    this.amountOfMoney = amountOfMoney;
  }

  public CreateCheckoutRequest references(CheckoutReferences references) {

    this.references = references;
    return this;
  }

  /**
   * Get references
   * 
   * @return references
   **/

  @JsonProperty(JSON_PROPERTY_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CheckoutReferences getReferences() {
    return references;
  }

  @JsonProperty(JSON_PROPERTY_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferences(CheckoutReferences references) {
    this.references = references;
  }

  public CreateCheckoutRequest shipping(Shipping shipping) {

    this.shipping = shipping;
    return this;
  }

  /**
   * Get shipping
   * 
   * @return shipping
   **/

  @JsonProperty(JSON_PROPERTY_SHIPPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Shipping getShipping() {
    return shipping;
  }

  @JsonProperty(JSON_PROPERTY_SHIPPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShipping(Shipping shipping) {
    this.shipping = shipping;
  }

  public CreateCheckoutRequest shoppingCart(ShoppingCartInput shoppingCart) {

    this.shoppingCart = shoppingCart;
    return this;
  }

  /**
   * Get shoppingCart
   * 
   * @return shoppingCart
   **/

  @JsonProperty(JSON_PROPERTY_SHOPPING_CART)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShoppingCartInput getShoppingCart() {
    return shoppingCart;
  }

  @JsonProperty(JSON_PROPERTY_SHOPPING_CART)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShoppingCart(ShoppingCartInput shoppingCart) {
    this.shoppingCart = shoppingCart;
  }

  public CreateCheckoutRequest orderRequest(OrderRequest orderRequest) {

    this.orderRequest = orderRequest;
    return this;
  }

  /**
   * Get orderRequest
   * 
   * @return orderRequest
   **/

  @JsonProperty(JSON_PROPERTY_ORDER_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrderRequest getOrderRequest() {
    return orderRequest;
  }

  @JsonProperty(JSON_PROPERTY_ORDER_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderRequest(OrderRequest orderRequest) {
    this.orderRequest = orderRequest;
  }

  public CreateCheckoutRequest creationDateTime(OffsetDateTime creationDateTime) {

    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Creation date and time of the Checkout in RFC3339 format. It can either be
   * provided in the request or otherwise will be automatically set to the time
   * when the request CreateCommerceCase was received. Response values will always
   * be in UTC time, but when providing this field in the requests, the time
   * offset can have different formats. Accepted formats are: *
   * YYYY-MM-DD&#39;T&#39;HH:mm:ss&#39;Z&#39; *
   * YYYY-MM-DD&#39;T&#39;HH:mm:ss+XX:XX * YYYY-MM-DD&#39;T&#39;HH:mm:ss-XX:XX *
   * YYYY-MM-DD&#39;T&#39;HH:mm&#39;Z&#39; * YYYY-MM-DD&#39;T&#39;HH:mm+XX:XX *
   * YYYY-MM-DD&#39;T&#39;HH:mm-XX:XX All other formats may be ignored by the
   * system.
   * 
   * @return creationDateTime
   **/

  @JsonProperty(JSON_PROPERTY_CREATION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }

  @JsonProperty(JSON_PROPERTY_CREATION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public CreateCheckoutRequest autoExecuteOrder(Boolean autoExecuteOrder) {

    this.autoExecuteOrder = autoExecuteOrder;
    return this;
  }

  /**
   * Set this flag to directly execute a payment when creating a Commerce Case or
   * Checkout. If the value for autoExecuteOrder is set to true, the
   * paymentMethodSpecificInput for the order is mandatory and has to be provided.
   * The autoExecuteOrder can only be used for orderType &#x3D; full.
   * 
   * @return autoExecuteOrder
   **/

  @JsonProperty(JSON_PROPERTY_AUTO_EXECUTE_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoExecuteOrder() {
    return autoExecuteOrder;
  }

  @JsonProperty(JSON_PROPERTY_AUTO_EXECUTE_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoExecuteOrder(Boolean autoExecuteOrder) {
    this.autoExecuteOrder = autoExecuteOrder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCheckoutRequest createCheckoutRequest = (CreateCheckoutRequest) o;
    return Objects.equals(this.amountOfMoney, createCheckoutRequest.amountOfMoney) &&
        Objects.equals(this.references, createCheckoutRequest.references) &&
        Objects.equals(this.shipping, createCheckoutRequest.shipping) &&
        Objects.equals(this.shoppingCart, createCheckoutRequest.shoppingCart) &&
        Objects.equals(this.orderRequest, createCheckoutRequest.orderRequest) &&
        Objects.equals(this.creationDateTime, createCheckoutRequest.creationDateTime) &&
        Objects.equals(this.autoExecuteOrder, createCheckoutRequest.autoExecuteOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountOfMoney, references, shipping, shoppingCart, orderRequest, creationDateTime,
        autoExecuteOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCheckoutRequest {\n");
    sb.append("    amountOfMoney: ").append(toIndentedString(amountOfMoney)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    shoppingCart: ").append(toIndentedString(shoppingCart)).append("\n");
    sb.append("    orderRequest: ").append(toIndentedString(orderRequest)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    autoExecuteOrder: ").append(toIndentedString(autoExecuteOrder)).append("\n");
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
