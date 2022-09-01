package Selenium_Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MethodsOfAlertPopUp {
	
	// alert popup

	
	public static void Accsept() throws InterruptedException {
	
		WebDriver Dr = UD_Open_Browser.openBrowser("https://chercher.tech/practice/popups");
		WebElement a =Dr.findElement(By.xpath("//input[@type='button']"));
		a.click();	
		
		Alert b = Dr.switchTo().alert();
		Thread.sleep(5000);
		b.accept();
		}
	
	public static void Dismiss() throws InterruptedException {
	
		WebDriver Dr = UD_Open_Browser.openBrowser("https://chercher.tech/practice/popups");		
		WebElement a =Dr.findElement(By.xpath("//input[@type='button'][2]"));
		a.click();
		
		Alert b = Dr.switchTo().alert();
		Thread.sleep(5000);
		b.dismiss();
		Thread.sleep(5000);
		Dr.close();
	}
	

		
	public static void gettext() throws InterruptedException {
	
		WebDriver Dr = UD_Open_Browser.openBrowser("https://chercher.tech/practice/popups");
		WebElement a =Dr.findElement(By.xpath("//input[@type='button']"));
		a.click();
		
		Alert b = Dr.switchTo().alert();
		Thread.sleep(5000);
		String d = b.getText();
		System.out.println(d);
		Dr.close();
		}
	
	public static void sendkeys() throws InterruptedException {
	
		WebDriver dr = UD_Open_Browser.openBrowser("https://chercher.tech/practice/popups");
		WebElement a =dr.findElement(By.xpath("//input[@onclick='promptbox();']"));
		a.click();
		Alert b = dr.switchTo().alert();
		Thread.sleep(5000);
		b.sendKeys("kartik");
		Thread.sleep(5000);
		b.accept();
		} /// value goes but dont shows.
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		//MethodsOfAlertPopUp.Accsept();
		//MethodsOfAlertPopUp.Dismiss();
		//MethodsOfAlertPopUp.gettext();
		MethodsOfAlertPopUp.sendkeys();
		
		
		
		
	}

}
