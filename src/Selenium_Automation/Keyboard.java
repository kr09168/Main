package Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) {
		
		WebDriver driver = UD_Open_Browser.openBrowser("https://demoqa.com/text-box");
		
		WebElement user = driver.findElement(By.xpath("//input[@id='userName']"));
		user.sendKeys("kartik");
		
		Actions ob = new Actions(driver);
		ob.sendKeys(Keys.TAB);
		//ob.perform();
		
		ob.sendKeys("kartik@gmail.com");
		//ob.perform();
		
		ob.keyDown(Keys.CONTROL);
		ob.sendKeys("a");
		ob.keyUp(Keys.CONTROL);
		//ob.perform();
		
		ob.keyDown(Keys.CONTROL);
		ob.sendKeys("c");
		ob.keyUp(Keys.CONTROL);
		//ob.perform();
		
		ob.sendKeys(Keys.TAB);
		
		ob.keyDown(Keys.CONTROL);
		ob.sendKeys("v");
		ob.keyUp(Keys.CONTROL);
		//ob.perform();
		ob.build().perform();// this one statement combine all perform methods.

	}

}
