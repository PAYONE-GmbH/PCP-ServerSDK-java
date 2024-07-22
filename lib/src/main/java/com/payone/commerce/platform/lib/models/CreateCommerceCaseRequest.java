package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CreateCommerceCaseRequest
 */
@JsonPropertyOrder({
    CreateCommerceCaseRequest.JSON_PROPERTY_MERCHANT_REFERENCE,
    CreateCommerceCaseRequest.JSON_PROPERTY_CUSTOMER,
    CreateCommerceCaseRequest.JSON_PROPERTY_CREATION_DATE_TIME,
    CreateCommerceCaseRequest.JSON_PROPERTY_CHECKOUT
})
public class CreateCommerceCaseRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MERCHANT_REFERENCE = "merchantReference";
  private String merchantReference;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private Customer customer;

  public static final String JSON_PROPERTY_CREATION_DATE_TIME = "creationDateTime";
  private OffsetDateTime creationDateTime;

  public static final String JSON_PROPERTY_CHECKOUT = "checkout";
  private CreateCheckoutRequest checkout;

  public CreateCommerceCaseRequest() {
  }

  public CreateCommerceCaseRequest merchantReference(String merchantReference) {

    this.merchantReference = merchantReference;
    return this;
  }

  /**
   * Unique reference of the Commerce Case that is also returned for reporting and
   * reconciliation purposes.
   * 
   * @return merchantReference
   **/

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

  public CreateCommerceCaseRequest customer(Customer customer) {

    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * 
   * @return customer
   **/

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

  public CreateCommerceCaseRequest creationDateTime(OffsetDateTime creationDateTime) {

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

  @JsonProperty(JSON_PROPERTY_CREATION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }

  @JsonProperty(JSON_PROPERTY_CREATION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreationDateTime(OffsetDateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public CreateCommerceCaseRequest checkout(CreateCheckoutRequest checkout) {

    this.checkout = checkout;
    return this;
  }

  /**
   * Get checkout
   * 
   * @return checkout
   **/

  @JsonProperty(JSON_PROPERTY_CHECKOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreateCheckoutRequest getCheckout() {
    return checkout;
  }

  @JsonProperty(JSON_PROPERTY_CHECKOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckout(CreateCheckoutRequest checkout) {
    this.checkout = checkout;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCommerceCaseRequest createCommerceCaseRequest = (CreateCommerceCaseRequest) o;
    return Objects.equals(this.merchantReference, createCommerceCaseRequest.merchantReference) &&
        Objects.equals(this.customer, createCommerceCaseRequest.customer) &&
        Objects.equals(this.creationDateTime, createCommerceCaseRequest.creationDateTime) &&
        Objects.equals(this.checkout, createCommerceCaseRequest.checkout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantReference, customer, creationDateTime, checkout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCommerceCaseRequest {\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    checkout: ").append(toIndentedString(checkout)).append("\n");
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
