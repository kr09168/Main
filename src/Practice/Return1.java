package Practice;

public class Return1 {
	
	public static void method() {
		
	System.out.println("I am method 1");

	}

	public static int method1() {
		
		System.out.println("hhhhh");
		
		return 10;
	}
	
	public static float method2() {
		
		
		
		return 0;
	}
	
	public static String method3() {
		
		
		
		return null;
	}
	public static double method4() {
		
		
		
		return 0;
	}
	
	public static char method5() {
		
		
		
		return 0;
	}
	
	public static Interface1 method7() {
		
		Interface1 ob = new InterfaceChild();
		ob.demo();
		ob.demo2();
		
		return null;
	}
	

	public static Return1 method6() {
		Return1.method1();
		Return1.method2();
		Return1.method3();
		Return1.method4();
		Return1.method5();
		
		
		return null;
	}

	
	public static void main(String[] args) {
	
		Return1.method7();
		
	
	}
}



