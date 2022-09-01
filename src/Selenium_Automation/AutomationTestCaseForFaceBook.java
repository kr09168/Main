package Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationTestCaseForFaceBook {
// we this is harcoded way to write test cases so insted of this we use POM page object model to write test case .
// x path works dynamically it means we don't have to chane it in each method if we change in one class it will reflect for all methods that 
//big advantage of POM.
	
	// We have seprate package for POM pls checkout this same code from there.
	
	public static void loginWithValidCrdentials() {

		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("kartik@gmail.com");

		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("1233");
		
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();

	}

	public static void loginWithEmail() {
		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("kartik@gmail.com");

		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();

	}

	public static void clickOnForgot() {
		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");

		WebElement forgot = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		forgot.click();

	}

	public static void clickOnSignUp() {
		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");

		WebElement signup = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		signup.click();

	}

	public static void clickOnCreatePage() {
		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");

		WebElement cp = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		cp.click();

	}

	public static void main(String[] args) {

		AutomationTestCaseForFaceBook.clickOnCreatePage();
		AutomationTestCaseForFaceBook.clickOnForgot();
		AutomationTestCaseForFaceBook.clickOnSignUp();
		AutomationTestCaseForFaceBook.loginWithEmail();
		AutomationTestCaseForFaceBook.loginWithValidCrdentials();

	}

}
