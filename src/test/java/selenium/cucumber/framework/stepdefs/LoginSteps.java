package selenium.cucumber.framework.stepdefs;

import cucumber.api.java.en.When;
import org.junit.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import selenium.cucumber.framework._infra.ZaleniumRule;
import selenium.cucumber.framework.steps.OpenPageSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSteps {

    private OpenPageSteps openPageSteps;
    @Value("${mb.io.url}")
    private String homeURL;

    @Rule
    @Autowired
    @Qualifier("zaleniumRule")
    public ZaleniumRule rule;


    @When("^the user opens the login page$")
    public void opensPage(){
        openPageSteps = new OpenPageSteps(rule.getWebDriver());
        rule.openUrl(homeURL);
        assertThat(homeURL).isEqualTo("http://uitestingplayground.com/sampleapp");
        assertThat(openPageSteps.getPageTitle()).isEqualTo("Sample App");
    }
}
