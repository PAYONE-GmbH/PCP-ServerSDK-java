package com.payone.commerce.platform.lib.models;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Business relation to the customer.
 * This is mandatory for PAYONE Buy Now, Pay Later payment methods:
 * - 3390 - PAYONE Secured Invoice
 * - 3391 - PAYONE Secured Installment
 * - 3392 - PAYONE Secured Direct Debit
 */
public enum BusinessRelation {
    B2C("B2C"), // Indicates business to consumer
    B2B("B2B"); // Indicates business to business

    private String value;

    BusinessRelation(String value) {
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
