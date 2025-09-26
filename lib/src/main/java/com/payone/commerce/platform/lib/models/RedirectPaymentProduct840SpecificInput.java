package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing specific input required for PayPal payments (Payment
 * product ID 840)
 */
@JsonPropertyOrder({
    RedirectPaymentProduct840SpecificInput.JSON_PROPERTY_ADDRESS_SELECTION_AT_PAY_PAL,
    RedirectPaymentProduct840SpecificInput.JSON_PROPERTY_FRAUD_NET_ID,
    RedirectPaymentProduct840SpecificInput.JSON_PROPERTY_JAVASCRIPT_SDK_FLOW,
    RedirectPaymentProduct840SpecificInput.JSON_PROPERTY_ACTION
})
public class RedirectPaymentProduct840SpecificInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ADDRESS_SELECTION_AT_PAY_PAL = "addressSelectionAtPayPal";
  private Boolean addressSelectionAtPayPal;

  public static final String JSON_PROPERTY_FRAUD_NET_ID = "fraudNetId";
  private UUID fraudNetId;

  public static final String JSON_PROPERTY_JAVASCRIPT_SDK_FLOW = "javaScriptSdkFlow";
  private Boolean javaScriptSdkFlow;

  public static final String JSON_PROPERTY_ACTION = "action";
  private String action;

  public RedirectPaymentProduct840SpecificInput() {
  }

  public RedirectPaymentProduct840SpecificInput addressSelectionAtPayPal(Boolean addressSelectionAtPayPal) {
    this.addressSelectionAtPayPal = addressSelectionAtPayPal;
    return this;
  }

  /**
   * Indicates whether to use PayPal Express Checkout Shortcut. * true &#x3D; When
   * shortcut is enabled, the consumer can select a shipping address during PayPal
   * checkout. * false &#x3D; When shortcut is disabled, the consumer cannot
   * change the shipping address. Default value is false. Please note that this
   * field is ignored when order.additionalInput.typeInformation.purchaseType is
   * set to \&quot;digital\&quot;
   * 
   * @return addressSelectionAtPayPal
   **/
  @JsonProperty(JSON_PROPERTY_ADDRESS_SELECTION_AT_PAY_PAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAddressSelectionAtPayPal() {
    return addressSelectionAtPayPal;
  }

  @JsonProperty(JSON_PROPERTY_ADDRESS_SELECTION_AT_PAY_PAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressSelectionAtPayPal(Boolean addressSelectionAtPayPal) {
    this.addressSelectionAtPayPal = addressSelectionAtPayPal;
  }

  public RedirectPaymentProduct840SpecificInput fraudNetId(UUID fraudNetId) {
    this.fraudNetId = fraudNetId;
    return this;
  }

  /**
   * A unique ID determined by the merchant, to link a Paypal transaction to a
   * FraudNet PayPal risk session. Only applicable to
   * customer-initiated transactions, when the FraudNet SDK is used, and to be
   * passed in the API request the same tracking ID value
   * (FraudNet Session Identifier). This SDK is available here
   * https://developer.paypal.com/docs/checkout/apm/pay-upon-invoice/fraudnet/
   * 
   * @return fraudNetId
   **/
  @JsonProperty(JSON_PROPERTY_FRAUD_NET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getFraudNetId() {
    return fraudNetId;
  }

  @JsonProperty(JSON_PROPERTY_FRAUD_NET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFraudNetId(UUID fraudNetId) {
    this.fraudNetId = fraudNetId;
  }

  public RedirectPaymentProduct840SpecificInput javaScriptSdkFlow(Boolean javaScriptSdkFlow) {
    this.javaScriptSdkFlow = javaScriptSdkFlow;
    return this;
  }

  /**
   * Required parameter which defines how PayPal is being integrated inside the
   * checkout page.
   * * true = the current integration uses PayPal SDK
   * * false = classic usage with PayPal Redirect flow
   * 
   * @return javaScriptSdkFlow
   **/
  @JsonProperty(JSON_PROPERTY_JAVASCRIPT_SDK_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getJavaScriptSdkFlow() {
    return javaScriptSdkFlow;
  }

  @JsonProperty(JSON_PROPERTY_JAVASCRIPT_SDK_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJavaScriptSdkFlow(Boolean javaScriptSdkFlow) {
    this.javaScriptSdkFlow = javaScriptSdkFlow;
  }

  public RedirectPaymentProduct840SpecificInput action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Required parameter for a COMPLETE CALL (not only an ORDER CALL) which one
   * value "CONFIRM_ORDER_STATUS"
   * it signals process is finished on merchant side.
   * 
   * @return action
   **/
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAction() {
    return action;
  }

  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAction(String action) {
    this.action = action;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedirectPaymentProduct840SpecificInput redirectPaymentProduct840SpecificInput = (RedirectPaymentProduct840SpecificInput) o;
    return Objects.equals(this.addressSelectionAtPayPal,
        redirectPaymentProduct840SpecificInput.addressSelectionAtPayPal) &&
        Objects.equals(this.fraudNetId, redirectPaymentProduct840SpecificInput.fraudNetId) &&
        Objects.equals(this.javaScriptSdkFlow, redirectPaymentProduct840SpecificInput.javaScriptSdkFlow) &&
        Objects.equals(this.action, redirectPaymentProduct840SpecificInput.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressSelectionAtPayPal, fraudNetId, javaScriptSdkFlow, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedirectPaymentProduct840SpecificInput {\n");
    sb.append("    addressSelectionAtPayPal: ").append(toIndentedString(addressSelectionAtPayPal)).append("\n");
    sb.append("    fraudNetId: ").append(toIndentedString(fraudNetId)).append("\n");
    sb.append("    javaScriptSdkFlow: ").append(toIndentedString(javaScriptSdkFlow)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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