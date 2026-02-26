package com.refi.api.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/api",
        glue = "com.refi.api.stepDef",
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        tags = "@api"
)

public class ApiRunnerTest {
}
