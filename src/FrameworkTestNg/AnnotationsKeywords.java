package FrameworkTestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsKeywords {

	@Test(priority = 3,timeOut = 3000)
	public void test1() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("test 1 is executed");

	}

	@Test(priority = 1,timeOut = 2000)
	public void test2() {

		System.out.println("test 2 is executed");

	}
	@Test(priority = 2,enabled = false)
	
	public void test3() {

		System.out.println("test 3 is executed");

	}
	
@Test(dependsOnMethods = {"test2"})
	
	public void test4() {

		System.out.println("test 4 is executed");

	}
@BeforeMethod

public void beforeMethod() {

	System.out.println("beforeMethod is executed");

}
@AfterMethod

public void afterMethod() {

	System.out.println("afterMethod is executed");

}
	
	
	
	
}
