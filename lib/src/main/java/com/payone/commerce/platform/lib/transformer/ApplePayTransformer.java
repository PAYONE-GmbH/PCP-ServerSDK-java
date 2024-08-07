package com.payone.commerce.platform.lib.transformer;

import com.payone.commerce.platform.lib.models.ApplePaymentDataTokenHeaderInformation;
import com.payone.commerce.platform.lib.models.ApplePaymentDataTokenInformation;
import com.payone.commerce.platform.lib.models.MobilePaymentMethodSpecificInput;
import com.payone.commerce.platform.lib.models.PaymentProduct320SpecificInput;
import com.payone.commerce.platform.lib.models.ApplePaymentDataTokenInformation.VersionEnum;
import com.payone.commerce.platform.lib.models.PaymentProduct320SpecificInput.NetworkEnum;
import com.payone.commerce.platform.lib.models.applepay.ApplePayPayment;

public class ApplePayTransformer {
    private static final int APPLE_PAY_PAYMENT_PRODUCT_ID = 302;

    static MobilePaymentMethodSpecificInput transformApplePayPaymentToMobilePaymentMethodSpecificInput(
            ApplePayPayment payment) {

        String publicKeyHash = null;
        String ephemeralKey = null;
        String network = null;
        String version = null;
        String signature = null;
        String transactionId = null;
        String applicationData = null;

        if (payment.getToken() != null && payment.getToken().getPaymentData() != null) {
            version = payment.getToken().getPaymentData().getVersion();
            signature = payment.getToken().getPaymentData().getSignature();
        }
        if (payment.getToken() != null && payment.getToken().getPaymentData() != null
                && payment.getToken().getPaymentData().getHeader() != null) {
            publicKeyHash = payment.getToken().getPaymentData().getHeader().getPublicKeyHash();
            ephemeralKey = payment.getToken().getPaymentData().getHeader().getEphemeralPublicKey();
            applicationData = payment.getToken().getPaymentData().getHeader().getApplicationData();
            transactionId = payment.getToken().getPaymentData().getHeader().getTransactionId();
        }
        if (payment.getToken() != null && payment.getToken().getPaymentMethod() != null) {
            network = payment.getToken().getPaymentMethod().getNetwork();
        }

        MobilePaymentMethodSpecificInput input = new MobilePaymentMethodSpecificInput();
        PaymentProduct320SpecificInput paymentProduct320SpecificInput = new PaymentProduct320SpecificInput();
        ApplePaymentDataTokenInformation applePaymentDataTokenInformation = new ApplePaymentDataTokenInformation();
        if (network != null) {
            paymentProduct320SpecificInput.setNetwork(NetworkEnum.fromValue(network.toUpperCase()));
        }
        if (version != null) {
            applePaymentDataTokenInformation.setVersion(VersionEnum.fromValue(version));
        }
        applePaymentDataTokenInformation.setSignature(signature);
        applePaymentDataTokenInformation.setHeader(new ApplePaymentDataTokenHeaderInformation()
                .transactionId(transactionId).applicationData(applicationData));
        paymentProduct320SpecificInput.setToken(applePaymentDataTokenInformation);

        input.setPaymentProductId(APPLE_PAY_PAYMENT_PRODUCT_ID);
        input.setPublicKeyHash(publicKeyHash);
        input.setEphemeralKey(ephemeralKey);
        input.setPaymentProduct302SpecificInput(paymentProduct320SpecificInput);
        return input;
    }
}
