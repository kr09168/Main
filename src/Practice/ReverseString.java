package Practice;

public class ReverseString {

	public static void main(String[] args) {
	String a = "Kartik";
	int len = a.length();
		
		for(int i = len-1;i>=0;i--) {
			
			System.out.print(a.charAt(i));
		}
		
	}

}
