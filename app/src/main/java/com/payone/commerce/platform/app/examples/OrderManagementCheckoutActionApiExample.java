// package com.payone.commerce.platform.app.examples;

// import java.io.IOException;
// import java.security.InvalidKeyException;

// import com.payone.commerce.platform.lib.CommunicatorConfiguration;
// import com.payone.commerce.platform.lib.endpoints.CheckoutApiClient;
// import
// com.payone.commerce.platform.lib.endpoints.OrderManagementCheckoutActionsApiClient;
// import com.payone.commerce.platform.lib.errors.ApiException;
// import com.payone.commerce.platform.lib.models.AmountOfMoney;
// import com.payone.commerce.platform.lib.models.CreateCheckoutRequest;
// import com.payone.commerce.platform.lib.models.CreateCheckoutResponse;
// import com.payone.commerce.platform.lib.models.OrderRequest;
// import com.payone.commerce.platform.lib.models.OrderResponse;
// import com.payone.commerce.platform.lib.models.OrderType;
// import com.payone.commerce.platform.lib.models.References;

// public class OrderManagementCheckoutActionApiExample {
// OrderManagementCheckoutActionsApiClient client;
// CheckoutApiClient checkoutClient;

// private final String merchantId = System.getenv("MERCHANT_ID");
// private final String commerceCaseId = System.getenv("COMMERCE_CASE_ID");
// private final String checkoutId = System.getenv("CHECKOUT_ID");

// public OrderManagementCheckoutActionApiExample(CommunicatorConfiguration
// config) throws InvalidKeyException {
// this.client = new OrderManagementCheckoutActionsApiClient(config);
// this.checkoutClient = new CheckoutApiClient(config);
// }

// public void runCreateOrderAndExecutePayment() throws ApiException,
// IOException {

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

// // execute payment
// OrderRequest payload2 = new OrderRequest();
// payload2.setOrderType(OrderType.FULL);
// References references = new References();
// references.setMerchantReference("1234");

// payload2.setOrderReferences(references);

// OrderResponse res = client.createOrder(merchantId, commerceCaseId,
// createdCheckoutId,
// payload2);

// System.out.println(res.toString());

// // remove checkout
// checkoutClient.removeCheckoutRequest(merchantId, commerceCaseId,
// createdCheckoutId);

// }

// }
