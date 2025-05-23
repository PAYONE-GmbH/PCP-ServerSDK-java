package com.payone.commerce.platform.lib.models;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Action merchants needs to take in the online payment process.
 * Possible values are:
 * * REDIRECT - The customer needs to be redirected using the details found in
 * redirectData
 * * SHOW_FORM - The customer needs to be shown a form with the fields found in
 * formFields. You can submit the data entered by the user in a Complete payment
 * request.
 * * SHOW_INSTRUCTIONS - The customer needs to be shown payment instruction
 * using the details found in showData. Alternatively the instructions can be
 * rendered by us using the instructionsRenderingData
 * * SHOW_TRANSACTION_RESULTS - The customer needs to be shown the transaction
 * results using the details found in showData. Alternatively the instructions
 * can be rendered by us using the instructionsRenderingData
 * * MOBILE_THREEDS_CHALLENGE - The customer needs to complete a challenge as
 * part of the 3D Secure authentication inside your mobile app. The details
 * contained in mobileThreeDSecureChallengeParameters need to be provided to the
 * EMVco certified Mobile SDK as a challengeParameters object.
 * * CALL_THIRD_PARTY - The merchant needs to call a third party using the data
 * found in thirdPartyData
 */
public enum ActionType {
    REDIRECT("REDIRECT"),
    SHOW_FORM("SHOW_FORM"),
    SHOW_INSTRUCTIONS("SHOW_INSTRUCTIONS"),
    SHOW_TRANSACTION_RESULTS("SHOW_TRANSACTION_RESULTS"),
    MOBILE_THREEDS_CHALLENGE("MOBILE_THREEDS_CHALLENGE"),
    CALL_THIRD_PARTY("CALL_THIRD_PARTY");

    private String value;

    ActionType(String value) {
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
