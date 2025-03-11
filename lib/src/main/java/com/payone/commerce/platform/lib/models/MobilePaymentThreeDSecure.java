package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing specific data regarding 3-D Secure for card digital
 * wallets. Necessary to perform 3D Secure when there is no liability shift from
 * the wallet and corresponding card network.
 */
@JsonPropertyOrder({
    MobilePaymentThreeDSecure.JSON_PROPERTY_REDIRECTION_DATA
})

public class MobilePaymentThreeDSecure implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REDIRECTION_DATA = "redirectionData";

  private RedirectionData redirectionData;

  public MobilePaymentThreeDSecure() {
  }

  public MobilePaymentThreeDSecure redirectionData(RedirectionData redirectionData) {
    this.redirectionData = redirectionData;
    return this;
  }

  /**
   * Get redirectionData
   * 
   * @return redirectionData
   */

  @JsonProperty(JSON_PROPERTY_REDIRECTION_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RedirectionData getRedirectionData() {
    return redirectionData;
  }

  @JsonProperty(JSON_PROPERTY_REDIRECTION_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectionData(RedirectionData redirectionData) {
    this.redirectionData = redirectionData;
  }

  /**
   * Return true if this MobilePaymentThreeDSecure object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobilePaymentThreeDSecure mobilePaymentThreeDSecure = (MobilePaymentThreeDSecure) o;
    return Objects.equals(this.redirectionData, mobilePaymentThreeDSecure.redirectionData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectionData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobilePaymentThreeDSecure {\n");
    sb.append("    redirectionData: ").append(toIndentedString(redirectionData)).append("\n");
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
