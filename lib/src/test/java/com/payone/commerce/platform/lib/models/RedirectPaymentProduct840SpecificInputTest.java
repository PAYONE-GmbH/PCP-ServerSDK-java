package com.payone.commerce.platform.lib.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class RedirectPaymentProduct840SpecificInputTest {
  @Test
  void serializesPaymentId() throws JsonProcessingException {
    RedirectPaymentProduct840SpecificInput input = new RedirectPaymentProduct840SpecificInput()
        .paymentId("3066019730_1");

    String paymentId = new ObjectMapper().readTree(new ObjectMapper().writeValueAsString(input)).get("paymentId")
        .asText();

    assertEquals("3066019730_1", paymentId);
  }
}
