package Practice;

public class String_Class2 {
	
	public static void main(String[] args) {
		
		String a = "Kartik";	
		String b = "Kartiki";
		
		char c = a.charAt(2);
		//System.out.println(c);
		
		int length = a.length(); 
		//System.out.print(length);
		
		boolean result = a.contains(""); // checks the equality and verify same string is present or not.
		//System.out.println(result);
		
		 boolean r =a.equals(b); 
		// System.out.println(r);
		 
		 
		 boolean i = a.equalsIgnoreCase(b); 
		 System.out.println(i);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		    String upper =a.toUpperCase();
		String lower =a.toLowerCase();
		   String con = a.concat("katraj"); 
		
		
	}

}
