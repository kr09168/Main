package CoreJava;

public class NestedForStars {
/*
*
**
***
****
*****
*/
	
	public static void method1() {
	for (int j = 1; j <= 5; j++) // 1,2,3,4
	{
		for (int i = 1; i <= j; i++) {// 1,2,3,4.
			System.out.print("*");

		}
		System.out.println();

	}
	}
	/*
	 
*****
****
***
**
*
	 */
	public static void method2() {
	for (int j = 5; j >= 1; j--) // 5,4,3,2,1
	{
		for (int i = 1; i <= j; i++) {// 1,2,3,4.
			System.out.print("*");

		}
		System.out.println();

	}

	}
	
	
	
	public static void main(String[] args) {

		NestedForStars.method1();
		NestedForStars.method2();
		
		
	}

}
