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

package com.payone.commerce.platform.lib.models;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The response contains references to the created Commerce case and the
 * Checkout. It also contains the payment response if the flag
 * &#39;autoExecuteOrder&#39; was set to true.
 */
@JsonPropertyOrder({
    CreateCommerceCaseResponse.JSON_PROPERTY_COMMERCE_CASE_ID,
    CreateCommerceCaseResponse.JSON_PROPERTY_MERCHANT_REFERENCE,
    CreateCommerceCaseResponse.JSON_PROPERTY_CUSTOMER,
    CreateCommerceCaseResponse.JSON_PROPERTY_CHECKOUT,
    CreateCommerceCaseResponse.JSON_PROPERTY_CREATION_DATE_TIME
})
public class CreateCommerceCaseResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_COMMERCE_CASE_ID = "commerceCaseId";
  private UUID commerceCaseId;

  public static final String JSON_PROPERTY_MERCHANT_REFERENCE = "merchantReference";
  private String merchantReference;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private Customer customer;

  public static final String JSON_PROPERTY_CHECKOUT = "checkout";
  private CreateCheckoutResponse checkout;

  public static final String JSON_PROPERTY_CREATION_DATE_TIME = "creationDateTime";
  private Date creationDateTime;

  public CreateCommerceCaseResponse() {
  }

  public CreateCommerceCaseResponse commerceCaseId(UUID commerceCaseId) {

    this.commerceCaseId = commerceCaseId;
    return this;
  }

  /**
   * Unique ID of the Commerce Case. It can used to add additional Checkouts to
   * the Commerce Case.
   * 
   * @return commerceCaseId
   **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMERCE_CASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCommerceCaseId() {
    return commerceCaseId;
  }

  @JsonProperty(JSON_PROPERTY_COMMERCE_CASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommerceCaseId(UUID commerceCaseId) {
    this.commerceCaseId = commerceCaseId;
  }

  public CreateCommerceCaseResponse merchantReference(String merchantReference) {

    this.merchantReference = merchantReference;
    return this;
  }

  /**
   * Unique reference of the Commerce Case that is also returned for reporting and
   * reconciliation purposes.
   * 
   * @return merchantReference
   **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantReference() {
    return merchantReference;
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }

  public CreateCommerceCaseResponse customer(Customer customer) {

    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * 
   * @return customer
   **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Customer getCustomer() {
    return customer;
  }

  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public CreateCommerceCaseResponse checkout(CreateCheckoutResponse checkout) {

    this.checkout = checkout;
    return this;
  }

  /**
   * Get checkout
   * 
   * @return checkout
   **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECKOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreateCheckoutResponse getCheckout() {
    return checkout;
  }

  @JsonProperty(JSON_PROPERTY_CHECKOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckout(CreateCheckoutResponse checkout) {
    this.checkout = checkout;
  }

  public CreateCommerceCaseResponse creationDateTime(Date creationDateTime) {

    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Creation date and time of the Checkout in RFC3339 format. It can either be
   * provided in the request or otherwise will be automatically set to the time
   * when the request CreateCommerceCase was received. Response values will always
   * be in UTC time, but when providing this field in the requests, the time
   * offset can have different formats. Accepted formats are: *
   * YYYY-MM-DD&#39;T&#39;HH:mm:ss&#39;Z&#39; *
   * YYYY-MM-DD&#39;T&#39;HH:mm:ss+XX:XX * YYYY-MM-DD&#39;T&#39;HH:mm:ss-XX:XX *
   * YYYY-MM-DD&#39;T&#39;HH:mm&#39;Z&#39; * YYYY-MM-DD&#39;T&#39;HH:mm+XX:XX *
   * YYYY-MM-DD&#39;T&#39;HH:mm-XX:XX All other formats may be ignored by the
   * system.
   * 
   * @return creationDateTime
   **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getCreationDateTime() {
    return creationDateTime;
  }

  @JsonProperty(JSON_PROPERTY_CREATION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreationDateTime(Date creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCommerceCaseResponse createCommerceCaseResponse = (CreateCommerceCaseResponse) o;
    return Objects.equals(this.commerceCaseId, createCommerceCaseResponse.commerceCaseId) &&
        Objects.equals(this.merchantReference, createCommerceCaseResponse.merchantReference) &&
        Objects.equals(this.customer, createCommerceCaseResponse.customer) &&
        Objects.equals(this.checkout, createCommerceCaseResponse.checkout) &&
        Objects.equals(this.creationDateTime, createCommerceCaseResponse.creationDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commerceCaseId, merchantReference, customer, checkout, creationDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCommerceCaseResponse {\n");
    sb.append("    commerceCaseId: ").append(toIndentedString(commerceCaseId)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    checkout: ").append(toIndentedString(checkout)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
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

    // add `commerceCaseId` to the URL query string
    if (getCommerceCaseId() != null) {
      try {
        joiner.add(String.format("%scommerceCaseId%s=%s", prefix, suffix,
            URLEncoder.encode(String.valueOf(getCommerceCaseId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `merchantReference` to the URL query string
    if (getMerchantReference() != null) {
      try {
        joiner.add(String.format("%smerchantReference%s=%s", prefix, suffix,
            URLEncoder.encode(String.valueOf(getMerchantReference()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `customer` to the URL query string
    if (getCustomer() != null) {
      joiner.add(getCustomer().toUrlQueryString(prefix + "customer" + suffix));
    }

    // add `checkout` to the URL query string
    if (getCheckout() != null) {
      joiner.add(getCheckout().toUrlQueryString(prefix + "checkout" + suffix));
    }

    // add `creationDateTime` to the URL query string
    if (getCreationDateTime() != null) {
      try {
        joiner.add(String.format("%screationDateTime%s=%s", prefix, suffix,
            URLEncoder.encode(String.valueOf(getCreationDateTime()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}
