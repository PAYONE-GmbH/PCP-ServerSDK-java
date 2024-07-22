package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The Checkout corresponds to the order of the WL API. We do not take
 * additionalInput from the WL API. We have no shipping and use deliveryAddress
 * instead of address.
 */
@JsonPropertyOrder({
    CheckoutResponse.JSON_PROPERTY_COMMERCE_CASE_ID,
    CheckoutResponse.JSON_PROPERTY_CHECKOUT_ID,
    CheckoutResponse.JSON_PROPERTY_MERCHANT_CUSTOMER_ID,
    CheckoutResponse.JSON_PROPERTY_AMOUNT_OF_MONEY,
    CheckoutResponse.JSON_PROPERTY_REFERENCES,
    CheckoutResponse.JSON_PROPERTY_SHIPPING,
    CheckoutResponse.JSON_PROPERTY_SHOPPING_CART,
    CheckoutResponse.JSON_PROPERTY_PAYMENT_EXECUTIONS,
    CheckoutResponse.JSON_PROPERTY_CHECKOUT_STATUS,
    CheckoutResponse.JSON_PROPERTY_STATUS_OUTPUT,
    CheckoutResponse.JSON_PROPERTY_PAYMENT_INFORMATION,
    CheckoutResponse.JSON_PROPERTY_CREATION_DATE_TIME,
    CheckoutResponse.JSON_PROPERTY_ALLOWED_PAYMENT_ACTIONS
})
public class CheckoutResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_COMMERCE_CASE_ID = "commerceCaseId";
  private UUID commerceCaseId;

  public static final String JSON_PROPERTY_CHECKOUT_ID = "checkoutId";
  private UUID checkoutId;

  public static final String JSON_PROPERTY_MERCHANT_CUSTOMER_ID = "merchantCustomerId";
  private String merchantCustomerId;

  public static final String JSON_PROPERTY_AMOUNT_OF_MONEY = "amountOfMoney";
  private AmountOfMoney amountOfMoney;

  public static final String JSON_PROPERTY_REFERENCES = "references";
  private CheckoutReferences references;

  public static final String JSON_PROPERTY_SHIPPING = "shipping";
  private Shipping shipping;

  public static final String JSON_PROPERTY_SHOPPING_CART = "shoppingCart";
  private ShoppingCartResult shoppingCart;

  public static final String JSON_PROPERTY_PAYMENT_EXECUTIONS = "paymentExecutions";
  private List<PaymentExecution> paymentExecutions;

  public static final String JSON_PROPERTY_CHECKOUT_STATUS = "checkoutStatus";
  private StatusCheckout checkoutStatus;

  public static final String JSON_PROPERTY_STATUS_OUTPUT = "statusOutput";
  private StatusOutput statusOutput;

  public static final String JSON_PROPERTY_PAYMENT_INFORMATION = "paymentInformation";
  private List<PaymentInformationResponse> paymentInformation;

  public static final String JSON_PROPERTY_CREATION_DATE_TIME = "creationDateTime";
  private Date creationDateTime;

  public static final String JSON_PROPERTY_ALLOWED_PAYMENT_ACTIONS = "allowedPaymentActions";
  private List<AllowedPaymentActions> allowedPaymentActions;

  public CheckoutResponse() {
  }

  public CheckoutResponse commerceCaseId(UUID commerceCaseId) {

    this.commerceCaseId = commerceCaseId;
    return this;
  }

  /**
   * reference to the Commerce Case.
   * 
   * @return commerceCaseId
   **/

  @JsonProperty(JSON_PROPERTY_COMMERCE_CASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCommerceCaseId() {
    return commerceCaseId;
  }

  @JsonProperty(JSON_PROPERTY_COMMERCE_CASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommerceCaseId(UUID commerceCaseId) {
    this.commerceCaseId = commerceCaseId;
  }

  public CheckoutResponse checkoutId(UUID checkoutId) {

    this.checkoutId = checkoutId;
    return this;
  }

  /**
   * reference to the Checkout.
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

  public CheckoutResponse merchantCustomerId(String merchantCustomerId) {

    this.merchantCustomerId = merchantCustomerId;
    return this;
  }

  /**
   * Unique identifier for the customer.
   * 
   * @return merchantCustomerId
   **/

  @JsonProperty(JSON_PROPERTY_MERCHANT_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantCustomerId() {
    return merchantCustomerId;
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantCustomerId(String merchantCustomerId) {
    this.merchantCustomerId = merchantCustomerId;
  }

  public CheckoutResponse amountOfMoney(AmountOfMoney amountOfMoney) {

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

  public CheckoutResponse references(CheckoutReferences references) {

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

  public CheckoutResponse shipping(Shipping shipping) {

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

  public CheckoutResponse shoppingCart(ShoppingCartResult shoppingCart) {

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

  public CheckoutResponse paymentExecutions(List<PaymentExecution> paymentExecutions) {

    this.paymentExecutions = paymentExecutions;
    return this;
  }

  public CheckoutResponse addPaymentExecutionsItem(PaymentExecution paymentExecutionsItem) {
    if (this.paymentExecutions == null) {
      this.paymentExecutions = new ArrayList<>();
    }
    this.paymentExecutions.add(paymentExecutionsItem);
    return this;
  }

  /**
   * Get paymentExecutions
   * 
   * @return paymentExecutions
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_EXECUTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PaymentExecution> getPaymentExecutions() {
    return paymentExecutions;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_EXECUTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentExecutions(List<PaymentExecution> paymentExecutions) {
    this.paymentExecutions = paymentExecutions;
  }

  public CheckoutResponse checkoutStatus(StatusCheckout checkoutStatus) {

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

  public CheckoutResponse statusOutput(StatusOutput statusOutput) {

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

  public CheckoutResponse paymentInformation(List<PaymentInformationResponse> paymentInformation) {

    this.paymentInformation = paymentInformation;
    return this;
  }

  public CheckoutResponse addPaymentInformationItem(PaymentInformationResponse paymentInformationItem) {
    if (this.paymentInformation == null) {
      this.paymentInformation = new ArrayList<>();
    }
    this.paymentInformation.add(paymentInformationItem);
    return this;
  }

  /**
   * Get paymentInformation
   * 
   * @return paymentInformation
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PaymentInformationResponse> getPaymentInformation() {
    return paymentInformation;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentInformation(List<PaymentInformationResponse> paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public CheckoutResponse creationDateTime(Date creationDateTime) {

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

  public Date getCreationDateTime() {
    return creationDateTime;
  }

  @JsonProperty(JSON_PROPERTY_CREATION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreationDateTime(Date creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public CheckoutResponse allowedPaymentActions(List<AllowedPaymentActions> allowedPaymentActions) {

    this.allowedPaymentActions = allowedPaymentActions;
    return this;
  }

  public CheckoutResponse addAllowedPaymentActionsItem(AllowedPaymentActions allowedPaymentActionsItem) {
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
    CheckoutResponse checkoutResponse = (CheckoutResponse) o;
    return Objects.equals(this.commerceCaseId, checkoutResponse.commerceCaseId) &&
        Objects.equals(this.checkoutId, checkoutResponse.checkoutId) &&
        Objects.equals(this.merchantCustomerId, checkoutResponse.merchantCustomerId) &&
        Objects.equals(this.amountOfMoney, checkoutResponse.amountOfMoney) &&
        Objects.equals(this.references, checkoutResponse.references) &&
        Objects.equals(this.shipping, checkoutResponse.shipping) &&
        Objects.equals(this.shoppingCart, checkoutResponse.shoppingCart) &&
        Objects.equals(this.paymentExecutions, checkoutResponse.paymentExecutions) &&
        Objects.equals(this.checkoutStatus, checkoutResponse.checkoutStatus) &&
        Objects.equals(this.statusOutput, checkoutResponse.statusOutput) &&
        Objects.equals(this.paymentInformation, checkoutResponse.paymentInformation) &&
        Objects.equals(this.creationDateTime, checkoutResponse.creationDateTime) &&
        Objects.equals(this.allowedPaymentActions, checkoutResponse.allowedPaymentActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commerceCaseId, checkoutId, merchantCustomerId, amountOfMoney, references, shipping,
        shoppingCart, paymentExecutions, checkoutStatus, statusOutput, paymentInformation, creationDateTime,
        allowedPaymentActions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutResponse {\n");
    sb.append("    commerceCaseId: ").append(toIndentedString(commerceCaseId)).append("\n");
    sb.append("    checkoutId: ").append(toIndentedString(checkoutId)).append("\n");
    sb.append("    merchantCustomerId: ").append(toIndentedString(merchantCustomerId)).append("\n");
    sb.append("    amountOfMoney: ").append(toIndentedString(amountOfMoney)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    shoppingCart: ").append(toIndentedString(shoppingCart)).append("\n");
    sb.append("    paymentExecutions: ").append(toIndentedString(paymentExecutions)).append("\n");
    sb.append("    checkoutStatus: ").append(toIndentedString(checkoutStatus)).append("\n");
    sb.append("    statusOutput: ").append(toIndentedString(statusOutput)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
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
