package com.payone.commerce.platform.lib.testutils;

import com.payone.commerce.platform.lib.CommunicatorConfiguration;

public abstract class TestConfig {

    public static final CommunicatorConfiguration COMMUNICATOR_CONFIGURATION = new CommunicatorConfiguration("KEY",
            "Super duper Ethan Hunt level secret",
            "awesome-api.com");
}
