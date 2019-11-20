package io.mb.oneweb.java.selenium.framework._infra;

import org.openqa.selenium.MutableCapabilities;

class CapabilitiesFactory {

    private CapabilitiesFactory() {
        // disables external instantiation
    }
    
    static MutableCapabilities create(Browser browser) {
        MutableCapabilities capabilities = browser.getCapabilities();
        capabilities.setCapability(browser.getEventsCapability(), true);

        return capabilities;
    }
}
