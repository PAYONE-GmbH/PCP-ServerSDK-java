package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Input for the payment for a respective payment method. In case the
 * paymentMethodSpecificInput has already been provided when creating the
 * Commerce Case or Checkout, it will automatically be used for the Payment
 * Execution. If a new input will be provided, the existing input will be
 * updated.
 */
@JsonPropertyOrder({
    PaymentMethodSpecificInput.JSON_PROPERTY_CARD_PAYMENT_METHOD_SPECIFIC_INPUT,
    PaymentMethodSpecificInput.JSON_PROPERTY_MOBILE_PAYMENT_METHOD_SPECIFIC_INPUT,
    PaymentMethodSpecificInput.JSON_PROPERTY_REDIRECT_PAYMENT_METHOD_SPECIFIC_INPUT,
    PaymentMethodSpecificInput.JSON_PROPERTY_SEPA_DIRECT_DEBIT_PAYMENT_METHOD_SPECIFIC_INPUT,
    PaymentMethodSpecificInput.JSON_PROPERTY_FINANCING_PAYMENT_METHOD_SPECIFIC_INPUT,
    PaymentMethodSpecificInput.JSON_PROPERTY_CUSTOMER_DEVICE,
    PaymentMethodSpecificInput.JSON_PROPERTY_PAYMENT_CHANNEL
})
public class PaymentMethodSpecificInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CARD_PAYMENT_METHOD_SPECIFIC_INPUT = "cardPaymentMethodSpecificInput";
  private CardPaymentMethodSpecificInput cardPaymentMethodSpecificInput;

  public static final String JSON_PROPERTY_MOBILE_PAYMENT_METHOD_SPECIFIC_INPUT = "mobilePaymentMethodSpecificInput";
  private MobilePaymentMethodSpecificInput mobilePaymentMethodSpecificInput;

  public static final String JSON_PROPERTY_REDIRECT_PAYMENT_METHOD_SPECIFIC_INPUT = "redirectPaymentMethodSpecificInput";
  private RedirectPaymentMethodSpecificInput redirectPaymentMethodSpecificInput;

  public static final String JSON_PROPERTY_SEPA_DIRECT_DEBIT_PAYMENT_METHOD_SPECIFIC_INPUT = "sepaDirectDebitPaymentMethodSpecificInput";
  private SepaDirectDebitPaymentMethodSpecificInput sepaDirectDebitPaymentMethodSpecificInput;

  public static final String JSON_PROPERTY_FINANCING_PAYMENT_METHOD_SPECIFIC_INPUT = "financingPaymentMethodSpecificInput";
  private FinancingPaymentMethodSpecificInput financingPaymentMethodSpecificInput;

  public static final String JSON_PROPERTY_CUSTOMER_DEVICE = "customerDevice";
  private CustomerDevice customerDevice;

  public static final String JSON_PROPERTY_PAYMENT_CHANNEL = "paymentChannel";
  private PaymentChannel paymentChannel;

  public PaymentMethodSpecificInput() {
  }

  public PaymentMethodSpecificInput cardPaymentMethodSpecificInput(
      CardPaymentMethodSpecificInput cardPaymentMethodSpecificInput) {

    this.cardPaymentMethodSpecificInput = cardPaymentMethodSpecificInput;
    return this;
  }

  /**
   * Get cardPaymentMethodSpecificInput
   * 
   * @return cardPaymentMethodSpecificInput
   **/

  @JsonProperty(JSON_PROPERTY_CARD_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CardPaymentMethodSpecificInput getCardPaymentMethodSpecificInput() {
    return cardPaymentMethodSpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_CARD_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardPaymentMethodSpecificInput(CardPaymentMethodSpecificInput cardPaymentMethodSpecificInput) {
    this.cardPaymentMethodSpecificInput = cardPaymentMethodSpecificInput;
  }

  public PaymentMethodSpecificInput mobilePaymentMethodSpecificInput(
      MobilePaymentMethodSpecificInput mobilePaymentMethodSpecificInput) {

    this.mobilePaymentMethodSpecificInput = mobilePaymentMethodSpecificInput;
    return this;
  }

  /**
   * Get mobilePaymentMethodSpecificInput
   * 
   * @return mobilePaymentMethodSpecificInput
   **/

  @JsonProperty(JSON_PROPERTY_MOBILE_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MobilePaymentMethodSpecificInput getMobilePaymentMethodSpecificInput() {
    return mobilePaymentMethodSpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_MOBILE_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobilePaymentMethodSpecificInput(MobilePaymentMethodSpecificInput mobilePaymentMethodSpecificInput) {
    this.mobilePaymentMethodSpecificInput = mobilePaymentMethodSpecificInput;
  }

  public PaymentMethodSpecificInput redirectPaymentMethodSpecificInput(
      RedirectPaymentMethodSpecificInput redirectPaymentMethodSpecificInput) {

    this.redirectPaymentMethodSpecificInput = redirectPaymentMethodSpecificInput;
    return this;
  }

  /**
   * Get redirectPaymentMethodSpecificInput
   * 
   * @return redirectPaymentMethodSpecificInput
   **/

  @JsonProperty(JSON_PROPERTY_REDIRECT_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RedirectPaymentMethodSpecificInput getRedirectPaymentMethodSpecificInput() {
    return redirectPaymentMethodSpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_REDIRECT_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectPaymentMethodSpecificInput(
      RedirectPaymentMethodSpecificInput redirectPaymentMethodSpecificInput) {
    this.redirectPaymentMethodSpecificInput = redirectPaymentMethodSpecificInput;
  }

  public PaymentMethodSpecificInput sepaDirectDebitPaymentMethodSpecificInput(
      SepaDirectDebitPaymentMethodSpecificInput sepaDirectDebitPaymentMethodSpecificInput) {

    this.sepaDirectDebitPaymentMethodSpecificInput = sepaDirectDebitPaymentMethodSpecificInput;
    return this;
  }

  /**
   * Get sepaDirectDebitPaymentMethodSpecificInput
   * 
   * @return sepaDirectDebitPaymentMethodSpecificInput
   **/

  @JsonProperty(JSON_PROPERTY_SEPA_DIRECT_DEBIT_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SepaDirectDebitPaymentMethodSpecificInput getSepaDirectDebitPaymentMethodSpecificInput() {
    return sepaDirectDebitPaymentMethodSpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_SEPA_DIRECT_DEBIT_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSepaDirectDebitPaymentMethodSpecificInput(
      SepaDirectDebitPaymentMethodSpecificInput sepaDirectDebitPaymentMethodSpecificInput) {
    this.sepaDirectDebitPaymentMethodSpecificInput = sepaDirectDebitPaymentMethodSpecificInput;
  }

  public PaymentMethodSpecificInput financingPaymentMethodSpecificInput(
      FinancingPaymentMethodSpecificInput financingPaymentMethodSpecificInput) {

    this.financingPaymentMethodSpecificInput = financingPaymentMethodSpecificInput;
    return this;
  }

  /**
   * Get financingPaymentMethodSpecificInput
   * 
   * @return financingPaymentMethodSpecificInput
   **/

  @JsonProperty(JSON_PROPERTY_FINANCING_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FinancingPaymentMethodSpecificInput getFinancingPaymentMethodSpecificInput() {
    return financingPaymentMethodSpecificInput;
  }

  @JsonProperty(JSON_PROPERTY_FINANCING_PAYMENT_METHOD_SPECIFIC_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinancingPaymentMethodSpecificInput(
      FinancingPaymentMethodSpecificInput financingPaymentMethodSpecificInput) {
    this.financingPaymentMethodSpecificInput = financingPaymentMethodSpecificInput;
  }

  public PaymentMethodSpecificInput customerDevice(CustomerDevice customerDevice) {

    this.customerDevice = customerDevice;
    return this;
  }

  /**
   * Get customerDevice
   * 
   * @return customerDevice
   **/

  @JsonProperty(JSON_PROPERTY_CUSTOMER_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomerDevice getCustomerDevice() {
    return customerDevice;
  }

  @JsonProperty(JSON_PROPERTY_CUSTOMER_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerDevice(CustomerDevice customerDevice) {
    this.customerDevice = customerDevice;
  }

  public PaymentMethodSpecificInput paymentChannel(PaymentChannel paymentChannel) {

    this.paymentChannel = paymentChannel;
    return this;
  }

  /**
   * Get paymentChannel
   * 
   * @return paymentChannel
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentChannel getPaymentChannel() {
    return paymentChannel;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentChannel(PaymentChannel paymentChannel) {
    this.paymentChannel = paymentChannel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodSpecificInput paymentMethodSpecificInput = (PaymentMethodSpecificInput) o;
    return Objects.equals(this.cardPaymentMethodSpecificInput,
        paymentMethodSpecificInput.cardPaymentMethodSpecificInput) &&
        Objects
            .equals(this.mobilePaymentMethodSpecificInput, paymentMethodSpecificInput.mobilePaymentMethodSpecificInput)
        &&
        Objects.equals(this.redirectPaymentMethodSpecificInput,
            paymentMethodSpecificInput.redirectPaymentMethodSpecificInput)
        &&
        Objects.equals(this.sepaDirectDebitPaymentMethodSpecificInput,
            paymentMethodSpecificInput.sepaDirectDebitPaymentMethodSpecificInput)
        &&
        Objects.equals(this.financingPaymentMethodSpecificInput,
            paymentMethodSpecificInput.financingPaymentMethodSpecificInput)
        &&
        Objects.equals(this.customerDevice, paymentMethodSpecificInput.customerDevice) &&
        Objects.equals(this.paymentChannel, paymentMethodSpecificInput.paymentChannel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardPaymentMethodSpecificInput, mobilePaymentMethodSpecificInput,
        redirectPaymentMethodSpecificInput, sepaDirectDebitPaymentMethodSpecificInput,
        financingPaymentMethodSpecificInput, customerDevice, paymentChannel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodSpecificInput {\n");
    sb.append("    cardPaymentMethodSpecificInput: ").append(toIndentedString(cardPaymentMethodSpecificInput))
        .append("\n");
    sb.append("    mobilePaymentMethodSpecificInput: ").append(toIndentedString(mobilePaymentMethodSpecificInput))
        .append("\n");
    sb.append("    redirectPaymentMethodSpecificInput: ").append(toIndentedString(redirectPaymentMethodSpecificInput))
        .append("\n");
    sb.append("    sepaDirectDebitPaymentMethodSpecificInput: ")
        .append(toIndentedString(sepaDirectDebitPaymentMethodSpecificInput)).append("\n");
    sb.append("    financingPaymentMethodSpecificInput: ").append(toIndentedString(financingPaymentMethodSpecificInput))
        .append("\n");
    sb.append("    customerDevice: ").append(toIndentedString(customerDevice)).append("\n");
    sb.append("    paymentChannel: ").append(toIndentedString(paymentChannel)).append("\n");
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
