package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		//features = {"feature"},
		features = "C:\\Users\\Monicca2502\\workspace\\FairFX_BDD\\src\\main\\java\\feature"		
		//glue = {"C:\\Users\\Monicca2502\\workspace\\FairFX_BDD\\src\\main\\java\\Stepdefinition\\TravelcardStep.java"},		
		,glue = {"stepdefinition"}		
		,dryRun = false	// real test case run	
		//,dryRun = true	   // find missing steps
				//,format={"pretty"}
		,plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" }
		/*for multiple scenario options put the tags of tests which need to run. 
		 * For OR use {"@SmokeTest, @RegressionTest"}
		 * For AND use ie both {"@SmokeTest","@RegressionTest"}
		 * To ignore use "~ e.g. {"~@SmokeTest","@RegressionTest"}
		 * ,*/
		,tags = {"@TCTest"}
		/*Display output in readable format in console window. To make output readable. Keep it true*/
		,monochrome = true		
		/*Strict - True means it will fail execution if there are any undefined/pending steps. Will show 
		 * pending exception if step missing. Checks if any step definition is not defined in step def file*/
		,strict = true		
				)
		
public class runner {

}