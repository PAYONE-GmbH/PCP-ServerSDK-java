package com.payone.commerce.platform.lib.models.applepay;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Information about the card used in the transaction.
 */
@JsonPropertyOrder({
        ApplePayPaymentMethod.JSON_PROPERTY_DISPLAY_NAME,
        ApplePayPaymentMethod.JSON_PROPERTY_NETWORK,
        ApplePayPaymentMethod.JSON_PROPERTY_TYPE,
        ApplePayPaymentMethod.JSON_PROPERTY_PAYMENT_PASS,
        ApplePayPaymentMethod.JSON_PROPERTY_BILLING_CONTACT
})
public class ApplePayPaymentMethod implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
    private String displayName;

    public static final String JSON_PROPERTY_NETWORK = "network";
    private String network;

    public static final String JSON_PROPERTY_TYPE = "type";
    private ApplePayPaymentMethodType type;

    public static final String JSON_PROPERTY_PAYMENT_PASS = "paymentPass";
    private String paymentPass;

    public static final String JSON_PROPERTY_BILLING_CONTACT = "billingContact";
    private ApplePayPaymentContact billingContact;

    public ApplePayPaymentMethod() {
    }

    public ApplePayPaymentMethod(String displayName, String network, ApplePayPaymentMethodType type,
            String paymentPass, ApplePayPaymentContact billingContact) {
        this.displayName = displayName;
        this.network = network;
        this.type = type;
        this.paymentPass = paymentPass;
        this.billingContact = billingContact;
    }

    public ApplePayPaymentMethod displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ApplePayPaymentMethod network(String network) {
        this.network = network;
        return this;
    }

    @JsonProperty(JSON_PROPERTY_NETWORK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getNetwork() {
        return network;
    }

    @JsonProperty(JSON_PROPERTY_NETWORK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNetwork(String network) {
        this.network = network;
    }

    public ApplePayPaymentMethod type(ApplePayPaymentMethodType type) {
        this.type = type;
        return this;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ApplePayPaymentMethodType getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setType(ApplePayPaymentMethodType type) {
        this.type = type;
    }

    public ApplePayPaymentMethod paymentPass(String paymentPass) {
        this.paymentPass = paymentPass;
        return this;
    }

    @JsonProperty(JSON_PROPERTY_PAYMENT_PASS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPaymentPass() {
        return paymentPass;
    }

    @JsonProperty(JSON_PROPERTY_PAYMENT_PASS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPaymentPass(String paymentPass) {
        this.paymentPass = paymentPass;
    }

    public ApplePayPaymentMethod billingContact(ApplePayPaymentContact billingContact) {
        this.billingContact = billingContact;
        return this;
    }

    @JsonProperty(JSON_PROPERTY_BILLING_CONTACT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ApplePayPaymentContact getBillingContact() {
        return billingContact;
    }

    @JsonProperty(JSON_PROPERTY_BILLING_CONTACT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBillingContact(ApplePayPaymentContact billingContact) {
        this.billingContact = billingContact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplePayPaymentMethod that = (ApplePayPaymentMethod) o;
        return Objects.equals(displayName, that.displayName) &&
                Objects.equals(network, that.network) &&
                Objects.equals(type, that.type) &&
                Objects.equals(paymentPass, that.paymentPass) &&
                Objects.equals(billingContact, that.billingContact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayName, network, type, paymentPass, billingContact);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentMethod {\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    paymentPass: ").append(toIndentedString(paymentPass)).append("\n");
        sb.append("    billingContact: ").append(toIndentedString(billingContact)).append("\n");
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
