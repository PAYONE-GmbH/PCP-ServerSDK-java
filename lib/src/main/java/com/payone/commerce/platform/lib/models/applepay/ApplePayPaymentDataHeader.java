package com.payone.commerce.platform.lib.models.applepay;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * PaymentDataHeader contains the payment data header information.
 * This includes various keys and identifiers used in the Apple Pay payment
 * process.
 */
@JsonPropertyOrder({
        ApplePayPaymentDataHeader.JSON_PROPERTY_APPLICATION_DATA,
        ApplePayPaymentDataHeader.JSON_PROPERTY_EPHEMERAL_PUBLIC_KEY,
        ApplePayPaymentDataHeader.JSON_PROPERTY_WRAPPED_KEY,
        ApplePayPaymentDataHeader.JSON_PROPERTY_PUBLIC_KEY_HASH,
        ApplePayPaymentDataHeader.JSON_PROPERTY_TRANSACTION_ID
})
public class ApplePayPaymentDataHeader implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String JSON_PROPERTY_APPLICATION_DATA = "applicationData";
    private String applicationData;

    public static final String JSON_PROPERTY_EPHEMERAL_PUBLIC_KEY = "ephemeralPublicKey";
    private String ephemeralPublicKey;

    public static final String JSON_PROPERTY_WRAPPED_KEY = "wrappedKey";
    private String wrappedKey;

    public static final String JSON_PROPERTY_PUBLIC_KEY_HASH = "publicKeyHash";
    private String publicKeyHash;

    public static final String JSON_PROPERTY_TRANSACTION_ID = "transactionId";
    private String transactionId;

    public ApplePayPaymentDataHeader() {
    }

    public ApplePayPaymentDataHeader(String applicationData, String ephemeralPublicKey, String wrappedKey,
            String publicKeyHash, String transactionId) {
        this.applicationData = applicationData;
        this.ephemeralPublicKey = ephemeralPublicKey;
        this.wrappedKey = wrappedKey;
        this.publicKeyHash = publicKeyHash;
        this.transactionId = transactionId;
    }

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

    @JsonProperty(JSON_PROPERTY_EPHEMERAL_PUBLIC_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getEphemeralPublicKey() {
        return ephemeralPublicKey;
    }

    @JsonProperty(JSON_PROPERTY_EPHEMERAL_PUBLIC_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEphemeralPublicKey(String ephemeralPublicKey) {
        this.ephemeralPublicKey = ephemeralPublicKey;
    }

    @JsonProperty(JSON_PROPERTY_WRAPPED_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getWrappedKey() {
        return wrappedKey;
    }

    @JsonProperty(JSON_PROPERTY_WRAPPED_KEY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWrappedKey(String wrappedKey) {
        this.wrappedKey = wrappedKey;
    }

    @JsonProperty(JSON_PROPERTY_PUBLIC_KEY_HASH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPublicKeyHash() {
        return publicKeyHash;
    }

    @JsonProperty(JSON_PROPERTY_PUBLIC_KEY_HASH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPublicKeyHash(String publicKeyHash) {
        this.publicKeyHash = publicKeyHash;
    }

    @JsonProperty(JSON_PROPERTY_TRANSACTION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTransactionId() {
        return transactionId;
    }

    @JsonProperty(JSON_PROPERTY_TRANSACTION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplePayPaymentDataHeader that = (ApplePayPaymentDataHeader) o;
        return Objects.equals(applicationData, that.applicationData) &&
                Objects.equals(ephemeralPublicKey, that.ephemeralPublicKey) &&
                Objects.equals(wrappedKey, that.wrappedKey) &&
                Objects.equals(publicKeyHash, that.publicKeyHash) &&
                Objects.equals(transactionId, that.transactionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationData, ephemeralPublicKey, wrappedKey, publicKeyHash, transactionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentDataHeader {\n");
        sb.append("    applicationData: ").append(toIndentedString(applicationData)).append("\n");
        sb.append("    ephemeralPublicKey: ").append(toIndentedString(ephemeralPublicKey)).append("\n");
        sb.append("    wrappedKey: ").append(toIndentedString(wrappedKey)).append("\n");
        sb.append("    publicKeyHash: ").append(toIndentedString(publicKeyHash)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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
