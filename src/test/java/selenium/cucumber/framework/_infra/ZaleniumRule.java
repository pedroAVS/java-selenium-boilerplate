package selenium.cucumber.framework._infra;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@Component
public class ZaleniumRule extends TestWatcher {
    private static final Logger LOG = LoggerFactory.getLogger(ZaleniumRule.class);

    private static final int RUN_ID = ThreadLocalRandom.current().nextInt(1, 1000);
    private static final int IMPLICIT_WAIT_TIME = 5;

    @Value("${zalenium.grid.url}")
    private String gridURL;

   /* @Value("#{'${zalenium.grid.browser}'.toUpperCase()}")
    private Browser browser;

    @Value("#{'${zalenium.grid.viewport}'.toUpperCase()}")
    private ViewPort viewPort;*/

    private RemoteWebDriver webDriver;

    @Override
    protected void starting(Description description) {
        LOG.info("Remote Webdriver is about to start in {}", gridURL);
        webDriver = new RemoteWebDriver(createGridURL(), createCapabilities(description));
        /*LOG.info("Setting the capabilities");
        webDriver.manage().window().setSize(new Dimension(viewPort.getWidth(),viewPort.getHeight()));*/
        webDriver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
    }

    private URL createGridURL() {
        try {
            return new URL(gridURL);
        } catch (MalformedURLException e) {
            throw new RuntimeException("", e);
        }
    }


    private Capabilities createCapabilities(Description description) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("build", "your build name");
        capabilities.setCapability("name", "your test name");
        capabilities.setCapability("platform", "Windows 10");
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("version","86.0");
        capabilities.setCapability("resolution","2560x1440");
        capabilities.setCapability("console",true);
        capabilities.setCapability("network",true);
        capabilities.setCapability("visual",true);
        capabilities.setCapability("geoLocation","GR");

        return capabilities;
    }

    @Override
    protected void succeeded(Description description) {
        webDriver.manage().addCookie(new Cookie("zaleniumTestPassed", "true"));
        webDriver.quit();
    }

    @Override
    protected void failed(Throwable e, Description description) {
        webDriver.manage().addCookie(new Cookie("zaleniumTestPassed", "false"));
        webDriver.quit();
    }

    public RemoteWebDriver getWebDriver() {
        return webDriver;
    }

    public void openUrl(String url) {
        webDriver.get(url);
    }

}
