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
    PaymentProduct302SpecificInput.JSON_PROPERTY_INTEGRATION_TYPE,
    PaymentProduct302SpecificInput.JSON_PROPERTY_NETWORK,
    PaymentProduct302SpecificInput.JSON_PROPERTY_TOKEN,
    PaymentProduct302SpecificInput.JSON_PROPERTY_DOMAIN_NAME,
    PaymentProduct302SpecificInput.JSON_PROPERTY_DISPLAY_NAME
})

public class PaymentProduct302SpecificInput implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Type of your Apple Pay integration. * MERCHANT_CERTIFICATE - using your own
   * certificate (paid apple pay account needed) * MASS_ENABLEMENT - using PAYONE
   * certificate
   */
  public enum IntegrationTypeEnum {
    MERCHANT_CERTIFICATE(String.valueOf("MERCHANT_CERTIFICATE")),

    MASS_ENABLEMENT(String.valueOf("MASS_ENABLEMENT"));

    private String value;

    IntegrationTypeEnum(String value) {
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
    public static IntegrationTypeEnum fromValue(String value) {
      for (IntegrationTypeEnum b : IntegrationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INTEGRATION_TYPE = "integrationType";

  private IntegrationTypeEnum integrationType;

  /**
   * Network/Scheme of the card used for the payment. * MASTERCARD * VISA * AMEX *
   * GIROCARD * DISCOVER (not supported yet) * JCB (not supported yet)
   */
  public enum NetworkEnum {
    MASTERCARD(String.valueOf("MASTERCARD")),

    VISA(String.valueOf("VISA")),

    AMEX(String.valueOf("AMEX")),

    GIROCARD(String.valueOf("GIROCARD")),

    DISCOVER(String.valueOf("DISCOVER")),

    JCB(String.valueOf("JCB"));

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

  public static final String JSON_PROPERTY_DOMAIN_NAME = "domainName";

  private String domainName;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";

  private String displayName;

  public PaymentProduct302SpecificInput() {
  }

  public PaymentProduct302SpecificInput integrationType(IntegrationTypeEnum integrationType) {
    this.integrationType = integrationType;
    return this;
  }

  /**
   * Type of your Apple Pay integration. * MERCHANT_CERTIFICATE - using your own
   * certificate (paid apple pay account needed) * MASS_ENABLEMENT - using PAYONE
   * certificate
   * 
   * @return integrationType
   */

  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IntegrationTypeEnum getIntegrationType() {
    return integrationType;
  }

  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationType(IntegrationTypeEnum integrationType) {
    this.integrationType = integrationType;
  }

  public PaymentProduct302SpecificInput network(NetworkEnum network) {
    this.network = network;
    return this;
  }

  /**
   * Network/Scheme of the card used for the payment. * MASTERCARD * VISA * AMEX *
   * GIROCARD * DISCOVER (not supported yet) * JCB (not supported yet)
   * 
   * @return network
   */

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

  public PaymentProduct302SpecificInput token(ApplePaymentDataTokenInformation token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * 
   * @return token
   */

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

  public PaymentProduct302SpecificInput domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

  /**
   * Domain of your Webshop. Needed for initialization of the Apple Pay payment
   * session with integrationType&#x3D;MASS_ENABLEMENT.
   * 
   * @return domainName
   */

  @JsonProperty(JSON_PROPERTY_DOMAIN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDomainName() {
    return domainName;
  }

  @JsonProperty(JSON_PROPERTY_DOMAIN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public PaymentProduct302SpecificInput displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Name of your Store. Needed for initialization of the Apple Pay payment
   * session with integrationType&#x3D;MASS_ENABLEMENT.
   * 
   * @return displayName
   */

  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisplayName() {
    return displayName;
  }

  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * Return true if this PaymentProduct302SpecificInput object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProduct302SpecificInput paymentProduct302SpecificInput = (PaymentProduct302SpecificInput) o;
    return Objects.equals(this.integrationType, paymentProduct302SpecificInput.integrationType) &&
        Objects.equals(this.network, paymentProduct302SpecificInput.network) &&
        Objects.equals(this.token, paymentProduct302SpecificInput.token) &&
        Objects.equals(this.domainName, paymentProduct302SpecificInput.domainName) &&
        Objects.equals(this.displayName, paymentProduct302SpecificInput.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationType, network, token, domainName, displayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProduct302SpecificInput {\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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
