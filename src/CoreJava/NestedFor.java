package CoreJava;

public class NestedFor {

	public static void method1() {

		for (int j = 1; j <= 4; j++) { // 1,2,3,4,5
			for (int i = 1; i <= 5; i++) {// 1,2,3,4,5,6
				System.out.print(j);// 11111

			}
			System.out.println();

		}

	}

	public static void method2() {
		for (int j = 1; j <= 4; j++) { // 1,2,3,4,5
			for (int i = 1; i <= 5; i++) {// 1,2,3,4,5,6
				System.out.print(i);// 12345
			}
			System.out.println();

		}

	}

	public static void main(String[] args) {

		NestedFor.method1();
		NestedFor.method2();

	}

}
