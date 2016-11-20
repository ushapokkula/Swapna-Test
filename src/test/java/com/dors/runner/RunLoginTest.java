package com.dors.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/cucumber" },
        glue = "test/java/steps",
        features = "classpath:cucumber-features/create_entry.feature",
        tags = "@test"
)
public class RunLoginTest {
}
