package selenium.cucumber.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private By pageTitle = By.xpath("//h3[contains(text(),'Sample App')]");


    public HomePage(WebDriver driver) {super(driver);}


    public WebElement getPageTitle() { return driver.findElement(pageTitle); }
    //top menu

}
