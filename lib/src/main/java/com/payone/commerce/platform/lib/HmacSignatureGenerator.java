package com.payone.commerce.platform.lib;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class HmacSignatureGenerator {
    private static final String ALGORITHM = "HmacSHA256";

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

    public String generate(HttpMethod method, Date date, URI resource) {
        String contentType = null;
        switch (method) {
            case POST:
            case PATCH:
                contentType = "application/json; charset=utf-8";
                break;
            case GET:
            case DELETE:
                contentType = null;
                break;
            default:
                throw new UnsupportedOperationException(
                        "The HTTP method " + method + " is unsupported. Use POST, PATCH, GET or DELETE");
        }

        List<String> orderedHeaders = null;
        if (contentType == null) {
            orderedHeaders = List.of(method.toString(), formatDateRFC1123(date), resource.toString());
        } else {
            orderedHeaders = List.of(method.toString(), contentType, formatDateRFC1123(date), resource.toString());
        }
        String stringToHash = String.join("\n", orderedHeaders) + "\n";
        return this.hash(stringToHash.getBytes(StandardCharsets.UTF_8));
    }

    private String formatDateRFC1123(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return dateFormat.format(date);
    }

    private String hash(byte[] toHash) {
        byte[] hash = mac.doFinal(toHash);
        return Base64.getEncoder().encodeToString(hash);
    }
}
