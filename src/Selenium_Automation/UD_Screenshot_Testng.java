package Selenium_Automation;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import FrameworkTestNg.WebDriverStaticVariable;

public class UD_Screenshot_Testng extends WebDriverStaticVariable { // we create the special class for defining static
																	// WebDriver variable. thats why we extends this
																	// class with that special class purpose is if we
																	// use this class method in another class then the
																	// value of webdriver variable is not intialize
																	// thats why method will not work,so for that we
																	// extends another class too with our created special
																	// class to intialize value then this value pass to
																	// this class varibale and method get run in another class.
																	//As we know static variable wont destroy their memory untill execution gets finished. 
	public static TakesScreenshot ssTestNG(String name) throws IOException {

		String date = UD_Screenshot.dt();

		TakesScreenshot b = ((TakesScreenshot) driver);

		File source = b.getScreenshotAs(OutputType.FILE);

		File destination = new File("C:\\Users\\Admin\\eclipse-workspace\\Main\\Screenshots\\" + name + ""+date+".jpg");

		FileHandler.copy(source, destination);

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
