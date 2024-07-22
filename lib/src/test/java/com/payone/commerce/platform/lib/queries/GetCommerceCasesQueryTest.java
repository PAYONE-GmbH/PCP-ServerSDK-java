package com.payone.commerce.platform.lib.queries;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.payone.commerce.platform.lib.models.PaymentChannel;
import com.payone.commerce.platform.lib.models.StatusCheckout;

public class GetCommerceCasesQueryTest {

    @Test
    void toQueryMap() {
        GetCommerceCasesQuery query = new GetCommerceCasesQuery();
        query.setOffset(1);
        query.setSize(10);
        query.setFromDate("2021-01-01");
        query.setToDate("2021-01-31");
        query.setCommerceCaseId("123456");
        query.setMerchantReference("7890");
        query.setMerchantCustomerId("1234");
        query.setIncludeCheckoutStatus(Arrays.asList(StatusCheckout.BILLED, StatusCheckout.CHARGEBACKED));
        query.setIncludePaymentChannel(Arrays.asList(PaymentChannel.ECOMMERCE, PaymentChannel.POS));

        Map<String, String> queryMap = query.toQueryMap();
        assertEquals("1", queryMap.get("offset"));
        assertEquals("10", queryMap.get("size"));
        assertEquals("2021-01-01", queryMap.get("fromDate"));
        assertEquals("2021-01-31", queryMap.get("toDate"));
        assertEquals("123456", queryMap.get("commerceCaseId"));
        assertEquals("7890", queryMap.get("merchantReference"));
        assertEquals("1234", queryMap.get("merchantCustomerId"));
        assertEquals("BILLED,CHARGEBACKED", queryMap.get("includeCheckoutStatus"));
        assertEquals("ECOMMERCE,POS", queryMap.get("includePaymentChannel"));
    }

    @Test
    void getters() {
        GetCommerceCasesQuery query = new GetCommerceCasesQuery();
        query.setOffset(1);
        query.setSize(10);
        query.setFromDate("2021-01-01");
        query.setToDate("2021-01-31");
        query.setCommerceCaseId("123456");
        query.setMerchantReference("7890");
        query.setMerchantCustomerId("1234");
        query.setIncludeCheckoutStatus(Arrays.asList(StatusCheckout.BILLED, StatusCheckout.CHARGEBACKED));
        query.setIncludePaymentChannel(Arrays.asList(PaymentChannel.ECOMMERCE, PaymentChannel.POS));

        assertEquals(1, query.getOffset());
        assertEquals(10, query.getSize());
        assertEquals("2021-01-01", query.getFromDate());
        assertEquals("2021-01-31", query.getToDate());
        assertEquals("123456", query.getCommerceCaseId());
        assertEquals("7890", query.getMerchantReference());
        assertEquals("1234", query.getMerchantCustomerId());
        assertEquals(Arrays.asList(StatusCheckout.BILLED, StatusCheckout.CHARGEBACKED),
                query.getIncludeCheckoutStatus());
        assertEquals(Arrays.asList(PaymentChannel.ECOMMERCE, PaymentChannel.POS), query.getIncludePaymentChannel());
    }

    @Test
    void nulls() {
        GetCommerceCasesQuery query = new GetCommerceCasesQuery();
        Map<String, String> queryMap = query.toQueryMap();

        assertEquals(0, queryMap.size());

    }

}
