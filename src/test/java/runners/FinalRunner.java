package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Finalproject.feature",
		glue= {"final_project"}, //stepDef
		tags = {"@001"}, //featurefile anotation
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})
 			//plugin is where is save the report...
public class FinalRunner {
	
	}
	
