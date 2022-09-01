package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POMFaceBooklogin {
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
	private WebElement newacc;
	@FindBy(xpath = "//a[text()='Create a Page']")
	private WebElement cp;
	// sign up page elements.
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement first;
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement last;
	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement mobile;
	@FindBy(xpath = "//input[@name='reg_passwd__']")
	private WebElement regpass;
	@FindBy(xpath = "//select[@id='day']")
	private WebElement day;
	@FindBy(xpath = "//select[@id='month']")
	private WebElement month;
	@FindBy(xpath = "//select[@id='year']")
	private WebElement year;
	@FindBy(xpath = "(//input[@name='sex'])[1]")
	private WebElement female;
	@FindBy(xpath = "(//input[@name='sex'])[2]")
	private WebElement male;
	@FindBy(xpath = "(//input[@name='sex'])[3]")
	private WebElement custom;
	@FindBy(xpath = "//select[@name='preferred_pronoun']")
	private WebElement pronoun;
	@FindBy(xpath = "//input[@name='custom_gender']")
	private WebElement custop;
	@FindBy(xpath = "(//button[text()='Sign Up'])[1]")
	private WebElement signup;

	public POMFaceBooklogin(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void EnterEmail(String mail) throws InterruptedException {
		Thread.sleep(2000);
		email.sendKeys(mail);
	}

	public void EnterPass(String pas) throws InterruptedException {
		Thread.sleep(2000);
		pass.sendKeys(pas);
	}

	public void clickOnLogin() throws InterruptedException {
		Thread.sleep(2000);
		login.click();
		Thread.sleep(2000);

	}

	public void clickOnForgot() throws InterruptedException {
		Thread.sleep(2000);
		forgot.click();

	}

	public void clickOnNewAcc() throws InterruptedException {
		newacc.click();
		Thread.sleep(9000);
	}

	public void clickOnCreatePage() throws InterruptedException {
		Thread.sleep(2000);

		cp.click();
	}

	public void $clickOnFirstName(String Name) throws InterruptedException {
		Thread.sleep(2000);

		first.sendKeys(Name);
	}

	public void $clickOnLastName(String LastName) throws InterruptedException {
		Thread.sleep(2000);

		last.sendKeys(LastName);
	}

	public void $clickOnMobile(String Phno) throws InterruptedException {
		Thread.sleep(2000);

		mobile.sendKeys(Phno);
	}

	public void $clickOnConPass(String Conpass) throws InterruptedException {
		Thread.sleep(2000);

		regpass.sendKeys(Conpass);
	}

	public void $clickOnDay(String dayy) throws InterruptedException {
		// Thread.sleep(9000);------required only when operforming action with single
		// element becoz UI takes much time to load.
		Thread.sleep(2000);// -- this inof for whole operation.
		// day.sendKeys("5"); // --------- 1st way

		Select a = new Select(day); // -------- 2nd way.
		a.selectByValue(dayy);

	}

	public void $clickOnMonth(String monthh) throws InterruptedException {
		Thread.sleep(2000);
		// month.sendKeys("5"); // --------- 1st way

		Select a = new Select(month); // -------- 2nd way.
		a.selectByVisibleText(monthh);

	}

	public void $clickOnYear(String yearr) throws InterruptedException {
		Thread.sleep(2000);
		year.sendKeys(yearr); // --------- 1st way

		// Select a = new Select(year); //-------- 2nd way.
		// a.selectByVisibleText("May");
	}

	public void $clickOnFemale() throws InterruptedException {
		// Thread.sleep(9000);------required only when operforming action with single
		// element becoz UI takes much time to load.
		Thread.sleep(2000);// -- this inof for whole operation.

		female.click();
	}

	public void $clickOnMale() throws InterruptedException {
		Thread.sleep(2000);

		male.click();

	}

	public void $clickOnCustom() throws InterruptedException {
		Thread.sleep(2000);

		custom.click();
		Thread.sleep(2000);
		pronoun.click();
		Thread.sleep(2000);
		pronoun.sendKeys("She: Wish her a happy birthday!");

		Thread.sleep(2000);
		pronoun.sendKeys("He: Wish him a happy birthday!");

		Thread.sleep(2000);
		pronoun.sendKeys("They: Wish them a happy birthday!");

		Thread.sleep(2000);
		custop.sendKeys("xyz");
	}

	public void $clickOnSignup() {

		signup.click();
	}

}
