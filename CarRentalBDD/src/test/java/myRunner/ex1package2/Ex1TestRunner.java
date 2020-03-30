package myRunner.ex1package2;

//import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

//@RunWith(Cucumber.class)
@CucumberOptions(
		//the path of the feature files
		features = "src\\test\\java\\features\\ex1package\\ex1login.feature",
		//the path of the step definition files
		glue={"stepDefinition\\ex1package2"},
		//to generate different types of reporting
		plugin= {"pretty","html:test-outout", "json:target/cucumber-reports/cucumber.json", "junit:junit_xml/cucumber.xml"},
		//to check the mapping is proper between feature file and step def file
		dryRun = false,
		//display the console output in a proper readable format
		monochrome = true,
		//it will check fail if anything is wrong
		strict = true

		)

public class Ex1TestRunner {
	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {
		testNGCucumberRunner.finish();
	}
}