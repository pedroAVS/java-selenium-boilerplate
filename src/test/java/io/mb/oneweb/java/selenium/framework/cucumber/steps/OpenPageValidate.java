package io.mb.oneweb.java.selenium.framework.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.mb.oneweb.java.selenium.framework._infra.ZaleniumRule;
import io.mb.oneweb.java.selenium.framework.cucumber.SpringTest;
import io.mb.oneweb.java.selenium.framework.steps.OpenPageSteps;
import org.junit.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import static org.assertj.core.api.Assertions.assertThat;

public class OpenPageValidate extends SpringTest {
    @Value("${mb.io.url}")
    private String homeURL;


    @Rule
    @Autowired
    @Qualifier("zaleniumRule")
    public ZaleniumRule rule;


    @Given("^the user opens the model overview page$")
    public void opensPage(){
        assertThat(homeURL).isEqualTo("https://test.assets.oneweb.mercedes-benz.com/plugin/vmos/index.html?country=DE&language=de&view=BODYTYPE&subgroup=see-all");

    }
}
