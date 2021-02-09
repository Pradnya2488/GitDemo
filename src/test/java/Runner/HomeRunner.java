package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/Features/Home.feature",
		glue="StepDefinitions",
		plugin="html:src/test/reports/cucumber-report.html",
		monochrome=true,
		dryRun=false
		)

public class HomeRunner {

}
