package Step_Definitions;

import Cucumber.Cucumber_automation.Utils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Utils {
	
	@Before("@Regressiontest")
	public void before_regression_start(Scenario scenario) {
		
		System.out.println("Before Regression");
	}
	
	@After("@Regressiontest")
	public void after_regression_start() {
		System.out.println("After Regression");
	}
	
	@After("@Selenium")
	public void after_Selenium() {
		driver.close();
	}
	
	@After("@Regression")
	public void after_Regression() {
		driver.close();
	}
}
