package Cucumber.Cucumber_automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {

	public static WebDriver driver;
	public static Properties prop;
	// public static String path = "";

	public static WebDriver get_driver() {
		try {
			FileInputStream fs = new FileInputStream(
					"C:\\Java_Learning\\Cucumber_automation\\src\\test\\java\\features\\global.properties");
			prop = new Properties();
			prop.load(fs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Learning\\Jars\\chrome_driver\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println(prop.getProperty("url"));
		driver.get(prop.getProperty("url"));
		return driver;
	}

}
