package HomeWork;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import Selenium_Automation.UD_Parameterization;

import Selenium_Automation.UD_Open_Browser;


public class TestCase_LoginPage {
	// we use non static methods because of continous memory allocations . we dont create static methods.

	public static void loginWithValidCrdentials() throws EncryptedDocumentException, IOException {
		String a = UD_Parameterization.getData("Sheet1", 0, 0);
		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");
		POMFaceBook POMFaceBook = new POMFaceBook(driver);
		POMFaceBook.EnterEmail(a);
		POMFaceBook.EnterPass("123");
		POMFaceBook.clickOnLogin();

	}
	public static void loginWithEmail() {
		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");
		POMFaceBook POMFaceBook = new POMFaceBook(driver);
		POMFaceBook.EnterEmail("kartik@gmail.com");
		POMFaceBook.clickOnLogin();

	}
	public static void clickOnForgot() {
		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");
		POMFaceBook POMFaceBook = new POMFaceBook(driver);
		POMFaceBook.clickOnForgot();
	}
	public static void clickOnSignUp(){
		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");
		POMFaceBook POMFaceBook = new POMFaceBook(driver);
		POMFaceBook.clickOnSignUp();
	}
	
	public void clickOnCreatePage() {
		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");
		POMFaceBook POMFaceBook = new POMFaceBook(driver);
		POMFaceBook.clickOnCreatePage();
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//	TestCase_LoginPage s = new TestCase_LoginPage();
	//	s.loginWithValidCrdentials();
	//	s.clickOnCreatePage();
	//	s.clickOnForgot();
	//	s.clickOnSignUp();
	//	s.loginWithEmail();
	//	TestCase_LoginPage.clickOnForgot();
	//	TestCase_LoginPage.loginWithValidCrdentials();
		TestCase_LoginPage.clickOnSignUp();
	}
}
