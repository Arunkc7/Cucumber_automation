package Step_Definitions;

import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Cucumber.Cucumber_automation.Utils;
import PageObjects.HomePageGC;
import PageObjects.checkout;
import PageObjects.prced_2_chkout;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class Search {

	public WebDriver driver;

	public HomePageGC h;

	public prced_2_chkout p;
	
	public checkout c;
	@Given("^the user is on landing the page$")
	public void the_user_is_on_landing_the_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Java_Learning\\Jars\\chrome_driver\\chromedriver.exe");
		// driver = new ChromeDriver();
		driver = Utils.get_driver();
		// driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//input[@type='search']")).sendKeys("cucumber");

	}



	//@When("^user searched for \"([^\"]*)\"$")
	/*public void user_searched_for(String arg1) throws Throwable {
		// driver.manage().window().maximize();
		h = new HomePageGC(driver);
		h.get_search().sendKeys(arg1);

		// driver.findElement(By.xpath("//input[@type='search']")).sendKeys(arg1);
		// driver.findElement(By.xpath("//button[@class='search-button']")).click();
		Thread.sleep(2000);

	}

*/
    @When("^user searched for (.+)$")
    public void user_searched_for(String vegetable) throws Throwable {
		h = new HomePageGC(driver);
		h.get_search().sendKeys(vegetable);
		Thread.sleep(2000);
    }
    
	@Then("^\"([^\"]*)\" results are displayed$")
	public void results_are_displayed(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		assertTrue(h.get_productname().getText().contains(arg1));
		// assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(arg1));
		Thread.sleep(2000);
	}

	@And("^Added items to the cart$")
	public void added_items_to_the_cart() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// driver.findElement(By.cssSelector("a.increment")).click();
		// driver.findElement(By.cssSelector("a.increment")).click();
		h.increment_product().click();
		Thread.sleep(1000);
		h.add_to_cart().click();
		// driver.findElement(By.xpath("//button[contains(text(),'ADD TO
		// CART')]")).click();

	}

	@And("^User proceeded to checkout page$")
	public void user_proceeded_to_checkout_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
		h.cart_icon().click();
		Thread.sleep(1000);
		p = new prced_2_chkout(driver);		
		p.prc_2_chkout().click();
		//driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		Thread.sleep(1000);
	}

	/*@Then("^verify selected \"([^\"]*)\" items are displayed in checkout page$")
	public void verify_selected_items_are_displayed_in_checkout_page(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		c = new checkout(driver);
		assertTrue(c.product_name().getText().contains(arg1));
		//assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(arg1));
	}
	*/

    @Then("^verify selected (.+) items are displayed in checkout page$")
    public void verify_selected_items_are_displayed_in_checkout_page(String vegetable) throws Throwable {
		c = new checkout(driver);
		assertTrue(c.product_name().getText().contains(vegetable));
    }
	
	
}
