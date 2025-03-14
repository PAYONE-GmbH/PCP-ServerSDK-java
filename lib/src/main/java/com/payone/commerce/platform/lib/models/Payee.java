package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Payee bank account details as part of the payment instructions
 */
@JsonPropertyOrder({
    Payee.JSON_PROPERTY_IBAN,
    Payee.JSON_PROPERTY_BIC,
    Payee.JSON_PROPERTY_NAME
})

public class Payee implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IBAN = "iban";

  private String iban;

  public static final String JSON_PROPERTY_BIC = "bic";

  private String bic;

  public static final String JSON_PROPERTY_NAME = "name";

  private String name;

  public Payee() {
  }

  public Payee iban(String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * IBAN of the payee&#39;s or beneficiary&#39;s bank account. The IBAN is the
   * International Bank Account Number. It is an internationally agreed format for
   * the BBAN and includes the ISO country code and two check digits.
   * 
   * @return iban
   */

  @JsonProperty(JSON_PROPERTY_IBAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIban() {
    return iban;
  }

  @JsonProperty(JSON_PROPERTY_IBAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIban(String iban) {
    this.iban = iban;
  }

  public Payee bic(String bic) {
    this.bic = bic;
    return this;
  }

  /**
   * Bank Identification Code
   * 
   * @return bic
   */

  @JsonProperty(JSON_PROPERTY_BIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBic() {
    return bic;
  }

  @JsonProperty(JSON_PROPERTY_BIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBic(String bic) {
    this.bic = bic;
  }

  public Payee name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the payee
   * 
   * @return name
   */

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Return true if this Payee object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payee payee = (Payee) o;
    return Objects.equals(this.iban, payee.iban) &&
        Objects.equals(this.bic, payee.bic) &&
        Objects.equals(this.name, payee.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iban, bic, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payee {\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
