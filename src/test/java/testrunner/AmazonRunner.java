package testrunner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features/amazon.feature",glue="stepdefinition")
public class AmazonRunner extends AbstractTestNGCucumberTests
{
}