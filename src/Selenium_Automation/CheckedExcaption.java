package Selenium_Automation;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CheckedExcaption {

	public static void main(String[] args) throws IOException { // checked exception becuase we alredy know that filehandler will throw IOexception.
		
		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");
		
		TakesScreenshot b = ((TakesScreenshot)driver); //yella unno nenite chala manci unaa
		
		
		File a = b.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("D:\\Velocity Testing\\Subodh Patil\\Selenium\\ScreenShots\\22.png");

		FileHandler.copy(a, destination);
		
	}

}


