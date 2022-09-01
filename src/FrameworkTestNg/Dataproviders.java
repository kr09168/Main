package FrameworkTestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviders {
	@DataProvider(name = "DataForTest")
	public Object[][] data() {
		return new Object[][] { { 1, "kartik" }, { 2, "raut" }, { 3, "Kartikey" } }; // Test will run three times.
	}

	@Test(dataProvider = "DataForTest")
	public void dp(int a, String b) {

		System.out.println(a + b);

	}

}
