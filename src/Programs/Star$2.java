package Programs;

public class Star$2 {
	
	public static void method() {
		for(int a= 1;a<=5;a++) {
			
			for(int b = 5;b>=a;b--) {
				System.out.print(" ");
			}
			for(int c=1;c<=a;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Star$2.method();
	}

}
