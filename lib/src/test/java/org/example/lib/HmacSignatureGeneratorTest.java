package org.example.lib;

import org.junit.jupiter.api.Test;

import com.payone.commerce.platform.lib.HttpMethod;
import com.payone.commerce.platform.lib.HmacSignatureGenerator;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;
import java.util.Date;

public class HmacSignatureGeneratorTest {
    @Test
    void testSigningWithContentType() {
        String secret = "Super duper Ethan Hunt level secret";
        HmacSignatureGenerator generator = null;
        // Tue, 09 Jul 2024 10:21:39 GMT
        Date date = new Date(1720520499000l);
        String actualSignature = null;
        String expectedSignature = "pr29D4Yqd9AIYK1LwL7t6Fb9Ak7KtvMxRJZkBfV3iNI=";

        try {
            generator = HmacSignatureGenerator.withSecret(secret);

            actualSignature = generator.generate(HttpMethod.POST, date, new URI("/v1/commerce_cases"));
        } catch (Exception e) {
            fail("Failed to create Signature instance: " + e.getMessage());
        }

        assertEquals(actualSignature, expectedSignature);
    }
}
