package CoreJava;

import java.util.Scanner;

public class Scanner_Class {
	public static void kartik() {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter Your PIN");
		int a = ob.nextInt();
		if (a == 1234) {
			System.out.println("Pin verified");
		} else {
			System.out.println("Entered Pin Is Wrong");
		}

	}

	public static void test() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("pls enter your name :-");
		String name = scan.nextLine(); // read value from console
		System.out.println("Welcome"+name);
		System.out.println("pls insert your card ");
		System.out.println("Enter your pin");
		int pin = scan.nextInt();
		
		if(pin==1234) {
		
		System.out.println("Your Pin verified");
		System.out.println("Enter Withdraw Ammount");
		int amt = scan.nextInt();
		System.out.println("pls collect your cash"+amt);
		
		}
		else
		{
			System.out.println("Entere Pin Is Wrong");
		}
	}
	public static void main(String[] args) {

	//	Scanner_Class.kartik();
		Scanner_Class.test();
	}

}
