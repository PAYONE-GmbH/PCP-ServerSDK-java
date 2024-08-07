package com.payone.commerce.platform.lib.queries;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.payone.commerce.platform.lib.models.ExtendedCheckoutStatus;
import com.payone.commerce.platform.lib.models.PaymentChannel;
import com.payone.commerce.platform.lib.models.StatusCheckout;

class GetCheckoutsQueryTest {

    @Test
    void toQueryMap() {
        GetCheckoutsQuery query = new GetCheckoutsQuery();
        query.setOffset(1);
        query.setSize(10);
        query.setFromDate("2021-01-01");
        query.setToDate("2021-01-31");
        query.setFromCheckoutAmount(100);
        query.setToCheckoutAmount(200);
        query.setFromOpenAmount(50);
        query.setToOpenAmount(150);
        query.setFromCollectedAmount(10);
        query.setToCollectedAmount(20);
        query.setFromCancelledAmount(5);
        query.setToCancelledAmount(15);
        query.setFromRefundAmount(1);
        query.setToRefundAmount(2);
        query.setFromChargebackAmount(100);
        query.setToChargebackAmount(200);
        query.setCheckoutId("123456");
        query.setMerchantReference("7890");
        query.setMerchantCustomerId("1234");
        query.setIncludePaymentProductId(Arrays.asList(12, 456));
        query.setIncludeCheckoutStatus(Arrays.asList(StatusCheckout.BILLED, StatusCheckout.CHARGEBACKED));
        query.setIncludeExtendedCheckoutStatus(
                Arrays.asList(ExtendedCheckoutStatus.OPEN, ExtendedCheckoutStatus.DELETED));
        query.setIncludePaymentChannel(Arrays.asList(PaymentChannel.ECOMMERCE, PaymentChannel.POS));
        query.setPaymentReference("1234");
        query.setPaymentId("5678");
        query.setFirstName("John");
        query.setSurname("Doe");
        query.setEmail("john.doe@example.com");
        query.setPhoneNumber("1234567890");
        query.setDateOfBirth("1980-01-01");
        query.setCompanyInformation("Company Inc.");

        Map<String, String> queryMap = query.toQueryMap();
        assertEquals("1", queryMap.get("offset"));
        assertEquals("10", queryMap.get("size"));
        assertEquals("2021-01-01", queryMap.get("fromDate"));
        assertEquals("2021-01-31", queryMap.get("toDate"));
        assertEquals("100", queryMap.get("fromCheckoutAmount"));
        assertEquals("200", queryMap.get("toCheckoutAmount"));
        assertEquals("50", queryMap.get("fromOpenAmount"));
        assertEquals("150", queryMap.get("toOpenAmount"));
        assertEquals("10", queryMap.get("fromCollectedAmount"));
        assertEquals("20", queryMap.get("toCollectedAmount"));
        assertEquals("5", queryMap.get("fromCancelledAmount"));
        assertEquals("15", queryMap.get("toCancelledAmount"));
        assertEquals("1", queryMap.get("fromRefundAmount"));
        assertEquals("2", queryMap.get("toRefundAmount"));
        assertEquals("100", queryMap.get("fromChargebackAmount"));
        assertEquals("200", queryMap.get("toChargebackAmount"));
        assertEquals("123456", queryMap.get("checkoutId"));
        assertEquals("7890", queryMap.get("merchantReference"));
        assertEquals("1234", queryMap.get("merchantCustomerId"));
        assertEquals("12,456", queryMap.get("includePaymentProductId"));
        assertEquals("BILLED,CHARGEBACKED", queryMap.get("includeCheckoutStatus"));
        assertEquals("OPEN,DELETED", queryMap.get("includeExtendedCheckoutStatus"));
        assertEquals("ECOMMERCE,POS", queryMap.get("includePaymentChannel"));
        assertEquals("1234", queryMap.get("paymentReference"));
        assertEquals("5678", queryMap.get("paymentId"));
        assertEquals("John", queryMap.get("firstName"));
        assertEquals("Doe", queryMap.get("surname"));
        assertEquals("john.doe@example.com", queryMap.get("email"));
        assertEquals("1234567890", queryMap.get("phoneNumber"));
        assertEquals("1980-01-01", queryMap.get("dateOfBirth"));
        assertEquals("Company Inc.", queryMap.get("companyInformation"));

    }

    @Test
    void getters() {
        GetCheckoutsQuery query = new GetCheckoutsQuery();
        query.setOffset(1);
        query.setSize(10);
        query.setFromDate("2021-01-01");
        query.setToDate("2021-01-31");
        query.setFromCheckoutAmount(100);
        query.setToCheckoutAmount(200);
        query.setFromOpenAmount(50);
        query.setToOpenAmount(150);
        query.setFromCollectedAmount(10);
        query.setToCollectedAmount(20);
        query.setFromCancelledAmount(5);
        query.setToCancelledAmount(15);
        query.setFromRefundAmount(1);
        query.setToRefundAmount(2);
        query.setFromChargebackAmount(100);
        query.setToChargebackAmount(200);
        query.setCheckoutId("123456");
        query.setMerchantReference("7890");
        query.setMerchantCustomerId("1234");
        query.setIncludePaymentProductId(Arrays.asList(12, 456));
        query.setIncludeCheckoutStatus(Arrays.asList(StatusCheckout.BILLED, StatusCheckout.CHARGEBACKED));
        query.setIncludeExtendedCheckoutStatus(
                Arrays.asList(ExtendedCheckoutStatus.OPEN, ExtendedCheckoutStatus.DELETED));
        query.setIncludePaymentChannel(Arrays.asList(PaymentChannel.ECOMMERCE, PaymentChannel.POS));
        query.setPaymentReference("1234");
        query.setPaymentId("5678");
        query.setFirstName("John");
        query.setSurname("Doe");
        query.setEmail("john.doe@example.com");
        query.setPhoneNumber("1234567890");
        query.setDateOfBirth("1980-01-01");
        query.setCompanyInformation("Company Inc.");

        assertEquals(1, query.getOffset());
        assertEquals(10, query.getSize());
        assertEquals("2021-01-01", query.getFromDate());
        assertEquals("2021-01-31", query.getToDate());
        assertEquals(100, query.getFromCheckoutAmount());
        assertEquals(200, query.getToCheckoutAmount());
        assertEquals(50, query.getFromOpenAmount());
        assertEquals(150, query.getToOpenAmount());
        assertEquals(10, query.getFromCollectedAmount());
        assertEquals(20, query.getToCollectedAmount());
        assertEquals(5, query.getFromCancelledAmount());
        assertEquals(15, query.getToCancelledAmount());
        assertEquals(1, query.getFromRefundAmount());
        assertEquals(2, query.getToRefundAmount());
        assertEquals(100, query.getFromChargebackAmount());
        assertEquals(200, query.getToChargebackAmount());
        assertEquals("123456", query.getCheckoutId());

        assertEquals("7890", query.getMerchantReference());
        assertEquals("1234", query.getMerchantCustomerId());
        assertEquals(Arrays.asList(12, 456), query.getIncludePaymentProductId());
        assertEquals(Arrays.asList(StatusCheckout.BILLED, StatusCheckout.CHARGEBACKED),
                query.getIncludeCheckoutStatus());
        assertEquals(Arrays.asList(ExtendedCheckoutStatus.OPEN, ExtendedCheckoutStatus.DELETED),
                query.getIncludeExtendedCheckoutStatus());
        assertEquals(Arrays.asList(PaymentChannel.ECOMMERCE, PaymentChannel.POS), query.getIncludePaymentChannel());
        assertEquals("1234", query.getPaymentReference());
        assertEquals("5678", query.getPaymentId());
        assertEquals("John", query.getFirstName());
        assertEquals("Doe", query.getSurname());
        assertEquals("john.doe@example.com", query.getEmail());
        assertEquals("1234567890", query.getPhoneNumber());
        assertEquals("1980-01-01", query.getDateOfBirth());
        assertEquals("Company Inc.", query.getCompanyInformation());

    }

    @Test
    void nulls() {
        GetCheckoutsQuery query = new GetCheckoutsQuery();
        Map<String, String> queryMap = query.toQueryMap();

        assertEquals(0, queryMap.size());

    }

}
