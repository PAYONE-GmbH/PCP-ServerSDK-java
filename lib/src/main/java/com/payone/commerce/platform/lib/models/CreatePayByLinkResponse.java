package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/** Object containing details about a created pay-link. */
@JsonPropertyOrder({ CreatePayByLinkResponse.JSON_PROPERTY_EXPIRATION_DATE,
    CreatePayByLinkResponse.JSON_PROPERTY_PAYMENT_LINK_ORDER, CreatePayByLinkResponse.JSON_PROPERTY_STATUS,
    CreatePayByLinkResponse.JSON_PROPERTY_REDIRECTION_URL, CreatePayByLinkResponse.JSON_PROPERTY_PAYMENT_LINK_ID })
public class CreatePayByLinkResponse implements Serializable {
  private static final long serialVersionUID = 1L;
  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expirationDate";
  private OffsetDateTime expirationDate;
  public static final String JSON_PROPERTY_PAYMENT_LINK_ORDER = "paymentLinkOrder";
  private PaymentLinkOrder paymentLinkOrder;
  public static final String JSON_PROPERTY_STATUS = "status";
  private PayLinkStatusValue status;
  public static final String JSON_PROPERTY_REDIRECTION_URL = "redirectionUrl";
  private String redirectionUrl;
  public static final String JSON_PROPERTY_PAYMENT_LINK_ID = "paymentLinkId";
  private UUID paymentLinkId;

  public CreatePayByLinkResponse expirationDate(OffsetDateTime value) {
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

  public CreatePayByLinkResponse paymentLinkOrder(PaymentLinkOrder value) {
    paymentLinkOrder = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_LINK_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PaymentLinkOrder getPaymentLinkOrder() {
    return paymentLinkOrder;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_LINK_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentLinkOrder(PaymentLinkOrder value) {
    paymentLinkOrder = value;
  }

  public CreatePayByLinkResponse status(PayLinkStatusValue value) {
    status = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PayLinkStatusValue getStatus() {
    return status;
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(PayLinkStatusValue value) {
    status = value;
  }

  public CreatePayByLinkResponse redirectionUrl(String value) {
    redirectionUrl = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_REDIRECTION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRedirectionUrl() {
    return redirectionUrl;
  }

  @JsonProperty(JSON_PROPERTY_REDIRECTION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectionUrl(String value) {
    redirectionUrl = value;
  }

  public CreatePayByLinkResponse paymentLinkId(UUID value) {
    paymentLinkId = value;
    return this;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_LINK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UUID getPaymentLinkId() {
    return paymentLinkId;
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_LINK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentLinkId(UUID value) {
    paymentLinkId = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePayByLinkResponse that = (CreatePayByLinkResponse) o;
    return Objects.equals(expirationDate, that.expirationDate)
        && Objects.equals(paymentLinkOrder, that.paymentLinkOrder) && status == that.status
        && Objects.equals(redirectionUrl, that.redirectionUrl) && Objects.equals(paymentLinkId, that.paymentLinkId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationDate, paymentLinkOrder, status, redirectionUrl, paymentLinkId);
  }
}
