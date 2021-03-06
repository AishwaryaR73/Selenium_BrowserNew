package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features/login.feature",
		glue = "stepsDefination", 
		monochrome = true, 
//		tags = {
//					//"@sanity","@Regression"  //AND operation
//				//"@sanity,@Regression"     // OR operation
//				},
		plugin = {
				"pretty", "html:test-output/cucumber"
				},
		dryRun = false
		

)

public class TestRun {

}