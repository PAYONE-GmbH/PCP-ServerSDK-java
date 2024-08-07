package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing the reference of the Checkout for following requests.
 */
@JsonPropertyOrder({
    CreateCheckoutResponse.JSON_PROPERTY_CHECKOUT_ID,
    CreateCheckoutResponse.JSON_PROPERTY_SHOPPING_CART,
    CreateCheckoutResponse.JSON_PROPERTY_PAYMENT_RESPONSE,
    CreateCheckoutResponse.JSON_PROPERTY_ERROR_RESPONSE,
    CreateCheckoutResponse.JSON_PROPERTY_AMOUNT_OF_MONEY,
    CreateCheckoutResponse.JSON_PROPERTY_REFERENCES,
    CreateCheckoutResponse.JSON_PROPERTY_SHIPPING,
    CreateCheckoutResponse.JSON_PROPERTY_PAYMENT_EXECUTION,
    CreateCheckoutResponse.JSON_PROPERTY_CHECKOUT_STATUS,
    CreateCheckoutResponse.JSON_PROPERTY_STATUS_OUTPUT,
    CreateCheckoutResponse.JSON_PROPERTY_CREATION_DATE_TIME,
    CreateCheckoutResponse.JSON_PROPERTY_ALLOWED_PAYMENT_ACTIONS
})
public class CreateCheckoutResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CHECKOUT_ID = "checkoutId";
  private UUID checkoutId;

  public static final String JSON_PROPERTY_SHOPPING_CART = "shoppingCart";
  private ShoppingCartResult shoppingCart;

  public static final String JSON_PROPERTY_PAYMENT_RESPONSE = "paymentResponse";
  private CreatePaymentResponse paymentResponse;

  public static final String JSON_PROPERTY_ERROR_RESPONSE = "errorResponse";
  private ErrorResponse errorResponse;

  public static final String JSON_PROPERTY_AMOUNT_OF_MONEY = "amountOfMoney";
  private AmountOfMoney amountOfMoney;

  public static final String JSON_PROPERTY_REFERENCES = "references";
  private CheckoutReferences references;

  public static final String JSON_PROPERTY_SHIPPING = "shipping";
  private Shipping shipping;

  public static final String JSON_PROPERTY_PAYMENT_EXECUTION = "paymentExecution";
  private PaymentExecution paymentExecution;

  public static final String JSON_PROPERTY_CHECKOUT_STATUS = "checkoutStatus";
  private StatusCheckout checkoutStatus;

  public static final String JSON_PROPERTY_STATUS_OUTPUT = "statusOutput";
  private StatusOutput statusOutput;

  public static final String JSON_PROPERTY_CREATION_DATE_TIME = "creationDateTime";
  private OffsetDateTime creationDateTime;

  public static final String JSON_PROPERTY_ALLOWED_PAYMENT_ACTIONS = "allowedPaymentActions";
  private List<AllowedPaymentActions> allowedPaymentActions;

  public CreateCheckoutResponse() {
  }

  public CreateCheckoutResponse checkoutId(UUID checkoutId) {

    this.checkoutId = checkoutId;
    return this;
  }

  /**
   * Reference to the Checkout. Can be used for following requests to get and
   * update the Checkout and execute the payment.
   * 
   * @return checkoutId
   **/

  @JsonProperty(JSON_PROPERTY_CHECKOUT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCheckoutId() {
    return checkoutId;
  }

  @JsonProperty(JSON_PROPERTY_CHECKOUT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckoutId(UUID checkoutId) {
    this.checkoutId = checkoutId;
  }

  public CreateCheckoutResponse shoppingCart(ShoppingCartResult shoppingCart) {

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

  public ShoppingCartResult getShoppingCart() {
    return shoppingCart;
  }

  @JsonProperty(JSON_PROPERTY_SHOPPING_CART)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShoppingCart(ShoppingCartResult shoppingCart) {
    this.shoppingCart = shoppingCart;
  }

  public CreateCheckoutResponse paymentResponse(CreatePaymentResponse paymentResponse) {

    this.paymentResponse = paymentResponse;
    return this;
  }

  /**
   * Get paymentResponse
   * 
   * @return paymentResponse
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreatePaymentResponse getPaymentResponse() {
    return paymentResponse;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentResponse(CreatePaymentResponse paymentResponse) {
    this.paymentResponse = paymentResponse;
  }

  public CreateCheckoutResponse errorResponse(ErrorResponse errorResponse) {

    this.errorResponse = errorResponse;
    return this;
  }

  /**
   * Get errorResponse
   * 
   * @return errorResponse
   **/

  @JsonProperty(JSON_PROPERTY_ERROR_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ErrorResponse getErrorResponse() {
    return errorResponse;
  }

  @JsonProperty(JSON_PROPERTY_ERROR_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorResponse(ErrorResponse errorResponse) {
    this.errorResponse = errorResponse;
  }

  public CreateCheckoutResponse amountOfMoney(AmountOfMoney amountOfMoney) {

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

  public CreateCheckoutResponse references(CheckoutReferences references) {

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

  public CreateCheckoutResponse shipping(Shipping shipping) {

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

  public CreateCheckoutResponse paymentExecution(PaymentExecution paymentExecution) {

    this.paymentExecution = paymentExecution;
    return this;
  }

  /**
   * Get paymentExecution
   * 
   * @return paymentExecution
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_EXECUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentExecution getPaymentExecution() {
    return paymentExecution;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_EXECUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentExecution(PaymentExecution paymentExecution) {
    this.paymentExecution = paymentExecution;
  }

  public CreateCheckoutResponse checkoutStatus(StatusCheckout checkoutStatus) {

    this.checkoutStatus = checkoutStatus;
    return this;
  }

  /**
   * Get checkoutStatus
   * 
   * @return checkoutStatus
   **/

  @JsonProperty(JSON_PROPERTY_CHECKOUT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusCheckout getCheckoutStatus() {
    return checkoutStatus;
  }

  @JsonProperty(JSON_PROPERTY_CHECKOUT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckoutStatus(StatusCheckout checkoutStatus) {
    this.checkoutStatus = checkoutStatus;
  }

  public CreateCheckoutResponse statusOutput(StatusOutput statusOutput) {

    this.statusOutput = statusOutput;
    return this;
  }

  /**
   * Get statusOutput
   * 
   * @return statusOutput
   **/

  @JsonProperty(JSON_PROPERTY_STATUS_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusOutput getStatusOutput() {
    return statusOutput;
  }

  @JsonProperty(JSON_PROPERTY_STATUS_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusOutput(StatusOutput statusOutput) {
    this.statusOutput = statusOutput;
  }

  public CreateCheckoutResponse creationDateTime(OffsetDateTime creationDateTime) {

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

  public CreateCheckoutResponse allowedPaymentActions(List<AllowedPaymentActions> allowedPaymentActions) {

    this.allowedPaymentActions = allowedPaymentActions;
    return this;
  }

  public CreateCheckoutResponse addAllowedPaymentActionsItem(AllowedPaymentActions allowedPaymentActionsItem) {
    if (this.allowedPaymentActions == null) {
      this.allowedPaymentActions = new ArrayList<>();
    }
    this.allowedPaymentActions.add(allowedPaymentActionsItem);
    return this;
  }

  /**
   * Get allowedPaymentActions
   * 
   * @return allowedPaymentActions
   **/

  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AllowedPaymentActions> getAllowedPaymentActions() {
    return allowedPaymentActions;
  }

  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedPaymentActions(List<AllowedPaymentActions> allowedPaymentActions) {
    this.allowedPaymentActions = allowedPaymentActions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCheckoutResponse createCheckoutResponse = (CreateCheckoutResponse) o;
    return Objects.equals(this.checkoutId, createCheckoutResponse.checkoutId) &&
        Objects.equals(this.shoppingCart, createCheckoutResponse.shoppingCart) &&
        Objects.equals(this.paymentResponse, createCheckoutResponse.paymentResponse) &&
        Objects.equals(this.errorResponse, createCheckoutResponse.errorResponse) &&
        Objects.equals(this.amountOfMoney, createCheckoutResponse.amountOfMoney) &&
        Objects.equals(this.references, createCheckoutResponse.references) &&
        Objects.equals(this.shipping, createCheckoutResponse.shipping) &&
        Objects.equals(this.paymentExecution, createCheckoutResponse.paymentExecution) &&
        Objects.equals(this.checkoutStatus, createCheckoutResponse.checkoutStatus) &&
        Objects.equals(this.statusOutput, createCheckoutResponse.statusOutput) &&
        Objects.equals(this.creationDateTime, createCheckoutResponse.creationDateTime) &&
        Objects.equals(this.allowedPaymentActions, createCheckoutResponse.allowedPaymentActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutId, shoppingCart, paymentResponse, errorResponse, amountOfMoney, references, shipping,
        paymentExecution, checkoutStatus, statusOutput, creationDateTime, allowedPaymentActions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCheckoutResponse {\n");
    sb.append("    checkoutId: ").append(toIndentedString(checkoutId)).append("\n");
    sb.append("    shoppingCart: ").append(toIndentedString(shoppingCart)).append("\n");
    sb.append("    paymentResponse: ").append(toIndentedString(paymentResponse)).append("\n");
    sb.append("    errorResponse: ").append(toIndentedString(errorResponse)).append("\n");
    sb.append("    amountOfMoney: ").append(toIndentedString(amountOfMoney)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    paymentExecution: ").append(toIndentedString(paymentExecution)).append("\n");
    sb.append("    checkoutStatus: ").append(toIndentedString(checkoutStatus)).append("\n");
    sb.append("    statusOutput: ").append(toIndentedString(statusOutput)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    allowedPaymentActions: ").append(toIndentedString(allowedPaymentActions)).append("\n");
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
