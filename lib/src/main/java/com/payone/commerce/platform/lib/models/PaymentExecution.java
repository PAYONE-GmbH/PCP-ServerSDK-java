package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object contains information of the payment with a specific payment method.
 */
@JsonPropertyOrder({
    PaymentExecution.JSON_PROPERTY_PAYMENT_EXECUTION_ID,
    PaymentExecution.JSON_PROPERTY_PAYMENT_ID,
    PaymentExecution.JSON_PROPERTY_CARD_PAYMENT_METHOD_SPECIFIC_INPUT,
    PaymentExecution.JSON_PROPERTY_MOBILE_PAYMENT_METHOD_SPECIFIC_INPUT,
    PaymentExecution.JSON_PROPERTY_REDIRECT_PAYMENT_METHOD_SPECIFIC_INPUT,
    PaymentExecution.JSON_PROPERTY_SEPA_DIRECT_DEBIT_PAYMENT_METHOD_SPECIFIC_INPUT,
    PaymentExecution.JSON_PROPERTY_FINANCING_PAYMENT_METHOD_SPECIFIC_INPUT,
    PaymentExecution.JSON_PROPERTY_PAYMENT_CHANNEL,
    PaymentExecution.JSON_PROPERTY_REFERENCES,
    PaymentExecution.JSON_PROPERTY_EVENTS
})
public class PaymentExecution implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAYMENT_EXECUTION_ID = "paymentExecutionId";
  private UUID paymentExecutionId;

  public static final String JSON_PROPERTY_PAYMENT_ID = "paymentId";
  private String paymentId;

  public static final String JSON_PROPERTY_CARD_PAYMENT_METHOD_SPECIFIC_INPUT = "cardPaymentMethodSpecificInput";
  private CardPaymentMethodSpecificInput cardPaymentMethodSpecificInput;

  public static final String JSON_PROPERTY_MOBILE_PAYMENT_METHOD_SPECIFIC_INPUT = "mobilePaymentMethodSpecificInput";
  private MobilePaymentMethodSpecificInput mobilePaymentMethodSpecificInput;

  public static final String JSON_PROPERTY_REDIRECT_PAYMENT_METHOD_SPECIFIC_INPUT = "redirectPaymentMethodSpecificInput";
  private RedirectPaymentMethodSpecificInput redirectPaymentMethodSpecificInput;

  public static final String JSON_PROPERTY_SEPA_DIRECT_DEBIT_PAYMENT_METHOD_SPECIFIC_INPUT = "sepaDirectDebitPaymentMethodSpecificInput";
  private SepaDirectDebitPaymentMethodSpecificInput sepaDirectDebitPaymentMethodSpecificInput;

  public static final String JSON_PROPERTY_FINANCING_PAYMENT_METHOD_SPECIFIC_INPUT = "financingPaymentMethodSpecificInput";
  private FinancingPaymentMethodSpecificInput financingPaymentMethodSpecificInput;

  public static final String JSON_PROPERTY_PAYMENT_CHANNEL = "paymentChannel";
  private PaymentChannel paymentChannel;

  public static final String JSON_PROPERTY_REFERENCES = "references";
  private References references;

  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<PaymentEvent> events;

  public PaymentExecution() {
  }

  public PaymentExecution paymentExecutionId(UUID paymentExecutionId) {

    this.paymentExecutionId = paymentExecutionId;
    return this;
  }

  /**
   * Unique ID of paymentExecution.
   * 
   * @return paymentExecutionId
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_EXECUTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getPaymentExecutionId() {
    return paymentExecutionId;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_EXECUTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentExecutionId(UUID paymentExecutionId) {
    this.paymentExecutionId = paymentExecutionId;
  }

  public PaymentExecution paymentId(String paymentId) {

    this.paymentId = paymentId;
    return this;
  }

  /**
   * Unique payment transaction identifier of the payment gateway.
   * 
   * @return paymentId
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentId() {
    return paymentId;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public PaymentExecution cardPaymentMethodSpecificInput(
      CardPaymentMethodSpecificInput cardPaymentMethodSpecificInput) {

    this.cardPaymentMethodSpecificInput = cardPaymentMethodSpecificInput;
    return this;
  }

  /**
   * Get cardPaymentMethodSpecificInput
   * 
   * @return cardPaymentMethodSpecificInput
   **/

  @JsonProperty(JSON_PROPERTY_CARD_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CardPaymentMethodSpecificInput getCardPaymentMethodSpecificInput() {
    return cardPaymentMethodSpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_CARD_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardPaymentMethodSpecificInput(CardPaymentMethodSpecificInput cardPaymentMethodSpecificInput) {
    this.cardPaymentMethodSpecificInput = cardPaymentMethodSpecificInput;
  }

  public PaymentExecution mobilePaymentMethodSpecificInput(
      MobilePaymentMethodSpecificInput mobilePaymentMethodSpecificInput) {

    this.mobilePaymentMethodSpecificInput = mobilePaymentMethodSpecificInput;
    return this;
  }

  /**
   * Get mobilePaymentMethodSpecificInput
   * 
   * @return mobilePaymentMethodSpecificInput
   **/

  @JsonProperty(JSON_PROPERTY_MOBILE_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MobilePaymentMethodSpecificInput getMobilePaymentMethodSpecificInput() {
    return mobilePaymentMethodSpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_MOBILE_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobilePaymentMethodSpecificInput(MobilePaymentMethodSpecificInput mobilePaymentMethodSpecificInput) {
    this.mobilePaymentMethodSpecificInput = mobilePaymentMethodSpecificInput;
  }

  public PaymentExecution redirectPaymentMethodSpecificInput(
      RedirectPaymentMethodSpecificInput redirectPaymentMethodSpecificInput) {

    this.redirectPaymentMethodSpecificInput = redirectPaymentMethodSpecificInput;
    return this;
  }

  /**
   * Get redirectPaymentMethodSpecificInput
   * 
   * @return redirectPaymentMethodSpecificInput
   **/

  @JsonProperty(JSON_PROPERTY_REDIRECT_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RedirectPaymentMethodSpecificInput getRedirectPaymentMethodSpecificInput() {
    return redirectPaymentMethodSpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_REDIRECT_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectPaymentMethodSpecificInput(
      RedirectPaymentMethodSpecificInput redirectPaymentMethodSpecificInput) {
    this.redirectPaymentMethodSpecificInput = redirectPaymentMethodSpecificInput;
  }

  public PaymentExecution sepaDirectDebitPaymentMethodSpecificInput(
      SepaDirectDebitPaymentMethodSpecificInput sepaDirectDebitPaymentMethodSpecificInput) {

    this.sepaDirectDebitPaymentMethodSpecificInput = sepaDirectDebitPaymentMethodSpecificInput;
    return this;
  }

  /**
   * Get sepaDirectDebitPaymentMethodSpecificInput
   * 
   * @return sepaDirectDebitPaymentMethodSpecificInput
   **/

  @JsonProperty(JSON_PROPERTY_SEPA_DIRECT_DEBIT_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SepaDirectDebitPaymentMethodSpecificInput getSepaDirectDebitPaymentMethodSpecificInput() {
    return sepaDirectDebitPaymentMethodSpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_SEPA_DIRECT_DEBIT_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSepaDirectDebitPaymentMethodSpecificInput(
      SepaDirectDebitPaymentMethodSpecificInput sepaDirectDebitPaymentMethodSpecificInput) {
    this.sepaDirectDebitPaymentMethodSpecificInput = sepaDirectDebitPaymentMethodSpecificInput;
  }

  public PaymentExecution financingPaymentMethodSpecificInput(
      FinancingPaymentMethodSpecificInput financingPaymentMethodSpecificInput) {

    this.financingPaymentMethodSpecificInput = financingPaymentMethodSpecificInput;
    return this;
  }

  /**
   * Get financingPaymentMethodSpecificInput
   * 
   * @return financingPaymentMethodSpecificInput
   **/

  @JsonProperty(JSON_PROPERTY_FINANCING_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FinancingPaymentMethodSpecificInput getFinancingPaymentMethodSpecificInput() {
    return financingPaymentMethodSpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_FINANCING_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinancingPaymentMethodSpecificInput(
      FinancingPaymentMethodSpecificInput financingPaymentMethodSpecificInput) {
    this.financingPaymentMethodSpecificInput = financingPaymentMethodSpecificInput;
  }

  public PaymentExecution paymentChannel(PaymentChannel paymentChannel) {

    this.paymentChannel = paymentChannel;
    return this;
  }

  /**
   * Get paymentChannel
   * 
   * @return paymentChannel
   **/

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

  public PaymentExecution references(References references) {

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

  public References getReferences() {
    return references;
  }

  @JsonProperty(JSON_PROPERTY_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferences(References references) {
    this.references = references;
  }

  public PaymentExecution events(List<PaymentEvent> events) {

    this.events = events;
    return this;
  }

  public PaymentExecution addEventsItem(PaymentEvent eventsItem) {
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
   **/

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentExecution paymentExecution = (PaymentExecution) o;
    return Objects.equals(this.paymentExecutionId, paymentExecution.paymentExecutionId) &&
        Objects.equals(this.paymentId, paymentExecution.paymentId) &&
        Objects.equals(this.cardPaymentMethodSpecificInput, paymentExecution.cardPaymentMethodSpecificInput) &&
        Objects.equals(this.mobilePaymentMethodSpecificInput, paymentExecution.mobilePaymentMethodSpecificInput) &&
        Objects.equals(this.redirectPaymentMethodSpecificInput, paymentExecution.redirectPaymentMethodSpecificInput) &&
        Objects.equals(this.sepaDirectDebitPaymentMethodSpecificInput,
            paymentExecution.sepaDirectDebitPaymentMethodSpecificInput)
        &&
        Objects.equals(this.financingPaymentMethodSpecificInput, paymentExecution.financingPaymentMethodSpecificInput)
        &&
        Objects.equals(this.paymentChannel, paymentExecution.paymentChannel) &&
        Objects.equals(this.references, paymentExecution.references) &&
        Objects.equals(this.events, paymentExecution.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentExecutionId, paymentId, cardPaymentMethodSpecificInput, mobilePaymentMethodSpecificInput,
        redirectPaymentMethodSpecificInput, sepaDirectDebitPaymentMethodSpecificInput,
        financingPaymentMethodSpecificInput, paymentChannel, references, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentExecution {\n");
    sb.append("    paymentExecutionId: ").append(toIndentedString(paymentExecutionId)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    cardPaymentMethodSpecificInput: ").append(toIndentedString(cardPaymentMethodSpecificInput))
        .append("\n");
    sb.append("    mobilePaymentMethodSpecificInput: ").append(toIndentedString(mobilePaymentMethodSpecificInput))
        .append("\n");
    sb.append("    redirectPaymentMethodSpecificInput: ").append(toIndentedString(redirectPaymentMethodSpecificInput))
        .append("\n");
    sb.append("    sepaDirectDebitPaymentMethodSpecificInput: ")
        .append(toIndentedString(sepaDirectDebitPaymentMethodSpecificInput)).append("\n");
    sb.append("    financingPaymentMethodSpecificInput: ").append(toIndentedString(financingPaymentMethodSpecificInput))
        .append("\n");
    sb.append("    paymentChannel: ").append(toIndentedString(paymentChannel)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
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
