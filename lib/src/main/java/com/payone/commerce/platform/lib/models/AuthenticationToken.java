package com.payone.commerce.platform.lib.models;

import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Model for the authentication JWT token response.
 */
public class AuthenticationToken {
    private String token;
    private UUID id;
    private OffsetDateTime creationDate;
    private OffsetDateTime expirationDate;

    public AuthenticationToken() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public OffsetDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public OffsetDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(OffsetDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }
}
