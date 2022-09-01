package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Selenium_Automation.UD_Open_Browser;
// we dont use static methods becoz of contineous memory allocation.
public class TestCase_LoginPage {

	public void loginWithValidCrdentials() throws InterruptedException {

		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");
		POMFaceBooklogin POMFaceBook = new POMFaceBooklogin(driver);
		POMFaceBook.EnterEmail("kartik@gmail.com");
		POMFaceBook.EnterPass("123");
		POMFaceBook.clickOnLogin();

	}
	public void loginWithEmail() throws InterruptedException {
		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");
		POMFaceBooklogin POMFaceBook = new POMFaceBooklogin(driver);
		POMFaceBook.EnterEmail("kartik@gmail.com");
		POMFaceBook.clickOnLogin();

	}
	public void clickOnForgot() throws InterruptedException {
		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");
		POMFaceBooklogin POMFaceBook = new POMFaceBooklogin(driver);
		POMFaceBook.clickOnForgot();
	}
	public void clickOnSignUp() throws InterruptedException{
		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");
		POMFaceBooklogin POMFaceBook = new POMFaceBooklogin(driver);
		POMFaceBook.clickOnNewAcc();
	}
	
	public void clickOnCreatePage() throws InterruptedException {
		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");
		POMFaceBooklogin POMFaceBook = new POMFaceBooklogin(driver);
		POMFaceBook.clickOnCreatePage();
	}
	public void SignUpPageFill() throws InterruptedException {
		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");
		POMFaceBooklogin p = new POMFaceBooklogin(driver);
		p.clickOnNewAcc();
		p.$clickOnFirstName("kartik");
		p.$clickOnLastName("raut");
		p.$clickOnMobile("454578874"); // how to set a limit for ph no---------------
		p.$clickOnConPass("gjhgjhg4545");
		p.$clickOnDay("20");
		p.$clickOnMonth("May");
		p.$clickOnYear("1999");
		p.$clickOnFemale();
		p.$clickOnMale();
		p.$clickOnCustom();
		p.$clickOnSignup();
	
	
	}
	
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		TestCase_LoginPage s = new TestCase_LoginPage();
	//	s.loginWithValidCrdentials();
	//	s.clickOnCreatePage();
	//	s.clickOnForgot();
	//	s.clickOnSignUp();
//		s.loginWithEmail();
		s.SignUpPageFill();
	}
}
