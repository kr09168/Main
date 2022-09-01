package HomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMFaceBook {
// if we use static methos and varriables then counstructor cant get called hence it throws nullpointerexception.
//	Exception in thread "main" java.lang.NullPointerException
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
 	@FindBy(xpath = "//input[@id='pass']")
	private WebElement pass;
	@FindBy(xpath = "//button[@name='login']")
	private WebElement login;
	@FindBy(xpath = "//a[text()='Forgotten password?']")
	private WebElement forgot;
	@FindBy(xpath = "//a[@data-testid='open-registration-form-button']")
	private WebElement signup;
	@FindBy(xpath = "//a[text()='Create a Page']")
	private WebElement cp;

	public POMFaceBook(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void EnterEmail(String mail) {
		email.sendKeys(mail);
	}
	public void EnterPass(String pas) {
		pass.sendKeys(pas);
	}
	public void clickOnLogin() {
		login.click();
	}
	public void clickOnForgot() {
		forgot.click();
	}
	public void clickOnSignUp() {
		signup.click();
	}
	public void clickOnCreatePage() {
		cp.click();
	}
}
