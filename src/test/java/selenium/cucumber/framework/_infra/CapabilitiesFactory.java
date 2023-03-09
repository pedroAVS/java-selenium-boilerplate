package selenium.cucumber.framework._infra;

import org.openqa.selenium.MutableCapabilities;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
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
