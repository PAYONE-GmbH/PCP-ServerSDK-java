package com.payone.commerce.platform.lib.utils;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        ServerMetaInfo.JSON_PROPERTY_PLATFORM_IDENTIFIER,
        ServerMetaInfo.JSON_PROPERTY_SDK_IDENTIFIER,
        ServerMetaInfo.JSON_PROPERTY_SDK_CREATOR,
        ServerMetaInfo.JSON_PROPERTY_INTEGRATOR,
})
public class ServerMetaInfo implements Serializable {
    public static ServerMetaInfo withDefaults(String integrator) {
        return new ServerMetaInfo()
                .platformIdentifier(String.format("%s, java version is: %s", System.getProperty("os.name"),
                        System.getProperty("java.version")))
                .sdkIdentifier("JavaServerSDK/v1.2.0")
                .sdkCreator("PAYONE GmbH")
                .integrator(integrator);
    }

    public static ServerMetaInfo withDefaults() {
        return withDefaults(null);
    }

    public static final String JSON_PROPERTY_PLATFORM_IDENTIFIER = "platformIdentifier";
    private String platformIdentifier;

    public static final String JSON_PROPERTY_SDK_IDENTIFIER = "sdkIdentifier";
    private String sdkIdentifier;

    public static final String JSON_PROPERTY_SDK_CREATOR = "sdkCreator";
    private String sdkCreator;

    public static final String JSON_PROPERTY_INTEGRATOR = "integrator";
    private String integrator;

    public ServerMetaInfo() {
        // empty constructor
        // required for Jackson deserialization
    }

    public ServerMetaInfo platformIdentifier(String platformIdentifier) {
        this.platformIdentifier = platformIdentifier;
        return this;
    }

    @JsonProperty(JSON_PROPERTY_PLATFORM_IDENTIFIER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPlatformIdentifier() {
        return platformIdentifier;
    }

    @JsonProperty(JSON_PROPERTY_PLATFORM_IDENTIFIER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPlatformIdentifier(String platformIdentifier) {
        this.platformIdentifier = platformIdentifier;
    }

    public ServerMetaInfo sdkIdentifier(String sdkIdentifier) {
        this.sdkIdentifier = sdkIdentifier;
        return this;
    }

    @JsonProperty(JSON_PROPERTY_SDK_IDENTIFIER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSdkIdentifier() {
        return sdkIdentifier;
    }

    @JsonProperty(JSON_PROPERTY_SDK_IDENTIFIER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSdkIdentifier(String sdkIdentifier) {
        this.sdkIdentifier = sdkIdentifier;
    }

    public ServerMetaInfo sdkCreator(String sdkCreator) {
        this.sdkCreator = sdkCreator;
        return this;
    }

    @JsonProperty(JSON_PROPERTY_SDK_CREATOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSdkCreator() {
        return sdkCreator;
    }

    @JsonProperty(JSON_PROPERTY_SDK_CREATOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSdkCreator(String sdkCreator) {
        this.sdkCreator = sdkCreator;
    }

    public ServerMetaInfo integrator(String integrator) {
        this.integrator = integrator;
        return this;
    }

    @JsonProperty(JSON_PROPERTY_INTEGRATOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getIntegrator() {
        return integrator;
    }

    @JsonProperty(JSON_PROPERTY_INTEGRATOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIntegrator(String integrator) {
        this.integrator = integrator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServerMetaInfo that = (ServerMetaInfo) o;
        return Objects.equals(platformIdentifier, that.platformIdentifier) &&
                Objects.equals(sdkIdentifier, that.sdkIdentifier) &&
                Objects.equals(sdkCreator, that.sdkCreator) &&
                Objects.equals(integrator, that.integrator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(platformIdentifier, sdkIdentifier, sdkCreator, integrator);
    }
}
