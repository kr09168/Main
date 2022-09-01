package Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath {
	public static void main(String[] args) {

		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");

		//WebElement a = driver.findElement(By.xpath("//input[@type='text']")); // by attribute.can use index.
		//a.sendKeys("kartik");
		//WebElement b = driver.findElement(By.xpath("//a[text()='Forgotten password?']")); // by text.can use index.
		//b.click();
	//	WebElement c = driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]")); // by contains.can use index.
	//	c.click();
	//	WebElement d = driver.findElement(By.xpath("(//a[@role='button'])[3]")); // by index.
	//	d.click();
		WebElement e = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input")); // by absolute path. step by step collection of tag names.
		e.sendKeys("kartikey"); 
		WebElement f = driver.findElement(By.xpath("//html//body//form//div[2]//input")); // by relative path.random collection of tagnames.
		f.sendKeys("raut");
	}

}
//most usable x path in organization.
//how to call hide button.