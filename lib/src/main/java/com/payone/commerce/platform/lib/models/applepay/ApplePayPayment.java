package com.payone.commerce.platform.lib.models.applepay;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The result of authorizing a payment request that contains payment
 * information.
 *
 * Data in PaymentToken is encrypted. Billing and shipping contact data are not
 * encrypted.
 */
@JsonPropertyOrder({
        ApplePayPayment.JSON_PROPERTY_TOKEN,
        ApplePayPayment.JSON_PROPERTY_BILLING_CONTACT,
        ApplePayPayment.JSON_PROPERTY_SHIPPING_CONTACT
})
public class ApplePayPayment implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String JSON_PROPERTY_TOKEN = "token";
    private ApplePayPaymentToken token;

    public static final String JSON_PROPERTY_BILLING_CONTACT = "billingContact";
    private ApplePayPaymentContact billingContact;

    public static final String JSON_PROPERTY_SHIPPING_CONTACT = "shippingContact";
    private ApplePayPaymentContact shippingContact;

    public ApplePayPayment() {
    }

    public ApplePayPayment(ApplePayPaymentToken token, ApplePayPaymentContact billingContact,
            ApplePayPaymentContact shippingContact) {
        this.token = token;
        this.billingContact = billingContact;
        this.shippingContact = shippingContact;
    }

    public ApplePayPayment token(ApplePayPaymentToken token) {
        this.token = token;
        return this;
    }

    @JsonProperty(JSON_PROPERTY_TOKEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ApplePayPaymentToken getToken() {
        return token;
    }

    @JsonProperty(JSON_PROPERTY_TOKEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setToken(ApplePayPaymentToken token) {
        this.token = token;
    }

    public ApplePayPayment billingContact(ApplePayPaymentContact billingContact) {
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

    public ApplePayPayment shippingContact(ApplePayPaymentContact shippingContact) {
        this.shippingContact = shippingContact;
        return this;
    }

    @JsonProperty(JSON_PROPERTY_SHIPPING_CONTACT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ApplePayPaymentContact getShippingContact() {
        return shippingContact;
    }

    @JsonProperty(JSON_PROPERTY_SHIPPING_CONTACT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setShippingContact(ApplePayPaymentContact shippingContact) {
        this.shippingContact = shippingContact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplePayPayment that = (ApplePayPayment) o;
        return Objects.equals(token, that.token) &&
                Objects.equals(billingContact, that.billingContact) &&
                Objects.equals(shippingContact, that.shippingContact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, billingContact, shippingContact);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Payment {\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    billingContact: ").append(toIndentedString(billingContact)).append("\n");
        sb.append("    shippingContact: ").append(toIndentedString(shippingContact)).append("\n");
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
