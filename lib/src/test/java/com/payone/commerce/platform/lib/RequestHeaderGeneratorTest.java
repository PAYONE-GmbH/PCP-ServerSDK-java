package com.payone.commerce.platform.lib;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.payone.commerce.platform.lib.utils.ServerMetaInfo;

import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.util.Base64;
import java.util.Date;

public class RequestHeaderGeneratorTest {
    private static final String TEST_KEY = "KEY";
    private static final String TEST_SECRET = "Super duper Ethan Hunt level secret";
    private static final CommunicatorConfiguration CONFIG = new CommunicatorConfiguration(TEST_KEY, TEST_SECRET,
            "awesome-api.com", null);
    private static final RequestHeaderGenerator HEADER_GENERATOR;
    static {
        try {
            HEADER_GENERATOR = new RequestHeaderGenerator(CONFIG);
        } catch (InvalidKeyException e) {
            throw new AssertionError(
                    String.format("Global test key %s, should valid as a key for HmacSHA256", TEST_KEY),
                    e);
        }
    }

    @Test
    void testSignatureGenerationForGet() {
        Date date = new Date(1720520499000l);
        Headers headers = new Headers.Builder().add("Date", date)
                // the meta info is normally generated internally, but fields and output may
                // change overtime, so we pin it for the test
                .add(RequestHeaderGenerator.SERVER_META_INFO_HEADER_NAME, "server fixed")
                .add(RequestHeaderGenerator.CLIENT_META_INFO_HEADER_NAME, "client fixed")
                .build();
        Request request = new Request.Builder().get().url("http://awesome-api.com/v1/commerce_cases")
                .headers(headers).build();
        try {
            Request updatedRequest = HEADER_GENERATOR.generateAdditionalRequestHeaders(request);

            assertEquals(updatedRequest.header("Authorization"),
                    "GCS v1HMAC:KEY:ZSq7H19dyhyNGSPY5UgyPwITc5n4QG+zHnNDExIa6A8=");
        } catch (Exception e) {
            fail(e);
        }
    }

    @Test
    void testSignatureGenerationWithContentType() {
        Date date = new Date(1720520499000l);
        MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
        Headers headers = new Headers.Builder()
                .add("Content-Type", mediaType.toString())
                .add("Date", date)
                // the meta info is normally generated internally, but fields and output may
                // change overtime, so we pin it for the test
                .add(RequestHeaderGenerator.SERVER_META_INFO_HEADER_NAME, "server fixed")
                .add(RequestHeaderGenerator.CLIENT_META_INFO_HEADER_NAME, "client fixed")
                .build();
        Request request = new Request.Builder()
                .post(RequestBody.create("", mediaType))
                .url("http://awesome-api.com/v1/commerce_cases")
                .headers(headers)
                .build();
        try {
            Request updatedRequest = HEADER_GENERATOR.generateAdditionalRequestHeaders(request);

            assertEquals(updatedRequest.header("Authorization"),
                    "GCS v1HMAC:KEY:c5aNDw4AUxRChugRyN0OmTCs38YLA9E/tR+k0bOQzyk=");
        } catch (Exception e) {
            fail(e);
        }
    }

    @Test
    void addADateHeaderIfMissingTest() {
        Request request = new Request.Builder()
                .get()
                .url("http://api.somewhere.com/route/to/thing")
                .build();

        try {
            Request updatedRequest = HEADER_GENERATOR.generateAdditionalRequestHeaders(request);

            assertNotNull(updatedRequest.headers().get("Date"));
            assertNotEquals(updatedRequest.headers().get("Date"), "");
        } catch (Exception e) {
            fail(e);
        }
    }

    @Test
    void addServerMetaInfoIfMissingTest() {
        Request request = new Request.Builder()
                .get()
                .url("http://api.somewhere.com/route/to/thing")
                .build();
        ObjectMapper objectMapper = new ObjectMapper();
        String serverMetaInfoAsJson = null;

        try {
            Request updatedRequest = HEADER_GENERATOR.generateAdditionalRequestHeaders(request);
            String serverMetaInfoBase64 = updatedRequest.header(RequestHeaderGenerator.SERVER_META_INFO_HEADER_NAME);
            assertNotNull(serverMetaInfoBase64);

            serverMetaInfoAsJson = new String(Base64.getDecoder().decode(serverMetaInfoBase64),
                    StandardCharsets.UTF_8);
            ServerMetaInfo serverMetaInfo = objectMapper.readValue(serverMetaInfoAsJson, ServerMetaInfo.class);
            assertEquals(serverMetaInfo, new ServerMetaInfo(null));
        } catch (JsonProcessingException e) {
            fail(String.format("Decoded meta info '%s', should have been valid json", serverMetaInfoAsJson), e);
        } catch (Exception e) {
            fail(e);
        }
    }

    @Test
    void addServerClientInfoIfMissingTest() {
        Request request = new Request.Builder()
                .get()
                .url("http://api.somewhere.com/route/to/thing")
                .build();

        try {
            Request updatedRequest = HEADER_GENERATOR.generateAdditionalRequestHeaders(request);
            String clientMetaInfo = updatedRequest.header(RequestHeaderGenerator.CLIENT_META_INFO_HEADER_NAME);
            assertNotNull(clientMetaInfo);

            String metaInfoAsJson = new String(Base64.getDecoder().decode(clientMetaInfo), StandardCharsets.UTF_8);
            assertEquals(metaInfoAsJson, "\"[]\"");
        } catch (Exception e) {
            fail(e);
        }
    }
}
