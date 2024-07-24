package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Request to refund a payment for a Checkout. It is possible to perform
 * multiple partial refunds by providing an amount that is lower than the total
 * captured amount. The returnReason can be provided for reporting and
 * reconciliation purposes but is not mandatory.
 */
@JsonPropertyOrder({
    RefundRequest.JSON_PROPERTY_AMOUNT_OF_MONEY,
    RefundRequest.JSON_PROPERTY_REFERENCES,
    RefundRequest.JSON_PROPERTY_RETURN
})
public class RefundRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AMOUNT_OF_MONEY = "amountOfMoney";
  private PositiveAmountOfMoney amountOfMoney;

  public static final String JSON_PROPERTY_REFERENCES = "references";
  private PaymentReferences references;

  public static final String JSON_PROPERTY_RETURN = "return";
  private ReturnInformation _return;

  public RefundRequest() {
  }

  public RefundRequest amountOfMoney(PositiveAmountOfMoney amountOfMoney) {

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

  public PositiveAmountOfMoney getAmountOfMoney() {
    return amountOfMoney;
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT_OF_MONEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountOfMoney(PositiveAmountOfMoney amountOfMoney) {
    this.amountOfMoney = amountOfMoney;
  }

  public RefundRequest references(PaymentReferences references) {

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

  public PaymentReferences getReferences() {
    return references;
  }

  @JsonProperty(JSON_PROPERTY_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferences(PaymentReferences references) {
    this.references = references;
  }

  public RefundRequest _return(ReturnInformation _return) {

    this._return = _return;
    return this;
  }

  /**
   * Get _return
   * 
   * @return _return
   **/

  @JsonProperty(JSON_PROPERTY_RETURN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReturnInformation getReturn() {
    return _return;
  }

  @JsonProperty(JSON_PROPERTY_RETURN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturn(ReturnInformation _return) {
    this._return = _return;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundRequest refundRequest = (RefundRequest) o;
    return Objects.equals(this.amountOfMoney, refundRequest.amountOfMoney) &&
        Objects.equals(this.references, refundRequest.references) &&
        Objects.equals(this._return, refundRequest._return);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountOfMoney, references, _return);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundRequest {\n");
    sb.append("    amountOfMoney: ").append(toIndentedString(amountOfMoney)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    _return: ").append(toIndentedString(_return)).append("\n");
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
