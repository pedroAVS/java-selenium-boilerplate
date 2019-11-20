package io.mb.oneweb.java.selenium.framework.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.mb.oneweb.java.selenium.framework._infra.LayoutRule;
import io.mb.oneweb.java.selenium.framework.cucumber.SpringTest;
import io.mb.oneweb.java.selenium.framework.pages.HomePage;
import io.mb.oneweb.java.selenium.framework.steps.BaseSteps;
import io.mb.oneweb.java.selenium.framework.steps.OpenPageSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import static org.assertj.core.api.Assertions.assertThat;

public class DisplayOnPage {
    private static final Logger LOG = LoggerFactory.getLogger(DisplayOnPage.class);

    @Value("${mb.io.url}")
    private String homeURL;

    private OpenPageSteps openPageSteps;


    @When("^the 'page title' is displayed on the page$")
    public void isDisplayedOnThePage(){
        assertThat(openPageSteps.getPageTitle()).isEqualTo("Unsere Fahrzeuge.");
        //System.out.println(openPageSteps.getPageTitle());
        /*switch (pageDisplay) {
            case "page title":
                System.out.println("YOOOOOOOOOOOOO");
                System.out.println(openPageSteps.getPageTitle());

                //assertThat(openPageSteps.getPageTitle()).isEqualTo("Unsere Fahrzeuge");
                break;
            default:
                LOG.error("page item not found");
        }*/

    }
}
