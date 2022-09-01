package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;  

public class OpenBrowser {  
public static WebDriver open(String url) {  

	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
    WebDriver driver = new ChromeDriver(); // upcasting.
    driver.get(url);
    driver.manage().window().maximize();
    return driver;
}  	
}  