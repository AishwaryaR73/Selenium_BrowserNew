package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
					features = ".//Features/Customer.feature",
					glue = "testSteps",
					monochrome = true,
					dryRun = false,
					plugin = {
							"pretty", "html:CucumberReports"
							}
					
		)



public class TestRun {
	

}
