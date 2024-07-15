package com.payone.commerce.platform.lib;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class HmacSignatureGenerator {
    private static final String ALGORITHM = "HmacSHA256";
    private static final DateTimeFormatter RFC_1123_DATE_TIME_FORMATTER;

    static {
        RFC_1123_DATE_TIME_FORMATTER = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("EEE, dd MMM yyyy HH:mm:ss ")
                .appendLiteral("GMT")
                .toFormatter(Locale.US)
                .withZone(TimeZone.getTimeZone("GMT").toZoneId());
    }

    public static HmacSignatureGenerator withSecret(String secret)
            throws NoSuchAlgorithmException, InvalidKeyException {

        Mac mac = Mac.getInstance(ALGORITHM);
        SecretKeySpec secretKeySpec = new SecretKeySpec(secret.getBytes(StandardCharsets.UTF_8), ALGORITHM);
        mac.init(secretKeySpec);
        return new HmacSignatureGenerator(mac);
    }

    private Mac mac;

    private HmacSignatureGenerator(Mac mac) {
        this.mac = mac;
    }

    public String generate(String method, Date date, String resource) {
        String contentType = null;
        switch (method) {
            case "POST":
            case "PATCH":
                contentType = "application/json; charset=utf-8";
                break;
            case "GET":
            case "DELETE":
                contentType = "";
                break;
            default:
                throw new UnsupportedOperationException(
                        "The HTTP method " + method + " is unsupported. Use POST, PATCH, GET or DELETE");
        }

        List<String> orderedHeaders = List.of(method.toString(), contentType, formatDateRFC1123(date),
                resource);
        String stringToHash = String.join("\n", orderedHeaders) + "\n";
        return this.hash(stringToHash.getBytes(StandardCharsets.UTF_8));
    }

    private String formatDateRFC1123(Date date) {
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(date.toInstant(), TimeZone.getTimeZone("GMT").toZoneId());
        return RFC_1123_DATE_TIME_FORMATTER.format(zonedDateTime);
    }

    private String hash(byte[] toHash) {
        byte[] hash = mac.doFinal(toHash);
        return Base64.getEncoder().encodeToString(hash);
    }
}
