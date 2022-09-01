package Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MethodsOfIFrame {

	public static void main(String[] args) {
		WebDriver driver = UD_Open_Browser.openBrowser("https://vctcpune.com/selenium/practice.html");

		driver.switchTo().frame(0); // switch to frame by index.-- it takes by default in sequence of webpage.
		// driver.switchTo().frame("courses-iframe");// Switch to frame by id.
		// driver.switchTo().frame("iframe-name");//Switch to frame by name.
		// driver.switchTo().frame(driver.findElement(By.xpath(""))); // switch to fram
		// by webelement.
		// driver.switchTo().parentFrame();// not covered.

		WebElement cources = driver.findElement(By.xpath("//a[text()='Courses']"));
		cources.click();

		driver.switchTo().defaultContent();// will switch the focus to main page.

		WebElement main = driver.findElement(By.xpath("//input[@id='alertbtn']"));
		main.click();

	}

}
