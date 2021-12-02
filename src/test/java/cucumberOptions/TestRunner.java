package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//mport cucumber.api.CucumberOptions;

//import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions 
(
		features = {"src\\test\\java\\features"},
		glue = {"stepDefinations"}
		//plugin={"html:target/cucumber-html-report","json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucumber.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdspter:"}

		//stepNotifications = true
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
