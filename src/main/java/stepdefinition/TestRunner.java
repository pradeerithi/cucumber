package stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Features\\AddCustomer.feature", tags = {}, strict = false, dryRun = false, glue = "stepdefinition", monochrome = true, plugin = {"html:target","json:target/cucumber.json"})
public class TestRunner {

}
