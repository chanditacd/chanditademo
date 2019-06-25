package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/java/Features/trial.feature",
	                  glue="stepdefinition")
	public class Acres {
}
