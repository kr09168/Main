package Selenium_Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowserPopup {

	public static void main(String[] args) {

		WebDriver driver = UD_Open_Browser.openBrowser("https://vctcpune.com/#");

		WebElement practise = driver.findElement(By.xpath("//a[@target='_blank'][1]"));
		practise.click();

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> i = handles.iterator();

		while (i.hasNext()) {
			String handle = i.next(); // next(); fetch one value.
			driver.switchTo().window(handle);
			String CurrentTitle = driver.getTitle();

			if (CurrentTitle.equals("Practice Page")) {

				WebElement link1 = driver.findElement(By.xpath("//a[@href='https://vctcpune.com/']"));
				link1.click();

			}
		}

	}

}
