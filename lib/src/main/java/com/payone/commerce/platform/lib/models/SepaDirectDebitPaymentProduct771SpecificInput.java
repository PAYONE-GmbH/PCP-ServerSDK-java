package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing information specific to SEPA Direct Debit
 */
@JsonPropertyOrder({
    SepaDirectDebitPaymentProduct771SpecificInput.JSON_PROPERTY_EXISTING_UNIQUE_MANDATE_REFERENCE,
    SepaDirectDebitPaymentProduct771SpecificInput.JSON_PROPERTY_MANDATE
})
public class SepaDirectDebitPaymentProduct771SpecificInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_EXISTING_UNIQUE_MANDATE_REFERENCE = "existingUniqueMandateReference";
  private String existingUniqueMandateReference;

  public static final String JSON_PROPERTY_MANDATE = "mandate";
  private ProcessingMandateInformation mandate;

  public SepaDirectDebitPaymentProduct771SpecificInput() {
  }

  public SepaDirectDebitPaymentProduct771SpecificInput existingUniqueMandateReference(
      String existingUniqueMandateReference) {

    this.existingUniqueMandateReference = existingUniqueMandateReference;
    return this;
  }

  /**
   * The unique reference of the existing mandate to use in this payment.
   * 
   * @return existingUniqueMandateReference
   **/

  @JsonProperty(JSON_PROPERTY_EXISTING_UNIQUE_MANDATE_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExistingUniqueMandateReference() {
    return existingUniqueMandateReference;
  }

  @JsonProperty(JSON_PROPERTY_EXISTING_UNIQUE_MANDATE_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExistingUniqueMandateReference(String existingUniqueMandateReference) {
    this.existingUniqueMandateReference = existingUniqueMandateReference;
  }

  public SepaDirectDebitPaymentProduct771SpecificInput mandate(ProcessingMandateInformation mandate) {

    this.mandate = mandate;
    return this;
  }

  /**
   * Get mandate
   * 
   * @return mandate
   **/

  @JsonProperty(JSON_PROPERTY_MANDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProcessingMandateInformation getMandate() {
    return mandate;
  }

  @JsonProperty(JSON_PROPERTY_MANDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMandate(ProcessingMandateInformation mandate) {
    this.mandate = mandate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SepaDirectDebitPaymentProduct771SpecificInput sepaDirectDebitPaymentProduct771SpecificInput = (SepaDirectDebitPaymentProduct771SpecificInput) o;
    return Objects.equals(this.existingUniqueMandateReference,
        sepaDirectDebitPaymentProduct771SpecificInput.existingUniqueMandateReference) &&
        Objects.equals(this.mandate, sepaDirectDebitPaymentProduct771SpecificInput.mandate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(existingUniqueMandateReference, mandate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SepaDirectDebitPaymentProduct771SpecificInput {\n");
    sb.append("    existingUniqueMandateReference: ").append(toIndentedString(existingUniqueMandateReference))
        .append("\n");
    sb.append("    mandate: ").append(toIndentedString(mandate)).append("\n");
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
