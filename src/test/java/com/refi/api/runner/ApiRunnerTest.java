package com.refi.api.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/api",
        glue = "com.refi.api.stepDef",
        plugin = {"pretty", "html:target/cucumber-report-api.html",
                "json:target/cucumber-report-api.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        tags = "@api"
)

public class ApiRunnerTest {
}
