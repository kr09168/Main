package Selenium_Automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class Browser_Size_Position {
	
	public static void size() {
	WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");
	
	Dimension d = new Dimension(200,300);
	driver.manage().window().setSize(d);
	}
	
	public static void position() {
		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");
		
		Point p = new Point(200,300);
		driver.manage().window().setPosition(p);
		}
	public static void main (String [] args) {	
		
		Browser_Size_Position.size();
		Browser_Size_Position.position();
}
}
