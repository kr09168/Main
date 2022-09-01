package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class child {

	public static void main(String[] args) {

		WebDriver driver = OpenBrowser.open("https://vctcpune.com/#");
		
		WebElement practise = driver.findElement(By.xpath("//a[@target='_blank'][1]"));
		practise.click();

		WebElement home = driver.findElement(By.xpath("//a[@href='https://vctcpune.com/']"));
		home.click();

		WebElement practise1 = driver.findElement(By.xpath("//a[@target='_blank'][1]"));
		practise1.click();

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> i = handles.iterator();

		while (i.hasNext()) {
			String handle = i.next(); // next(); fetch one value.
			driver.switchTo().window(handle);
			String CurrentTitle = driver.getTitle();

			if (CurrentTitle.equals("Velocity | Best software testing centre in Pune and Mumbai")) {

				WebElement link1 = driver.findElement(By.xpath("(//a[text()='Courses'])[1]"));
				link1.click();

			}
		}

	}

}
