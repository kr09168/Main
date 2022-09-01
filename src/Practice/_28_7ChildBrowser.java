package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _28_7ChildBrowser {

	public static void method() {
		
		WebDriver driver = OpenBrowser.open("https://chercher.tech/practice/popups");
		
		WebElement add = driver.findElement(By.xpath("//input[@value='Open Multiple Windows']"));
		add.click();
	
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> i = handles.iterator();
		
		while(i.hasNext()) {
			
			String handle = i.next();
			driver.switchTo().window(handle);
			String currenturl = driver.getTitle();
			
			if(currenturl.contentEquals("Bing")) {
				
				String a = driver.getCurrentUrl();
				driver.get(a);
				
			}
			else {
				
				System.out.println("not find address of child url");
			}
			
			
			
			
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		_28_7ChildBrowser.method();
		
		

	}

}
