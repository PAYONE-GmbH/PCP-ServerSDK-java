package com.payone.commerce.platform.lib.utils;

public class ServerMetaInfo {
    public String platformIdentifier;
    public String sdkIdentifier;
    public String sdkCreator;

    public ServerMetaInfo() {
        this.platformIdentifier = String.format("%s, java version is: %s", System.getProperty("os.name"),
                System.getProperty("java.version"));
        // TODO: get version
        this.sdkIdentifier = "JavaServerSDKv1.0";
        this.sdkCreator = "PAYONE GmbH";

        // TODO: what about integrator?
    }

}
