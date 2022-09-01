package CoreJava;

public class Variables {
	int z = 10; // global or instance variable.
	static int y = 10;
	public static void main(String[] args) {
		int a ; // variable a decleration.// local variable
		a = 20; // initialization.
		
		int b = 30;// variable b decleration & initialization.
		
		int c = 40, d = 20, e = 30; //multiple declarations and intializations at same time.

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}

}

// note :- global variable can be accsesed throughout the class and outside the class
// non static method can only call in non satic methods.
//static variables can directly call inside static and non static method.
