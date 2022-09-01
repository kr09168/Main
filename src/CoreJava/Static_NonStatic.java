package CoreJava;

public class Static_NonStatic {

	int a = 10;// not static global variable.
	static int b = 20; // static variable.
	
	public void test() { // non static method
		
		System.out.println("Non static method");
		
	}
	
	public static void test1() { // static method
		
		System.out.println("static method");
		
	}
	
	public static void main(String[] args) {
	
		Static_NonStatic.test1();
		System.out.println(Static_NonStatic.b);
		
		Static_NonStatic obj = new Static_NonStatic();
		obj.test();
		System.out.println(obj.a);
		
		//note static method can also call with object but its not good practice.
	}

}
