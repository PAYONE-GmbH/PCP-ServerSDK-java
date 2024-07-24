package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * PaymentInformationRequest
 */
@JsonPropertyOrder({
    PaymentInformationRequest.JSON_PROPERTY_AMOUNT_OF_MONEY,
    PaymentInformationRequest.JSON_PROPERTY_TYPE,
    PaymentInformationRequest.JSON_PROPERTY_PAYMENT_CHANNEL,
    PaymentInformationRequest.JSON_PROPERTY_PAYMENT_PRODUCT_ID,
    PaymentInformationRequest.JSON_PROPERTY_MERCHANT_REFERENCE
})
public class PaymentInformationRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AMOUNT_OF_MONEY = "amountOfMoney";
  private AmountOfMoney amountOfMoney;

  public static final String JSON_PROPERTY_TYPE = "type";
  private PaymentType type;

  public static final String JSON_PROPERTY_PAYMENT_CHANNEL = "paymentChannel";
  private PaymentChannel paymentChannel;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT_ID = "paymentProductId";
  private Integer paymentProductId;

  public static final String JSON_PROPERTY_MERCHANT_REFERENCE = "merchantReference";
  private String merchantReference;

  public PaymentInformationRequest() {
  }

  public PaymentInformationRequest amountOfMoney(AmountOfMoney amountOfMoney) {

    this.amountOfMoney = amountOfMoney;
    return this;
  }

  /**
   * Get amountOfMoney
   * 
   * @return amountOfMoney
   **/

  @JsonProperty(JSON_PROPERTY_AMOUNT_OF_MONEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AmountOfMoney getAmountOfMoney() {
    return amountOfMoney;
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT_OF_MONEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmountOfMoney(AmountOfMoney amountOfMoney) {
    this.amountOfMoney = amountOfMoney;
  }

  public PaymentInformationRequest type(PaymentType type) {

    this.type = type;
    return this;
  }

  /**
   * Get type
   * 
   * @return type
   **/

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaymentType getType() {
    return type;
  }

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(PaymentType type) {
    this.type = type;
  }

  public PaymentInformationRequest paymentChannel(PaymentChannel paymentChannel) {

    this.paymentChannel = paymentChannel;
    return this;
  }

  /**
   * Get paymentChannel
   * 
   * @return paymentChannel
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaymentChannel getPaymentChannel() {
    return paymentChannel;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentChannel(PaymentChannel paymentChannel) {
    this.paymentChannel = paymentChannel;
  }

  public PaymentInformationRequest paymentProductId(Integer paymentProductId) {

    this.paymentProductId = paymentProductId;
    return this;
  }

  /**
   * Payment method identifier - please check the product documentation for a full
   * overview of possible values.
   * minimum: 0
   * maximum: 99999
   * 
   * @return paymentProductId
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPaymentProductId() {
    return paymentProductId;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentProductId(Integer paymentProductId) {
    this.paymentProductId = paymentProductId;
  }

  public PaymentInformationRequest merchantReference(String merchantReference) {

    this.merchantReference = merchantReference;
    return this;
  }

  /**
   * Unique reference of the PaymentInformation. In case of card present
   * transactions, the reference from the ECR or terminal will be used. It is
   * always the reference for external transactions. (e.g. card present payments,
   * cash payments or payments processed by other payment providers).
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInformationRequest paymentInformationRequest = (PaymentInformationRequest) o;
    return Objects.equals(this.amountOfMoney, paymentInformationRequest.amountOfMoney) &&
        Objects.equals(this.type, paymentInformationRequest.type) &&
        Objects.equals(this.paymentChannel, paymentInformationRequest.paymentChannel) &&
        Objects.equals(this.paymentProductId, paymentInformationRequest.paymentProductId) &&
        Objects.equals(this.merchantReference, paymentInformationRequest.merchantReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountOfMoney, type, paymentChannel, paymentProductId, merchantReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInformationRequest {\n");
    sb.append("    amountOfMoney: ").append(toIndentedString(amountOfMoney)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    paymentChannel: ").append(toIndentedString(paymentChannel)).append("\n");
    sb.append("    paymentProductId: ").append(toIndentedString(paymentProductId)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
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
