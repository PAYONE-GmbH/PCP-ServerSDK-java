package com.payone.commerce.platform.lib.utils;

import java.util.Objects;

public class ServerMetaInfo {
    public String platformIdentifier;
    public String sdkIdentifier;
    public String sdkCreator;

    public ServerMetaInfo() {
        this.platformIdentifier = String.format("%s, java version is: %s", System.getProperty("os.name"),
                System.getProperty("java.version"));
        // TODO: get version
        this.sdkIdentifier = "JavaServerSDK/v1.0";
        this.sdkCreator = "PAYONE GmbH";

        // TODO: what about integrator?
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
                Objects.equals(sdkCreator, that.sdkCreator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(platformIdentifier, sdkIdentifier, sdkCreator);
    }
}
