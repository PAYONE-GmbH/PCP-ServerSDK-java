package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ RedirectPaymentProduct840SpecificInputData.JSON_PROPERTY_ADDRESS_SELECTION_AT_PAYPAL,
    RedirectPaymentProduct840SpecificInputData.JSON_PROPERTY_JAVA_SCRIPT_SDK_FLOW })
public class RedirectPaymentProduct840SpecificInputData implements Serializable {
  private static final long serialVersionUID = 1L;
  public static final String JSON_PROPERTY_ADDRESS_SELECTION_AT_PAYPAL = "addressSelectionAtPayPal";
  private Boolean addressSelectionAtPayPal;
  public static final String JSON_PROPERTY_JAVA_SCRIPT_SDK_FLOW = "javaScriptSdkFlow";
  private Boolean javaScriptSdkFlow;

  public RedirectPaymentProduct840SpecificInputData() {
  }

  public RedirectPaymentProduct840SpecificInputData addressSelectionAtPayPal(Boolean value) {
    addressSelectionAtPayPal = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_ADDRESS_SELECTION_AT_PAYPAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAddressSelectionAtPayPal() {
    return addressSelectionAtPayPal;
  }

  @JsonProperty(JSON_PROPERTY_ADDRESS_SELECTION_AT_PAYPAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressSelectionAtPayPal(Boolean value) {
    addressSelectionAtPayPal = value;
  }

  public RedirectPaymentProduct840SpecificInputData javaScriptSdkFlow(Boolean value) {
    javaScriptSdkFlow = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_JAVA_SCRIPT_SDK_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getJavaScriptSdkFlow() {
    return javaScriptSdkFlow;
  }

  @JsonProperty(JSON_PROPERTY_JAVA_SCRIPT_SDK_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJavaScriptSdkFlow(Boolean value) {
    javaScriptSdkFlow = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    RedirectPaymentProduct840SpecificInputData that = (RedirectPaymentProduct840SpecificInputData) o;
    return Objects.equals(addressSelectionAtPayPal, that.addressSelectionAtPayPal)
        && Objects.equals(javaScriptSdkFlow, that.javaScriptSdkFlow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressSelectionAtPayPal, javaScriptSdkFlow);
  }

  @Override
  public String toString() {
    return "class RedirectPaymentProduct840SpecificInputData {\n    addressSelectionAtPayPal: "
        + toIndentedString(addressSelectionAtPayPal) + "\n    javaScriptSdkFlow: " + toIndentedString(javaScriptSdkFlow)
        + "\n}";
  }

  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
