package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CommerceCaseResponse
 */
@JsonPropertyOrder({
    CommerceCaseResponse.JSON_PROPERTY_MERCHANT_REFERENCE,
    CommerceCaseResponse.JSON_PROPERTY_COMMERCE_CASE_ID,
    CommerceCaseResponse.JSON_PROPERTY_CUSTOMER,
    CommerceCaseResponse.JSON_PROPERTY_CHECKOUTS,
    CommerceCaseResponse.JSON_PROPERTY_CREATION_DATE_TIME
})
public class CommerceCaseResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MERCHANT_REFERENCE = "merchantReference";
  private String merchantReference;

  public static final String JSON_PROPERTY_COMMERCE_CASE_ID = "commerceCaseId";
  private UUID commerceCaseId;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private Customer customer;

  public static final String JSON_PROPERTY_CHECKOUTS = "checkouts";
  private List<CheckoutResponse> checkouts;

  public static final String JSON_PROPERTY_CREATION_DATE_TIME = "creationDateTime";
  private Date creationDateTime;

  public CommerceCaseResponse() {
  }

  public CommerceCaseResponse merchantReference(String merchantReference) {

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

  public CommerceCaseResponse commerceCaseId(UUID commerceCaseId) {

    this.commerceCaseId = commerceCaseId;
    return this;
  }

  /**
   * Unique ID reference of the Commerce Case. It can be used to add additional
   * Checkouts to the Commerce Case.
   * 
   * @return commerceCaseId
   **/

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

  public CommerceCaseResponse customer(Customer customer) {

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

  public CommerceCaseResponse checkouts(List<CheckoutResponse> checkouts) {

    this.checkouts = checkouts;
    return this;
  }

  public CommerceCaseResponse addCheckoutsItem(CheckoutResponse checkoutsItem) {
    if (this.checkouts == null) {
      this.checkouts = new ArrayList<>();
    }
    this.checkouts.add(checkoutsItem);
    return this;
  }

  /**
   * Get checkouts
   * 
   * @return checkouts
   **/

  @JsonProperty(JSON_PROPERTY_CHECKOUTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CheckoutResponse> getCheckouts() {
    return checkouts;
  }

  @JsonProperty(JSON_PROPERTY_CHECKOUTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckouts(List<CheckoutResponse> checkouts) {
    this.checkouts = checkouts;
  }

  public CommerceCaseResponse creationDateTime(Date creationDateTime) {

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
    CommerceCaseResponse commerceCaseResponse = (CommerceCaseResponse) o;
    return Objects.equals(this.merchantReference, commerceCaseResponse.merchantReference) &&
        Objects.equals(this.commerceCaseId, commerceCaseResponse.commerceCaseId) &&
        Objects.equals(this.customer, commerceCaseResponse.customer) &&
        Objects.equals(this.checkouts, commerceCaseResponse.checkouts) &&
        Objects.equals(this.creationDateTime, commerceCaseResponse.creationDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantReference, commerceCaseId, customer, checkouts, creationDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommerceCaseResponse {\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    commerceCaseId: ").append(toIndentedString(commerceCaseId)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    checkouts: ").append(toIndentedString(checkouts)).append("\n");
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

}
