package com.payone.commerce.platform.lib.models.applepay;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A string that represents the type of the payment method.
 *
 * The type of card the customer uses to complete the transaction.
 */
public enum ApplePayPaymentMethodType {
    DEBIT("debit"),
    CREDIT("credit"),
    PREPAID("prepaid"),
    STORE("store");

    private String value;

    ApplePayPaymentMethodType(String value) {
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
    public static ApplePayPaymentMethodType fromValue(String value) {
        for (ApplePayPaymentMethodType type : ApplePayPaymentMethodType.values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
