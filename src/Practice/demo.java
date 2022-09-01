package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Selenium_Automation.UD_Open_Browser;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");
	WebElement a = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	a.click();
	Thread.sleep(2000);
	WebElement b = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	//Thread.sleep(2000);
	b.click();
	//Thread.sleep(2000);
	//b.click();
	//Thread.sleep(2000);
	//Select c = new Select(b);
	//Thread.sleep(2000);
	//c.selectByVisibleText("2");
	//Thread.sleep(2000);
	//b.sendKeys("2");
	//Thread.sleep(5000);
	
	/*
	
	
	b.click();
	Thread.sleep(2000);
	Actions ac = new Actions(driver);
	Thread.sleep(2000);
	ac.sendKeys("10");
	ac.perform();
	
	*/
		
		
		
	}

}
