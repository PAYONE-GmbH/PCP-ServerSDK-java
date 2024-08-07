package com.payone.commerce.platform.lib.models.applepay;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * An object that contains the user's payment credentials.
 * You access the payment token of an authorized payment request using the token
 * property of the Payment object.
 */
@JsonPropertyOrder({
        ApplePayPaymentData.JSON_PROPERTY_DATA,
        ApplePayPaymentData.JSON_PROPERTY_HEADER,
        ApplePayPaymentData.JSON_PROPERTY_SIGNATURE,
        ApplePayPaymentData.JSON_PROPERTY_VERSION
})
public class ApplePayPaymentData implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String JSON_PROPERTY_DATA = "data";
    private String data;

    public static final String JSON_PROPERTY_HEADER = "header";
    private ApplePayPaymentDataHeader header;

    public static final String JSON_PROPERTY_SIGNATURE = "signature";
    private String signature;

    public static final String JSON_PROPERTY_VERSION = "version";
    private String version;

    public ApplePayPaymentData() {
    }

    public ApplePayPaymentData(String data, ApplePayPaymentDataHeader header, String signature, String version) {
        this.data = data;
        this.header = header;
        this.signature = signature;
        this.version = version;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setData(String data) {
        this.data = data;
    }

    @JsonProperty(JSON_PROPERTY_HEADER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ApplePayPaymentDataHeader getHeader() {
        return header;
    }

    @JsonProperty(JSON_PROPERTY_HEADER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHeader(ApplePayPaymentDataHeader header) {
        this.header = header;
    }

    @JsonProperty(JSON_PROPERTY_SIGNATURE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSignature() {
        return signature;
    }

    @JsonProperty(JSON_PROPERTY_SIGNATURE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSignature(String signature) {
        this.signature = signature;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplePayPaymentData that = (ApplePayPaymentData) o;
        return Objects.equals(data, that.data) &&
                Objects.equals(header, that.header) &&
                Objects.equals(signature, that.signature) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, header, signature, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentData {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    header: ").append(toIndentedString(header)).append("\n");
        sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
