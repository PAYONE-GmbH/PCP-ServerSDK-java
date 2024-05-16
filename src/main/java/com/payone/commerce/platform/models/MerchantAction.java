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

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Object that contains the action, including the needed data, that you should perform next, like showing instructions, showing the transaction results or redirect to a third party to complete the payment
 */
@JsonPropertyOrder({
  MerchantAction.JSON_PROPERTY_ACTION_TYPE,
  MerchantAction.JSON_PROPERTY_REDIRECT_DATA
})
public class MerchantAction implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ACTION_TYPE = "actionType";
  private String actionType;

  public static final String JSON_PROPERTY_REDIRECT_DATA = "redirectData";
  private RedirectData redirectData;

  public MerchantAction() {
  }

  public MerchantAction actionType(String actionType) {
    
    this.actionType = actionType;
    return this;
  }

   /**
   * Action merchants needs to take in the online payment process. Possible values are:   * REDIRECT - The customer needs to be redirected using the details found in redirectData   * SHOW_FORM - The customer needs to be shown a form with the fields found in formFields. You can submit the data entered by the user in a Complete payment request.   * SHOW_INSTRUCTIONS - The customer needs to be shown payment instruction using the details found in showData. Alternatively the instructions can be rendered by us using the instructionsRenderingData   * SHOW_TRANSACTION_RESULTS - The customer needs to be shown the transaction results using the details found in showData. Alternatively the instructions can be rendered by us using the instructionsRenderingData   * MOBILE_THREEDS_CHALLENGE - The customer needs to complete a challenge as part of the 3D Secure authentication inside your mobile app. The details contained in mobileThreeDSecureChallengeParameters need to be provided to the EMVco certified Mobile SDK as a challengeParameters object.   * CALL_THIRD_PARTY - The merchant needs to call a third party using the data found in thirdPartyData
   * @return actionType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActionType() {
    return actionType;
  }


  @JsonProperty(JSON_PROPERTY_ACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActionType(String actionType) {
    this.actionType = actionType;
  }


  public MerchantAction redirectData(RedirectData redirectData) {
    
    this.redirectData = redirectData;
    return this;
  }

   /**
   * Get redirectData
   * @return redirectData
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDIRECT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RedirectData getRedirectData() {
    return redirectData;
  }


  @JsonProperty(JSON_PROPERTY_REDIRECT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectData(RedirectData redirectData) {
    this.redirectData = redirectData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantAction merchantAction = (MerchantAction) o;
    return Objects.equals(this.actionType, merchantAction.actionType) &&
        Objects.equals(this.redirectData, merchantAction.redirectData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, redirectData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantAction {\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    redirectData: ").append(toIndentedString(redirectData)).append("\n");
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

    // add `actionType` to the URL query string
    if (getActionType() != null) {
      try {
        joiner.add(String.format("%sactionType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActionType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `redirectData` to the URL query string
    if (getRedirectData() != null) {
      joiner.add(getRedirectData().toUrlQueryString(prefix + "redirectData" + suffix));
    }

    return joiner.toString();
  }

}

