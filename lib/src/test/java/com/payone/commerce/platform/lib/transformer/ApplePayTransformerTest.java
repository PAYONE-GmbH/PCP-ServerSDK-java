package com.payone.commerce.platform.lib.transformer;

import org.junit.jupiter.api.Test;

import com.payone.commerce.platform.lib.models.ApplePaymentDataTokenHeaderInformation;
import com.payone.commerce.platform.lib.models.ApplePaymentDataTokenInformation;
import com.payone.commerce.platform.lib.models.MobilePaymentMethodSpecificInput;
import com.payone.commerce.platform.lib.models.PaymentProduct320SpecificInput;
import com.payone.commerce.platform.lib.models.applepay.ApplePayPayment;
import com.payone.commerce.platform.lib.models.applepay.ApplePayPaymentContact;
import com.payone.commerce.platform.lib.models.applepay.ApplePayPaymentData;
import com.payone.commerce.platform.lib.models.applepay.ApplePayPaymentDataHeader;
import com.payone.commerce.platform.lib.models.applepay.ApplePayPaymentMethod;
import com.payone.commerce.platform.lib.models.applepay.ApplePayPaymentMethodType;
import com.payone.commerce.platform.lib.models.applepay.ApplePayPaymentToken;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

public class ApplePayTransformerTest {
    @Test
    void testApplePayPaymentToMobilePaymentMethodSpecificInput() {
        ApplePayPayment payment = new ApplePayPayment();

        ApplePayPaymentContact billingContact = new ApplePayPaymentContact();
        billingContact.setPhoneNumber("+1239452324");
        billingContact.setEmailAddress("mail@imail.com");
        billingContact.setGivenName("John");
        billingContact.setFamilyName("Michell");
        billingContact.setPhoneticGivenName("");
        billingContact.setPhoneticFamilyName("");
        billingContact.setAddressLines(Arrays.asList("Alarichtstraße 12"));
        billingContact.setLocality("Berlin");
        billingContact.setPostalCode("12105");
        billingContact.setSubAdministrativeArea("");

        ApplePayPaymentToken token = new ApplePayPaymentToken();
        ApplePayPaymentData paymentData = new ApplePayPaymentData();
        ApplePayPaymentDataHeader paymentDataHeader = new ApplePayPaymentDataHeader();
        ApplePayPaymentMethod paymentMethod = new ApplePayPaymentMethod();
        paymentDataHeader.setApplicationData(null);
        paymentDataHeader.setPublicKeyHash("hashhashhash");
        paymentDataHeader.setTransactionId("transaction-101");
        paymentData.setData("data");
        paymentData.setHeader(paymentDataHeader);
        paymentMethod.setDisplayName("The name is...");
        paymentMethod.setNetwork("MasterCard");
        paymentMethod.setType(ApplePayPaymentMethodType.CREDIT);
        paymentMethod.setPaymentPass(null);
        paymentMethod.setBillingContact(null);
        token.setPaymentData(paymentData);
        token.setPaymentMethod(paymentMethod);
        token.setTransactionIdentifier("transaction-101-cc");

        payment.setToken(token);
        payment.setBillingContact(new ApplePayPaymentContact());
        payment.setShippingContact(null);

        MobilePaymentMethodSpecificInput expected = new MobilePaymentMethodSpecificInput();
        PaymentProduct320SpecificInput paymentProduct320SpecificInput = new PaymentProduct320SpecificInput();
        ApplePaymentDataTokenInformation applePaymentDataTokenInformation = new ApplePaymentDataTokenInformation();
        ApplePaymentDataTokenHeaderInformation applePaymentDataTokenHeaderInformation = new ApplePaymentDataTokenHeaderInformation();
        applePaymentDataTokenHeaderInformation.setTransactionId("transaction-101");
        applePaymentDataTokenHeaderInformation.setApplicationData(null);
        applePaymentDataTokenInformation.setHeader(applePaymentDataTokenHeaderInformation);
        paymentProduct320SpecificInput.setNetwork(PaymentProduct320SpecificInput.NetworkEnum.MASTERCARD);
        paymentProduct320SpecificInput.setToken(applePaymentDataTokenInformation);

        expected.setPaymentProductId(302);
        expected.setPublicKeyHash("hashhashhash");
        expected.setEphemeralKey(null);
        expected.setPaymentProduct302SpecificInput(paymentProduct320SpecificInput);

        assertEquals(expected, ApplePayTransformer.transformApplePayPaymentToMobilePaymentMethodSpecificInput(payment));
    }
}
