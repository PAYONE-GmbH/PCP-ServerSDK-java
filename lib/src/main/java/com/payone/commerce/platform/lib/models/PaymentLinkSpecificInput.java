package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ PaymentLinkSpecificInput.JSON_PROPERTY_EXPIRATION_DATE,
    PaymentLinkSpecificInput.JSON_PROPERTY_AUTHORIZATION_MODE, PaymentLinkSpecificInput.JSON_PROPERTY_PAYMENT_METHODS,
    PaymentLinkSpecificInput.JSON_PROPERTY_BNPL_ID, PaymentLinkSpecificInput.JSON_PROPERTY_RETURN_URL,
    PaymentLinkSpecificInput.JSON_PROPERTY_LOGO_URL, PaymentLinkSpecificInput.JSON_PROPERTY_AUTO_REDIRECTION,
    PaymentLinkSpecificInput.JSON_PROPERTY_TERMS_URL, PaymentLinkSpecificInput.JSON_PROPERTY_RETRY_NUMBER,
    PaymentLinkSpecificInput.JSON_PROPERTY_MERCHANT_NAME, PaymentLinkSpecificInput.JSON_PROPERTY_MERCHANT_ORIGIN })
public class PaymentLinkSpecificInput implements Serializable {
  private static final long serialVersionUID = 1L;
  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expirationDate";
  private OffsetDateTime expirationDate;
  public static final String JSON_PROPERTY_AUTHORIZATION_MODE = "authorizationMode";
  private AuthorizationMode authorizationMode;
  public static final String JSON_PROPERTY_PAYMENT_METHODS = "paymentMethods";
  private List<String> paymentMethods;
  public static final String JSON_PROPERTY_BNPL_ID = "bnplId";
  private String bnplId;
  public static final String JSON_PROPERTY_RETURN_URL = "returnUrl";
  private String returnUrl;
  public static final String JSON_PROPERTY_LOGO_URL = "logoUrl";
  private String logoUrl;
  public static final String JSON_PROPERTY_AUTO_REDIRECTION = "autoRedirection";
  private Boolean autoRedirection;
  public static final String JSON_PROPERTY_TERMS_URL = "termsUrl";
  private String termsUrl;
  public static final String JSON_PROPERTY_RETRY_NUMBER = "retryNumber";
  private Long retryNumber;
  public static final String JSON_PROPERTY_MERCHANT_NAME = "merchantName";
  private String merchantName;
  public static final String JSON_PROPERTY_MERCHANT_ORIGIN = "merchantOrigin";
  private String merchantOrigin;

  public PaymentLinkSpecificInput expirationDate(OffsetDateTime value) {
    expirationDate = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpirationDate(OffsetDateTime value) {
    expirationDate = value;
  }

  public PaymentLinkSpecificInput authorizationMode(AuthorizationMode value) {
    authorizationMode = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AuthorizationMode getAuthorizationMode() {
    return authorizationMode;
  }

  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthorizationMode(AuthorizationMode value) {
    authorizationMode = value;
  }

  public PaymentLinkSpecificInput paymentMethods(List<String> value) {
    paymentMethods = value;
    return this;
  }

  public PaymentLinkSpecificInput addPaymentMethodsItem(String value) {
    if (paymentMethods == null) {
      paymentMethods = new ArrayList<>();
    }
    paymentMethods.add(value);
    return this;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHODS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getPaymentMethods() {
    return paymentMethods;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_METHODS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentMethods(List<String> value) {
    paymentMethods = value;
  }

  public PaymentLinkSpecificInput bnplId(String value) {
    bnplId = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_BNPL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBnplId() {
    return bnplId;
  }

  @JsonProperty(JSON_PROPERTY_BNPL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBnplId(String value) {
    bnplId = value;
  }

  public PaymentLinkSpecificInput returnUrl(String value) {
    returnUrl = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_RETURN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReturnUrl() {
    return returnUrl;
  }

  @JsonProperty(JSON_PROPERTY_RETURN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnUrl(String value) {
    returnUrl = value;
  }

  public PaymentLinkSpecificInput logoUrl(String value) {
    logoUrl = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_LOGO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLogoUrl() {
    return logoUrl;
  }

  @JsonProperty(JSON_PROPERTY_LOGO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoUrl(String value) {
    logoUrl = value;
  }

  public PaymentLinkSpecificInput autoRedirection(Boolean value) {
    autoRedirection = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_AUTO_REDIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAutoRedirection() {
    return autoRedirection;
  }

  @JsonProperty(JSON_PROPERTY_AUTO_REDIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoRedirection(Boolean value) {
    autoRedirection = value;
  }

  public PaymentLinkSpecificInput termsUrl(String value) {
    termsUrl = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_TERMS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTermsUrl() {
    return termsUrl;
  }

  @JsonProperty(JSON_PROPERTY_TERMS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTermsUrl(String value) {
    termsUrl = value;
  }

  public PaymentLinkSpecificInput retryNumber(Long value) {
    retryNumber = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_RETRY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRetryNumber() {
    return retryNumber;
  }

  @JsonProperty(JSON_PROPERTY_RETRY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetryNumber(Long value) {
    retryNumber = value;
  }

  public PaymentLinkSpecificInput merchantName(String value) {
    merchantName = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantName() {
    return merchantName;
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantName(String value) {
    merchantName = value;
  }

  public PaymentLinkSpecificInput merchantOrigin(String value) {
    merchantOrigin = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_ORIGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMerchantOrigin() {
    return merchantOrigin;
  }

  @JsonProperty(JSON_PROPERTY_MERCHANT_ORIGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantOrigin(String value) {
    merchantOrigin = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentLinkSpecificInput that = (PaymentLinkSpecificInput) o;
    return Objects.equals(expirationDate, that.expirationDate) && authorizationMode == that.authorizationMode
        && Objects.equals(paymentMethods, that.paymentMethods) && Objects.equals(bnplId, that.bnplId)
        && Objects.equals(returnUrl, that.returnUrl) && Objects.equals(logoUrl, that.logoUrl)
        && Objects.equals(autoRedirection, that.autoRedirection) && Objects.equals(termsUrl, that.termsUrl)
        && Objects.equals(retryNumber, that.retryNumber) && Objects.equals(merchantName, that.merchantName)
        && Objects.equals(merchantOrigin, that.merchantOrigin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationDate, authorizationMode, paymentMethods, bnplId, returnUrl, logoUrl,
        autoRedirection, termsUrl, retryNumber, merchantName, merchantOrigin);
  }
}
