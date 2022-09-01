package Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropdownUsingSelectClass {

	public static void main(String[] args) throws InterruptedException {
		
		// important not :- we can use select only when we have tag name as select.
		
		WebDriver driver = UD_Open_Browser.openBrowser("https://chercher.tech/practice/dropdowns");
		
		WebElement a = driver.findElement(By.xpath("//select[@id='first']"));
		
		//a.sendKeys("Google"); --- another way to handle drop down.
		
		Select b = new Select(a);
		
		b.selectByIndex(0); // select by index
		Thread.sleep(3000);
		b.selectByValue("Google"); //  select by value
		Thread.sleep(3000);
		b.selectByVisibleText("Iphone"); // select by visible text
		
		
		

	}

}
