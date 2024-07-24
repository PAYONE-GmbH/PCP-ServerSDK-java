// package com.payone.commerce.platform.app.examples;

// import java.io.IOException;
// import java.security.InvalidKeyException;

// import com.payone.commerce.platform.lib.CommunicatorConfiguration;
// import com.payone.commerce.platform.lib.endpoints.CheckoutApiClient;
// import com.payone.commerce.platform.lib.endpoints.PaymentExecutionApiClient;
// import com.payone.commerce.platform.lib.errors.ApiException;
// import com.payone.commerce.platform.lib.models.AmountOfMoney;
// import com.payone.commerce.platform.lib.models.CreateCheckoutRequest;
// import com.payone.commerce.platform.lib.models.CreateCheckoutResponse;
// import com.payone.commerce.platform.lib.models.CreatePaymentResponse;
// import com.payone.commerce.platform.lib.models.PaymentExecutionRequest;
// import com.payone.commerce.platform.lib.models.PaymentExecutionSpecificInput;
// import com.payone.commerce.platform.lib.models.References;

// public class PaymentExecutionApiExample {
// PaymentExecutionApiClient client;
// CheckoutApiClient checkoutClient;

// private final String merchantId = System.getenv("MERCHANT_ID");
// private final String commerceCaseId = System.getenv("COMMERCE_CASE_ID");
// private final String checkoutId = System.getenv("CHECKOUT_ID");

// public PaymentExecutionApiExample(CommunicatorConfiguration config) throws
// InvalidKeyException {
// this.client = new PaymentExecutionApiClient(config);
// this.checkoutClient = new CheckoutApiClient(config);
// }

// public void runCreatePayment() throws ApiException, IOException {

// // create checkout
// CreateCheckoutRequest payload = new CreateCheckoutRequest();
// AmountOfMoney amount = new AmountOfMoney();
// amount.setAmount(1000l);
// amount.setCurrencyCode("EUR");
// payload.setAmountOfMoney(amount);

// CreateCheckoutResponse res2 =
// checkoutClient.createCheckoutRequest(merchantId,
// commerceCaseId, payload);
// String createdCheckoutId = res2.getCheckoutId().toString();

// System.out.println(res2.toString());

// try {
// // execute payment
// PaymentExecutionSpecificInput paymentExecutionSpecificInput = new
// PaymentExecutionSpecificInput();
// paymentExecutionSpecificInput.setAmountOfMoney(amount);
// References references = new References();
// references.setMerchantReference("12345678764");
// paymentExecutionSpecificInput.setPaymentReferences(references);
// PaymentExecutionRequest payload2 = new PaymentExecutionRequest();
// payload2.setPaymentExecutionSpecificInput(paymentExecutionSpecificInput);

// CreatePaymentResponse res = client.createPayment(merchantId, commerceCaseId,
// createdCheckoutId,
// payload2);

// System.out.println(res.toString());
// } catch (Exception e) {
// System.out.println(e.getMessage());
// // remove checkout
// checkoutClient.removeCheckoutRequest(merchantId, commerceCaseId,
// createdCheckoutId);
// }

// }

// }
