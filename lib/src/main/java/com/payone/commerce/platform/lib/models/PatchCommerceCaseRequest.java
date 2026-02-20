package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Update the customer data of the given Commerce Case
 */
@JsonPropertyOrder({
    PatchCommerceCaseRequest.JSON_PROPERTY_CUSTOMER
})
public class PatchCommerceCaseRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private Customer customer;

  public PatchCommerceCaseRequest() {
  }

  public PatchCommerceCaseRequest customer(Customer customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   *
   * @return customer
   */
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchCommerceCaseRequest patchCommerceCaseRequest = (PatchCommerceCaseRequest) o;
    return Objects.equals(this.customer, patchCommerceCaseRequest.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchCommerceCaseRequest {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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
