/*
 * Commerce Platform API
 * RESTful API for the creation of Commerce Cases with Checkouts and the execution of Payments. 
 *
 * The version of the OpenAPI document: 1.5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.payone.commerce.platform.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Object containing the specific input details for mobile payments.
 */
@JsonPropertyOrder({
  MobilePaymentMethodSpecificInput.JSON_PROPERTY_PAYMENT_PRODUCT_ID,
  MobilePaymentMethodSpecificInput.JSON_PROPERTY_AUTHORIZATION_MODE,
  MobilePaymentMethodSpecificInput.JSON_PROPERTY_ENCRYPTED_PAYMENT_DATA,
  MobilePaymentMethodSpecificInput.JSON_PROPERTY_PUBLIC_KEY_HASH,
  MobilePaymentMethodSpecificInput.JSON_PROPERTY_EPHEMERAL_KEY,
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

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT302_SPECIFIC_INPUT = "paymentProduct302SpecificInput";
  private PaymentProduct320SpecificInput paymentProduct302SpecificInput;

  public MobilePaymentMethodSpecificInput() {
  }

  public MobilePaymentMethodSpecificInput paymentProductId(Integer paymentProductId) {
    
    this.paymentProductId = paymentProductId;
    return this;
  }

   /**
   * Payment product identifier - please check product documentation for a full overview of possible values.
   * minimum: 0
   * maximum: 99999
   * @return paymentProductId
  **/
  @jakarta.annotation.Nullable
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
   * @return authorizationMode
  **/
  @jakarta.annotation.Nullable
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
   * The payment data if we will do the decryption of the encrypted payment data. Typically you&#39;d use encryptedCustomerInput in the root of the create payment request to provide the encrypted payment data instead.
   * @return encryptedPaymentData
  **/
  @jakarta.annotation.Nullable
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
   * Public Key Hash A unique identifier to retrieve key used by Apple to encrypt information.
   * @return publicKeyHash
  **/
  @jakarta.annotation.Nullable
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
   * @return ephemeralKey
  **/
  @jakarta.annotation.Nullable
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


  public MobilePaymentMethodSpecificInput paymentProduct302SpecificInput(PaymentProduct320SpecificInput paymentProduct302SpecificInput) {
    
    this.paymentProduct302SpecificInput = paymentProduct302SpecificInput;
    return this;
  }

   /**
   * Get paymentProduct302SpecificInput
   * @return paymentProduct302SpecificInput
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT302_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentProduct320SpecificInput getPaymentProduct302SpecificInput() {
    return paymentProduct302SpecificInput;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT302_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentProduct302SpecificInput(PaymentProduct320SpecificInput paymentProduct302SpecificInput) {
    this.paymentProduct302SpecificInput = paymentProduct302SpecificInput;
  }

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
        Objects.equals(this.paymentProduct302SpecificInput, mobilePaymentMethodSpecificInput.paymentProduct302SpecificInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentProductId, authorizationMode, encryptedPaymentData, publicKeyHash, ephemeralKey, paymentProduct302SpecificInput);
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
    sb.append("    paymentProduct302SpecificInput: ").append(toIndentedString(paymentProduct302SpecificInput)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `paymentProductId` to the URL query string
    if (getPaymentProductId() != null) {
      try {
        joiner.add(String.format("%spaymentProductId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentProductId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `authorizationMode` to the URL query string
    if (getAuthorizationMode() != null) {
      try {
        joiner.add(String.format("%sauthorizationMode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthorizationMode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `encryptedPaymentData` to the URL query string
    if (getEncryptedPaymentData() != null) {
      try {
        joiner.add(String.format("%sencryptedPaymentData%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEncryptedPaymentData()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `publicKeyHash` to the URL query string
    if (getPublicKeyHash() != null) {
      try {
        joiner.add(String.format("%spublicKeyHash%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPublicKeyHash()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `ephemeralKey` to the URL query string
    if (getEphemeralKey() != null) {
      try {
        joiner.add(String.format("%sephemeralKey%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEphemeralKey()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `paymentProduct302SpecificInput` to the URL query string
    if (getPaymentProduct302SpecificInput() != null) {
      joiner.add(getPaymentProduct302SpecificInput().toUrlQueryString(prefix + "paymentProduct302SpecificInput" + suffix));
    }

    return joiner.toString();
  }

}

