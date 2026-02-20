package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DeliverResponse
 */
@JsonPropertyOrder({
    DeliverResponse.JSON_PROPERTY_CAPTURE_PAYMENT_RESPONSE,
    DeliverResponse.JSON_PROPERTY_SHOPPING_CART,
    DeliverResponse.JSON_PROPERTY_FUND_SPLIT
})
public class DeliverResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CAPTURE_PAYMENT_RESPONSE = "capturePaymentResponse";
  private CapturePaymentResponse capturePaymentResponse;

  public static final String JSON_PROPERTY_SHOPPING_CART = "shoppingCart";
  private ShoppingCartResult shoppingCart;

  public static final String JSON_PROPERTY_FUND_SPLIT = "fundSplit";
  private FundSplit fundSplit;

  public DeliverResponse() {
  }

  public DeliverResponse capturePaymentResponse(CapturePaymentResponse capturePaymentResponse) {

    this.capturePaymentResponse = capturePaymentResponse;
    return this;
  }

  /**
   * Get capturePaymentResponse
   * 
   * @return capturePaymentResponse
   **/

  @JsonProperty(JSON_PROPERTY_CAPTURE_PAYMENT_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CapturePaymentResponse getCapturePaymentResponse() {
    return capturePaymentResponse;
  }

  @JsonProperty(JSON_PROPERTY_CAPTURE_PAYMENT_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapturePaymentResponse(CapturePaymentResponse capturePaymentResponse) {
    this.capturePaymentResponse = capturePaymentResponse;
  }

  public DeliverResponse shoppingCart(ShoppingCartResult shoppingCart) {

    this.shoppingCart = shoppingCart;
    return this;
  }

  /**
   * Get shoppingCart
   * 
   * @return shoppingCart
   **/

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

  public DeliverResponse fundSplit(FundSplit fundSplit) {

    this.fundSplit = fundSplit;
    return this;
  }

  /**
   * Get fundSplit
   * 
   * @return fundSplit
   **/

  @JsonProperty(JSON_PROPERTY_FUND_SPLIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FundSplit getFundSplit() {
    return fundSplit;
  }

  @JsonProperty(JSON_PROPERTY_FUND_SPLIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFundSplit(FundSplit fundSplit) {
    this.fundSplit = fundSplit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliverResponse deliverResponse = (DeliverResponse) o;
    return Objects.equals(this.capturePaymentResponse, deliverResponse.capturePaymentResponse) &&
        Objects.equals(this.shoppingCart, deliverResponse.shoppingCart) &&
        Objects.equals(this.fundSplit, deliverResponse.fundSplit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capturePaymentResponse, shoppingCart, fundSplit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliverResponse {\n");
    sb.append("    capturePaymentResponse: ").append(toIndentedString(capturePaymentResponse)).append("\n");
    sb.append("    shoppingCart: ").append(toIndentedString(shoppingCart)).append("\n");
    sb.append("    fundSplit: ").append(toIndentedString(fundSplit)).append("\n");
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
