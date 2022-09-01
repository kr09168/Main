package CoreJava;

public class Reverse_String {

	public static void main(String[] args) {
		String s = "kartik";
		int len = s.length();

		for (int i = len - 1; i >= 0; i--) {

			System.out.print(s.charAt(i));

		}

	}

}
