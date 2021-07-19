package env;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
			 "pretty", 
			 "html:target/cucumberHtmlReport",
		   	 "json:target/cucumber-json-report.json"  
		     },
		features = "classpath:features",
		glue = {"info.seleniumcucumber.stepdefinitions",   // predefined step definitions package
				"info.seleniumcucumber.userStepDefintions" // user step definitions package
			   }
)

public class RunCukeTest { 	
}
