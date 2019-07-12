package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class prced_2_chkout {
	
	public WebDriver driver;
	
	public prced_2_chkout (WebDriver driver) {
		
		this.driver = driver;
	}
	
	By prc_2_chkout = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	
	public WebElement prc_2_chkout () {
		
		return driver.findElement(prc_2_chkout);
	}
	
}
