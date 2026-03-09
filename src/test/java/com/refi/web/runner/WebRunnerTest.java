package com.refi.web.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/web",
        glue = "com.refi.web.stepDef",
        plugin = {"pretty", "html:target/cucumber-report-web.html"},
        tags = "@web"
)

public class WebRunnerTest {
}
