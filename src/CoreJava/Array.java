package CoreJava;

public class Array {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30 };

		String[] b = { "kartik", "raut" };

		int[] c;
		System.out.println(a[0]);
		System.out.println(b[1]);

		int len = a.length; // length is keyword not method.
		System.out.println(len);

		c = new int[] { 50, 60, 70 };

		int[] d = new int[10];// declearing fixed size array.
		d[0] = 10;// inserting value in an array.
		d[1] = 20;

	}

}
