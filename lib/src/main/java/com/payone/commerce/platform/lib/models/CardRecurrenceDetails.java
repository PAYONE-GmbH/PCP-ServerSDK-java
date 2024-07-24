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
  private String recurringPaymentSequenceIndicator;

  public CardRecurrenceDetails() {
  }

  public CardRecurrenceDetails recurringPaymentSequenceIndicator(String recurringPaymentSequenceIndicator) {

    this.recurringPaymentSequenceIndicator = recurringPaymentSequenceIndicator;
    return this;
  }

  /**
   * * first &#x3D; This transaction is the first of a series of recurring
   * transactions * recurring &#x3D; This transaction is a subsequent transaction
   * in a series of recurring transactions Note: For any first of a recurring the
   * system will automatically create a token as you will need to use a token for
   * any subsequent recurring transactions. In case a token already exists this is
   * indicated in the response with a value of False for the isNewToken property
   * in the response.
   * 
   * @return recurringPaymentSequenceIndicator
   **/

  @JsonProperty(JSON_PROPERTY_RECURRING_PAYMENT_SEQUENCE_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecurringPaymentSequenceIndicator() {
    return recurringPaymentSequenceIndicator;
  }

  @JsonProperty(JSON_PROPERTY_RECURRING_PAYMENT_SEQUENCE_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringPaymentSequenceIndicator(String recurringPaymentSequenceIndicator) {
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
