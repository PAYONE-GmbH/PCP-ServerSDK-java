package com.payone.commerce.platform.app.examples;

import java.io.IOException;
import java.security.InvalidKeyException;

import com.payone.commerce.platform.lib.errors.ApiException;
import com.payone.commerce.platform.lib.CommunicatorConfiguration;
import com.payone.commerce.platform.lib.endpoints.CheckoutApiClient;
import com.payone.commerce.platform.lib.models.AmountOfMoney;
import com.payone.commerce.platform.lib.models.CheckoutResponse;
import com.payone.commerce.platform.lib.models.CreateCheckoutRequest;
import com.payone.commerce.platform.lib.models.CreateCheckoutResponse;
import com.payone.commerce.platform.lib.models.PatchCheckoutRequest;

public class CheckoutApiExample {
    CheckoutApiClient client;
    private final String merchantId = System.getenv("MERCHANT_ID");
    private final String commerceCaseId = System.getenv("COMMERCE_CASE_ID");
    private final String checkoutId = System.getenv("CHECKOUT_ID");
    private String createdCheckoutId;

    public CheckoutApiExample(CommunicatorConfiguration config) throws InvalidKeyException {
        this.client = new CheckoutApiClient(config);
    }

    public void runPostOne() throws ApiException, IOException {
        CreateCheckoutRequest payload = new CreateCheckoutRequest();
        AmountOfMoney amount = new AmountOfMoney();
        amount.setAmount(1000l);
        amount.setCurrencyCode("EUR");
        payload.amountOfMoney(amount);
        CreateCheckoutResponse res2 = client.createCheckoutRequest(merchantId,
                commerceCaseId, payload);

        createdCheckoutId = res2.getCheckoutId().toString();

        System.out.println(res2);

    }

    public void runGetAll() throws ApiException, IOException {
        // List<CheckoutResponse> res = client.getAllCheckouts(merchantId,
        // null);

        // System.out.println(res.toString());

    }

    public void runGetOne() throws ApiException, IOException {
        CheckoutResponse res = client.getCheckoutRequest(merchantId, commerceCaseId,
                checkoutId);

        System.out.println(res.toString());
    }

    public void runUpdateOne() throws ApiException, IOException {
        PatchCheckoutRequest patch = new PatchCheckoutRequest();
        AmountOfMoney amount = new AmountOfMoney();

        amount.setCurrencyCode("EUR");
        amount.setAmount(1500l);
        patch.amountOfMoney(amount);
        client.updateCheckoutRequest(merchantId,
                commerceCaseId,
                createdCheckoutId, patch);

    }

    public void runDeleteOne() throws ApiException, IOException {
        client.removeCheckoutRequest(merchantId, commerceCaseId, createdCheckoutId);
    }
}
