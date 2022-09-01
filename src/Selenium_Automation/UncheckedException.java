package Selenium_Automation;

public class UncheckedException {

	public static void method1() {

		int a = 10;
		int b = 20;
		System.out.println(a * b);
		
		try { // We handled unchecked exception through try and catch. 
			
			System.out.println(a / 0);

		} catch (Exception e) {

			System.out.println("Input Is Wrong");

		}
		System.out.println("Thanku So Much");

	}

	public static void main(String[] args) {
		UncheckedException.method1();

	}

}
