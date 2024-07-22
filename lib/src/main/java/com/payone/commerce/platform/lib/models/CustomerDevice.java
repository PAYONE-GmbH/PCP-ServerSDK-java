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

package com.payone.commerce.platform.lib.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Object containing information about the device of the end customer.
 */
@JsonPropertyOrder({
    CustomerDevice.JSON_PROPERTY_IP_ADDRESS,
    CustomerDevice.JSON_PROPERTY_DEVICE_TOKEN
})
public class CustomerDevice implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IP_ADDRESS = "ipAddress";
  private String ipAddress;

  public static final String JSON_PROPERTY_DEVICE_TOKEN = "deviceToken";
  private String deviceToken;

  public CustomerDevice() {
  }

  public CustomerDevice ipAddress(String ipAddress) {

    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * The IP address of the customer client from the HTTP Headers.
   * 
   * @return ipAddress
   **/

  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpAddress() {
    return ipAddress;
  }

  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public CustomerDevice deviceToken(String deviceToken) {

    this.deviceToken = deviceToken;
    return this;
  }

  /**
   * Tokenized representation of the end customers device. For example used for
   * PAYONE Buy Now, Pay Later (BNPL).
   * 
   * @return deviceToken
   **/

  @JsonProperty(JSON_PROPERTY_DEVICE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceToken() {
    return deviceToken;
  }

  @JsonProperty(JSON_PROPERTY_DEVICE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerDevice customerDevice = (CustomerDevice) o;
    return Objects.equals(this.ipAddress, customerDevice.ipAddress) &&
        Objects.equals(this.deviceToken, customerDevice.deviceToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, deviceToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDevice {\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    deviceToken: ").append(toIndentedString(deviceToken)).append("\n");
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

    // add `ipAddress` to the URL query string
    if (getIpAddress() != null) {
      try {
        joiner.add(String.format("%sipAddress%s=%s", prefix, suffix,
            URLEncoder.encode(String.valueOf(getIpAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `deviceToken` to the URL query string
    if (getDeviceToken() != null) {
      try {
        joiner.add(String.format("%sdeviceToken%s=%s", prefix, suffix,
            URLEncoder.encode(String.valueOf(getDeviceToken()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}
