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
 * Object containing the related data of the created Payment Information.
 */
@JsonPropertyOrder({
    PaymentInformationResponse.JSON_PROPERTY_COMMERCE_CASE_ID,
    PaymentInformationResponse.JSON_PROPERTY_CHECKOUT_ID,
    PaymentInformationResponse.JSON_PROPERTY_MERCHANT_CUSTOMER_ID,
    PaymentInformationResponse.JSON_PROPERTY_PAYMENT_INFORMATION_ID,
    PaymentInformationResponse.JSON_PROPERTY_PAYMENT_CHANNEL,
    PaymentInformationResponse.JSON_PROPERTY_PAYMENT_PRODUCT_ID,
    PaymentInformationResponse.JSON_PROPERTY_TERMINAL_ID,
    PaymentInformationResponse.JSON_PROPERTY_CARD_ACCEPTOR_ID,
    PaymentInformationResponse.JSON_PROPERTY_MERCHANT_REFERENCE,
    PaymentInformationResponse.JSON_PROPERTY_CREATION_DATE_TIME,
    PaymentInformationResponse.JSON_PROPERTY_LAST_UPDATED,
    PaymentInformationResponse.JSON_PROPERTY_CARD_PAYMENT_DETAILS,
    PaymentInformationResponse.JSON_PROPERTY_EVENTS
})

public class PaymentInformationResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_COMMERCE_CASE_ID = "commerceCaseId";

  private UUID commerceCaseId;

  public static final String JSON_PROPERTY_CHECKOUT_ID = "checkoutId";

  private UUID checkoutId;

  public static final String JSON_PROPERTY_MERCHANT_CUSTOMER_ID = "merchantCustomerId";

  private String merchantCustomerId;

  public static final String JSON_PROPERTY_PAYMENT_INFORMATION_ID = "paymentInformationId";

  private UUID paymentInformationId;

  public static final String JSON_PROPERTY_PAYMENT_CHANNEL = "paymentChannel";

  private PaymentChannel paymentChannel;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT_ID = "paymentProductId";

  private Integer paymentProductId;

  public static final String JSON_PROPERTY_TERMINAL_ID = "terminalId";

  private String terminalId;

  public static final String JSON_PROPERTY_CARD_ACCEPTOR_ID = "cardAcceptorId";

  private String cardAcceptorId;

  public static final String JSON_PROPERTY_MERCHANT_REFERENCE = "merchantReference";

  private String merchantReference;

  public static final String JSON_PROPERTY_CREATION_DATE_TIME = "creationDateTime";

  private OffsetDateTime creationDateTime;

  public static final String JSON_PROPERTY_LAST_UPDATED = "lastUpdated";

  private OffsetDateTime lastUpdated;

  public static final String JSON_PROPERTY_CARD_PAYMENT_DETAILS = "cardPaymentDetails";

  private CardPaymentDetails cardPaymentDetails;

  public static final String JSON_PROPERTY_EVENTS = "events";

  private List<PaymentEvent> events = new ArrayList<>();

  public PaymentInformationResponse() {
  }

  public PaymentInformationResponse commerceCaseId(UUID commerceCaseId) {
    this.commerceCaseId = commerceCaseId;
    return this;
  }

  /**
   * Unique ID of the Commerce Case.
   * 
   * @return commerceCaseId
   */

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

  public PaymentInformationResponse checkoutId(UUID checkoutId) {
    this.checkoutId = checkoutId;
    return this;
  }

  /**
   * Unique ID of the Commerce Case.
   * 
   * @return checkoutId
   */

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

  public PaymentInformationResponse merchantCustomerId(String merchantCustomerId) {
    this.merchantCustomerId = merchantCustomerId;
    return this;
  }

  /**
   * Unique identifier of the customer.
   * 
   * @return merchantCustomerId
   */

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

  public PaymentInformationResponse paymentInformationId(UUID paymentInformationId) {
    this.paymentInformationId = paymentInformationId;
    return this;
  }

  /**
   * Unique ID of the Payment Information.
   * 
   * @return paymentInformationId
   */

  @JsonProperty(JSON_PROPERTY_PAYMENT_INFORMATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getPaymentInformationId() {
    return paymentInformationId;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_INFORMATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentInformationId(UUID paymentInformationId) {
    this.paymentInformationId = paymentInformationId;
  }

  public PaymentInformationResponse paymentChannel(PaymentChannel paymentChannel) {
    this.paymentChannel = paymentChannel;
    return this;
  }

  /**
   * Get paymentChannel
   * 
   * @return paymentChannel
   */

  @JsonProperty(JSON_PROPERTY_PAYMENT_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PaymentChannel getPaymentChannel() {
    return paymentChannel;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentChannel(PaymentChannel paymentChannel) {
    this.paymentChannel = paymentChannel;
  }

  public PaymentInformationResponse paymentProductId(Integer paymentProductId) {
    this.paymentProductId = paymentProductId;
    return this;
  }

  /**
   * Payment product identifier - please check see product documentation for a
   * full overview of possible values.
   * minimum: 0
   * maximum: 99999
   * 
   * @return paymentProductId
   */

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getPaymentProductId() {
    return paymentProductId;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentProductId(Integer paymentProductId) {
    this.paymentProductId = paymentProductId;
  }

  public PaymentInformationResponse terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

  /**
   * Unique identifier of the POS terminal of the payment transaction.
   * 
   * @return terminalId
   */

  @JsonProperty(JSON_PROPERTY_TERMINAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTerminalId() {
    return terminalId;
  }

  @JsonProperty(JSON_PROPERTY_TERMINAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  public PaymentInformationResponse cardAcceptorId(String cardAcceptorId) {
    this.cardAcceptorId = cardAcceptorId;
    return this;
  }

  /**
   * Unique ID that identifies a store location or transaction point and which
   * refers to the contract number of the merchant accepting the card.
   * 
   * @return cardAcceptorId
   */

  @JsonProperty(JSON_PROPERTY_CARD_ACCEPTOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCardAcceptorId() {
    return cardAcceptorId;
  }

  @JsonProperty(JSON_PROPERTY_CARD_ACCEPTOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardAcceptorId(String cardAcceptorId) {
    this.cardAcceptorId = cardAcceptorId;
  }

  public PaymentInformationResponse merchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
    return this;
  }

  /**
   * Unique reference of the PaymentInformation. In case of card present
   * transactions, the reference from the ECR or terminal will be used. It is
   * always the reference for external transactions. (e.g. card present payments,
   * cash payments or payments processed by other payment providers).
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

  public PaymentInformationResponse creationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * The date and time when the payment was created. Format will be in one of the
   * following formats: * YYYY-MM-DD&#39;T&#39;HH:mm:ss&#39;Z&#39; *
   * YYYY-MM-DD&#39;T&#39;HH:mm:ss+XX:XX * YYYY-MM-DD&#39;T&#39;HH:mm:ss-XX:XX
   * 
   * @return creationDateTime
   */

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

  public PaymentInformationResponse lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * The date and time when the payment was last updated. Format will be in one of
   * the following formats: * YYYY-MM-DD&#39;T&#39;HH:mm:ss&#39;Z&#39; *
   * YYYY-MM-DD&#39;T&#39;HH:mm:ss+XX:XX * YYYY-MM-DD&#39;T&#39;HH:mm:ss-XX:XX
   * 
   * @return lastUpdated
   */

  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public PaymentInformationResponse cardPaymentDetails(CardPaymentDetails cardPaymentDetails) {
    this.cardPaymentDetails = cardPaymentDetails;
    return this;
  }

  /**
   * Get cardPaymentDetails
   * 
   * @return cardPaymentDetails
   */

  @JsonProperty(JSON_PROPERTY_CARD_PAYMENT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CardPaymentDetails getCardPaymentDetails() {
    return cardPaymentDetails;
  }

  @JsonProperty(JSON_PROPERTY_CARD_PAYMENT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardPaymentDetails(CardPaymentDetails cardPaymentDetails) {
    this.cardPaymentDetails = cardPaymentDetails;
  }

  public PaymentInformationResponse events(List<PaymentEvent> events) {
    this.events = events;
    return this;
  }

  public PaymentInformationResponse addEventsItem(PaymentEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

  /**
   * Get events
   * 
   * @return events
   */

  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<PaymentEvent> getEvents() {
    return events;
  }

  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvents(List<PaymentEvent> events) {
    this.events = events;
  }

  /**
   * Return true if this PaymentInformationResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInformationResponse paymentInformationResponse = (PaymentInformationResponse) o;
    return Objects.equals(this.commerceCaseId, paymentInformationResponse.commerceCaseId) &&
        Objects.equals(this.checkoutId, paymentInformationResponse.checkoutId) &&
        Objects.equals(this.merchantCustomerId, paymentInformationResponse.merchantCustomerId) &&
        Objects.equals(this.paymentInformationId, paymentInformationResponse.paymentInformationId) &&
        Objects.equals(this.paymentChannel, paymentInformationResponse.paymentChannel) &&
        Objects.equals(this.paymentProductId, paymentInformationResponse.paymentProductId) &&
        Objects.equals(this.terminalId, paymentInformationResponse.terminalId) &&
        Objects.equals(this.cardAcceptorId, paymentInformationResponse.cardAcceptorId) &&
        Objects.equals(this.merchantReference, paymentInformationResponse.merchantReference) &&
        Objects.equals(this.creationDateTime, paymentInformationResponse.creationDateTime) &&
        Objects.equals(this.lastUpdated, paymentInformationResponse.lastUpdated) &&
        Objects.equals(this.cardPaymentDetails, paymentInformationResponse.cardPaymentDetails) &&
        Objects.equals(this.events, paymentInformationResponse.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commerceCaseId, checkoutId, merchantCustomerId, paymentInformationId, paymentChannel,
        paymentProductId, terminalId, cardAcceptorId, merchantReference, creationDateTime, lastUpdated,
        cardPaymentDetails, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInformationResponse {\n");
    sb.append("    commerceCaseId: ").append(toIndentedString(commerceCaseId)).append("\n");
    sb.append("    checkoutId: ").append(toIndentedString(checkoutId)).append("\n");
    sb.append("    merchantCustomerId: ").append(toIndentedString(merchantCustomerId)).append("\n");
    sb.append("    paymentInformationId: ").append(toIndentedString(paymentInformationId)).append("\n");
    sb.append("    paymentChannel: ").append(toIndentedString(paymentChannel)).append("\n");
    sb.append("    paymentProductId: ").append(toIndentedString(paymentProductId)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    cardAcceptorId: ").append(toIndentedString(cardAcceptorId)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    cardPaymentDetails: ").append(toIndentedString(cardPaymentDetails)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
