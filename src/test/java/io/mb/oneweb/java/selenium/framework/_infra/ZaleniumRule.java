package io.mb.oneweb.java.selenium.framework._infra;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class ZaleniumRule extends TestWatcher {
    private static final Logger LOG = LoggerFactory.getLogger(ZaleniumRule.class);

    private static final int RUN_ID = ThreadLocalRandom.current().nextInt(1, 1000);

    @Value("${zalenium.grid.url}")
    private String gridURL;

    @Value("#{'${zalenium.grid.browser}'.toUpperCase()}")
    private Browser browser;

    @Value("#{'${zalenium.grid.viewport}'.toUpperCase()}")
    private ViewPort viewPort;

    private RemoteWebDriver webDriver;

    @Override
    protected void starting(Description description) {
        LOG.info("Remote Webdriver is about to start in {}", gridURL);
        webDriver = new RemoteWebDriver(createGridURL(), createCapabilities(description));
        webDriver.manage().window().setSize(new Dimension(viewPort.getWidth(),viewPort.getHeight()));
    }

    private URL createGridURL() {
        try {
            return new URL(gridURL);
        } catch (MalformedURLException e) {
            throw new RuntimeException("", e);
        }
    }


    private Capabilities createCapabilities(Description description) {
        MutableCapabilities capabilities = CapabilitiesFactory.create(browser);

        String appName = String.format("[%s] %s %s", RUN_ID, description.getTestClass().getPackage().getName(), viewPort);
        capabilities.setCapability("zal:name", appName);

        String testName = String.format("%s.%s", description.getTestClass().getSimpleName(), description.getMethodName());
        capabilities.setCapability("zal:build", testName);

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

    public Browser getBrowser() {
        return browser;
    }

    public ViewPort getViewPort() {
        return viewPort;
    }

}
