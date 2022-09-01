package Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver = UD_Open_Browser.openBrowser("https://chercher.tech/practice/dropdowns");
		
		WebElement a = driver.findElement(By.xpath("//option[@dummy='goo']"));
		a.click();

	}

}
