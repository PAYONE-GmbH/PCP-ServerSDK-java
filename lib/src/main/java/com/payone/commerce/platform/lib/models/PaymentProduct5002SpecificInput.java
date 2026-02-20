package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing additional Information needed for Click To Pay processing.
 */
@JsonPropertyOrder({
    PaymentProduct5002SpecificInput.JSON_PROPERTY_NETWORK,
    PaymentProduct5002SpecificInput.JSON_PROPERTY_PAYMENT_CHECKOUT_DATA,
    PaymentProduct5002SpecificInput.JSON_PROPERTY_SRC_DPA_ID
})
public class PaymentProduct5002SpecificInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NETWORK = "network";
  private MobilePaymentNetwork network;

  public static final String JSON_PROPERTY_PAYMENT_CHECKOUT_DATA = "paymentCheckoutData";
  private String paymentCheckoutData;

  public static final String JSON_PROPERTY_SRC_DPA_ID = "srcDpaId";
  private String srcDpaId;

  public PaymentProduct5002SpecificInput() {
  }

  public PaymentProduct5002SpecificInput network(MobilePaymentNetwork network) {
    this.network = network;
    return this;
  }

  /**
   * Get network
   *
   * @return network
   */

  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MobilePaymentNetwork getNetwork() {
    return network;
  }

  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetwork(MobilePaymentNetwork network) {
    this.network = network;
  }

  public PaymentProduct5002SpecificInput paymentCheckoutData(String paymentCheckoutData) {
    this.paymentCheckoutData = paymentCheckoutData;
    return this;
  }

  /**
   * JWS Token Value (checkoutResponseSignature) as received in the Checkout Response on Client Side,
   * Base64URL encoded.
   *
   * @return paymentCheckoutData
   */

  @JsonProperty(JSON_PROPERTY_PAYMENT_CHECKOUT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPaymentCheckoutData() {
    return paymentCheckoutData;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_CHECKOUT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentCheckoutData(String paymentCheckoutData) {
    this.paymentCheckoutData = paymentCheckoutData;
  }

  public PaymentProduct5002SpecificInput srcDpaId(String srcDpaId) {
    this.srcDpaId = srcDpaId;
    return this;
  }

  /**
   * DPA Identifier provided by PAYONE during client side initialization for the corresponding card
   * type selected by the end consumer in the Click to Pay flow.
   *
   * @return srcDpaId
   */

  @JsonProperty(JSON_PROPERTY_SRC_DPA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSrcDpaId() {
    return srcDpaId;
  }

  @JsonProperty(JSON_PROPERTY_SRC_DPA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSrcDpaId(String srcDpaId) {
    this.srcDpaId = srcDpaId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProduct5002SpecificInput paymentProduct5002SpecificInput = (PaymentProduct5002SpecificInput) o;
    return Objects.equals(this.network, paymentProduct5002SpecificInput.network) &&
        Objects.equals(this.paymentCheckoutData, paymentProduct5002SpecificInput.paymentCheckoutData) &&
        Objects.equals(this.srcDpaId, paymentProduct5002SpecificInput.srcDpaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(network, paymentCheckoutData, srcDpaId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProduct5002SpecificInput {\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    paymentCheckoutData: ").append(toIndentedString(paymentCheckoutData)).append("\n");
    sb.append("    srcDpaId: ").append(toIndentedString(srcDpaId)).append("\n");
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
