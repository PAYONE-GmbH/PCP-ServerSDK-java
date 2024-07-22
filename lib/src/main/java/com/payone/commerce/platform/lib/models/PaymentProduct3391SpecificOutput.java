package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing specififc information for PAYONE Secured Installments.
 */
@JsonPropertyOrder({
    PaymentProduct3391SpecificOutput.JSON_PROPERTY_INSTALLMENT_OPTIONS
})
public class PaymentProduct3391SpecificOutput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_INSTALLMENT_OPTIONS = "installmentOptions";
  private List<InstallmentOption> installmentOptions;

  public PaymentProduct3391SpecificOutput() {
  }

  public PaymentProduct3391SpecificOutput installmentOptions(List<InstallmentOption> installmentOptions) {

    this.installmentOptions = installmentOptions;
    return this;
  }

  public PaymentProduct3391SpecificOutput addInstallmentOptionsItem(InstallmentOption installmentOptionsItem) {
    if (this.installmentOptions == null) {
      this.installmentOptions = new ArrayList<>();
    }
    this.installmentOptions.add(installmentOptionsItem);
    return this;
  }

  /**
   * List of installment options.
   * 
   * @return installmentOptions
   **/

  @JsonProperty(JSON_PROPERTY_INSTALLMENT_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InstallmentOption> getInstallmentOptions() {
    return installmentOptions;
  }

  @JsonProperty(JSON_PROPERTY_INSTALLMENT_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstallmentOptions(List<InstallmentOption> installmentOptions) {
    this.installmentOptions = installmentOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProduct3391SpecificOutput paymentProduct3391SpecificOutput = (PaymentProduct3391SpecificOutput) o;
    return Objects.equals(this.installmentOptions, paymentProduct3391SpecificOutput.installmentOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installmentOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProduct3391SpecificOutput {\n");
    sb.append("    installmentOptions: ").append(toIndentedString(installmentOptions)).append("\n");
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
