package Selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");

		// There are 8 locators in By class.

		//WebElement a = driver.findElement(By.id("email"));// locating element by id.
		//a.sendKeys("kartik@gmail.com");
	//	WebElement c =driver.findElement(By.name("pass"));// locating element by attribute name with passing a value of it.
	//	c.sendKeys("pass");
	//	Thread.sleep(3000);
	//	c.clear(); // use to clear filed data.
	///	WebElement b = driver.findElement(By.tagName("button"));// using tagname.
	//	b.click();
	//	WebElement d =driver.findElement(By.className("_55r1 _1kbt"));
	//	d.sendKeys("passgy"); // class name draw back is duplicate values.
	//WebElement d =driver.findElement(By.className("_97w4"));
	//	d.click(); // class name draw back is duplicate values.we can only perform the operation on links using its class value.
		
		
	//WebElement e =driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));// css cannot find with the and cannot make locator
		// unique if we have multiple matching. 
		//ccs find with attribute name and its value with syntax as tagname[attribute name='value'].
		//e.click();
		//WebElement f = driver.findElement(By.linkText("Create a Page")); // only fetch or returns hyperlink text.Not an simple text.
		//String text = f.getText(); 
		//System.out.println(text);
		//f.click();
		//WebElement g = driver.findElement(By.partialLinkText("Facebook P"));// it also fetch partial hperlinks only if we have same link with same intial letters then it by default takes priority one.e.g.We have Facebook Lite & Facebook Pay so we pass only facebook then it print who come first on webpage.
		//String text1 = g.getText(); 
		//System.out.println(text1);
		//g.click();
		// driver.findElement(By.xpath("")); will see in xpath class.

	
	
		}

}
