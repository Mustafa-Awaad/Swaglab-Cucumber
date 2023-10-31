package org.example.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\AHMED\\IdeaProjects\\Automation_Assignment\\src\\main\\resources\\Features",
        glue = {"org/example/TestCases"},
        plugin = { "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"},
        tags = "@smoke"
)

public class TestCase_Runner extends AbstractTestNGCucumberTests
{
  
}

