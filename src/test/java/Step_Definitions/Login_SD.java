package Step_Definitions;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_SD {

	@Given("^User is on the Landing page$")
	public void user_is_on_the_Landing_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step1 -Home page -Regression");

	}

	@When("^User provides login details with user name as \"([^\"]*)\" and password as \"([^\"]*)\"$")

	public void user_provides_login_details_with_user_name_as_and_password_as(String arg1, String arg2)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step2-Entered Credentials -Regression");
		System.out.println("User name :" + arg1 + " Password :" + arg2);
	}

	@And("^click the Login button$")
	public void click_the_Login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step3-Clicked Login button Regression");
	}

	@Then("^the Home page is dispaly is \"([^\"]*)\"$")
	public void the_Home_page_is_dispaly_is(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if (arg1.equals("successfully")) {
			System.out.println("Step4 -Successful login Regression");
		} else {
			System.out.println("Step4 -Login failed");
		}
	}

	@When("^User clicks the Signup page$")
	public void user_clicks_the_Signup_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("Step3-Signup page displayed Successfully");

	}

	@When("^Enter the below detais$")
	public void enter_the_below_detais(DataTable arg1) throws Throwable {

		List<List<String>> data = arg1.raw();

		for (List<String> rows : data) {

			for (String columns : rows) {

				System.out.println(columns);

			}
		}
		System.out.println("Step4-Signup Successfull");
	}
	
    @When("^User provides login details providing user name as (.+) and password as (.+)$")
    public void user_provides_login_details_providing_user_name_as_and_password_as(String username, String password) throws Throwable {
    
    	System.out.println("Step2-Entered Credentials");
		System.out.println("User name :" + username + " Password :" + password);
    }

    
    @Given("^Applogin feature started$")
    public void applogin_feature_started() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Background Step1");
    }

    @When("^Env is web$")
    public void env_is_web() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Background Step2");
    }

    @Then("^Clear the cookies$")
    public void clear_the_cookies() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Background Step3");
    }


}
