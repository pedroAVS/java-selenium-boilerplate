package io.mb.oneweb.java.selenium.framework.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Jobs {

    @Value("${mb.io.url}")
    private String apiUrl;

    @Value("${mb.io.api.endpoint.jobs}")
    private String jobsEndpoint;

    @Test
    public void apiCallGetJobs() {
        String apiUrlJobsEndpoint = apiUrl.concat(jobsEndpoint);

        when().
                get(apiUrlJobsEndpoint).
        then().
                statusCode(200).
                body("size()", equalTo(37));
    }

}
