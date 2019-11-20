package io.mb.oneweb.java.selenium.framework.layout;

import com.galenframework.api.Galen;
import io.mb.oneweb.java.selenium.framework._infra.LayoutRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HomePageTest {
    @Value("${mb.io.url}")
    private String homeURL;

    @Value("${galen.component.homePage}")
    private String componentSpecPath;

    @Rule
    @Autowired
    @Qualifier("layoutRule")
    public LayoutRule layoutRule;

    @Before
    public void beforeTest() {
        layoutRule.openUrl(homeURL);
    }

    @Test
    public void homePageLayoutTest() throws IOException {
        List<String> includedTags = Collections.singletonList(layoutRule.getViewPort().name().toLowerCase());

        layoutRule.setLayoutReport(
                Galen.checkLayout(
                        layoutRule.getWebDriver(),
                        componentSpecPath,
                        includedTags));
    }

}
