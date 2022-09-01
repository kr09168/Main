package FrameworkTestNg;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Selenium_Automation.UD_Open_Browser;

public class Waits {

	@Test(enabled = false)
	public void impleciteWait() throws InterruptedException {
		// important note :- we apply implicite wait in browser code only .we not use
		// for percular element but for just understnding i putted it here.
		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/"); // stored the value into driver.

		WebElement signup = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		signup.click();
		// Thread.sleep(5000); // we can do it with sleep method but its wrong method to
		// do.
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS); // implicite wait.
		// #. it will wait for element with respect to assigned time if element visible
		// then
		// test get pass otherwise it will throw error. for example
		// elementnotfoundException.
		// #. drawback is it will wait for every element for mentioned time. and if
		// element not found
		// then execution get stopped.
		// #. We use implicite wait where we want to put screen on wait (i found this in
		// my case. it means we cant put it at last of code.)
		// #. use for web element becoz browser is already controlled by selenium.
		// #. if is there no need to wait then it will also stop - drawback.
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select a = new Select(day);
		a.selectByValue("8");
		driver.close();
	}

	@Test
	public void expleciteWait() throws InterruptedException {
		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/"); // stored the value into driver.

		WebElement signup = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		signup.click();
		// Thread.sleep(5000); // we can do it with sleep method but its wrong method to
		// do.
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select a = new Select(day);
		WebDriverWait obj = new WebDriverWait(driver, 9000);
		obj.until(ExpectedConditions.visibilityOf(day));
		// #. mostlty we use it in industry.
		// #. it will use for perticular element with diff methods of ExpectedConditions
		// class.
		// #. Drawback of explicite wait is its pooling time is 500 miliseconds if
		// element foud it in 10 mililiseconds then still it will comlete its cooling
		// cycle.
		// then after that it depends on our mentioned time like we put 2000 the there
		// is 4 slabs of pooling time.
		a.selectByValue("8");
		driver.close();

	}

	@Test(enabled = false)
	public void fluentWait() throws InterruptedException {
		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/"); // stored the value into driver.
		WebElement signup = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		signup.click();
		// Thread.sleep(5000); // we can do it with sleep method but its wrong method to
		// do.

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		FluentWait<WebDriver> obj = new FluentWait<WebDriver>(driver); // WebDriver is a part of collection generics.
		obj.withTimeout(Duration.ofMillis(10000));// Total wait time.
		obj.pollingEvery(Duration.ofMillis(100));// Pooling time.
		obj.ignoring(NoSuchElementException.class); // obj.ignoring(Exception.class);// to ignor exception.
		obj.until(ExpectedConditions.visibilityOf(day));
		// Its just like explicete wait just the diffrance is we can set the pooling
		// time(rechecking interval time) for it.
		Select a = new Select(day);
		a.selectByValue("8");
		driver.close();

	}

}
// buy x path found.
//move element is not working.
