package FrameworkTestNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Selenium_Automation.UD_Open_Browser;

public class TableAutomation {

	@Test(enabled = false)
	public void forOneElement() {

		WebDriver driver = UD_Open_Browser.openBrowser("https://demo.guru99.com/test/web-table-element.php");

		WebElement data = driver.findElement(By.xpath("(//table//tbody//tr//td[1])[2]"));
		String value = data.getText();
		System.out.println(value);

	}

	@Test(enabled = false)
	public void forTableHeaders() {

		WebDriver driver = UD_Open_Browser.openBrowser("https://demo.guru99.com/test/web-table-element.php");

		List<WebElement> data = driver.findElements(By.xpath("//table//th"));

		int sizee = data.size();

		for (int i = 1; i < sizee; i++) { // we can put '0' here too but one memory get lost beacause we have 5 element
											// and loop start with index.

			WebElement ele = data.get(i);
			String text = ele.getText();
			System.out.println(text);

		}

	}

	@Test
	public void forMaxPrice() {

		WebDriver driver = UD_Open_Browser.openBrowser("https://demo.guru99.com/test/web-table-element.php");

		List<WebElement> currentprice = driver.findElements(By.xpath("//table//tbody//tr//td[4]"));
		int sizee = currentprice.size();

		double max = 0;
		double min = 0;
		for (int i = 1; i < sizee; i++) { //100.0,150.8,35,500.0
			WebElement ele = currentprice.get(i);
			String text = ele.getText();
			double num = Double.parseDouble(text);

			if (num >= max) {

				max = num;//500.0

			}
			else if(num<max) {
				min = num;
			}

		}
		System.out.println("Maximum value is " + max);

		System.out.println("Minimum value is " + min);

	}

}
