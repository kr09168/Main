package CoreJava;

public class Reverse_Array {

	public static void main(String[] args) {

		String s[] = { "kartik", "raut", "good", "guy" };

		int arraylen = s.length; // 4.

		for (int j = 0; j < arraylen; j++) {

			String value = s[j];

			int len = value.length();

			for (int i = len - 1; i >= 0; i--) {

				System.out.print(value.charAt(i));
			}

			System.out.println(arraylen);
		}
	}

}
