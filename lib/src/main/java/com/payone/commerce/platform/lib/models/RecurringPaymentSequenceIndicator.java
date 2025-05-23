package com.payone.commerce.platform.lib.models;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Indicates whether this transaction is the first or a subsequent transaction
 * in a series of recurring transactions. For any first of a recurring payment,
 * the system will automatically create a token as it will be needed for any
 * subsequent recurring transactions. If a token already exists, this is
 * indicated in the response with a value of False for the isNewToken property.
 */
public enum RecurringPaymentSequenceIndicator {
    FIRST("first"), // First transaction in a series of recurring transactions
    RECURRING("recurring"); // Subsequent transaction in a series of recurring transactions

    private String value;

    RecurringPaymentSequenceIndicator(String value) {
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
}
