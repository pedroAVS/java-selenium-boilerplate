package selenium.cucumber.framework._infra;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan
@Component
public enum Browser {

    FIREFOX("Firefox", new FirefoxOptions(), "webdriver.enable.native.events"),
    CHROME("Chrome", new ChromeOptions(), "webdriver.chrome.driver");
    

    private String name;

    private MutableCapabilities capabilities;

    private String eventsCapability;

    Browser(String name, MutableCapabilities capabilities, String eventsCapability) {
        this.name = name;
        this.capabilities = capabilities;
        this.eventsCapability = eventsCapability;
    }

    public String getName() {
        return name;
    }

    public MutableCapabilities getCapabilities() {
        return capabilities;
    }

    public String getEventsCapability() {
        return eventsCapability;
    }
}
