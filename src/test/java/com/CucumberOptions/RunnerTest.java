package com.CucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/features",
        glue = "com.StepDefinitions",
        //tags = "@all",
        dryRun = false,
        strict = false,
        snippets = SnippetType.UNDERSCORE
)

public class RunnerTest {

}
