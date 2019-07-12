package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageGC {

	public WebDriver driver;

	public HomePageGC(WebDriver driver) {

		this.driver = driver;
	}

	By search = By.xpath("//input[@type='search']");
	By product_name = By.cssSelector("h4.product-name");
	By increment_product = By.cssSelector("a.increment");
	By add_to_cart = By.xpath("//button[contains(text(),'ADD TO CART')]");
	By cart_icon = By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]");

	public WebElement get_search() {

		return driver.findElement(search);
	}

	public WebElement get_productname() {

		return driver.findElement(product_name);
	}
	public WebElement increment_product() {

		return driver.findElement(increment_product);
	}
	public WebElement add_to_cart() {

		return driver.findElement(add_to_cart);
	}
	public WebElement cart_icon() {

		return driver.findElement(cart_icon);
	}	

}
