package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1 {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver = OpenBrowser.open("https://vctcpune.com/selenium/practice.html");
		TakesScreenshot tk = (TakesScreenshot)(driver);
		
		File dj = tk.getScreenshotAs(OutputType.FILE);
		
		File ss = new File("C:\\screenshot\\kartik.jpg");
		
		FileHandler.copy(dj, ss);
		
	}

}
