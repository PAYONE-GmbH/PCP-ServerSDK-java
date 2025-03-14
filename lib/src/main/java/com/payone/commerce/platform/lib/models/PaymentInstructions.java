package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing information on payment instructions details (e.g. on the
 * invoice payments)
 */
@JsonPropertyOrder({
    PaymentInstructions.JSON_PROPERTY_PAYEE,
    PaymentInstructions.JSON_PROPERTY_DUE_DATE,
    PaymentInstructions.JSON_PROPERTY_REFERENCE_NUMBER,
    PaymentInstructions.JSON_PROPERTY_STATUS
})

public class PaymentInstructions implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAYEE = "payee";

  private Payee payee;

  public static final String JSON_PROPERTY_DUE_DATE = "dueDate";

  private String dueDate;

  public static final String JSON_PROPERTY_REFERENCE_NUMBER = "referenceNumber";

  private String referenceNumber;

  public static final String JSON_PROPERTY_STATUS = "status";

  private String status;

  public PaymentInstructions() {
  }

  public PaymentInstructions payee(Payee payee) {
    this.payee = payee;
    return this;
  }

  /**
   * Get payee
   * 
   * @return payee
   */

  @JsonProperty(JSON_PROPERTY_PAYEE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Payee getPayee() {
    return payee;
  }

  @JsonProperty(JSON_PROPERTY_PAYEE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayee(Payee payee) {
    this.payee = payee;
  }

  public PaymentInstructions dueDate(String dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Due date of the payment. Format: YYYYMMDD
   * 
   * @return dueDate
   */

  @JsonProperty(JSON_PROPERTY_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDueDate() {
    return dueDate;
  }

  @JsonProperty(JSON_PROPERTY_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }

  public PaymentInstructions referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

  /**
   * External payment reference number as part of payment instructions for the
   * consumer
   * 
   * @return referenceNumber
   */

  @JsonProperty(JSON_PROPERTY_REFERENCE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getReferenceNumber() {
    return referenceNumber;
  }

  @JsonProperty(JSON_PROPERTY_REFERENCE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public PaymentInstructions status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status, usually describing the status of the invoice if paid, overdue,
   * open...
   * 
   * @return status
   */

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Return true if this PaymentInstructions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstructions paymentInstructions = (PaymentInstructions) o;
    return Objects.equals(this.payee, paymentInstructions.payee) &&
        Objects.equals(this.dueDate, paymentInstructions.dueDate) &&
        Objects.equals(this.referenceNumber, paymentInstructions.referenceNumber) &&
        Objects.equals(this.status, paymentInstructions.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payee, dueDate, referenceNumber, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstructions {\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
