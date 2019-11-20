package io.mb.oneweb.java.selenium.framework._infra;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public enum Browser {

    /**
     * We might want to move the creation of MutableCapabilities out of the ENUM.
     * Most likely few projects will need to add few specific Browser options.
     *
     * An example of usage:
     *<pre>
     *  ChromeOptions chromeOptions = new ChromeOptions();
     *  .addArguments("--headless");
     *</pre>
     *
     * or
     *
     *<pre>
     *  FirefoxOptions options = new FirefoxOptions()
     *  .addArguments("-headless");
     *</pre>
     *
     */
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
