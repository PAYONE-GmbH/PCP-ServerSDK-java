package com.payone.commerce.platform.lib.models;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Result of the Address Verification Service checks.
 */
public enum AvsResult {
    A("A"), // Address (Street) matches, Zip does not
    B("B"), // Street address match for international transactions—Postal code not verified
            // due to incompatible formats
    C("C"), // Street address and postal code not verified for international transaction due
            // to incompatible formats
    D("D"), // Street address and postal code match for international transaction,
            // cardholder name is incorrect
    E("E"), // AVS error
    F("F"), // Address does match and five digit ZIP code does match (UK only)
    G("G"), // Address information is unavailable; international transaction; non-AVS
            // participant
    H("H"), // Billing address and postal code match, cardholder name is incorrect (Amex)
    I("I"), // Address information not verified for international transaction
    K("K"), // Cardholder name matches (Amex)
    L("L"), // Cardholder name and postal code match (Amex)
    M("M"), // Cardholder name, street address, and postal code match for international
            // transaction
    N("N"), // No Match on Address (Street) or Zip
    O("O"), // Cardholder name and address match (Amex)
    P("P"), // Postal codes match for international transaction—Street address not verified
            // due to incompatible formats
    Q("Q"), // Billing address matches, cardholder is incorrect (Amex)
    R("R"), // Retry, System unavailable or Timed out
    S("S"), // Service not supported by issuer
    U("U"), // Address information is unavailable
    W("W"), // 9 digit Zip matches, Address (Street) does not
    X("X"), // Exact AVS Match
    Y("Y"), // Address (Street) and 5 digit Zip match
    Z("Z"), // 5 digit Zip matches, Address (Street) does not
    ZERO("0"); // No service available

    private String value;

    AvsResult(String value) {
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
