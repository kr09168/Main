package Selenium_Automation;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookWithParameterization {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
			
		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");
		
		String a = UD_Parameterization.getData("Sheet1", 0, 0);
		String b = UD_Parameterization.getData("Sheet1", 1, 0);

		
		
		WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys(a);
		
		WebElement pass =driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys(b);
		
		
	}

}
