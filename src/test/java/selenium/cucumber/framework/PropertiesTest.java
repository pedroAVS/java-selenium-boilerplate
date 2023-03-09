package selenium.cucumber.framework;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("default")
public class PropertiesTest {

    @Value("${zalenium.grid.url}")
    private String gridURL;

    @Autowired
    private Environment env;

    @Test
    public void propertiesLoadedTest() {
        assertThat(gridURL).isEqualTo(env.getProperty("zalenium.grid.url"));

        assertThat(gridURL).isEqualTo("http://localhost:4444/wd/hub");
    }
}
