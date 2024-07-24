package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing the relevant information of a SEPA Direct Debit mandate for
 * processing (mandatory fields in pain.008). Renamed from
 * CreateMandateWithReturnUrl to ProcessingMandateInformation.
 */
@JsonPropertyOrder({
    ProcessingMandateInformation.JSON_PROPERTY_BANK_ACCOUNT_IBAN,
    ProcessingMandateInformation.JSON_PROPERTY_RECURRENCE_TYPE,
    ProcessingMandateInformation.JSON_PROPERTY_UNIQUE_MANDATE_REFERENCE,
    ProcessingMandateInformation.JSON_PROPERTY_DATE_OF_SIGNATURE,
    ProcessingMandateInformation.JSON_PROPERTY_CREDITOR_ID
})
public class ProcessingMandateInformation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_BANK_ACCOUNT_IBAN = "bankAccountIban";
  private BankAccountInformation bankAccountIban;

  public static final String JSON_PROPERTY_RECURRENCE_TYPE = "recurrenceType";
  private MandateRecurrenceType recurrenceType;

  public static final String JSON_PROPERTY_UNIQUE_MANDATE_REFERENCE = "uniqueMandateReference";
  private String uniqueMandateReference;

  public static final String JSON_PROPERTY_DATE_OF_SIGNATURE = "dateOfSignature";
  private String dateOfSignature;

  public static final String JSON_PROPERTY_CREDITOR_ID = "creditorId";
  private String creditorId;

  public ProcessingMandateInformation() {
  }

  public ProcessingMandateInformation bankAccountIban(BankAccountInformation bankAccountIban) {

    this.bankAccountIban = bankAccountIban;
    return this;
  }

  /**
   * Get bankAccountIban
   * 
   * @return bankAccountIban
   **/

  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_IBAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BankAccountInformation getBankAccountIban() {
    return bankAccountIban;
  }

  @JsonProperty(JSON_PROPERTY_BANK_ACCOUNT_IBAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBankAccountIban(BankAccountInformation bankAccountIban) {
    this.bankAccountIban = bankAccountIban;
  }

  public ProcessingMandateInformation recurrenceType(MandateRecurrenceType recurrenceType) {

    this.recurrenceType = recurrenceType;
    return this;
  }

  /**
   * Get recurrenceType
   * 
   * @return recurrenceType
   **/

  @JsonProperty(JSON_PROPERTY_RECURRENCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MandateRecurrenceType getRecurrenceType() {
    return recurrenceType;
  }

  @JsonProperty(JSON_PROPERTY_RECURRENCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecurrenceType(MandateRecurrenceType recurrenceType) {
    this.recurrenceType = recurrenceType;
  }

  public ProcessingMandateInformation uniqueMandateReference(String uniqueMandateReference) {

    this.uniqueMandateReference = uniqueMandateReference;
    return this;
  }

  /**
   * The unique identifier of the mandate
   * 
   * @return uniqueMandateReference
   **/

  @JsonProperty(JSON_PROPERTY_UNIQUE_MANDATE_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUniqueMandateReference() {
    return uniqueMandateReference;
  }

  @JsonProperty(JSON_PROPERTY_UNIQUE_MANDATE_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUniqueMandateReference(String uniqueMandateReference) {
    this.uniqueMandateReference = uniqueMandateReference;
  }

  public ProcessingMandateInformation dateOfSignature(String dateOfSignature) {

    this.dateOfSignature = dateOfSignature;
    return this;
  }

  /**
   * The date of signature of the mandate. Format YYYYMMDD
   * 
   * @return dateOfSignature
   **/

  @JsonProperty(JSON_PROPERTY_DATE_OF_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDateOfSignature() {
    return dateOfSignature;
  }

  @JsonProperty(JSON_PROPERTY_DATE_OF_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateOfSignature(String dateOfSignature) {
    this.dateOfSignature = dateOfSignature;
  }

  public ProcessingMandateInformation creditorId(String creditorId) {

    this.creditorId = creditorId;
    return this;
  }

  /**
   * Your unique creditor identifier.
   * 
   * @return creditorId
   **/

  @JsonProperty(JSON_PROPERTY_CREDITOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCreditorId() {
    return creditorId;
  }

  @JsonProperty(JSON_PROPERTY_CREDITOR_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreditorId(String creditorId) {
    this.creditorId = creditorId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessingMandateInformation processingMandateInformation = (ProcessingMandateInformation) o;
    return Objects.equals(this.bankAccountIban, processingMandateInformation.bankAccountIban) &&
        Objects.equals(this.recurrenceType, processingMandateInformation.recurrenceType) &&
        Objects.equals(this.uniqueMandateReference, processingMandateInformation.uniqueMandateReference) &&
        Objects.equals(this.dateOfSignature, processingMandateInformation.dateOfSignature) &&
        Objects.equals(this.creditorId, processingMandateInformation.creditorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccountIban, recurrenceType, uniqueMandateReference, dateOfSignature, creditorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessingMandateInformation {\n");
    sb.append("    bankAccountIban: ").append(toIndentedString(bankAccountIban)).append("\n");
    sb.append("    recurrenceType: ").append(toIndentedString(recurrenceType)).append("\n");
    sb.append("    uniqueMandateReference: ").append(toIndentedString(uniqueMandateReference)).append("\n");
    sb.append("    dateOfSignature: ").append(toIndentedString(dateOfSignature)).append("\n");
    sb.append("    creditorId: ").append(toIndentedString(creditorId)).append("\n");
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
