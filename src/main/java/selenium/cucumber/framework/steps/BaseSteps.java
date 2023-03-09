package selenium.cucumber.framework.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.cucumber.framework.pages.BasePage;

public abstract class BaseSteps<T extends BasePage> {

    protected WebDriver webDriver;
    protected WebDriverWait wait;
    protected T page;

    public BaseSteps(WebDriver webDriver, T page) {
        this.webDriver = webDriver;
        this.page = page;
        this.wait =  new WebDriverWait(webDriver, 5);
    }

    public T getPage() {
        return page;
    }
}
