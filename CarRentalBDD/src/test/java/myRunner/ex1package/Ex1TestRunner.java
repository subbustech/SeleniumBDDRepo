package myRunner.ex1package;

//import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
@CucumberOptions(
			//the path of the feature files
			features = "src\\test\\java\\features\\ex1package\\ex1login.feature",
			//the path of the step definition files
			glue={"stepDefinition\\ex1package"},
			//Pretty console output and different reports
			plugin= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
			//to check the mapping is proper between feature file and step def file
			dryRun = false,
			//display the console output in a proper readable format
			monochrome = true,
			//Strictly fail
			strict = true
		)

public class Ex1TestRunner {

}