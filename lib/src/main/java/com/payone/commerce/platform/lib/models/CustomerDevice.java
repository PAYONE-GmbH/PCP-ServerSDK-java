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

}
