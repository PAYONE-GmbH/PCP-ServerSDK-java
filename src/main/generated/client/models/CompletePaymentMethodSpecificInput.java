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

import java.util.StringJoiner;

/**
 * To complete the Order the completePaymentMethodSpecificInput has to be provided, containing the selected installmentOptionId as well as the the bankAccountInformation of the customer. 
 */
@JsonPropertyOrder({
  CompletePaymentMethodSpecificInput.JSON_PROPERTY_PAYMENT_PRODUCT3391_SPECIFIC_INPUT
})
public class CompletePaymentMethodSpecificInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT3391_SPECIFIC_INPUT = "paymentProduct3391SpecificInput";
  private PaymentProduct3391SpecificInput paymentProduct3391SpecificInput;

  public CompletePaymentMethodSpecificInput() {
  }

  public CompletePaymentMethodSpecificInput paymentProduct3391SpecificInput(PaymentProduct3391SpecificInput paymentProduct3391SpecificInput) {
    
    this.paymentProduct3391SpecificInput = paymentProduct3391SpecificInput;
    return this;
  }

   /**
   * Get paymentProduct3391SpecificInput
   * @return paymentProduct3391SpecificInput
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT3391_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentProduct3391SpecificInput getPaymentProduct3391SpecificInput() {
    return paymentProduct3391SpecificInput;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT3391_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentProduct3391SpecificInput(PaymentProduct3391SpecificInput paymentProduct3391SpecificInput) {
    this.paymentProduct3391SpecificInput = paymentProduct3391SpecificInput;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompletePaymentMethodSpecificInput completePaymentMethodSpecificInput = (CompletePaymentMethodSpecificInput) o;
    return Objects.equals(this.paymentProduct3391SpecificInput, completePaymentMethodSpecificInput.paymentProduct3391SpecificInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentProduct3391SpecificInput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletePaymentMethodSpecificInput {\n");
    sb.append("    paymentProduct3391SpecificInput: ").append(toIndentedString(paymentProduct3391SpecificInput)).append("\n");
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

    // add `paymentProduct3391SpecificInput` to the URL query string
    if (getPaymentProduct3391SpecificInput() != null) {
      joiner.add(getPaymentProduct3391SpecificInput().toUrlQueryString(prefix + "paymentProduct3391SpecificInput" + suffix));
    }

    return joiner.toString();
  }

}

