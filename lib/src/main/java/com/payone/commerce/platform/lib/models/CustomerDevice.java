package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing information about the device of the end customer.
 */
@JsonPropertyOrder({
    CustomerDevice.JSON_PROPERTY_ACCEPT_HEADER,
    CustomerDevice.JSON_PROPERTY_IP_ADDRESS,
    CustomerDevice.JSON_PROPERTY_DEVICE_TOKEN,
    CustomerDevice.JSON_PROPERTY_USER_AGENT
})
public class CustomerDevice implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ACCEPT_HEADER = "acceptHeader";
  private String acceptHeader;

  public static final String JSON_PROPERTY_IP_ADDRESS = "ipAddress";
  private String ipAddress;

  public static final String JSON_PROPERTY_DEVICE_TOKEN = "deviceToken";
  private String deviceToken;

  public static final String JSON_PROPERTY_USER_AGENT = "userAgent";
  private String userAgent;

  public CustomerDevice() {
  }

  public CustomerDevice acceptHeader(String acceptHeader) {

    this.acceptHeader = acceptHeader;
    return this;
  }

  /**
   * The accept-header of the customer client from the HTTP Headers. This field
   * can be mandatory depending on the selected
   * payment method and routing option.
   *
   * @maxLength 2048
   * @example text/html,application/xhtml+xml,application/xml;q=0.9,*\/*;q=0.8
   * @return acceptHeader
   **/

  @JsonProperty(JSON_PROPERTY_ACCEPT_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAcceptHeader() {
    return acceptHeader;
  }

  @JsonProperty(JSON_PROPERTY_ACCEPT_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcceptHeader(String acceptHeader) {
    this.acceptHeader = acceptHeader;
  }

  public CustomerDevice ipAddress(String ipAddress) {

    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * The IP address of the customer client from the HTTP Headers.
   * 
   * @maxLength 45
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
   * @maxLength 255
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

  public CustomerDevice userAgent(String userAgent) {

    this.userAgent = userAgent;
    return this;
  }

  /**
   * User-Agent of the client device/browser from the HTTP Headers. This field can
   * be mandatory depending on the selected payment method and routing option.
   *
   * @maxLength 2048
   * @example Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML,
   *          like Gecko) Chrome/115.0.0.0 Safari/537.36
   * @return userAgent
   **/

  @JsonProperty(JSON_PROPERTY_USER_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserAgent() {
    return userAgent;
  }

  @JsonProperty(JSON_PROPERTY_USER_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
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
    return Objects.equals(this.acceptHeader, customerDevice.acceptHeader) &&
        Objects.equals(this.ipAddress, customerDevice.ipAddress) &&
        Objects.equals(this.deviceToken, customerDevice.deviceToken) &&
        Objects.equals(this.userAgent, customerDevice.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptHeader, ipAddress, deviceToken, userAgent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDevice {\n");
    sb.append("    acceptHeader: ").append(toIndentedString(acceptHeader)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    deviceToken: ").append(toIndentedString(deviceToken)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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
