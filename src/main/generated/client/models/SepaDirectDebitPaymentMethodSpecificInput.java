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
 * Object containing the specific input details for SEPA direct debit payments
 */
@JsonPropertyOrder({
  SepaDirectDebitPaymentMethodSpecificInput.JSON_PROPERTY_PAYMENT_PRODUCT771_SPECIFIC_INPUT,
  SepaDirectDebitPaymentMethodSpecificInput.JSON_PROPERTY_PAYMENT_PRODUCT_ID
})
public class SepaDirectDebitPaymentMethodSpecificInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT771_SPECIFIC_INPUT = "paymentProduct771SpecificInput";
  private SepaDirectDebitPaymentProduct771SpecificInput paymentProduct771SpecificInput;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT_ID = "paymentProductId";
  private Integer paymentProductId;

  public SepaDirectDebitPaymentMethodSpecificInput() {
  }

  public SepaDirectDebitPaymentMethodSpecificInput paymentProduct771SpecificInput(SepaDirectDebitPaymentProduct771SpecificInput paymentProduct771SpecificInput) {
    
    this.paymentProduct771SpecificInput = paymentProduct771SpecificInput;
    return this;
  }

   /**
   * Get paymentProduct771SpecificInput
   * @return paymentProduct771SpecificInput
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT771_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SepaDirectDebitPaymentProduct771SpecificInput getPaymentProduct771SpecificInput() {
    return paymentProduct771SpecificInput;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT771_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentProduct771SpecificInput(SepaDirectDebitPaymentProduct771SpecificInput paymentProduct771SpecificInput) {
    this.paymentProduct771SpecificInput = paymentProduct771SpecificInput;
  }


  public SepaDirectDebitPaymentMethodSpecificInput paymentProductId(Integer paymentProductId) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SepaDirectDebitPaymentMethodSpecificInput sepaDirectDebitPaymentMethodSpecificInput = (SepaDirectDebitPaymentMethodSpecificInput) o;
    return Objects.equals(this.paymentProduct771SpecificInput, sepaDirectDebitPaymentMethodSpecificInput.paymentProduct771SpecificInput) &&
        Objects.equals(this.paymentProductId, sepaDirectDebitPaymentMethodSpecificInput.paymentProductId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentProduct771SpecificInput, paymentProductId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SepaDirectDebitPaymentMethodSpecificInput {\n");
    sb.append("    paymentProduct771SpecificInput: ").append(toIndentedString(paymentProduct771SpecificInput)).append("\n");
    sb.append("    paymentProductId: ").append(toIndentedString(paymentProductId)).append("\n");
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

    // add `paymentProduct771SpecificInput` to the URL query string
    if (getPaymentProduct771SpecificInput() != null) {
      joiner.add(getPaymentProduct771SpecificInput().toUrlQueryString(prefix + "paymentProduct771SpecificInput" + suffix));
    }

    // add `paymentProductId` to the URL query string
    if (getPaymentProductId() != null) {
      try {
        joiner.add(String.format("%spaymentProductId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentProductId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

