package Selenium_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MethodsOfMouseAction {

	public static void right_double_Click() {

		WebDriver driver = UD_Open_Browser.openBrowser("https://demo.guru99.com/test/simple_context_menu.html");

		WebElement rclick = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions ob = new Actions(driver);

		ob.contextClick(rclick); // right click.
		// ob.perform(); // It is used to perform actions and will be used after every
		// method called from Actions class.

		WebElement dclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		ob.doubleClick(dclick); // double click.
		// ob.perform();
		ob.build().perform();// it is used when we call multiple mouse action together, it builds all the
								// actions together.
	}

	public static void moveToElement() {

		WebDriver driver = UD_Open_Browser.openBrowser("https://www.amazon.in/");

		WebElement hover = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));

		Actions ob = new Actions(driver);
		ob.moveToElement(hover);
		ob.perform();

	}

	public static void dragAndDrop() {

		WebDriver driver = UD_Open_Browser.openBrowser("https://www.globalsqa.com/demo-site/draganddrop/");

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame); // find by webelement.

		WebElement source = driver.findElement(
				By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'][1]"));

		WebElement target = driver.findElement(By.xpath("//div[@id='trash']"));

		Actions ob = new Actions(driver);
		ob.dragAndDrop(source, target);
		ob.perform();

	}

	public static void multidragDropwithreverse() throws InterruptedException {

		WebDriver driver = UD_Open_Browser.openBrowser("https://www.globalsqa.com/demo-site/draganddrop/");

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame); // find by webelement.

		List<WebElement> source = driver.findElements(
				By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
		int s = source.size();// to get size of list
		// System.out.println(s);

		WebElement target = driver.findElement(By.xpath("//div[@id='trash']"));
		Actions ob = new Actions(driver);

		for (int i = 0; i < s; i++) {// 0,1,2,3,4

			WebElement image = source.get(i);// get method is use to get the value of list.
			ob.dragAndDrop(image, target);
			ob.perform();
			Thread.sleep(2000);

		}

		List<WebElement> so = driver.findElements(
				By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
		int d = so.size();
		

		for (int j = 0; d > j; j--) {

			WebElement ss = driver.findElement(By.xpath("//a[@class='ui-icon ui-icon-refresh']"));
			ss.click();
			Thread.sleep(2000);

		}
	
	
}
	public static void main(String[] args) throws InterruptedException {
		MethodsOfMouseAction.dragAndDrop();
		MethodsOfMouseAction.multidragDropwithreverse();
		MethodsOfMouseAction.moveToElement();
		MethodsOfMouseAction.right_double_Click();
		
	}
}