package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Object containing additional Information needed for Apple Pay payment
 * transactions.
 */
@JsonPropertyOrder({
    PaymentProduct320SpecificInput.JSON_PROPERTY_NETWORK,
    PaymentProduct320SpecificInput.JSON_PROPERTY_TOKEN
})
public class PaymentProduct320SpecificInput implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets network
   */
  public enum NetworkEnum {
    MASTERCARD("MASTERCARD"),

    VISA("VISA"),

    AMEX("AMEX"),

    GIROCARD("GIROCARD"),

    DISCOVER("DISCOVER"),

    JCB("JCB");

    private String value;

    NetworkEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NetworkEnum fromValue(String value) {
      for (NetworkEnum b : NetworkEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_NETWORK = "network";
  private NetworkEnum network;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private ApplePaymentDataTokenInformation token;

  public PaymentProduct320SpecificInput() {
  }

  public PaymentProduct320SpecificInput network(NetworkEnum network) {

    this.network = network;
    return this;
  }

  /**
   * Get network
   * 
   * @return network
   **/

  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NetworkEnum getNetwork() {
    return network;
  }

  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetwork(NetworkEnum network) {
    this.network = network;
  }

  public PaymentProduct320SpecificInput token(ApplePaymentDataTokenInformation token) {

    this.token = token;
    return this;
  }

  /**
   * Get token
   * 
   * @return token
   **/

  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApplePaymentDataTokenInformation getToken() {
    return token;
  }

  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(ApplePaymentDataTokenInformation token) {
    this.token = token;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProduct320SpecificInput paymentProduct320SpecificInput = (PaymentProduct320SpecificInput) o;
    return Objects.equals(this.network, paymentProduct320SpecificInput.network) &&
        Objects.equals(this.token, paymentProduct320SpecificInput.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(network, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProduct320SpecificInput {\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
