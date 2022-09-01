package FrameworkTestNg;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

//Berfore test & Berfore class,After test & After class executed at once with start and end.
//Berfore method & After method is executed for each @test.
public class Annotations {
	@Test
	@Parameters({"a"})
	public void test1(int a) { // if you try to run here then parameter will not work you have to run program from xml only.

		System.out.println("test 1 is executed"+a);

	}
	
	@Test
	public void test2() {

		System.out.println("test 2 is executed");

	}

	@Test
	public void test3() {

		System.out.println("test 3 is executed");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Berfore class is executed");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class is executed");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Berfore method is executed");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After method is executed");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Berfore test is executed");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After test is executed");
	}

}
