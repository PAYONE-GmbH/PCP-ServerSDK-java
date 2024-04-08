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
 * CancelResponse
 */
@JsonPropertyOrder({
  CancelResponse.JSON_PROPERTY_CANCEL_PAYMENT_RESPONSE,
  CancelResponse.JSON_PROPERTY_SHOPPING_CART
})
public class CancelResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CANCEL_PAYMENT_RESPONSE = "cancelPaymentResponse";
  private CancelPaymentResponse cancelPaymentResponse;

  public static final String JSON_PROPERTY_SHOPPING_CART = "shoppingCart";
  private ShoppingCartResult shoppingCart;

  public CancelResponse() {
  }

  public CancelResponse cancelPaymentResponse(CancelPaymentResponse cancelPaymentResponse) {
    
    this.cancelPaymentResponse = cancelPaymentResponse;
    return this;
  }

   /**
   * Get cancelPaymentResponse
   * @return cancelPaymentResponse
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CANCEL_PAYMENT_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CancelPaymentResponse getCancelPaymentResponse() {
    return cancelPaymentResponse;
  }


  @JsonProperty(JSON_PROPERTY_CANCEL_PAYMENT_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCancelPaymentResponse(CancelPaymentResponse cancelPaymentResponse) {
    this.cancelPaymentResponse = cancelPaymentResponse;
  }


  public CancelResponse shoppingCart(ShoppingCartResult shoppingCart) {
    
    this.shoppingCart = shoppingCart;
    return this;
  }

   /**
   * Get shoppingCart
   * @return shoppingCart
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOPPING_CART)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShoppingCartResult getShoppingCart() {
    return shoppingCart;
  }


  @JsonProperty(JSON_PROPERTY_SHOPPING_CART)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShoppingCart(ShoppingCartResult shoppingCart) {
    this.shoppingCart = shoppingCart;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelResponse cancelResponse = (CancelResponse) o;
    return Objects.equals(this.cancelPaymentResponse, cancelResponse.cancelPaymentResponse) &&
        Objects.equals(this.shoppingCart, cancelResponse.shoppingCart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelPaymentResponse, shoppingCart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelResponse {\n");
    sb.append("    cancelPaymentResponse: ").append(toIndentedString(cancelPaymentResponse)).append("\n");
    sb.append("    shoppingCart: ").append(toIndentedString(shoppingCart)).append("\n");
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

    // add `cancelPaymentResponse` to the URL query string
    if (getCancelPaymentResponse() != null) {
      joiner.add(getCancelPaymentResponse().toUrlQueryString(prefix + "cancelPaymentResponse" + suffix));
    }

    // add `shoppingCart` to the URL query string
    if (getShoppingCart() != null) {
      joiner.add(getShoppingCart().toUrlQueryString(prefix + "shoppingCart" + suffix));
    }

    return joiner.toString();
  }

}

