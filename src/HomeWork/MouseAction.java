package HomeWork;

import org.openqa.selenium.Alert;
import Selenium_Automation.UD_Open_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = UD_Open_Browser
				.openBrowser("https://demo.guru99.com/test/simple_context_menu.html");

		WebElement rclick = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions ob = new Actions(driver);
		ob.contextClick(rclick); // right click.
		ob.perform();

		WebElement edit = driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']"));
		Thread.sleep(2000);
		edit.click();
		Thread.sleep(2000);
		Alert save = driver.switchTo().alert();
		Thread.sleep(2000);
		save.accept();
		
		ob.contextClick(rclick); // right click.
		ob.perform();

		WebElement cut = driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-cut']"));
		Thread.sleep(2000);
		cut.click();
		Thread.sleep(2000);
		Alert save1 = driver.switchTo().alert();
		save1.accept();
		
		ob.contextClick(rclick); // right click.
		ob.perform();

		
		
		
		WebElement copy = driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']"));
		Thread.sleep(2000);
		copy.click();
		Thread.sleep(2000);
		Alert save2 = driver.switchTo().alert();
		Thread.sleep(2000);
		save2.accept();
		
		ob.contextClick(rclick); // right click.
		ob.perform();

		
		
		
		WebElement paste = driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-paste']"));
		Thread.sleep(2000);
		paste.click();
		Thread.sleep(2000);
		Alert save3 = driver.switchTo().alert();
		Thread.sleep(2000);
		save3.accept();
		
		
		ob.contextClick(rclick); // right click.
		ob.perform();

		
		
		WebElement delete = driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-delete']"));
		Thread.sleep(2000);
		delete.click();
		Thread.sleep(2000);
		Alert save4 = driver.switchTo().alert();
		Thread.sleep(2000);
		save4.accept();
		
		
		ob.contextClick(rclick); // right click.
		ob.perform();
		WebElement quit = driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-quit']"));
		Thread.sleep(2000);
		quit.click();
		Thread.sleep(2000);
		Alert save5 = driver.switchTo().alert();
		Thread.sleep(2000);
		save5.accept();
		
	
	
	}
	

}
