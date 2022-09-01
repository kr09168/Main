package Selenium_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Open_Browser {

	public static void main(String [] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");// key :-"webdriver.chrome.driver" Value
																				// :-"D:\\chromedriver.exe".
		WebDriver driver = new ChromeDriver();// (upcasting) responsible to open the browser.	
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
	}

}
