package Selenium_Automation;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import FrameworkTestNg.TestFaceBookLogin;
import FrameworkTestNg.WebDriverStaticVariable;

public class UD_Screenshot {
	
	WebDriver driver;// we can use non static global variable to becuase argumets are going in same class.

	public static TakesScreenshot ss(String url,String name) throws IOException {
		
		WebDriver driver = UD_Open_Browser.openBrowser(url);
		
		String  date = UD_Screenshot.dt();
		
		TakesScreenshot b =((TakesScreenshot)driver);
		
		File a = b.getScreenshotAs(OutputType.FILE);	
		
		File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\Main\\Screenshots\\"+name+""+date+".jpg");
		
		FileHandler.copy(a, destination); 
	
		return b;

	}	
	
	public static String dt() {
	
		SimpleDateFormat formatter = new SimpleDateFormat("dd-yyyy HH-mm"); 
		Date a = new Date();
		System.out.println(formatter.format(a));
		String b = formatter.format(a);
		return b;	
	}


}

