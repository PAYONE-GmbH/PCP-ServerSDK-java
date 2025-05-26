package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing data related to recurring.
 */
@JsonPropertyOrder({
    CardRecurrenceDetails.JSON_PROPERTY_RECURRING_PAYMENT_SEQUENCE_INDICATOR
})
public class CardRecurrenceDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RECURRING_PAYMENT_SEQUENCE_INDICATOR = "recurringPaymentSequenceIndicator";
  private RecurringPaymentSequenceIndicator recurringPaymentSequenceIndicator;

  public CardRecurrenceDetails() {
  }

  public CardRecurrenceDetails recurringPaymentSequenceIndicator(
      RecurringPaymentSequenceIndicator recurringPaymentSequenceIndicator) {

    this.recurringPaymentSequenceIndicator = recurringPaymentSequenceIndicator;
    return this;
  }

  /**
   * Indicates whether this transaction is the first or a subsequent transaction
   * in a series of recurring transactions. See
   * {@link RecurringPaymentSequenceIndicator} for possible values.
   * 
   * Note: For any first of a recurring payment, the system will automatically
   * create a token as it will be needed for any subsequent recurring
   * transactions.
   * If a token already exists, this is indicated in the response with a value of
   * False for the isNewToken property.
   * 
   * @return The sequence indicator for this recurring payment
   **/

  @JsonProperty(JSON_PROPERTY_RECURRING_PAYMENT_SEQUENCE_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecurringPaymentSequenceIndicator getRecurringPaymentSequenceIndicator() {
    return recurringPaymentSequenceIndicator;
  }

  @JsonProperty(JSON_PROPERTY_RECURRING_PAYMENT_SEQUENCE_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringPaymentSequenceIndicator(
      RecurringPaymentSequenceIndicator recurringPaymentSequenceIndicator) {
    this.recurringPaymentSequenceIndicator = recurringPaymentSequenceIndicator;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardRecurrenceDetails cardRecurrenceDetails = (CardRecurrenceDetails) o;
    return Objects.equals(this.recurringPaymentSequenceIndicator,
        cardRecurrenceDetails.recurringPaymentSequenceIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recurringPaymentSequenceIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardRecurrenceDetails {\n");
    sb.append("    recurringPaymentSequenceIndicator: ").append(toIndentedString(recurringPaymentSequenceIndicator))
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
