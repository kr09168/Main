package FrameworkTestNg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POM.POMFaceBooklogin;
import Selenium_Automation.UD_Open_Browser;
import Selenium_Automation.UD_Screenshot;
import Selenium_Automation.UD_Screenshot_Testng;


//@Listeners(FrameworkTestNg.Listeners.class)// we use this annotation for listener purpose.

public class TestFaceBookLogin extends WebDriverStaticVariable { // purpose of using extend is we are using UD_Screenshot_Testng
														// class for taking the screen shot thats why we have to
														// intialize webdriver referance variable first and then it will
														// pass to the method of UD_Screenshot_Testng class.

//	 WebDriver driver; // decleared as global
	
	
	@BeforeMethod
	 public void beforeMethod() {
		driver = UD_Open_Browser.openBrowser("https://www.facebook.com/"); // stored the value into driver.
	
	}

	@Test(priority = 1)
	
	public void loginWithValidCrdentials() throws InterruptedException, IOException {
		POMFaceBooklogin POMFaceBook = new POMFaceBooklogin(driver);
		POMFaceBook.EnterEmail("kartik@gmail.com");
		POMFaceBook.EnterPass("123");
		POMFaceBook.clickOnLogin();
		//Thread.sleep(9000);
		//Assert.assertTrue(false); use for checking reponse of listener for fail test case.
		
	}

//	
//	  @Test(priority =2) 
//	  
//	  public void loginWithEmail() throws InterruptedException {
//	  POMFaceBooklogin POMFaceBook = new POMFaceBooklogin(driver);
//	  POMFaceBook.EnterEmail("kartik@gmail.com"); POMFaceBook.clickOnLogin();
//	  Thread.sleep(7000);
//	  
//	  }
	  /* 
	 * @Test(priority =3) public void clickOnForgot() throws InterruptedException {
	 * POMFaceBooklogin POMFaceBook = new POMFaceBooklogin(driver);
	 * POMFaceBook.clickOnForgot(); }
	 * 
	 * @Test(priority =4) public void clickOnSignUp() throws InterruptedException {
	 * POMFaceBooklogin POMFaceBook = new POMFaceBooklogin(driver);
	 * POMFaceBook.clickOnNewAcc(); }
	 * 
	 * @Test(priority =5) public void clickOnCreatePage() throws
	 * InterruptedException { POMFaceBooklogin POMFaceBook = new
	 * POMFaceBooklogin(driver); POMFaceBook.clickOnCreatePage(); }
	 * 
	 * @Test(priority =6) public void SignUpPageFill() throws InterruptedException {
	 * POMFaceBooklogin p = new POMFaceBooklogin(driver); p.clickOnNewAcc();
	 * p.$clickOnFirstName("kartik"); p.$clickOnLastName("raut");
	 * p.$clickOnMobile("454578874"); // how to set a limit for ph no---------------
	 * p.$clickOnConPass("gjhgjhg4545"); p.$clickOnDay("20");
	 * p.$clickOnMonth("May"); p.$clickOnYear("1999"); p.$clickOnFemale();
	 * p.$clickOnMale(); p.$clickOnCustom(); p.$clickOnSignup(); Thread.sleep(9000);
	 * }
	 */
	@AfterMethod
	public void afterMethod() throws IOException, InterruptedException {

	//UD_Screenshot_Testng.ssTestNG("kartikry");
		
		
		
	}
	
}
