package FrameworkTestNg;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Selenium_Automation.UD_Screenshot;
import Selenium_Automation.UD_Screenshot_Testng;

public class Listeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test Started" + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed" + result.getName());

	}

	public void onTestFailure(ITestResult result) {
		//System.out.println("Test Failed" + result.getName());
		try {
			UD_Screenshot_Testng.ssTestNG(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped" + result.getName());

	}

}
