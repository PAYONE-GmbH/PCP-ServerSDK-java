package com.payone.commerce.platform.lib.models;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object containing the redirect payment product details.
 */
@JsonPropertyOrder({
        CompleteRedirectPaymentMethodSpecificInput.JSON_PROPERTY_PAYMENT_PRODUCT_ID,
        CompleteRedirectPaymentMethodSpecificInput.JSON_PROPERTY_PAYMENT_PRODUCT840_SPECIFIC_INPUT
})
public class CompleteRedirectPaymentMethodSpecificInput implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String JSON_PROPERTY_PAYMENT_PRODUCT_ID = "paymentProductId";
    private PaymentProductId paymentProductId;

    public static final String JSON_PROPERTY_PAYMENT_PRODUCT840_SPECIFIC_INPUT = "paymentProduct840SpecificInput";
    private CompletePaymentProduct840SpecificInput paymentProduct840SpecificInput;

    public CompleteRedirectPaymentMethodSpecificInput() {
    }

    public CompleteRedirectPaymentMethodSpecificInput paymentProductId(PaymentProductId paymentProductId) {
        this.paymentProductId = paymentProductId;
        return this;
    }

    /**
     * Get paymentProductId
     *
     * @return paymentProductId
     */
    @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public PaymentProductId getPaymentProductId() {
        return paymentProductId;
    }

    @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPaymentProductId(PaymentProductId paymentProductId) {
        this.paymentProductId = paymentProductId;
    }

    public CompleteRedirectPaymentMethodSpecificInput paymentProduct840SpecificInput(
            CompletePaymentProduct840SpecificInput paymentProduct840SpecificInput) {
        this.paymentProduct840SpecificInput = paymentProduct840SpecificInput;
        return this;
    }

    /**
     * Get paymentProduct840SpecificInput
     *
     * @return paymentProduct840SpecificInput
     */
    @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT840_SPECIFIC_INPUT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CompletePaymentProduct840SpecificInput getPaymentProduct840SpecificInput() {
        return paymentProduct840SpecificInput;
    }

    @JsonProperty(JSON_PROPERTY_PAYMENT_PRODUCT840_SPECIFIC_INPUT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPaymentProduct840SpecificInput(
            CompletePaymentProduct840SpecificInput paymentProduct840SpecificInput) {
        this.paymentProduct840SpecificInput = paymentProduct840SpecificInput;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompleteRedirectPaymentMethodSpecificInput that = (CompleteRedirectPaymentMethodSpecificInput) o;
        return Objects.equals(this.paymentProductId, that.paymentProductId) &&
                Objects.equals(this.paymentProduct840SpecificInput, that.paymentProduct840SpecificInput);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentProductId, paymentProduct840SpecificInput);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompleteRedirectPaymentMethodSpecificInput {\n");
        sb.append("    paymentProductId: ").append(toIndentedString(paymentProductId)).append("\n");
        sb.append("    paymentProduct840SpecificInput: ").append(toIndentedString(paymentProduct840SpecificInput))
                .append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
