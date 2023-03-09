package selenium.cucumber.framework.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium.cucumber.framework.pages.HomePage;

public class OpenPageSteps extends BaseSteps<HomePage> {

    public OpenPageSteps(WebDriver driver) {
        super(driver, new HomePage(driver));
    }

    public String getPageTitle(){
        return wait.until(ExpectedConditions.visibilityOf(page.getPageTitle())).getText();
    }

}
