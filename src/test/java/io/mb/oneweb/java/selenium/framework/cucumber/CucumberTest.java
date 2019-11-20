package io.mb.oneweb.java.selenium.framework.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumberFeatures", glue = {"cucumber.api.spring"})
public class CucumberTest{}



