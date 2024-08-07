package com.payone.commerce.platform.lib.serializer;

import org.junit.jupiter.api.Test;

import com.payone.commerce.platform.lib.models.AddressPersonal;
import com.payone.commerce.platform.lib.models.AmountOfMoney;
import com.payone.commerce.platform.lib.models.CartItemInput;
import com.payone.commerce.platform.lib.models.CartItemInvoiceData;
import com.payone.commerce.platform.lib.models.CreateCheckoutRequest;
import com.payone.commerce.platform.lib.models.OrderLineDetailsInput;
import com.payone.commerce.platform.lib.models.OrderRequest;
import com.payone.commerce.platform.lib.models.ProductType;
import com.payone.commerce.platform.lib.models.Shipping;
import com.payone.commerce.platform.lib.models.ShoppingCartInput;
import com.payone.commerce.platform.lib.models.applepay.ApplePayPayment;
import com.payone.commerce.platform.lib.models.applepay.ApplePayPaymentContact;
import com.payone.commerce.platform.lib.models.applepay.ApplePayPaymentData;
import com.payone.commerce.platform.lib.models.applepay.ApplePayPaymentDataHeader;
import com.payone.commerce.platform.lib.models.applepay.ApplePayPaymentMethod;
import com.payone.commerce.platform.lib.models.applepay.ApplePayPaymentMethodType;
import com.payone.commerce.platform.lib.models.applepay.ApplePayPaymentToken;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;

public class JsonSerializerTest {
    @Test
    public void testSerializeJson() {
        CreateCheckoutRequest object = new CreateCheckoutRequest()
                .amountOfMoney(new AmountOfMoney()
                        .amount(6099L)
                        .currencyCode("USD"))
                .shipping(new Shipping()
                        .address(
                                new AddressPersonal()
                                        .countryCode("DE")
                                        .zip("12105")
                                        .city("Berlin")
                                        .street("Alarichstraße")
                                        .houseNumber("12")))
                .shoppingCart(new ShoppingCartInput()
                        .addItemsItem(new CartItemInput()
                                .invoiceData(new CartItemInvoiceData()
                                        .description("Learn PHP the hard way - Hardcover"))
                                .orderLineDetails(new OrderLineDetailsInput()
                                        .productPrice(6099L)
                                        .quantity(1L)
                                        .productType(ProductType.GOODS))))
                .orderRequest(new OrderRequest())
                .creationDateTime(null)
                .autoExecuteOrder(false);
        String expected = "{\"amountOfMoney\":{\"amount\":6099,\"currencyCode\":\"USD\"},\"shipping\":{\"address\":{\"city\":\"Berlin\",\"countryCode\":\"DE\",\"houseNumber\":\"12\",\"street\":\"Alarichstra\u00dfe\",\"zip\":\"12105\"}},\"shoppingCart\":{\"items\":[{\"invoiceData\":{\"description\":\"Learn PHP the hard way - Hardcover\"},\"orderLineDetails\":{\"productPrice\":6099,\"productType\":\"GOODS\",\"quantity\":1}}]},\"orderRequest\":{},\"autoExecuteOrder\":false}";

        try {
            assertEquals(expected, JsonSerializer.serializeToJson(object));
        } catch (Exception e) {
            fail(e);
        }
    }

    @Test
    public void testDeserializeJson() {
        ApplePayPayment applePayPayment = new ApplePayPayment();
        ApplePayPaymentToken token = new ApplePayPaymentToken();

        ApplePayPaymentData data = new ApplePayPaymentData();
        ApplePayPaymentDataHeader dataHeader = new ApplePayPaymentDataHeader();
        dataHeader.setWrappedKey("foobar");
        dataHeader.setTransactionId("transaction-101");
        dataHeader.setApplicationData(null);
        data.setData("data");
        data.setHeader(dataHeader);

        ApplePayPaymentMethod method = new ApplePayPaymentMethod();
        method.setDisplayName("The name is...");
        method.setNetwork("MasterCard");
        method.setType(ApplePayPaymentMethodType.CREDIT);
        method.setPaymentPass(null);
        method.setBillingContact(null);

        token.setPaymentData(data);
        token.setPaymentMethod(method);
        token.setTransactionIdentifier("transaction-101-cc");

        ApplePayPaymentContact billingContact = new ApplePayPaymentContact();
        billingContact.setPhoneNumber("+1239452324");
        billingContact.setEmailAddress("mail@imail.com");
        billingContact.setGivenName("John");
        billingContact.setFamilyName("Michell");
        billingContact.setPhoneticGivenName("");
        billingContact.setPhoneticFamilyName("");
        billingContact.setAddressLines(Arrays.asList("Alarichstraße 12"));
        billingContact.setLocality("Berlin");
        billingContact.setPostalCode("12105");
        billingContact.setSubAdministrativeArea("");

        applePayPayment.setToken(token);
        applePayPayment.setBillingContact(billingContact);
        applePayPayment.setShippingContact(null);

        String json = "{\"token\":{\"paymentData\":{\"data\":\"data\",\"header\":{\"wrappedKey\":\"foobar\",\"transactionId\":\"transaction-101\"}},\"paymentMethod\":{\"displayName\":\"The name is...\",\"network\":\"MasterCard\",\"type\":\"credit\",\"billingContact\":null},\"transactionIdentifier\":\"transaction-101-cc\"},\"billingContact\":{\"phoneNumber\":\"+1239452324\",\"emailAddress\":\"mail@imail.com\",\"givenName\":\"John\",\"familyName\":\"Michell\",\"phoneticGivenName\":\"\",\"phoneticFamilyName\":\"\",\"addressLines\":[\"Alarichstraße 12\"],\"locality\":\"Berlin\",\"postalCode\":\"12105\",\"subAdministrativeArea\":\"\"},\"spam\":\"IGNORE THIS\"}";

        try {
            ApplePayPayment deserialized = JsonSerializer.deserializeFromJson(json, ApplePayPayment.class);
            assertEquals(applePayPayment, deserialized);
        } catch (Exception e) {
            fail(e);
        }
    }
}