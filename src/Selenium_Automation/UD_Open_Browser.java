package Selenium_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UD_Open_Browser {

	public static WebDriver openBrowser(String url) { // Declare variable 

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);// pass variable reference.

		driver.manage().window().maximize();
		
		return driver;
	}

}
