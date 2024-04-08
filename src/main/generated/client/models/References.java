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


package client.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Object that holds all reference properties that are linked to this transaction.
 */
@JsonPropertyOrder({
  References.JSON_PROPERTY_DESCRIPTOR,
  References.JSON_PROPERTY_MERCHANT_REFERENCE,
  References.JSON_PROPERTY_MERCHANT_PARAMETERS
})
public class References implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DESCRIPTOR = "descriptor";
  private String descriptor;

  public static final String JSON_PROPERTY_MERCHANT_REFERENCE = "merchantReference";
  private String merchantReference;

  public static final String JSON_PROPERTY_MERCHANT_PARAMETERS = "merchantParameters";
  private String merchantParameters;

  public References() {
  }

  public References descriptor(String descriptor) {
    
    this.descriptor = descriptor;
    return this;
  }

   /**
   * Descriptive text that is used towards to customer, either during an online Checkout at a third party and/or on the statement of the customer. For card transactions this is usually referred to as a Soft Descriptor. The maximum allowed length varies per card acquirer:  * AIB - 22 characters  * American Express - 25 characters  * Atos Origin BNP - 15 characters  * Barclays - 25 characters  * Catella - 22 characters  * CBA - 20 characters  * Elavon - 25 characters  * First Data - 25 characters  * INICIS (INIPAY) - 22-30 characters  * JCB - 25 characters  * Merchant Solutions - 22-25 characters  * Payvision (EU &amp; HK) - 25 characters  * SEB Euroline - 22 characters  * Sub1 Argentina - 15 characters  * Wells Fargo - 25 characters  Note that we advise you to use 22 characters as the max length as beyond this our experience is that issuers will start to truncate. We currently also only allow per API call overrides for AIB and Barclays For alternative payment products the maximum allowed length varies per payment product:  * 402 e-Przelewy - 30 characters  * 404 INICIS - 80 characters  * 802 Nordea ePayment Finland - 234 characters  * 809 iDeal - 32 characters  * 836 SOFORT - 42 characters  * 840 PayPal - 127 characters  * 841 WebMoney - 175 characters  * 849 Yandex - 64 characters  * 861 Alipay - 256 characters  * 863 WeChat Pay - 32 characters  * 880 BOKU - 20 characters  * 8580 Qiwi - 255 characters  * 1504 Konbini - 80 characters  All other payment products don&#39;t support a descriptor.
   * @return descriptor
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescriptor() {
    return descriptor;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescriptor(String descriptor) {
    this.descriptor = descriptor;
  }


  public References merchantReference(String merchantReference) {
    
    this.merchantReference = merchantReference;
    return this;
  }

   /**
   * The merchantReference is a unique identifier for a payment and can be used for reporting purposes. The merchantReference is required for the execution of a payment and has to be unique. In case a payment has failed the same merchantReference can be used again. Once a successful payment has been made the same merchantReference can no longer be used and will be rejected. 
   * @return merchantReference
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMerchantReference() {
    return merchantReference;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }


  public References merchantParameters(String merchantParameters) {
    
    this.merchantParameters = merchantParameters;
    return this;
  }

   /**
   * It allows you to store additional parameters for the transaction in JSON format. This field must not contain any personal data.
   * @return merchantParameters
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERCHANT_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantParameters() {
    return merchantParameters;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantParameters(String merchantParameters) {
    this.merchantParameters = merchantParameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    References references = (References) o;
    return Objects.equals(this.descriptor, references.descriptor) &&
        Objects.equals(this.merchantReference, references.merchantReference) &&
        Objects.equals(this.merchantParameters, references.merchantParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descriptor, merchantReference, merchantParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class References {\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    merchantParameters: ").append(toIndentedString(merchantParameters)).append("\n");
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

    // add `descriptor` to the URL query string
    if (getDescriptor() != null) {
      try {
        joiner.add(String.format("%sdescriptor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescriptor()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `merchantReference` to the URL query string
    if (getMerchantReference() != null) {
      try {
        joiner.add(String.format("%smerchantReference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMerchantReference()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `merchantParameters` to the URL query string
    if (getMerchantParameters() != null) {
      try {
        joiner.add(String.format("%smerchantParameters%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMerchantParameters()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

