package CoreJava;

public class Casting {

	public static void main(String[] args) {
		byte b = 10;
		
		double d = b; // Implicit casting
		
		System.out.println(d);
		
		double e = 30.35;
		
		int i = (int)e; //Explicit casting
		
		System.out.println(i);
		
	}

}
