package Selenium_Automation;

public class Finally {
	
	public static void method1() {

		int a = 10;
		int b = 20;
		System.out.println(a * b);
		
		 // We handled unchecked exception through try and catch. 
			try {
			System.out.println(a / 0);
			}
			
			finally {

			System.out.println("Input Is Wrong"); //#. Finally use with try block
												//#.It cant catch the exception or handle the exception 
												//#.it just execute the block of code which comes under finally block & throw the exception 
												//#.Because of exception further code get stopped
		}
		System.out.println("Thanku So Much");
		
	}

	public static void main(String[] args) {
		
		Finally.method1();

	}

}
