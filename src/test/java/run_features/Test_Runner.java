package run_features;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
		// glue = "Step_Definitions",tags ="@Possitive_Scenarios,@Negative_Scenarios"
		// glue = "Step_Definitions",tags ="@Possitive_Scenarios,@Multi_test"
		// glue = "Step_Definitions",tags ="@Regressiontest",dryRun=true,
		// glue = "Step_Definitions",strict=true,
		 glue = "Step_Definitions", tags = "@Regressiontest", monochrome = true,
		//glue = "Step_Definitions", tags = "@Selenium", monochrome = true, 
		plugin = { "pretty", "html:target/reports/",
				"json:target/reports.json", "junit:target/reports.xml" })

public class Test_Runner {

}
