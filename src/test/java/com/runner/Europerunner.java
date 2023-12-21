package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Resources/features",
                     glue = "src/test/java/com/stepdefinition",
                      tags = "@functional",
                       dryRun = true)
public class Europerunner {

}
