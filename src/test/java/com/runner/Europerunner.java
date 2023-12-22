package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Resources/features",
        glue = "com/stepdefinition",
        tags = "@functional",
        dryRun = false,
        monochrome = true)
public class Europerunner {

}
