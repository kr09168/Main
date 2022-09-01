package Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll {

	public static void main(String[] args) {
		
		WebDriver driver = UD_Open_Browser.openBrowser("https://demoqa.com/text-box");
		
	WebElement submit = driver.findElement(By.xpath("//[@id='submit']"));
		
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoVieqw(true)",submit);
		
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(100,300)");
		
		
		

	}

}
