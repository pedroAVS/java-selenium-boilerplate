package io.mb.oneweb.java.selenium.framework.flows;

import io.mb.oneweb.java.selenium.framework._infra.ZaleniumRule;
import io.mb.oneweb.java.selenium.framework.steps.OpenPageSteps;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JobsPageTest {

    @Value("${mb.io.url}")
    private String homeURL;

    @Rule
    @Autowired
    @Qualifier("zaleniumRule")
    public ZaleniumRule rule;
    
    @Before
    public void beforeTest() {
        rule.openUrl(homeURL);
    }

    @Test
    public void openJobsPage() {
        OpenPageSteps openPageSteps = new OpenPageSteps(rule.getWebDriver());
/*
        assertThat(rule.getWebDriver().getCurrentUrl()).isEqualTo(homeURL);

        homePageSteps.clickOnBlog();
        homePageSteps.clickOnHome();
        JobsPageSteps jobsPageSteps = homePageSteps.clickOnJobs();

        assertThat(jobsPageSteps.getJobsitle()).isEqualTo("Jobs");

 */
    }

}
