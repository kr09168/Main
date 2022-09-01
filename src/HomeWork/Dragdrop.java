package HomeWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Selenium_Automation.UD_Open_Browser;

public class Dragdrop {

	public static void main(String[] args) throws InterruptedException {

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

}
