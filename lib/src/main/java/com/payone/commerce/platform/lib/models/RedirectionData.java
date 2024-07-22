package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing browser specific redirection related data.
 */
@JsonPropertyOrder({
    RedirectionData.JSON_PROPERTY_RETURN_URL
})
public class RedirectionData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RETURN_URL = "returnUrl";
  private String returnUrl;

  public RedirectionData() {
  }

  public RedirectionData returnUrl(String returnUrl) {

    this.returnUrl = returnUrl;
    return this;
  }

  /**
   * The URL that the customer is redirected to after the payment flow has
   * finished. You can add any number of key value pairs in the query string that,
   * for instance help you to identify the customer when they return to your site.
   * Please note that we will also append some additional key value pairs that
   * will also help you with this identification process. Note: The provided URL
   * should be absolute and contain the protocol to use, e.g. http:// or https://.
   * For use on mobile devices a custom protocol can be used in the form of
   * protocol://. This protocol must be registered on the device first. URLs
   * without a protocol will be rejected.
   * 
   * @return returnUrl
   **/

  @JsonProperty(JSON_PROPERTY_RETURN_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getReturnUrl() {
    return returnUrl;
  }

  @JsonProperty(JSON_PROPERTY_RETURN_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedirectionData redirectionData = (RedirectionData) o;
    return Objects.equals(this.returnUrl, redirectionData.returnUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedirectionData {\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
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
