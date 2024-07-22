package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing the details of the created payment.
 */
@JsonPropertyOrder({
    PaymentCreationOutput.JSON_PROPERTY_EXTERNAL_REFERENCE
})
public class PaymentCreationOutput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_EXTERNAL_REFERENCE = "externalReference";
  private String externalReference;

  public PaymentCreationOutput() {
  }

  public PaymentCreationOutput externalReference(String externalReference) {

    this.externalReference = externalReference;
    return this;
  }

  /**
   * The external reference is an identifier for this transaction and can be used
   * for reconciliation purposes.
   * 
   * @return externalReference
   **/

  @JsonProperty(JSON_PROPERTY_EXTERNAL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalReference() {
    return externalReference;
  }

  @JsonProperty(JSON_PROPERTY_EXTERNAL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalReference(String externalReference) {
    this.externalReference = externalReference;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentCreationOutput paymentCreationOutput = (PaymentCreationOutput) o;
    return Objects.equals(this.externalReference, paymentCreationOutput.externalReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCreationOutput {\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
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
