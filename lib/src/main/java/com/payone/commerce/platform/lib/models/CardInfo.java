package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing additional non PCI DSS relevant card information. used
 * instead of card (missing fields: cardNumber, expiryDate, cvv)
 */
@JsonPropertyOrder({
    CardInfo.JSON_PROPERTY_CARDHOLDER_NAME
})
public class CardInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CARDHOLDER_NAME = "cardholderName";
  private String cardholderName;

  public CardInfo() {
  }

  public CardInfo cardholderName(String cardholderName) {

    this.cardholderName = cardholderName;
    return this;
  }

  /**
   * The card holder&#39;s name on the card.
   * 
   * @return cardholderName
   **/

  @JsonProperty(JSON_PROPERTY_CARDHOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardholderName() {
    return cardholderName;
  }

  @JsonProperty(JSON_PROPERTY_CARDHOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardholderName(String cardholderName) {
    this.cardholderName = cardholderName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardInfo cardInfo = (CardInfo) o;
    return Objects.equals(this.cardholderName, cardInfo.cardholderName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardholderName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardInfo {\n");
    sb.append("    cardholderName: ").append(toIndentedString(cardholderName)).append("\n");
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
