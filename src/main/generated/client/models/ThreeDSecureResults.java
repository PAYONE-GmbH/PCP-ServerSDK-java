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


package client.models;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * 3D Secure results object
 */
@JsonPropertyOrder({
  ThreeDSecureResults.JSON_PROPERTY_VERSION,
  ThreeDSecureResults.JSON_PROPERTY_SCHEME_ECI,
  ThreeDSecureResults.JSON_PROPERTY_APPLIED_EXEMPTION
})
public class ThreeDSecureResults implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_SCHEME_ECI = "schemeEci";
  private String schemeEci;

  /**
   * Exemption requested and applied in the authorization. 
   */
  public enum AppliedExemptionEnum {
    LOW_VALUE("low-value"),
    
    MERCHANT_ACQUIRER_TRANSACTION_RISK_ANALYSIS("merchant-acquirer-transaction-risk-analysis");

    private String value;

    AppliedExemptionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AppliedExemptionEnum fromValue(String value) {
      for (AppliedExemptionEnum b : AppliedExemptionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_APPLIED_EXEMPTION = "appliedExemption";
  private AppliedExemptionEnum appliedExemption;

  public ThreeDSecureResults() {
  }

  public ThreeDSecureResults version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * 3D Secure Protocol version used during this transaction.
   * @return version
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  public ThreeDSecureResults schemeEci(String schemeEci) {
    
    this.schemeEci = schemeEci;
    return this;
  }

   /**
   * 3D Secure ECI (Electronic Commerce Indicator) depending on the Scheme. Returned by DS.
   * @return schemeEci
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEME_ECI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSchemeEci() {
    return schemeEci;
  }


  @JsonProperty(JSON_PROPERTY_SCHEME_ECI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemeEci(String schemeEci) {
    this.schemeEci = schemeEci;
  }


  public ThreeDSecureResults appliedExemption(AppliedExemptionEnum appliedExemption) {
    
    this.appliedExemption = appliedExemption;
    return this;
  }

   /**
   * Exemption requested and applied in the authorization. 
   * @return appliedExemption
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLIED_EXEMPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppliedExemptionEnum getAppliedExemption() {
    return appliedExemption;
  }


  @JsonProperty(JSON_PROPERTY_APPLIED_EXEMPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppliedExemption(AppliedExemptionEnum appliedExemption) {
    this.appliedExemption = appliedExemption;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDSecureResults threeDSecureResults = (ThreeDSecureResults) o;
    return Objects.equals(this.version, threeDSecureResults.version) &&
        Objects.equals(this.schemeEci, threeDSecureResults.schemeEci) &&
        Objects.equals(this.appliedExemption, threeDSecureResults.appliedExemption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, schemeEci, appliedExemption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDSecureResults {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    schemeEci: ").append(toIndentedString(schemeEci)).append("\n");
    sb.append("    appliedExemption: ").append(toIndentedString(appliedExemption)).append("\n");
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

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `schemeEci` to the URL query string
    if (getSchemeEci() != null) {
      try {
        joiner.add(String.format("%sschemeEci%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSchemeEci()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `appliedExemption` to the URL query string
    if (getAppliedExemption() != null) {
      try {
        joiner.add(String.format("%sappliedExemption%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAppliedExemption()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

