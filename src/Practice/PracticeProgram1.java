	package Practice;
	
	import java.util.Iterator;
	import java.util.Set;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	
	public class PracticeProgram1 {
	
		public static void main(String[] args) {
	
			WebDriver driver = OpenBrowser.open("https://vctcpune.com/");
	
			WebElement pradip = driver.findElement(By.xpath("//a[@rel='noopener noreferrer']"));
			pradip.click();
	
			Set<String> shubham = driver.getWindowHandles();
			Iterator<String> kartik = shubham.iterator();
	
			while (kartik.hasNext()) {
				String shruti = kartik.next();
				driver.switchTo().window(shruti);
				String saurabh = driver.getTitle();
	
				if (saurabh.contentEquals("Practice Page")) {
	
					WebElement h = driver.findElement(By.xpath("//input[@value='Radio2']"));
					h.click();
				} else {
					System.out.println("child browser not found");
				}
	
			}
	
		}
	
	}
