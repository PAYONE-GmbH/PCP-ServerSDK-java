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


package com.payone.commerce.platform.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Object containing the related data of the created Payment Information.
 */
@JsonPropertyOrder({
  PaymentInformationResponse.JSON_PROPERTY_COMMERCE_CASE_ID,
  PaymentInformationResponse.JSON_PROPERTY_CHECKOUT_ID,
  PaymentInformationResponse.JSON_PROPERTY_MERCHANT_CUSTOMER_ID,
  PaymentInformationResponse.JSON_PROPERTY_PAYMENT_INFORMATION_ID,
  PaymentInformationResponse.JSON_PROPERTY_PAYMENT_CHANNEL,
  PaymentInformationResponse.JSON_PROPERTY_PAYMENT_PRODUCT_ID,
  PaymentInformationResponse.JSON_PROPERTY_TERMINAL_ID,
  PaymentInformationResponse.JSON_PROPERTY_CARD_ACCEPTOR_ID,
  PaymentInformationResponse.JSON_PROPERTY_MERCHANT_REFERENCE,
  PaymentInformationResponse.JSON_PROPERTY_CARD_PAYMENT_DETAILS,
  PaymentInformationResponse.JSON_PROPERTY_EVENTS
})
public class PaymentInformationResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_COMMERCE_CASE_ID = "commerceCaseId";
  private UUID commerceCaseId;

  public static final String JSON_PROPERTY_CHECKOUT_ID = "checkoutId";
  private UUID checkoutId;

  public static final String JSON_PROPERTY_MERCHANT_CUSTOMER_ID = "merchantCustomerId";
  private String merchantCustomerId;

  public static final String JSON_PROPERTY_PAYMENT_INFORMATION_ID = "paymentInformationId";
  private UUID paymentInformationId;

  public static final String JSON_PROPERTY_PAYMENT_CHANNEL = "paymentChannel";
  private PaymentChannel paymentChannel;

  public static final String JSON_PROPERTY_PAYMENT_PRODUCT_ID = "paymentProductId";
  private Integer paymentProductId;

  public static final String JSON_PROPERTY_TERMINAL_ID = "terminalId";
  private String terminalId;

  public static final String JSON_PROPERTY_CARD_ACCEPTOR_ID = "cardAcceptorId";
  private String cardAcceptorId;

  public static final String JSON_PROPERTY_MERCHANT_REFERENCE = "merchantReference";
  private String merchantReference;

  public static final String JSON_PROPERTY_CARD_PAYMENT_DETAILS = "cardPaymentDetails";
  private CardPaymentDetails cardPaymentDetails;

  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<PaymentEvent> events;

  public PaymentInformationResponse() {
  }

  public PaymentInformationResponse commerceCaseId(UUID commerceCaseId) {
    
    this.commerceCaseId = commerceCaseId;
    return this;
  }

   /**
   * Unique ID of the Commerce Case.
   * @return commerceCaseId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMERCE_CASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCommerceCaseId() {
    return commerceCaseId;
  }


  @JsonProperty(JSON_PROPERTY_COMMERCE_CASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommerceCaseId(UUID commerceCaseId) {
    this.commerceCaseId = commerceCaseId;
  }


  public PaymentInformationResponse checkoutId(UUID checkoutId) {
    
    this.checkoutId = checkoutId;
    return this;
  }

   /**
   * Unique ID of the Commerce Case.
   * @return checkoutId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHECKOUT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCheckoutId() {
    return checkoutId;
  }


  @JsonProperty(JSON_PROPERTY_CHECKOUT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckoutId(UUID checkoutId) {
    this.checkoutId = checkoutId;
  }


  public PaymentInformationResponse merchantCustomerId(String merchantCustomerId) {
    
    this.merchantCustomerId = merchantCustomerId;
    return this;
  }

   /**
   * Unique identifier of the customer.
   * @return merchantCustomerId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERCHANT_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantCustomerId() {
    return merchantCustomerId;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantCustomerId(String merchantCustomerId) {
    this.merchantCustomerId = merchantCustomerId;
  }


  public PaymentInformationResponse paymentInformationId(UUID paymentInformationId) {
    
    this.paymentInformationId = paymentInformationId;
    return this;
  }

   /**
   * Unique ID of the Payment Information.
   * @return paymentInformationId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_INFORMATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getPaymentInformationId() {
    return paymentInformationId;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_INFORMATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentInformationId(UUID paymentInformationId) {
    this.paymentInformationId = paymentInformationId;
  }


  public PaymentInformationResponse paymentChannel(PaymentChannel paymentChannel) {
    
    this.paymentChannel = paymentChannel;
    return this;
  }

   /**
   * Get paymentChannel
   * @return paymentChannel
  **/
  @jakarta.annotation.Nullable
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


  public PaymentInformationResponse paymentProductId(Integer paymentProductId) {
    
    this.paymentProductId = paymentProductId;
    return this;
  }

   /**
   * Payment product identifier - please check see product documentation for a full overview of possible values.
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


  public PaymentInformationResponse terminalId(String terminalId) {
    
    this.terminalId = terminalId;
    return this;
  }

   /**
   * Unique identifier of the POS terminal of the payment transaction.
   * @return terminalId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERMINAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTerminalId() {
    return terminalId;
  }


  @JsonProperty(JSON_PROPERTY_TERMINAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }


  public PaymentInformationResponse cardAcceptorId(String cardAcceptorId) {
    
    this.cardAcceptorId = cardAcceptorId;
    return this;
  }

   /**
   * Unique ID that identifies a store location or transaction point and which refers to the contract number of the merchant accepting the card.
   * @return cardAcceptorId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARD_ACCEPTOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardAcceptorId() {
    return cardAcceptorId;
  }


  @JsonProperty(JSON_PROPERTY_CARD_ACCEPTOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardAcceptorId(String cardAcceptorId) {
    this.cardAcceptorId = cardAcceptorId;
  }


  public PaymentInformationResponse merchantReference(String merchantReference) {
    
    this.merchantReference = merchantReference;
    return this;
  }

   /**
   * Unique reference of the PaymentInformation. In case of card present transactions, the reference from the ECR or terminal will be used. It is always the reference for external transactions. (e.g. card present payments, cash payments or payments processed by other payment providers). 
   * @return merchantReference
  **/
  @jakarta.annotation.Nullable
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


  public PaymentInformationResponse cardPaymentDetails(CardPaymentDetails cardPaymentDetails) {
    
    this.cardPaymentDetails = cardPaymentDetails;
    return this;
  }

   /**
   * Get cardPaymentDetails
   * @return cardPaymentDetails
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARD_PAYMENT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CardPaymentDetails getCardPaymentDetails() {
    return cardPaymentDetails;
  }


  @JsonProperty(JSON_PROPERTY_CARD_PAYMENT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardPaymentDetails(CardPaymentDetails cardPaymentDetails) {
    this.cardPaymentDetails = cardPaymentDetails;
  }


  public PaymentInformationResponse events(List<PaymentEvent> events) {
    
    this.events = events;
    return this;
  }

  public PaymentInformationResponse addEventsItem(PaymentEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PaymentEvent> getEvents() {
    return events;
  }


  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvents(List<PaymentEvent> events) {
    this.events = events;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInformationResponse paymentInformationResponse = (PaymentInformationResponse) o;
    return Objects.equals(this.commerceCaseId, paymentInformationResponse.commerceCaseId) &&
        Objects.equals(this.checkoutId, paymentInformationResponse.checkoutId) &&
        Objects.equals(this.merchantCustomerId, paymentInformationResponse.merchantCustomerId) &&
        Objects.equals(this.paymentInformationId, paymentInformationResponse.paymentInformationId) &&
        Objects.equals(this.paymentChannel, paymentInformationResponse.paymentChannel) &&
        Objects.equals(this.paymentProductId, paymentInformationResponse.paymentProductId) &&
        Objects.equals(this.terminalId, paymentInformationResponse.terminalId) &&
        Objects.equals(this.cardAcceptorId, paymentInformationResponse.cardAcceptorId) &&
        Objects.equals(this.merchantReference, paymentInformationResponse.merchantReference) &&
        Objects.equals(this.cardPaymentDetails, paymentInformationResponse.cardPaymentDetails) &&
        Objects.equals(this.events, paymentInformationResponse.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commerceCaseId, checkoutId, merchantCustomerId, paymentInformationId, paymentChannel, paymentProductId, terminalId, cardAcceptorId, merchantReference, cardPaymentDetails, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInformationResponse {\n");
    sb.append("    commerceCaseId: ").append(toIndentedString(commerceCaseId)).append("\n");
    sb.append("    checkoutId: ").append(toIndentedString(checkoutId)).append("\n");
    sb.append("    merchantCustomerId: ").append(toIndentedString(merchantCustomerId)).append("\n");
    sb.append("    paymentInformationId: ").append(toIndentedString(paymentInformationId)).append("\n");
    sb.append("    paymentChannel: ").append(toIndentedString(paymentChannel)).append("\n");
    sb.append("    paymentProductId: ").append(toIndentedString(paymentProductId)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    cardAcceptorId: ").append(toIndentedString(cardAcceptorId)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    cardPaymentDetails: ").append(toIndentedString(cardPaymentDetails)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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

    // add `commerceCaseId` to the URL query string
    if (getCommerceCaseId() != null) {
      try {
        joiner.add(String.format("%scommerceCaseId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCommerceCaseId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `checkoutId` to the URL query string
    if (getCheckoutId() != null) {
      try {
        joiner.add(String.format("%scheckoutId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCheckoutId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `merchantCustomerId` to the URL query string
    if (getMerchantCustomerId() != null) {
      try {
        joiner.add(String.format("%smerchantCustomerId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMerchantCustomerId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `paymentInformationId` to the URL query string
    if (getPaymentInformationId() != null) {
      try {
        joiner.add(String.format("%spaymentInformationId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentInformationId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `paymentChannel` to the URL query string
    if (getPaymentChannel() != null) {
      try {
        joiner.add(String.format("%spaymentChannel%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentChannel()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `terminalId` to the URL query string
    if (getTerminalId() != null) {
      try {
        joiner.add(String.format("%sterminalId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTerminalId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `cardAcceptorId` to the URL query string
    if (getCardAcceptorId() != null) {
      try {
        joiner.add(String.format("%scardAcceptorId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCardAcceptorId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `merchantReference` to the URL query string
    if (getMerchantReference() != null) {
      try {
        joiner.add(String.format("%smerchantReference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMerchantReference()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `cardPaymentDetails` to the URL query string
    if (getCardPaymentDetails() != null) {
      joiner.add(getCardPaymentDetails().toUrlQueryString(prefix + "cardPaymentDetails" + suffix));
    }

    // add `events` to the URL query string
    if (getEvents() != null) {
      for (int i = 0; i < getEvents().size(); i++) {
        if (getEvents().get(i) != null) {
          joiner.add(getEvents().get(i).toUrlQueryString(String.format("%sevents%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

