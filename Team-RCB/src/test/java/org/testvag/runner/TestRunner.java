package org.testvag.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/java/resource/features",
        glue = {"org/testvag/stepdefinition"},
        tags = "@TeamPlayersValidation",
        plugin = {"pretty", "json:target/cucumber.json",
                "html:target/cucumber-report/cucumber.html"}
)

public class TestRunner {

}


