package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Additional information about the Apple payment data token. This information
 * are needed for checking the validity of the payment data token before
 * decryption.
 */
@JsonPropertyOrder({
    ApplePaymentDataTokenInformation.JSON_PROPERTY_VERSION,
    ApplePaymentDataTokenInformation.JSON_PROPERTY_SIGNATURE,
    ApplePaymentDataTokenInformation.JSON_PROPERTY_HEADER
})
public class ApplePaymentDataTokenInformation implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Version information about the payment token. Currently only EC_v1 for
   * ECC-encrypted data is supported.
   */
  public enum VersionEnum {
    EC_V1("EC_V1");

    private String value;

    VersionEnum(String value) {
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
    public static VersionEnum fromValue(String value) {
      for (VersionEnum b : VersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VERSION = "version";
  private VersionEnum version;

  public static final String JSON_PROPERTY_SIGNATURE = "signature";
  private String signature;

  public static final String JSON_PROPERTY_HEADER = "header";
  private ApplePaymentDataTokenHeaderInformation header;

  public ApplePaymentDataTokenInformation() {
  }

  public ApplePaymentDataTokenInformation version(VersionEnum version) {

    this.version = version;
    return this;
  }

  /**
   * Version information about the payment token. Currently only EC_v1 for
   * ECC-encrypted data is supported.
   * 
   * @return version
   **/

  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VersionEnum getVersion() {
    return version;
  }

  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(VersionEnum version) {
    this.version = version;
  }

  public ApplePaymentDataTokenInformation signature(String signature) {

    this.signature = signature;
    return this;
  }

  /**
   * Detached PKCS #7 signature, Base64 encoded as string. Signature of the
   * payment and header data. The signature includes the signing certificate, its
   * intermediate CA certificate, and information about the signing algorithm.
   * 
   * @return signature
   **/

  @JsonProperty(JSON_PROPERTY_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSignature() {
    return signature;
  }

  @JsonProperty(JSON_PROPERTY_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignature(String signature) {
    this.signature = signature;
  }

  public ApplePaymentDataTokenInformation header(ApplePaymentDataTokenHeaderInformation header) {

    this.header = header;
    return this;
  }

  /**
   * Get header
   * 
   * @return header
   **/

  @JsonProperty(JSON_PROPERTY_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApplePaymentDataTokenHeaderInformation getHeader() {
    return header;
  }

  @JsonProperty(JSON_PROPERTY_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeader(ApplePaymentDataTokenHeaderInformation header) {
    this.header = header;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplePaymentDataTokenInformation applePaymentDataTokenInformation = (ApplePaymentDataTokenInformation) o;
    return Objects.equals(this.version, applePaymentDataTokenInformation.version) &&
        Objects.equals(this.signature, applePaymentDataTokenInformation.signature) &&
        Objects.equals(this.header, applePaymentDataTokenInformation.header);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, signature, header);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplePaymentDataTokenInformation {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
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
