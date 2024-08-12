package com.payone.commerce.platform.lib.models.applepay;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * An object that contains the user's payment credentials.
 *
 * You access the payment token of an authorized payment request using the token
 * property of the Payment object.
 */
@JsonPropertyOrder({
        ApplePayPaymentToken.JSON_PROPERTY_PAYMENT_DATA,
        ApplePayPaymentToken.JSON_PROPERTY_PAYMENT_METHOD,
        ApplePayPaymentToken.JSON_PROPERTY_TRANSACTION_IDENTIFIER
})
public class ApplePayPaymentToken implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String JSON_PROPERTY_PAYMENT_DATA = "paymentData";
    private ApplePayPaymentData paymentData;

    public static final String JSON_PROPERTY_PAYMENT_METHOD = "paymentMethod";
    private ApplePayPaymentMethod paymentMethod;

    public static final String JSON_PROPERTY_TRANSACTION_IDENTIFIER = "transactionIdentifier";
    private String transactionIdentifier;

    public ApplePayPaymentToken() {
    }

    public ApplePayPaymentToken(ApplePayPaymentData paymentData, ApplePayPaymentMethod paymentMethod,
            String transactionIdentifier) {
        this.paymentData = paymentData;
        this.paymentMethod = paymentMethod;
        this.transactionIdentifier = transactionIdentifier;
    }

    public ApplePayPaymentToken paymentData(ApplePayPaymentData paymentData) {
        this.paymentData = paymentData;
        return this;
    }

    @JsonProperty(JSON_PROPERTY_PAYMENT_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ApplePayPaymentData getPaymentData() {
        return paymentData;
    }

    @JsonProperty(JSON_PROPERTY_PAYMENT_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPaymentData(ApplePayPaymentData paymentData) {
        this.paymentData = paymentData;
    }

    public ApplePayPaymentToken paymentMethod(ApplePayPaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ApplePayPaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPaymentMethod(ApplePayPaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public ApplePayPaymentToken transactionIdentifier(String transactionIdentifier) {
        this.transactionIdentifier = transactionIdentifier;
        return this;
    }

    @JsonProperty(JSON_PROPERTY_TRANSACTION_IDENTIFIER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    @JsonProperty(JSON_PROPERTY_TRANSACTION_IDENTIFIER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTransactionIdentifier(String transactionIdentifier) {
        this.transactionIdentifier = transactionIdentifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplePayPaymentToken that = (ApplePayPaymentToken) o;
        return Objects.equals(paymentData, that.paymentData) &&
                Objects.equals(paymentMethod, that.paymentMethod) &&
                Objects.equals(transactionIdentifier, that.transactionIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentData, paymentMethod, transactionIdentifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentToken {\n");
        sb.append("    paymentData: ").append(toIndentedString(paymentData)).append("\n");
        sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
        sb.append("    transactionIdentifier: ").append(toIndentedString(transactionIdentifier)).append("\n");
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
