package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkout {
	
	public WebDriver driver;
	
	public checkout(WebDriver driver){
		
		this.driver = driver;
	}

	By product_name = By.cssSelector("p.product-name");
	
	public WebElement product_name() {
		
		return driver.findElement(product_name);
	}
	
}
