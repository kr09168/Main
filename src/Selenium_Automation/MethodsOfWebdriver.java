package Selenium_Automation;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MethodsOfWebdriver {

	// windowhandle & windowhandles is also there.
	// findElement & findElements is also there.

	public static void findElement() throws InterruptedException {

		WebDriver driver = UD_Open_Browser.openBrowser("https://www.facebook.com/");

		WebElement a = driver.findElement(By.xpath("//input[@type='text']")); // by attribute.can use index.
		a.sendKeys("kartik");

	}

	public static void findElements() throws InterruptedException {

		WebDriver driver = UD_Open_Browser.openBrowser("https://www.globalsqa.com/demo-site/draganddrop/");

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame); // find by webelement.

		List<WebElement> source = driver.findElements(
				By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
		int s = source.size();// to get size of list
		// System.out.println(s);

		WebElement target = driver.findElement(By.xpath("//div[@id='trash']"));
		Actions ob = new Actions(driver);

		for (int i = 0; i < s; i++) {// 0,1,2,3,4

			WebElement image = source.get(i);// get method is use to get the value of list.
			ob.dragAndDrop(image, target);
			ob.perform();
			Thread.sleep(2000);

		}

		List<WebElement> so = driver.findElements(
				By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
		int d = so.size();

		for (int j = 0; d > j; j--) {
			WebElement ss = driver.findElement(By.xpath("//a[@class='ui-icon ui-icon-refresh']"));
			ss.click();
			Thread.sleep(2000);
		}

	}

	public static void windowhandle() {
		WebDriver d = UD_Open_Browser.openBrowser("https://chercher.tech/practice/popups");

		WebElement c = d.findElement(By.xpath("//input[@value='Open New Window']"));
		c.click();
		String a = d.getWindowHandle();
		System.out.println(a);

	}

	public static void windowhandles() {
		WebDriver d = UD_Open_Browser.openBrowser("https://chercher.tech/practice/popups");

		WebElement m = d.findElement(By.xpath("//input[@value='Open Multiple Windows']"));
		m.click();
		Set<String> h = d.getWindowHandles();// Set<String> is a collection uniqueness is it will store unique value
												// only e.g In String Array We can store multiple duplicate values
												// String [] a = {"kartik","kartik"}
		Iterator<String> mb = h.iterator(); // with iterator we can find out child class address.
		String dj = mb.next();
		System.out.println(dj);
		String djj = mb.next();
		System.out.println(djj);

//		System.out.print(h);

	}

	public static void allMethods() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");// key :-"webdriver.chrome.driver" Value
		// :-"D:\\chromedriver.exe".

		WebDriver driver = new ChromeDriver();// (upcasting) responsible to open the browser.

		Thread.sleep(5000);
		driver.manage().window().maximize();
		Options op = driver.manage(); // returns option interface.
		Window w = op.window();// window is method of option interface which return window interface.
		w.maximize();// maximize is the method of window interface which returns void.
		/*
		 * Explanation of methods. Options op = driver.manage(); //returns option
		 * interface. Window w = op.window();//window is method of option interface
		 * which return window interface. w.maximize();//maximize is the method of
		 * window interface which returns void.
		 */
		Thread.sleep(5000);
		// fetch title of webpage.
		String tilte = driver.getTitle();
		System.out.println(tilte);
		Thread.sleep(5000);
		// fetch url of current webpage.
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);
		// open url
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		// get back from webpage
		driver.navigate().back();
		Thread.sleep(5000);
		// get forward to webpage
		driver.navigate().forward();
		Thread.sleep(5000);
		// refresh the webpage
		driver.navigate().refresh();
	}

	public static void main(String[] args) throws InterruptedException {

		// MethodsOfWebdriver.windowhandle();
		// MethodsOfWebdriver.windowhandles();
		// MethodsOfWebdriver.allMethods();
	//	MethodsOfWebdriver.findElement();
		//MethodsOfWebdriver.findElements();
	}

}
