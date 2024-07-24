package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Object containing the specific input details for card payments.
 */
@JsonPropertyOrder({
    CardPaymentMethodSpecificInput.JSON_PROPERTY_AUTHORIZATION_MODE,
    CardPaymentMethodSpecificInput.JSON_PROPERTY_RECURRING,
    CardPaymentMethodSpecificInput.JSON_PROPERTY_PAYMENT_PROCESSING_TOKEN,
    CardPaymentMethodSpecificInput.JSON_PROPERTY_REPORTING_TOKEN,
    CardPaymentMethodSpecificInput.JSON_PROPERTY_TRANSACTION_CHANNEL,
    CardPaymentMethodSpecificInput.JSON_PROPERTY_UNSCHEDULED_CARD_ON_FILE_REQUESTOR,
    CardPaymentMethodSpecificInput.JSON_PROPERTY_UNSCHEDULED_CARD_ON_FILE_SEQUENCE_INDICATOR,
    CardPaymentMethodSpecificInput.JSON_PROPERTY_PAYMENT_PRODUCT_ID,
    CardPaymentMethodSpecificInput.JSON_PROPERTY_CARD,
    CardPaymentMethodSpecificInput.JSON_PROPERTY_RETURN_URL,
    CardPaymentMethodSpecificInput.JSON_PROPERTY_CARD_ON_FILE_RECURRING_FREQUENCY,
    CardPaymentMethodSpecificInput.JSON_PROPERTY_CARD_ON_FILE_RECURRING_EXPIRATION
})
public class CardPaymentMethodSpecificInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AUTHORIZATION_MODE = "authorizationMode";
  private AuthorizationMode authorizationMode;

  public static final String JSON_PROPERTY_RECURRING = "recurring";
  private CardRecurrenceDetails recurring;

  public static final String JSON_PROPERTY_PAYMENT_PROCESSING_TOKEN = "paymentProcessingToken";
  private String paymentProcessingToken;

  public static final String JSON_PROPERTY_REPORTING_TOKEN = "reportingToken";
  private String reportingToken;

  public static final String JSON_PROPERTY_TRANSACTION_CHANNEL = "transactionChannel";
  private TransactionChannel transactionChannel;

  public static final String JSON_PROPERTY_UNSCHEDULED_CARD_ON_FILE_REQUESTOR = "unscheduledCardOnFileRequestor";
  private UnscheduledCardOnFileRequestor unscheduledCardOnFileRequestor;

  public static final String JSON_PROPERTY_UNSCHEDULED_CARD_ON_FILE_SEQUENCE_INDICATOR = "unscheduledCardOnFileSequenceIndicator";
  private UnscheduledCardOnFileSequenceIndicator unscheduledCardOnFileSequenceIndicator;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT_ID = "paymentProductId";
  private Integer paymentProductId;

  public static final String JSON_PROPERTY_CARD = "card";
  private CardInfo card;

  public static final String JSON_PROPERTY_RETURN_URL = "returnUrl";
  private String returnUrl;

  /**
   * Period of payment occurrence for recurring and installment payments. Allowed
   * values: * Yearly * Quarterly * Monthly * Weekly * Daily Supported soon
   */
  public enum CardOnFileRecurringFrequencyEnum {
    YEARLY("Yearly"),

    QUARTERLY("Quarterly"),

    MONTHLY("Monthly"),

    WEEKLY("Weekly"),

    DAILY("Daily");

    private String value;

    CardOnFileRecurringFrequencyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CardOnFileRecurringFrequencyEnum fromValue(String value) {
      for (CardOnFileRecurringFrequencyEnum b : CardOnFileRecurringFrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CARD_ON_FILE_RECURRING_FREQUENCY = "cardOnFileRecurringFrequency";
  private CardOnFileRecurringFrequencyEnum cardOnFileRecurringFrequency;

  public static final String JSON_PROPERTY_CARD_ON_FILE_RECURRING_EXPIRATION = "cardOnFileRecurringExpiration";
  private String cardOnFileRecurringExpiration;

  public CardPaymentMethodSpecificInput() {
  }

  @JsonCreator
  public CardPaymentMethodSpecificInput(
      @JsonProperty(JSON_PROPERTY_REPORTING_TOKEN) String reportingToken) {
    this();
    this.reportingToken = reportingToken;
  }

  public CardPaymentMethodSpecificInput authorizationMode(AuthorizationMode authorizationMode) {

    this.authorizationMode = authorizationMode;
    return this;
  }

  /**
   * Get authorizationMode
   * 
   * @return authorizationMode
   **/

  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuthorizationMode getAuthorizationMode() {
    return authorizationMode;
  }

  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorizationMode(AuthorizationMode authorizationMode) {
    this.authorizationMode = authorizationMode;
  }

  public CardPaymentMethodSpecificInput recurring(CardRecurrenceDetails recurring) {

    this.recurring = recurring;
    return this;
  }

  /**
   * Get recurring
   * 
   * @return recurring
   **/

  @JsonProperty(JSON_PROPERTY_RECURRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CardRecurrenceDetails getRecurring() {
    return recurring;
  }

  @JsonProperty(JSON_PROPERTY_RECURRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurring(CardRecurrenceDetails recurring) {
    this.recurring = recurring;
  }

  public CardPaymentMethodSpecificInput paymentProcessingToken(String paymentProcessingToken) {

    this.paymentProcessingToken = paymentProcessingToken;
    return this;
  }

  /**
   * ID of the token to use to create the payment.
   * 
   * @return paymentProcessingToken
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_PROCESSING_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentProcessingToken() {
    return paymentProcessingToken;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_PROCESSING_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentProcessingToken(String paymentProcessingToken) {
    this.paymentProcessingToken = paymentProcessingToken;
  }

  /**
   * Token to identify the card in the reporting.
   * 
   * @return reportingToken
   **/

  @JsonProperty(JSON_PROPERTY_REPORTING_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReportingToken() {
    return reportingToken;
  }

  public CardPaymentMethodSpecificInput transactionChannel(TransactionChannel transactionChannel) {

    this.transactionChannel = transactionChannel;
    return this;
  }

  /**
   * Get transactionChannel
   * 
   * @return transactionChannel
   **/

  @JsonProperty(JSON_PROPERTY_TRANSACTION_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionChannel getTransactionChannel() {
    return transactionChannel;
  }

  @JsonProperty(JSON_PROPERTY_TRANSACTION_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionChannel(TransactionChannel transactionChannel) {
    this.transactionChannel = transactionChannel;
  }

  public CardPaymentMethodSpecificInput unscheduledCardOnFileRequestor(
      UnscheduledCardOnFileRequestor unscheduledCardOnFileRequestor) {

    this.unscheduledCardOnFileRequestor = unscheduledCardOnFileRequestor;
    return this;
  }

  /**
   * Get unscheduledCardOnFileRequestor
   * 
   * @return unscheduledCardOnFileRequestor
   **/

  @JsonProperty(JSON_PROPERTY_UNSCHEDULED_CARD_ON_FILE_REQUESTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UnscheduledCardOnFileRequestor getUnscheduledCardOnFileRequestor() {
    return unscheduledCardOnFileRequestor;
  }

  @JsonProperty(JSON_PROPERTY_UNSCHEDULED_CARD_ON_FILE_REQUESTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnscheduledCardOnFileRequestor(UnscheduledCardOnFileRequestor unscheduledCardOnFileRequestor) {
    this.unscheduledCardOnFileRequestor = unscheduledCardOnFileRequestor;
  }

  public CardPaymentMethodSpecificInput unscheduledCardOnFileSequenceIndicator(
      UnscheduledCardOnFileSequenceIndicator unscheduledCardOnFileSequenceIndicator) {

    this.unscheduledCardOnFileSequenceIndicator = unscheduledCardOnFileSequenceIndicator;
    return this;
  }

  /**
   * Get unscheduledCardOnFileSequenceIndicator
   * 
   * @return unscheduledCardOnFileSequenceIndicator
   **/

  @JsonProperty(JSON_PROPERTY_UNSCHEDULED_CARD_ON_FILE_SEQUENCE_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UnscheduledCardOnFileSequenceIndicator getUnscheduledCardOnFileSequenceIndicator() {
    return unscheduledCardOnFileSequenceIndicator;
  }

  @JsonProperty(JSON_PROPERTY_UNSCHEDULED_CARD_ON_FILE_SEQUENCE_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnscheduledCardOnFileSequenceIndicator(
      UnscheduledCardOnFileSequenceIndicator unscheduledCardOnFileSequenceIndicator) {
    this.unscheduledCardOnFileSequenceIndicator = unscheduledCardOnFileSequenceIndicator;
  }

  public CardPaymentMethodSpecificInput paymentProductId(Integer paymentProductId) {

    this.paymentProductId = paymentProductId;
    return this;
  }

  /**
   * Payment product identifier - please check product documentation for a full
   * overview of possible values.
   * minimum: 0
   * maximum: 99999
   * 
   * @return paymentProductId
   **/

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

  public CardPaymentMethodSpecificInput card(CardInfo card) {

    this.card = card;
    return this;
  }

  /**
   * Get card
   * 
   * @return card
   **/

  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CardInfo getCard() {
    return card;
  }

  @JsonProperty(JSON_PROPERTY_CARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCard(CardInfo card) {
    this.card = card;
  }

  public CardPaymentMethodSpecificInput returnUrl(String returnUrl) {

    this.returnUrl = returnUrl;
    return this;
  }

  /**
   * The URL that the customer is redirect to after the payment flow has finished.
   * You can add any number of key value pairs in the query string that, for
   * instance help you to identify the customer when they return to your site.
   * Please note that we will also append some additional key value pairs that
   * will also help you with this identification process. Note: The provided URL
   * should be absolute and contain the protocol to use, e.g. http:// or https://.
   * For use on mobile devices a custom protocol can be used in the form of
   * protocol://. This protocol must be registered on the device first. URLs
   * without a protocol will be rejected.
   * 
   * @return returnUrl
   **/

  @JsonProperty(JSON_PROPERTY_RETURN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReturnUrl() {
    return returnUrl;
  }

  @JsonProperty(JSON_PROPERTY_RETURN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  public CardPaymentMethodSpecificInput cardOnFileRecurringFrequency(
      CardOnFileRecurringFrequencyEnum cardOnFileRecurringFrequency) {

    this.cardOnFileRecurringFrequency = cardOnFileRecurringFrequency;
    return this;
  }

  /**
   * Period of payment occurrence for recurring and installment payments. Allowed
   * values: * Yearly * Quarterly * Monthly * Weekly * Daily Supported soon
   * 
   * @return cardOnFileRecurringFrequency
   **/

  @JsonProperty(JSON_PROPERTY_CARD_ON_FILE_RECURRING_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CardOnFileRecurringFrequencyEnum getCardOnFileRecurringFrequency() {
    return cardOnFileRecurringFrequency;
  }

  @JsonProperty(JSON_PROPERTY_CARD_ON_FILE_RECURRING_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardOnFileRecurringFrequency(CardOnFileRecurringFrequencyEnum cardOnFileRecurringFrequency) {
    this.cardOnFileRecurringFrequency = cardOnFileRecurringFrequency;
  }

  public CardPaymentMethodSpecificInput cardOnFileRecurringExpiration(String cardOnFileRecurringExpiration) {

    this.cardOnFileRecurringExpiration = cardOnFileRecurringExpiration;
    return this;
  }

  /**
   * The end date of the last scheduled payment in a series of transactions.
   * Format YYYYMMDD Supported soon
   * 
   * @return cardOnFileRecurringExpiration
   **/

  @JsonProperty(JSON_PROPERTY_CARD_ON_FILE_RECURRING_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardOnFileRecurringExpiration() {
    return cardOnFileRecurringExpiration;
  }

  @JsonProperty(JSON_PROPERTY_CARD_ON_FILE_RECURRING_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardOnFileRecurringExpiration(String cardOnFileRecurringExpiration) {
    this.cardOnFileRecurringExpiration = cardOnFileRecurringExpiration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardPaymentMethodSpecificInput cardPaymentMethodSpecificInput = (CardPaymentMethodSpecificInput) o;
    return Objects.equals(this.authorizationMode, cardPaymentMethodSpecificInput.authorizationMode) &&
        Objects.equals(this.recurring, cardPaymentMethodSpecificInput.recurring) &&
        Objects.equals(this.paymentProcessingToken, cardPaymentMethodSpecificInput.paymentProcessingToken) &&
        Objects.equals(this.reportingToken, cardPaymentMethodSpecificInput.reportingToken) &&
        Objects.equals(this.transactionChannel, cardPaymentMethodSpecificInput.transactionChannel) &&
        Objects
            .equals(this.unscheduledCardOnFileRequestor, cardPaymentMethodSpecificInput.unscheduledCardOnFileRequestor)
        &&
        Objects.equals(this.unscheduledCardOnFileSequenceIndicator,
            cardPaymentMethodSpecificInput.unscheduledCardOnFileSequenceIndicator)
        &&
        Objects.equals(this.paymentProductId, cardPaymentMethodSpecificInput.paymentProductId) &&
        Objects.equals(this.card, cardPaymentMethodSpecificInput.card) &&
        Objects.equals(this.returnUrl, cardPaymentMethodSpecificInput.returnUrl) &&
        Objects.equals(this.cardOnFileRecurringFrequency, cardPaymentMethodSpecificInput.cardOnFileRecurringFrequency)
        &&
        Objects.equals(this.cardOnFileRecurringExpiration,
            cardPaymentMethodSpecificInput.cardOnFileRecurringExpiration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationMode, recurring, paymentProcessingToken, reportingToken, transactionChannel,
        unscheduledCardOnFileRequestor, unscheduledCardOnFileSequenceIndicator, paymentProductId, card, returnUrl,
        cardOnFileRecurringFrequency, cardOnFileRecurringExpiration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardPaymentMethodSpecificInput {\n");
    sb.append("    authorizationMode: ").append(toIndentedString(authorizationMode)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    paymentProcessingToken: ").append(toIndentedString(paymentProcessingToken)).append("\n");
    sb.append("    reportingToken: ").append(toIndentedString(reportingToken)).append("\n");
    sb.append("    transactionChannel: ").append(toIndentedString(transactionChannel)).append("\n");
    sb.append("    unscheduledCardOnFileRequestor: ").append(toIndentedString(unscheduledCardOnFileRequestor))
        .append("\n");
    sb.append("    unscheduledCardOnFileSequenceIndicator: ")
        .append(toIndentedString(unscheduledCardOnFileSequenceIndicator)).append("\n");
    sb.append("    paymentProductId: ").append(toIndentedString(paymentProductId)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    cardOnFileRecurringFrequency: ").append(toIndentedString(cardOnFileRecurringFrequency)).append("\n");
    sb.append("    cardOnFileRecurringExpiration: ").append(toIndentedString(cardOnFileRecurringExpiration))
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
