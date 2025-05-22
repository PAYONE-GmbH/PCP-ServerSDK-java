package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Additional information about the Apple payment data token header.
 */
@JsonPropertyOrder({
    ApplePaymentDataTokenHeaderInformation.JSON_PROPERTY_TRANSACTION_ID,
    ApplePaymentDataTokenHeaderInformation.JSON_PROPERTY_APPLICATION_DATA
})
public class ApplePaymentDataTokenHeaderInformation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TRANSACTION_ID = "transactionId";
  private String transactionId;

  public static final String JSON_PROPERTY_APPLICATION_DATA = "applicationData";
  private String applicationData;

  public ApplePaymentDataTokenHeaderInformation() {
  }

  public ApplePaymentDataTokenHeaderInformation transactionId(String transactionId) {

    this.transactionId = transactionId;
    return this;
  }

  /**
   * A hexadecimal Transaction identifier identifier as a string.
   * 
   * @return transactionId
   **/

  @JsonProperty(JSON_PROPERTY_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTransactionId() {
    return transactionId;
  }

  @JsonProperty(JSON_PROPERTY_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public ApplePaymentDataTokenHeaderInformation applicationData(String applicationData) {

    this.applicationData = applicationData;
    return this;
  }

  /**
   * SHA–256 hash, hex encoded as a string. Hash of the applicationData property
   * of the original PKPaymentRequest object.
   * 
   * @return applicationData
   **/

  @JsonProperty(JSON_PROPERTY_APPLICATION_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApplicationData() {
    return applicationData;
  }

  @JsonProperty(JSON_PROPERTY_APPLICATION_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicationData(String applicationData) {
    this.applicationData = applicationData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplePaymentDataTokenHeaderInformation applePaymentDataTokenHeaderInformation = (ApplePaymentDataTokenHeaderInformation) o;
    return Objects.equals(this.transactionId, applePaymentDataTokenHeaderInformation.transactionId) &&
        Objects.equals(this.applicationData, applePaymentDataTokenHeaderInformation.applicationData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, applicationData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplePaymentDataTokenHeaderInformation {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    applicationData: ").append(toIndentedString(applicationData)).append("\n");
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
