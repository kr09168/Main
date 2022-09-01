package FrameworkTestNg;
// assertion means instruction it should like this then it should be like this only.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Selenium_Automation.UD_Open_Browser;

public class Assertions {

	@Test(enabled = false)
	public static void hardAssert() {
		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		boolean mail = email.isDisplayed();
		Assert.assertEquals(mail, true);// hard assert.
		//Asserts use for checks.
		//hard assert use for blocker functionaliteies 
		//also called as validation 
		//use to control state of execution.
		// it will stop further execution too if assert get failed.
		// hard aasrtion example is high severity
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title,"Facebook – log in or sign up");
	//	hard assert have multiple method use as per need.
		//Assert.assertTrue(condition);	
	}
	@Test
	public static void softAssert() {

		// methods are same in both assert.
		// main diff of soft assert is it will not stop the execution it will record all
		// validations and show after complete execution done.
		// but for that we must have to use aasertAll() compalsaryly put at the end.
		// without assertAll there is no use of softasset.
		// soft aasrtion example is low severity
		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		boolean mail = email.isDisplayed();
		SoftAssert obj = new SoftAssert();
		obj.assertEquals(mail, false);//softassert

		String title = driver.getTitle();
		System.out.println(title);
		obj.assertEquals(title,"Facebook – log in or sign up");//softassert	
		obj.assertAll();// mandatory
	
		
	
	}
}
