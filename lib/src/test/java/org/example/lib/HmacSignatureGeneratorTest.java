package org.example.lib;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Date;

import org.junit.jupiter.api.Test;

import com.payone.commerce.platform.lib.HmacSignatureGenerator;

public class HmacSignatureGeneratorTest {
    @Test
    void testSignatureGenerationForPost() {
        String secret = "Super duper Ethan Hunt level secret";
        HmacSignatureGenerator generator = null;
        Date date = new Date(1720520499000l);
        String actualSignature = null;
        String expectedSignature = "pr29D4Yqd9AIYK1LwL7t6Fb9Ak7KtvMxRJZkBfV3iNI=";

        try {
            generator = HmacSignatureGenerator.withSecret(secret);

            actualSignature = generator.generate("POST", date, "/v1/commerce_cases");
        } catch (Exception e) {
            fail("Failed to create Signature instance: " + e.getMessage());
        }

        assertEquals(actualSignature, expectedSignature);
    }

    @Test
    void testSignatureGenerationForGet() {
        String secret = "Super duper Ethan Hunt level secret";
        HmacSignatureGenerator generator = null;
        // Tue, 09 Jul 2024 10:21:39 GMT
        Date date = new Date(1720520499000l);
        String actualSignature = null;
        String expectedSignature = "Fo61ZnKBrfyqXMzhlo+0Tqertq6SVzFZHXGg1QTB3yc=";

        try {
            generator = HmacSignatureGenerator.withSecret(secret);

            actualSignature = generator.generate("GET", date, "/v1/commerce-cases");
        } catch (Exception e) {
            fail("Failed to create Signature instance: " + e.getMessage());
        }

        assertEquals(actualSignature, expectedSignature);
    }

    @Test
    void testSignatureGenerationForDelete() {
        String secret = "change it";
        HmacSignatureGenerator generator = null;
        // Thu, 11 Jul 2024 13:16:35 GMT
        Date date = new Date(1720703795041l);
        String actualSignature = null;
        String expectedSignature = "pV4WJCzF3t65zqYP1OzyFjj/2HPXCJyOVkidEYrHUpU=";

        try {
            generator = HmacSignatureGenerator.withSecret(secret);

            actualSignature = generator.generate("DELETE", date, "/v1/commerce-cases");
        } catch (Exception e) {
            fail("Failed to create Signature instance: " + e.getMessage());
        }

        assertEquals(actualSignature, expectedSignature);
    }

    @Test
    void testSignatureGenerationFailsForTrace() {
        String secret = "change it";
        // Thu, 11 Jul 2024 13:16:35 GMT
        Date date = new Date(1720703795041l);
        try {
            assertThrowsExactly(UnsupportedOperationException.class, () -> {
                HmacSignatureGenerator generator = HmacSignatureGenerator.withSecret(secret);
                generator.generate("TRACE", date, "/v1/commerce-cases");
            });
        } catch (Exception e) {
            fail("Failed to create Signature instance: " + e.getMessage());
        }
    }
}
