package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Output that is SEPA Direct Debit specific (i.e. the used mandate).
 */
@JsonPropertyOrder({
    PaymentProduct771SpecificOutput.JSON_PROPERTY_MANDATE_REFERENCE
})
public class PaymentProduct771SpecificOutput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MANDATE_REFERENCE = "mandateReference";
  private String mandateReference;

  public PaymentProduct771SpecificOutput() {
  }

  public PaymentProduct771SpecificOutput mandateReference(String mandateReference) {

    this.mandateReference = mandateReference;
    return this;
  }

  /**
   * Unique reference fo a SEPA Mandate
   * 
   * @return mandateReference
   **/

  @JsonProperty(JSON_PROPERTY_MANDATE_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMandateReference() {
    return mandateReference;
  }

  @JsonProperty(JSON_PROPERTY_MANDATE_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMandateReference(String mandateReference) {
    this.mandateReference = mandateReference;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProduct771SpecificOutput paymentProduct771SpecificOutput = (PaymentProduct771SpecificOutput) o;
    return Objects.equals(this.mandateReference, paymentProduct771SpecificOutput.mandateReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mandateReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProduct771SpecificOutput {\n");
    sb.append("    mandateReference: ").append(toIndentedString(mandateReference)).append("\n");
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
