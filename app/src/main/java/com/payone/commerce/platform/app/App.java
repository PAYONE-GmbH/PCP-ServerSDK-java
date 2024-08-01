/*
 * This source file was generated by the Gradle 'init' task
 */
package com.payone.commerce.platform.app;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.util.Arrays;

import com.payone.commerce.platform.lib.CommunicatorConfiguration;
import com.payone.commerce.platform.lib.endpoints.CheckoutApiClient;
import com.payone.commerce.platform.lib.endpoints.CommerceCaseApiClient;
import com.payone.commerce.platform.lib.endpoints.OrderManagementCheckoutActionsApiClient;
import com.payone.commerce.platform.lib.endpoints.PaymentExecutionApiClient;
import com.payone.commerce.platform.lib.errors.ApiErrorResponseException;
import com.payone.commerce.platform.lib.errors.ApiException;
import com.payone.commerce.platform.lib.models.APIError;
import com.payone.commerce.platform.lib.models.Address;
import com.payone.commerce.platform.lib.models.AddressPersonal;
import com.payone.commerce.platform.lib.models.AmountOfMoney;
import com.payone.commerce.platform.lib.models.BankAccountInformation;
import com.payone.commerce.platform.lib.models.CartItemInput;
import com.payone.commerce.platform.lib.models.CartItemInvoiceData;
import com.payone.commerce.platform.lib.models.CheckoutReferences;
import com.payone.commerce.platform.lib.models.CheckoutResponse;
import com.payone.commerce.platform.lib.models.ContactDetails;
import com.payone.commerce.platform.lib.models.CreateCheckoutRequest;
import com.payone.commerce.platform.lib.models.CreateCommerceCaseRequest;
import com.payone.commerce.platform.lib.models.CreateCommerceCaseResponse;
import com.payone.commerce.platform.lib.models.CreatePaymentResponse;
import com.payone.commerce.platform.lib.models.Customer;
import com.payone.commerce.platform.lib.models.DeliverRequest;
import com.payone.commerce.platform.lib.models.DeliverResponse;
import com.payone.commerce.platform.lib.models.DeliverType;
import com.payone.commerce.platform.lib.models.MandateRecurrenceType;
import com.payone.commerce.platform.lib.models.OrderLineDetailsInput;
import com.payone.commerce.platform.lib.models.OrderRequest;
import com.payone.commerce.platform.lib.models.OrderType;
import com.payone.commerce.platform.lib.models.PatchCheckoutRequest;
import com.payone.commerce.platform.lib.models.PaymentChannel;
import com.payone.commerce.platform.lib.models.PaymentExecutionRequest;
import com.payone.commerce.platform.lib.models.PaymentExecutionSpecificInput;
import com.payone.commerce.platform.lib.models.PaymentMethodSpecificInput;
import com.payone.commerce.platform.lib.models.PersonalInformation;
import com.payone.commerce.platform.lib.models.PersonalName;
import com.payone.commerce.platform.lib.models.ProcessingMandateInformation;
import com.payone.commerce.platform.lib.models.ProductType;
import com.payone.commerce.platform.lib.models.References;
import com.payone.commerce.platform.lib.models.SepaDirectDebitPaymentMethodSpecificInput;
import com.payone.commerce.platform.lib.models.SepaDirectDebitPaymentProduct771SpecificInput;
import com.payone.commerce.platform.lib.models.Shipping;
import com.payone.commerce.platform.lib.models.ShoppingCartInput;

public class App {
    private final String MERCHANT_ID;
    private final CommunicatorConfiguration config;
    private final CommerceCaseApiClient commerceCaseClient;
    private final CheckoutApiClient checkoutClient;
    private final OrderManagementCheckoutActionsApiClient orderManagementCheckoutClient;
    private final PaymentExecutionApiClient paymentExecutionClient;

    public App(String API_KEY, String API_SECRET, String MERCHANT_ID) {
        this.MERCHANT_ID = MERCHANT_ID;
        this.config = new CommunicatorConfiguration(API_KEY, API_SECRET, "preprod.commerce-api.payone.com");
        try {
            this.commerceCaseClient = new CommerceCaseApiClient(config);
            this.checkoutClient = new CheckoutApiClient(config);
            this.orderManagementCheckoutClient = new OrderManagementCheckoutActionsApiClient(config);
            this.paymentExecutionClient = new PaymentExecutionApiClient(config);
        } catch (InvalidKeyException e) {
            throw new RuntimeException("Expected key to be valid", e);
        }
    }

    private static App initFromEnv() {
        String apiKey = System.getenv("API_KEY");
        String apiSecret = System.getenv("API_SECRET");
        String merchantId = System.getenv("MERCHANT_ID");

        if (apiKey == null) {
            throw new RuntimeException("required environment variable API_KEY is not set");
        }
        if (apiSecret == null) {
            throw new RuntimeException("required environment variable API_SECRET is not set");
        }
        if (merchantId == null) {
            throw new RuntimeException("required environment variable MERCHANT_ID is not set");
        }

        return new App(apiKey, apiSecret, merchantId);
    }

    private void runCheckoutWithPaymentExecution(String commerceCaseMerchantReference)
            throws IOException, ApiException {
        // Create a commerce case, add customer data, put something into the shopping
        // cart
        CreateCommerceCaseRequest createCommerceCaseRequest = new CreateCommerceCaseRequest();

        Customer customer = new Customer();
        PersonalInformation personalInformation = new PersonalInformation()
                .dateOfBirth("19991112")
                .name(new PersonalName().firstName("Ryan").surname("Carniato"));
        ContactDetails contactDetails = new ContactDetails().emailAddress("mail@mail.com");
        Address address = new Address()
                .countryCode("DE")
                .zip("24937")
                .city("Flensburg")
                .street("Rathausplatz")
                .houseNumber("1");
        customer.setPersonalInformation(personalInformation);
        customer.setContactDetails(contactDetails);
        customer.billingAddress(address);

        CreateCheckoutRequest checkoutRequest = new CreateCheckoutRequest();
        AmountOfMoney amountOfMoney = new AmountOfMoney()
                .amount(3599L)
                .currencyCode("EUR");
        Shipping shipping = new Shipping()
                .address(new AddressPersonal()
                        .countryCode("DE")
                        .zip("24937")
                        .city("Flensburg")
                        .street("Rathausplatz").houseNumber("1"));
        ShoppingCartInput shoppingCart = new ShoppingCartInput();
        CartItemInput cartItem = new CartItemInput()
                .invoiceData(new CartItemInvoiceData()
                        .description("T-Shirt - Scaleshape Logo - S"))
                .orderLineDetails(new OrderLineDetailsInput()
                        .productPrice(3599L)
                        .quantity(1L)
                        .productType(ProductType.GOODS));
        shoppingCart.addItemsItem(cartItem);

        checkoutRequest.amountOfMoney(amountOfMoney)
                .shoppingCart(shoppingCart)
                .shipping(shipping);

        createCommerceCaseRequest
                .merchantReference(commerceCaseMerchantReference)
                .customer(customer)
                .checkout(checkoutRequest);

        CreateCommerceCaseResponse commerceCase = commerceCaseClient.createCommerceCaseRequest(
                MERCHANT_ID,
                createCommerceCaseRequest);

        PaymentExecutionRequest paymentExecutionRequest = new PaymentExecutionRequest()
                .paymentExecutionSpecificInput(new PaymentExecutionSpecificInput()
                        .paymentReferences(new References().merchantReference("p-" + commerceCaseMerchantReference))
                        .amountOfMoney(new AmountOfMoney()
                                .amount(3599L)
                                .currencyCode("EUR")))
                .paymentMethodSpecificInput(new PaymentMethodSpecificInput()
                        .sepaDirectDebitPaymentMethodSpecificInput(new SepaDirectDebitPaymentMethodSpecificInput()
                                .paymentProductId(771)
                                .paymentProduct771SpecificInput(new SepaDirectDebitPaymentProduct771SpecificInput()
                                        .mandate(new ProcessingMandateInformation()
                                                .bankAccountIban(new BankAccountInformation()
                                                        .iban("DE75512108001245126199")
                                                        .accountHolder("Ryan Carniato"))
                                                .dateOfSignature("20240730")
                                                .recurrenceType(MandateRecurrenceType.UNIQUE)
                                                .uniqueMandateReference("m-" + commerceCaseMerchantReference)
                                                .creditorId("DE98ZZZ09999999999")))));
        CreatePaymentResponse paymentResponse = this.paymentExecutionClient.createPayment(MERCHANT_ID,
                commerceCase.getCommerceCaseId().toString(),
                commerceCase.getCheckout().getCheckoutId().toString(), paymentExecutionRequest);
        System.out.println(paymentResponse);

        CheckoutResponse finalCheckout = this.checkoutClient.getCheckoutRequest(
                MERCHANT_ID,
                commerceCase.getCommerceCaseId().toString(),
                commerceCase.getCheckout().getCheckoutId().toString());
        System.out.println(finalCheckout);
    }

    private void runSingleStepCheckout(String commerceCaseMerchantReference)
            throws IOException, ApiException {
        CreateCommerceCaseRequest payload = new CreateCommerceCaseRequest();

        Customer customer = new Customer();
        PersonalInformation personalInformation = new PersonalInformation()
                .dateOfBirth("19840505")
                .name(new PersonalName().firstName("Rich").surname("Harris"));
        ContactDetails contactDetails = new ContactDetails().emailAddress("mail@mail.com");
        Address address = new Address()
                .countryCode("DE")
                .zip("40474")
                .city("Düsseldorf")
                .street("Cecilienallee")
                .houseNumber("2");
        customer.setPersonalInformation(personalInformation);
        customer.setContactDetails(contactDetails);
        customer.billingAddress(address);

        CreateCheckoutRequest checkout = new CreateCheckoutRequest();

        CheckoutReferences checkoutReferences = new CheckoutReferences()
                .merchantReference("c-" + commerceCaseMerchantReference);
        AmountOfMoney amountOfMoney = new AmountOfMoney()
                .amount(5199L)
                .currencyCode("EUR");
        Shipping shipping = new Shipping()
                .address(new AddressPersonal()
                        .countryCode("DE")
                        .zip("40474")
                        .city("Düsseldorf")
                        .street("Cecilienallee").houseNumber("2"));
        ShoppingCartInput shoppingCart = new ShoppingCartInput();
        CartItemInput cartItem = new CartItemInput()
                .invoiceData(new CartItemInvoiceData()
                        .description("Hoodie - Scaleshape Logo - L"))
                .orderLineDetails(new OrderLineDetailsInput()
                        .productPrice(5199L)
                        .quantity(1L)
                        .productType(ProductType.GOODS));
        shoppingCart.addItemsItem(cartItem);

        OrderRequest orderRequest = new OrderRequest()
                .orderReferences(new References().merchantReference("o-" + commerceCaseMerchantReference))
                .paymentMethodSpecificInput(new PaymentMethodSpecificInput()
                        .sepaDirectDebitPaymentMethodSpecificInput(new SepaDirectDebitPaymentMethodSpecificInput()
                                .paymentProductId(771)
                                .paymentProduct771SpecificInput(new SepaDirectDebitPaymentProduct771SpecificInput()
                                        .mandate(new ProcessingMandateInformation()
                                                .bankAccountIban(new BankAccountInformation()
                                                        .iban("DE75512108001245126199")
                                                        .accountHolder("Rich Harris"))
                                                .dateOfSignature("20240730")
                                                .recurrenceType(MandateRecurrenceType.UNIQUE)
                                                .uniqueMandateReference("m-" + commerceCaseMerchantReference)
                                                .creditorId("DE98ZZZ09999999999")))));

        checkout
                .references(checkoutReferences)
                .amountOfMoney(amountOfMoney)
                .shipping(shipping)
                .shoppingCart(shoppingCart)
                .orderRequest(orderRequest);

        payload.setMerchantReference(commerceCaseMerchantReference);
        payload.checkout(checkout);
        payload.customer(customer);

        CreateCommerceCaseResponse commerceCase = commerceCaseClient.createCommerceCaseRequest(MERCHANT_ID,
                payload);
        System.out.println(commerceCase);
    }

    private void runMultiStepCheckout(String commerceCaseMerchantReference)
            throws IOException, ApiException {
        // create the commercase
        CreateCommerceCaseRequest createCommerceCaseRequest = new CreateCommerceCaseRequest()
                .customer(new Customer()
                        .businessRelation("B2C")
                        .locale("de")
                        .personalInformation(new PersonalInformation().dateOfBirth("19840604")
                                .name(new PersonalName().firstName("Rich").surname("Harris")))
                        .contactDetails(new ContactDetails().emailAddress("mail@mail.com"))
                        .billingAddress(new Address()
                                .countryCode("DE")
                                .zip("40474")
                                .city("Düsseldorf")
                                .street("Cecilienallee")
                                .houseNumber("2")))
                .checkout(new CreateCheckoutRequest()
                        .shoppingCart(new ShoppingCartInput()
                                .items(Arrays.asList(new CartItemInput()
                                        .invoiceData(new CartItemInvoiceData()
                                                .description("Frankenstein - Mary Shelley - Hardcover"))
                                        .orderLineDetails(new OrderLineDetailsInput()
                                                .productCode("shelley-42")
                                                .productPrice(1999L)
                                                .quantity(1L)
                                                .productType(ProductType.GOODS)
                                                .taxAmount(19L))))));
        CreateCommerceCaseResponse initialCommerceCase = this.commerceCaseClient.createCommerceCaseRequest(MERCHANT_ID,
                createCommerceCaseRequest);
        // add shipping information
        PatchCheckoutRequest patchCheckoutRequest = new PatchCheckoutRequest()
                .shipping(new Shipping()
                        .address(new AddressPersonal()
                                .countryCode("DE")
                                .zip("40474")
                                .city("Düsseldorf")
                                .street("Cecilienallee")
                                .houseNumber("2")));
        this.checkoutClient.updateCheckoutRequest(
                MERCHANT_ID,
                initialCommerceCase.getCommerceCaseId().toString(),
                initialCommerceCase.getCheckout().getCheckoutId().toString(),
                patchCheckoutRequest);

        // confirm the order
        OrderRequest orderRequest = new OrderRequest()
                .orderType(OrderType.FULL)
                .orderReferences(new References().merchantReference("o-" + commerceCaseMerchantReference))
                .paymentMethodSpecificInput(new PaymentMethodSpecificInput()
                        .paymentChannel(PaymentChannel.ECOMMERCE)
                        .sepaDirectDebitPaymentMethodSpecificInput(new SepaDirectDebitPaymentMethodSpecificInput()
                                .paymentProductId(771)
                                .paymentProduct771SpecificInput(new SepaDirectDebitPaymentProduct771SpecificInput()
                                        .mandate(new ProcessingMandateInformation()
                                                .bankAccountIban(new BankAccountInformation()
                                                        .iban("DE75512108001245126199")
                                                        .accountHolder("Rich Harris"))
                                                .dateOfSignature("20240730")
                                                .recurrenceType(MandateRecurrenceType.UNIQUE)
                                                .uniqueMandateReference("m-" + commerceCaseMerchantReference)
                                                .creditorId("DE98ZZZ09999999999")))));
        this.orderManagementCheckoutClient.createOrder(
                MERCHANT_ID,
                initialCommerceCase.getCommerceCaseId().toString(),
                initialCommerceCase.getCheckout().getCheckoutId().toString(),
                orderRequest);

        CheckoutResponse finalCheckout = this.checkoutClient.getCheckoutRequest(
                MERCHANT_ID,
                initialCommerceCase.getCommerceCaseId().toString(),
                initialCommerceCase.getCheckout().getCheckoutId().toString());
        System.out.println(finalCheckout);

        // items are ready for shipment, the delivery can be performed to capture the
        // money from the reservation
        DeliverResponse delivery = this.orderManagementCheckoutClient.deliverOrder(
                MERCHANT_ID,
                initialCommerceCase.getCommerceCaseId().toString(),
                initialCommerceCase.getCheckout().getCheckoutId().toString(),
                new DeliverRequest().deliverType(DeliverType.FULL).isFinal(true));
        System.out.println(delivery);
    }

    public static void main(String[] args) {
        App app = initFromEnv();

        try {
            app.runCheckoutWithPaymentExecution("comc1a5");
        } catch (ApiErrorResponseException e) {
            for (APIError error : e.getErrors()) {
                System.err.println(error.getMessage());
            }
            System.exit(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            app.runMultiStepCheckout("comc1a1");
        } catch (ApiErrorResponseException e) {
            for (APIError error : e.getErrors()) {
                System.err.println(error.getMessage());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            app.runSingleStepCheckout("comc1a1");
        } catch (ApiErrorResponseException e) {
            for (APIError error : e.getErrors()) {
                System.err.println(error.getMessage());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
