package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing payment details.
 */
@JsonPropertyOrder({
    PaymentOutput.JSON_PROPERTY_AMOUNT_OF_MONEY,
    PaymentOutput.JSON_PROPERTY_MERCHANT_PARAMETERS,
    PaymentOutput.JSON_PROPERTY_REFERENCES,
    PaymentOutput.JSON_PROPERTY_CARD_PAYMENT_METHOD_SPECIFIC_OUTPUT,
    PaymentOutput.JSON_PROPERTY_MOBILE_PAYMENT_METHOD_SPECIFIC_OUTPUT,
    PaymentOutput.JSON_PROPERTY_PAYMENT_METHOD,
    PaymentOutput.JSON_PROPERTY_REDIRECT_PAYMENT_METHOD_SPECIFIC_OUTPUT,
    PaymentOutput.JSON_PROPERTY_SEPA_DIRECT_DEBIT_PAYMENT_METHOD_SPECIFIC_OUTPUT,
    PaymentOutput.JSON_PROPERTY_FINANCING_PAYMENT_METHOD_SPECIFIC_OUTPUT
})
public class PaymentOutput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AMOUNT_OF_MONEY = "amountOfMoney";
  private AmountOfMoney amountOfMoney;

  public static final String JSON_PROPERTY_MERCHANT_PARAMETERS = "merchantParameters";
  private String merchantParameters;

  public static final String JSON_PROPERTY_REFERENCES = "references";
  private PaymentReferences references;

  public static final String JSON_PROPERTY_CARD_PAYMENT_METHOD_SPECIFIC_OUTPUT = "cardPaymentMethodSpecificOutput";
  private CardPaymentMethodSpecificOutput cardPaymentMethodSpecificOutput;

  public static final String JSON_PROPERTY_MOBILE_PAYMENT_METHOD_SPECIFIC_OUTPUT = "mobilePaymentMethodSpecificOutput";
  private MobilePaymentMethodSpecificOutput mobilePaymentMethodSpecificOutput;

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "paymentMethod";
  private String paymentMethod;

  public static final String JSON_PROPERTY_REDIRECT_PAYMENT_METHOD_SPECIFIC_OUTPUT = "redirectPaymentMethodSpecificOutput";
  private RedirectPaymentMethodSpecificOutput redirectPaymentMethodSpecificOutput;

  public static final String JSON_PROPERTY_SEPA_DIRECT_DEBIT_PAYMENT_METHOD_SPECIFIC_OUTPUT = "sepaDirectDebitPaymentMethodSpecificOutput";
  private SepaDirectDebitPaymentMethodSpecificOutput sepaDirectDebitPaymentMethodSpecificOutput;

  public static final String JSON_PROPERTY_FINANCING_PAYMENT_METHOD_SPECIFIC_OUTPUT = "financingPaymentMethodSpecificOutput";
  private FinancingPaymentMethodSpecificOutput financingPaymentMethodSpecificOutput;

  public PaymentOutput() {
  }

  public PaymentOutput amountOfMoney(AmountOfMoney amountOfMoney) {

    this.amountOfMoney = amountOfMoney;
    return this;
  }

  /**
   * Get amountOfMoney
   * 
   * @return amountOfMoney
   **/

  @JsonProperty(JSON_PROPERTY_AMOUNT_OF_MONEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AmountOfMoney getAmountOfMoney() {
    return amountOfMoney;
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT_OF_MONEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountOfMoney(AmountOfMoney amountOfMoney) {
    this.amountOfMoney = amountOfMoney;
  }

  public PaymentOutput merchantParameters(String merchantParameters) {

    this.merchantParameters = merchantParameters;
    return this;
  }

  /**
   * It allows you to store additional parameters for the transaction in JSON
   * format. This field should not contain any personal data.
   * 
   * @return merchantParameters
   **/

  @JsonProperty(JSON_PROPERTY_MERCHANT_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantParameters() {
    return merchantParameters;
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantParameters(String merchantParameters) {
    this.merchantParameters = merchantParameters;
  }

  public PaymentOutput references(PaymentReferences references) {

    this.references = references;
    return this;
  }

  /**
   * Get references
   * 
   * @return references
   **/

  @JsonProperty(JSON_PROPERTY_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentReferences getReferences() {
    return references;
  }

  @JsonProperty(JSON_PROPERTY_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferences(PaymentReferences references) {
    this.references = references;
  }

  public PaymentOutput cardPaymentMethodSpecificOutput(
      CardPaymentMethodSpecificOutput cardPaymentMethodSpecificOutput) {

    this.cardPaymentMethodSpecificOutput = cardPaymentMethodSpecificOutput;
    return this;
  }

  /**
   * Get cardPaymentMethodSpecificOutput
   * 
   * @return cardPaymentMethodSpecificOutput
   **/

  @JsonProperty(JSON_PROPERTY_CARD_PAYMENT_METHOD_SPECIFIC_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CardPaymentMethodSpecificOutput getCardPaymentMethodSpecificOutput() {
    return cardPaymentMethodSpecificOutput;
  }

  @JsonProperty(JSON_PROPERTY_CARD_PAYMENT_METHOD_SPECIFIC_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardPaymentMethodSpecificOutput(CardPaymentMethodSpecificOutput cardPaymentMethodSpecificOutput) {
    this.cardPaymentMethodSpecificOutput = cardPaymentMethodSpecificOutput;
  }

  public PaymentOutput mobilePaymentMethodSpecificOutput(
      MobilePaymentMethodSpecificOutput mobilePaymentMethodSpecificOutput) {

    this.mobilePaymentMethodSpecificOutput = mobilePaymentMethodSpecificOutput;
    return this;
  }

  /**
   * Get mobilePaymentMethodSpecificOutput
   * 
   * @return mobilePaymentMethodSpecificOutput
   **/

  @JsonProperty(JSON_PROPERTY_MOBILE_PAYMENT_METHOD_SPECIFIC_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MobilePaymentMethodSpecificOutput getMobilePaymentMethodSpecificOutput() {
    return mobilePaymentMethodSpecificOutput;
  }

  @JsonProperty(JSON_PROPERTY_MOBILE_PAYMENT_METHOD_SPECIFIC_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobilePaymentMethodSpecificOutput(
      MobilePaymentMethodSpecificOutput mobilePaymentMethodSpecificOutput) {
    this.mobilePaymentMethodSpecificOutput = mobilePaymentMethodSpecificOutput;
  }

  public PaymentOutput paymentMethod(String paymentMethod) {

    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Payment method identifier based on the paymentProductId.
   * 
   * @return paymentMethod
   **/

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentMethod() {
    return paymentMethod;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PaymentOutput redirectPaymentMethodSpecificOutput(
      RedirectPaymentMethodSpecificOutput redirectPaymentMethodSpecificOutput) {

    this.redirectPaymentMethodSpecificOutput = redirectPaymentMethodSpecificOutput;
    return this;
  }

  /**
   * Get redirectPaymentMethodSpecificOutput
   * 
   * @return redirectPaymentMethodSpecificOutput
   **/

  @JsonProperty(JSON_PROPERTY_REDIRECT_PAYMENT_METHOD_SPECIFIC_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RedirectPaymentMethodSpecificOutput getRedirectPaymentMethodSpecificOutput() {
    return redirectPaymentMethodSpecificOutput;
  }

  @JsonProperty(JSON_PROPERTY_REDIRECT_PAYMENT_METHOD_SPECIFIC_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectPaymentMethodSpecificOutput(
      RedirectPaymentMethodSpecificOutput redirectPaymentMethodSpecificOutput) {
    this.redirectPaymentMethodSpecificOutput = redirectPaymentMethodSpecificOutput;
  }

  public PaymentOutput sepaDirectDebitPaymentMethodSpecificOutput(
      SepaDirectDebitPaymentMethodSpecificOutput sepaDirectDebitPaymentMethodSpecificOutput) {

    this.sepaDirectDebitPaymentMethodSpecificOutput = sepaDirectDebitPaymentMethodSpecificOutput;
    return this;
  }

  /**
   * Get sepaDirectDebitPaymentMethodSpecificOutput
   * 
   * @return sepaDirectDebitPaymentMethodSpecificOutput
   **/

  @JsonProperty(JSON_PROPERTY_SEPA_DIRECT_DEBIT_PAYMENT_METHOD_SPECIFIC_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SepaDirectDebitPaymentMethodSpecificOutput getSepaDirectDebitPaymentMethodSpecificOutput() {
    return sepaDirectDebitPaymentMethodSpecificOutput;
  }

  @JsonProperty(JSON_PROPERTY_SEPA_DIRECT_DEBIT_PAYMENT_METHOD_SPECIFIC_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSepaDirectDebitPaymentMethodSpecificOutput(
      SepaDirectDebitPaymentMethodSpecificOutput sepaDirectDebitPaymentMethodSpecificOutput) {
    this.sepaDirectDebitPaymentMethodSpecificOutput = sepaDirectDebitPaymentMethodSpecificOutput;
  }

  public PaymentOutput financingPaymentMethodSpecificOutput(
      FinancingPaymentMethodSpecificOutput financingPaymentMethodSpecificOutput) {

    this.financingPaymentMethodSpecificOutput = financingPaymentMethodSpecificOutput;
    return this;
  }

  /**
   * Get financingPaymentMethodSpecificOutput
   * 
   * @return financingPaymentMethodSpecificOutput
   **/

  @JsonProperty(JSON_PROPERTY_FINANCING_PAYMENT_METHOD_SPECIFIC_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FinancingPaymentMethodSpecificOutput getFinancingPaymentMethodSpecificOutput() {
    return financingPaymentMethodSpecificOutput;
  }

  @JsonProperty(JSON_PROPERTY_FINANCING_PAYMENT_METHOD_SPECIFIC_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinancingPaymentMethodSpecificOutput(
      FinancingPaymentMethodSpecificOutput financingPaymentMethodSpecificOutput) {
    this.financingPaymentMethodSpecificOutput = financingPaymentMethodSpecificOutput;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentOutput paymentOutput = (PaymentOutput) o;
    return Objects.equals(this.amountOfMoney, paymentOutput.amountOfMoney) &&
        Objects.equals(this.merchantParameters, paymentOutput.merchantParameters) &&
        Objects.equals(this.references, paymentOutput.references) &&
        Objects.equals(this.cardPaymentMethodSpecificOutput, paymentOutput.cardPaymentMethodSpecificOutput) &&
        Objects.equals(this.mobilePaymentMethodSpecificOutput, paymentOutput.mobilePaymentMethodSpecificOutput) &&
        Objects.equals(this.paymentMethod, paymentOutput.paymentMethod) &&
        Objects.equals(this.redirectPaymentMethodSpecificOutput, paymentOutput.redirectPaymentMethodSpecificOutput) &&
        Objects.equals(this.sepaDirectDebitPaymentMethodSpecificOutput,
            paymentOutput.sepaDirectDebitPaymentMethodSpecificOutput)
        &&
        Objects.equals(this.financingPaymentMethodSpecificOutput, paymentOutput.financingPaymentMethodSpecificOutput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountOfMoney, merchantParameters, references, cardPaymentMethodSpecificOutput,
        mobilePaymentMethodSpecificOutput, paymentMethod, redirectPaymentMethodSpecificOutput,
        sepaDirectDebitPaymentMethodSpecificOutput, financingPaymentMethodSpecificOutput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentOutput {\n");
    sb.append("    amountOfMoney: ").append(toIndentedString(amountOfMoney)).append("\n");
    sb.append("    merchantParameters: ").append(toIndentedString(merchantParameters)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    cardPaymentMethodSpecificOutput: ").append(toIndentedString(cardPaymentMethodSpecificOutput))
        .append("\n");
    sb.append("    mobilePaymentMethodSpecificOutput: ").append(toIndentedString(mobilePaymentMethodSpecificOutput))
        .append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    redirectPaymentMethodSpecificOutput: ").append(toIndentedString(redirectPaymentMethodSpecificOutput))
        .append("\n");
    sb.append("    sepaDirectDebitPaymentMethodSpecificOutput: ")
        .append(toIndentedString(sepaDirectDebitPaymentMethodSpecificOutput)).append("\n");
    sb.append("    financingPaymentMethodSpecificOutput: ")
        .append(toIndentedString(financingPaymentMethodSpecificOutput)).append("\n");
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
