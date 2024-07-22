package com.payone.commerce.platform.app.examples;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.util.List;

import com.payone.commerce.platform.lib.errors.ApiException;
import com.payone.commerce.platform.lib.CommunicatorConfiguration;
import com.payone.commerce.platform.lib.endpoints.CommerceCaseApiClient;
import com.payone.commerce.platform.lib.models.Address;
import com.payone.commerce.platform.lib.models.CommerceCaseResponse;
import com.payone.commerce.platform.lib.models.CreateCommerceCaseRequest;
import com.payone.commerce.platform.lib.models.CreateCommerceCaseResponse;
import com.payone.commerce.platform.lib.models.Customer;
import com.payone.commerce.platform.lib.queries.GetCommerceCasesQuery;

public class CommerceCaseApiExample {
    CommerceCaseApiClient client;
    private final String merchantId = System.getenv("MERCHANT_ID");
    private final String commerceCaseId = System.getenv("COMMERCE_CASE_ID");

    public CommerceCaseApiExample(CommunicatorConfiguration config) throws InvalidKeyException {
        this.client = new CommerceCaseApiClient(config);
    }

    public void runPostOne() throws ApiException, IOException {

        CreateCommerceCaseResponse res = client.createCommerceCaseRequest(merchantId,
                new CreateCommerceCaseRequest());

        System.out.println(res.toString());

    }

    public void runGetAll() throws ApiException, IOException {
        GetCommerceCasesQuery query = new GetCommerceCasesQuery();
        query.setOffset(2);
        query.setSize(1);
        // Set<StatusCheckout> status = Set.of(StatusCheckout.COMPLETED);
        // query.setIncludeCheckoutStatus(status);

        List<CommerceCaseResponse> res = client.getAllCommerceCaseRequest(merchantId, query);

        System.out.println(res.toString());

    }

    public void runGetOne() throws ApiException, IOException {
        CommerceCaseResponse res = client.getCommerceCaseRequest(merchantId,
                commerceCaseId);

        System.out.println(res.toString());
    }

    public void runUpdateOne() throws ApiException, IOException {
        CommerceCaseResponse responseGetOne = client.getCommerceCaseRequest(merchantId,
                commerceCaseId);

        Customer modifiedCustomer = responseGetOne.getCustomer();
        Address modifiedBillingAddress = modifiedCustomer.getBillingAddress();
        modifiedBillingAddress.setCity("Kerken");
        modifiedCustomer.setBillingAddress(modifiedBillingAddress);

        client.updateCommerceCaseRequest(merchantId,
                commerceCaseId, modifiedCustomer);

        CommerceCaseResponse res = client.getCommerceCaseRequest(merchantId,
                commerceCaseId);

        System.out.println(res.toString());
    }
}
