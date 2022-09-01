package CoreJava;

public class Conditional_Statement {
	static int a = 30;
	static int b = 30;
	static int c = 40;

	// if
	public static void ifMethod() {
		if (a == b) {

			System.out.println("A And B is equal");
		}
	}

	// if AND else
	public static void ifelseMethod() {
		if (a >= c) {

			if (a >= c) {

				System.out.println("A is greater than equal to c");

			} else {
				System.out.println("C is greater");
			}
		} else {
			System.out.println("Nothing");
		}
	}

	// ladder if
	public static void ladderIfMethod() {
		if (a >= c) {

			System.out.println("A is greater than equal to C.");

		} else if (a >= b) {
			System.out.println("A is greater than equal to B.");
		} else if (b >= c) {
			System.out.println("B is greater than equal to C.");
		} else {

			System.out.println("C is greater");

		}

	}
 // nested if
	public static void Complex1() {
		int veriety = 20;
		int discount = 30;
		boolean noCostEmi = false;

		if (veriety >= 20)// true
		{
			if (discount >= 30)// true
			{
				if (noCostEmi == true)// false
				{

					System.out.println("I will buy here");
				} else {

					System.out.println("No copy EMI Not available");
				}
			} else {
				System.out.println("Discount is less");
			}
		} else {
			System.out.println("Varitey are less");
		}
	}

	public static void Complex2() {
		int a = 60;
		int b = 60;
		int c = 50;

		if (a == b && b == c)// false
		{
			System.out.println("All no are equal");
		} else if (a == b)// false
		{
			System.out.println("a and b are equal");
			if (b > c)// false
			{
				System.out.println("a and b is greater");
			} else {
				System.out.println("c is greater");
			}

		} else if (a > b)// false
		{
			if (a == c) {
				System.out.println("a and c are equal and greater");
			} else if (a > c)// false

			{
				System.out.println("a is greater");
			} else {
				System.out.println("a is greater");
			}

		}

	}

	public static void main(String[] args) {
		Conditional_Statement.ifMethod();
		Conditional_Statement.ifelseMethod();
		Conditional_Statement.ladderIfMethod();
		Conditional_Statement.Complex1();
		Conditional_Statement.Complex2();
	}

}
