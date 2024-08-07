package com.payone.commerce.platform.lib.utils;

import java.util.Objects;

public class ServerMetaInfo {
    public String platformIdentifier;
    public String sdkIdentifier;
    public String sdkCreator;
    public String integrator;

    public ServerMetaInfo() {
        this.platformIdentifier = String.format("%s, java version is: %s", System.getProperty("os.name"),
                System.getProperty("java.version"));
        // version gets updated with the prepare-release.sh script
        this.sdkIdentifier = "JavaServerSDK/v0.0.2";
        this.sdkCreator = "PAYONE GmbH";
        this.integrator = null;
    }

    public ServerMetaInfo(String integrator) {
        this.platformIdentifier = String.format("%s, java version is: %s", System.getProperty("os.name"),
                System.getProperty("java.version"));
        // version gets updated with the prepare-release.sh script
        this.sdkIdentifier = "JavaServerSDK/v0.0.2";
        this.sdkCreator = "PAYONE GmbH";
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
                Objects.equals(sdkCreator, that.sdkCreator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(platformIdentifier, sdkIdentifier, sdkCreator);
    }
}
