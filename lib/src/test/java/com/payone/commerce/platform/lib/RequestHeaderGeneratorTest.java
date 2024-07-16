package com.payone.commerce.platform.lib;

import org.junit.jupiter.api.Test;

import okhttp3.Headers;
import okhttp3.Request;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Date;

public class RequestHeaderGeneratorTest {
    @Test
    void testSignatureGenerationForGet() {
        String secret = "Super duper Ethan Hunt level secret";
        Date date = new Date(1720520499000l);
        Request request = new Request.Builder().get().url("http://awesome-api.com/v1/commerce_cases")
                .headers(new Headers.Builder().add("Date", date).build()).build();
        CommunicatorConfiguration config = new CommunicatorConfiguration("KEY", secret);
        RequestHeaderGenerator headerGenerator = null;
        try {
            headerGenerator = new RequestHeaderGenerator(config);
            Request updatedRequest = headerGenerator.generateAdditionalRequestHeaders(request);

            System.out.println(updatedRequest.header("Authorization"));

            assertEquals(updatedRequest.header("Authorization"),
                    "GCS v1HMAC:KEY:29Obqkt6uQaF+pLAuKKmRxKJ5MeJrGDPIfvluAxiMLE=");
        } catch (Exception e) {
            fail("Failed to create request header generator: " + e.getMessage());
        }
    }
}
