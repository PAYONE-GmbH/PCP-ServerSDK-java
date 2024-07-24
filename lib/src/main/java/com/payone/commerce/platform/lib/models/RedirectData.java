package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing all data needed to redirect the customer.
 */
@JsonPropertyOrder({
    RedirectData.JSON_PROPERTY_REDIRECT_U_R_L
})
public class RedirectData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REDIRECT_U_R_L = "redirectURL";
  private String redirectURL;

  public RedirectData() {
  }

  public RedirectData redirectURL(String redirectURL) {

    this.redirectURL = redirectURL;
    return this;
  }

  /**
   * The URL that the customer should be redirected to. Be sure to redirect using
   * the GET method
   * 
   * @return redirectURL
   **/

  @JsonProperty(JSON_PROPERTY_REDIRECT_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRedirectURL() {
    return redirectURL;
  }

  @JsonProperty(JSON_PROPERTY_REDIRECT_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectURL(String redirectURL) {
    this.redirectURL = redirectURL;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedirectData redirectData = (RedirectData) o;
    return Objects.equals(this.redirectURL, redirectData.redirectURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedirectData {\n");
    sb.append("    redirectURL: ").append(toIndentedString(redirectURL)).append("\n");
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
