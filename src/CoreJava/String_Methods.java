package CoreJava;

public class String_Methods {
		
	public static void main(String[] args) {

		
		String a = "kartik";// literal way
		String c = "kartik";
		// PRE DEFINED METHODS OF STRINGS.
		
		char b = a.charAt(1);
		System.out.println(b);

		int l = a.length();
		System.out.println(l);
		
		boolean d = a.contains("kar");
		System.out.println(d);
		
		boolean e = a.equals(c);
		System.out.println(e);
		
		boolean i = a.equalsIgnoreCase(c);
		System.out.println(i);
		
		String u = a.toUpperCase();
		System.out.println(u);
		
		String lower = a.toLowerCase();
		System.out.println(lower);
		
		System.out.println(a); // string is immutable.
		
		String con = a.concat("raut");
		System.out.println(con);
		
		String sub = a.substring(1);
		System.out.println(sub);
		
		String sub2 = a.substring(1,2);
		System.out.println(sub2);
		

	}

}
