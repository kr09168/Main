package Practice;

public class Star {

	public static void main(String[] args) {

		for (int d = 1; d <= 5; d++) // 1
		{
			for (int b = 5; b >= d; b--) {
				System.out.print("1");
			}

			for (int c = 1; c <= d; c++)

			{
				System.out.print("*");

			}
			System.out.println();

		}
	}
}