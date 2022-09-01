package Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MethodsOfWebElements {
	
	public static void text() {
		
		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");
		WebElement text = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		
		String d = text.getText(); // fetch any text from webpage.
		System.out.println(d);
		
		}
	
	public static void methods() {
//		WebDriver driver = Return_Open_Browser_Class.openBrowser("https://demo.guru99.com/test/radio.html");
		
	//	WebElement radio = driver.findElement(By.xpath("(//input[@name='webform'])[1]"));
	//	WebElement radio = driver.findElement(null);
		//radio.click();
		/*
		 sendKeys();  // already seen in locators.
		 clear();
		 */
	//	boolean a = radio.isSelected(); // show selected records
	//	System.out.println(a);
		
	//	boolean b = radio.isDisplayed();// show the element displaying or not
	//	System.out.println(b);
		
	//	boolean c = radio.isEnabled(); // show enabled or disabled particular filed
	//	System.out.println(c);
		
		}
	public static void main(String[] args) {
		//MethodsOfWebElements.text();
		MethodsOfWebElements.methods();

	}

}
