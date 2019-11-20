package io.mb.oneweb.java.selenium.framework.steps;

import io.mb.oneweb.java.selenium.framework.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OpenPageSteps extends BaseSteps<HomePage> {

    public OpenPageSteps(WebDriver driver) {
        super(driver, new HomePage(driver));
    }

    public String getPageTitle(){
        return wait.until(ExpectedConditions.visibilityOf(page.getPageTitle())).getText();
    }

}
