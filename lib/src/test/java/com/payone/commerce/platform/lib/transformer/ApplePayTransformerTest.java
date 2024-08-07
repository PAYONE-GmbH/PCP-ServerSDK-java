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
    ApplePayPayment payment = new ApplePayPayment()
        .token(
            new ApplePayPaymentToken()
                .paymentData(
                    new ApplePayPaymentData()
                        .data("data")
                        .header(
                            new ApplePayPaymentDataHeader()
                                .applicationData(null)
                                .publicKeyHash("hashhashhash")
                                .transactionId("transaction-101"))
                        .signature("signature")
                        .version("version"))
                .paymentMethod(
                    new ApplePayPaymentMethod()
                        .displayName("The name is...")
                        .network("MasterCard")
                        .type(ApplePayPaymentMethodType.CREDIT)
                        .paymentPass(null)
                        .billingContact(null))
                .transactionIdentifier("transaction-101-cc"))
        .billingContact(
            new ApplePayPaymentContact()
                .phoneNumber("+1239452324")
                .emailAddress("mail@imail.com")
                .givenName("John")
                .familyName("Michell")
                .phoneticGivenName("")
                .phoneticFamilyName("")
                .addressLines(Arrays.asList("Alarichtstraße 12"))
                .locality("Berlin")
                .postalCode("12105")
                .subAdministrativeArea(""))
        .shippingContact(null);

    MobilePaymentMethodSpecificInput expected = new MobilePaymentMethodSpecificInput()
        .paymentProductId(302)
        .publicKeyHash("hashhashhash")
        .ephemeralKey(null)
        .paymentProduct302SpecificInput(
            new PaymentProduct320SpecificInput()
                .network(PaymentProduct320SpecificInput.NetworkEnum.MASTERCARD)
                .token(
                    new ApplePaymentDataTokenInformation()
                        .header(
                            new ApplePaymentDataTokenHeaderInformation()
                                .transactionId("transaction-101")
                                .applicationData(null))));

    assertEquals(expected, ApplePayTransformer.transformApplePayPaymentToMobilePaymentMethodSpecificInput(payment));
  }
}
