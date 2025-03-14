package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing the specific input details for mobile payments.
 */
@JsonPropertyOrder({
    MobilePaymentMethodSpecificInput.JSON_PROPERTY_PAYMENT_PRODUCT_ID,
    MobilePaymentMethodSpecificInput.JSON_PROPERTY_AUTHORIZATION_MODE,
    MobilePaymentMethodSpecificInput.JSON_PROPERTY_ENCRYPTED_PAYMENT_DATA,
    MobilePaymentMethodSpecificInput.JSON_PROPERTY_PUBLIC_KEY_HASH,
    MobilePaymentMethodSpecificInput.JSON_PROPERTY_EPHEMERAL_KEY,
    MobilePaymentMethodSpecificInput.JSON_PROPERTY_THREE_D_SECURE,
    MobilePaymentMethodSpecificInput.JSON_PROPERTY_PAYMENT_PRODUCT302_SPECIFIC_INPUT
})

public class MobilePaymentMethodSpecificInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT_ID = "paymentProductId";

  private Integer paymentProductId;

  public static final String JSON_PROPERTY_AUTHORIZATION_MODE = "authorizationMode";

  private AuthorizationMode authorizationMode;

  public static final String JSON_PROPERTY_ENCRYPTED_PAYMENT_DATA = "encryptedPaymentData";

  private String encryptedPaymentData;

  public static final String JSON_PROPERTY_PUBLIC_KEY_HASH = "publicKeyHash";

  private String publicKeyHash;

  public static final String JSON_PROPERTY_EPHEMERAL_KEY = "ephemeralKey";

  private String ephemeralKey;

  public static final String JSON_PROPERTY_THREE_D_SECURE = "threeDSecure";

  private MobilePaymentThreeDSecure threeDSecure;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT302_SPECIFIC_INPUT = "paymentProduct302SpecificInput";

  private PaymentProduct302SpecificInput paymentProduct302SpecificInput;

  public MobilePaymentMethodSpecificInput() {
  }

  public MobilePaymentMethodSpecificInput paymentProductId(Integer paymentProductId) {
    this.paymentProductId = paymentProductId;
    return this;
  }

  /**
   * Payment product identifier - please check product documentation for a full
   * overview of possible values.
   * minimum: 0
   * maximum: 99999
   * 
   * @return paymentProductId
   */

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getPaymentProductId() {
    return paymentProductId;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentProductId(Integer paymentProductId) {
    this.paymentProductId = paymentProductId;
  }

  public MobilePaymentMethodSpecificInput authorizationMode(AuthorizationMode authorizationMode) {
    this.authorizationMode = authorizationMode;
    return this;
  }

  /**
   * Get authorizationMode
   * 
   * @return authorizationMode
   */

  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AuthorizationMode getAuthorizationMode() {
    return authorizationMode;
  }

  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorizationMode(AuthorizationMode authorizationMode) {
    this.authorizationMode = authorizationMode;
  }

  public MobilePaymentMethodSpecificInput encryptedPaymentData(String encryptedPaymentData) {
    this.encryptedPaymentData = encryptedPaymentData;
    return this;
  }

  /**
   * The payment data if we will do the decryption of the encrypted payment data.
   * Typically you&#39;d use encryptedCustomerInput in the root of the create
   * payment request to provide the encrypted payment data instead.
   * 
   * @return encryptedPaymentData
   */

  @JsonProperty(JSON_PROPERTY_ENCRYPTED_PAYMENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEncryptedPaymentData() {
    return encryptedPaymentData;
  }

  @JsonProperty(JSON_PROPERTY_ENCRYPTED_PAYMENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryptedPaymentData(String encryptedPaymentData) {
    this.encryptedPaymentData = encryptedPaymentData;
  }

  public MobilePaymentMethodSpecificInput publicKeyHash(String publicKeyHash) {
    this.publicKeyHash = publicKeyHash;
    return this;
  }

  /**
   * Public Key Hash A unique identifier to retrieve key used by Apple to encrypt
   * information.
   * 
   * @return publicKeyHash
   */

  @JsonProperty(JSON_PROPERTY_PUBLIC_KEY_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicKeyHash() {
    return publicKeyHash;
  }

  @JsonProperty(JSON_PROPERTY_PUBLIC_KEY_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicKeyHash(String publicKeyHash) {
    this.publicKeyHash = publicKeyHash;
  }

  public MobilePaymentMethodSpecificInput ephemeralKey(String ephemeralKey) {
    this.ephemeralKey = ephemeralKey;
    return this;
  }

  /**
   * Ephemeral Key A unique generated key used by Apple to encrypt data.
   * 
   * @return ephemeralKey
   */

  @JsonProperty(JSON_PROPERTY_EPHEMERAL_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEphemeralKey() {
    return ephemeralKey;
  }

  @JsonProperty(JSON_PROPERTY_EPHEMERAL_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEphemeralKey(String ephemeralKey) {
    this.ephemeralKey = ephemeralKey;
  }

  public MobilePaymentMethodSpecificInput threeDSecure(MobilePaymentThreeDSecure threeDSecure) {
    this.threeDSecure = threeDSecure;
    return this;
  }

  /**
   * Get threeDSecure
   * 
   * @return threeDSecure
   */

  @JsonProperty(JSON_PROPERTY_THREE_D_SECURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MobilePaymentThreeDSecure getThreeDSecure() {
    return threeDSecure;
  }

  @JsonProperty(JSON_PROPERTY_THREE_D_SECURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDSecure(MobilePaymentThreeDSecure threeDSecure) {
    this.threeDSecure = threeDSecure;
  }

  public MobilePaymentMethodSpecificInput paymentProduct302SpecificInput(
      PaymentProduct302SpecificInput paymentProduct302SpecificInput) {
    this.paymentProduct302SpecificInput = paymentProduct302SpecificInput;
    return this;
  }

  /**
   * Get paymentProduct302SpecificInput
   * 
   * @return paymentProduct302SpecificInput
   */

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT302_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PaymentProduct302SpecificInput getPaymentProduct302SpecificInput() {
    return paymentProduct302SpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT302_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentProduct302SpecificInput(PaymentProduct302SpecificInput paymentProduct302SpecificInput) {
    this.paymentProduct302SpecificInput = paymentProduct302SpecificInput;
  }

  /**
   * Return true if this MobilePaymentMethodSpecificInput object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobilePaymentMethodSpecificInput mobilePaymentMethodSpecificInput = (MobilePaymentMethodSpecificInput) o;
    return Objects.equals(this.paymentProductId, mobilePaymentMethodSpecificInput.paymentProductId) &&
        Objects.equals(this.authorizationMode, mobilePaymentMethodSpecificInput.authorizationMode) &&
        Objects.equals(this.encryptedPaymentData, mobilePaymentMethodSpecificInput.encryptedPaymentData) &&
        Objects.equals(this.publicKeyHash, mobilePaymentMethodSpecificInput.publicKeyHash) &&
        Objects.equals(this.ephemeralKey, mobilePaymentMethodSpecificInput.ephemeralKey) &&
        Objects.equals(this.threeDSecure, mobilePaymentMethodSpecificInput.threeDSecure) &&
        Objects.equals(this.paymentProduct302SpecificInput,
            mobilePaymentMethodSpecificInput.paymentProduct302SpecificInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentProductId, authorizationMode, encryptedPaymentData, publicKeyHash, ephemeralKey,
        threeDSecure, paymentProduct302SpecificInput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobilePaymentMethodSpecificInput {\n");
    sb.append("    paymentProductId: ").append(toIndentedString(paymentProductId)).append("\n");
    sb.append("    authorizationMode: ").append(toIndentedString(authorizationMode)).append("\n");
    sb.append("    encryptedPaymentData: ").append(toIndentedString(encryptedPaymentData)).append("\n");
    sb.append("    publicKeyHash: ").append(toIndentedString(publicKeyHash)).append("\n");
    sb.append("    ephemeralKey: ").append(toIndentedString(ephemeralKey)).append("\n");
    sb.append("    threeDSecure: ").append(toIndentedString(threeDSecure)).append("\n");
    sb.append("    paymentProduct302SpecificInput: ").append(toIndentedString(paymentProduct302SpecificInput))
        .append("\n");
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
