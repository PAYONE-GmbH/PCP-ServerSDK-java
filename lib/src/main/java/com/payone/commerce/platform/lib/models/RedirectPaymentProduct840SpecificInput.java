package com.payone.commerce.platform.lib.models;

import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ RedirectPaymentProduct840SpecificInputData.JSON_PROPERTY_ADDRESS_SELECTION_AT_PAYPAL,
    RedirectPaymentProduct840SpecificInputData.JSON_PROPERTY_JAVA_SCRIPT_SDK_FLOW,
    RedirectPaymentProduct840SpecificInput.JSON_PROPERTY_FRAUD_NET_ID })
public class RedirectPaymentProduct840SpecificInput extends RedirectPaymentProduct840SpecificInputData {
  private static final long serialVersionUID = 1L;
  public static final String JSON_PROPERTY_FRAUD_NET_ID = "fraudNetId";
  private UUID fraudNetId;

  @Override
  public RedirectPaymentProduct840SpecificInput addressSelectionAtPayPal(Boolean value) {
    super.addressSelectionAtPayPal(value);
    return this;
  }

  @Override
  public RedirectPaymentProduct840SpecificInput javaScriptSdkFlow(Boolean value) {
    super.javaScriptSdkFlow(value);
    return this;
  }

  public RedirectPaymentProduct840SpecificInput fraudNetId(UUID value) {
    fraudNetId = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_FRAUD_NET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getFraudNetId() {
    return fraudNetId;
  }

  @JsonProperty(JSON_PROPERTY_FRAUD_NET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFraudNetId(UUID value) {
    fraudNetId = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    return Objects.equals(fraudNetId, ((RedirectPaymentProduct840SpecificInput) o).fraudNetId) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fraudNetId, super.hashCode());
  }

  @Override
  public String toString() {
    return "class RedirectPaymentProduct840SpecificInput {\n    addressSelectionAtPayPal: "
        + toIndentedString(getAddressSelectionAtPayPal()) + "\n    javaScriptSdkFlow: "
        + toIndentedString(getJavaScriptSdkFlow()) + "\n    fraudNetId: " + toIndentedString(fraudNetId) + "\n}";
  }

  private String toIndentedString(Object value) {
    return value == null ? "null" : value.toString().replace("\n", "\n    ");
  }
}
