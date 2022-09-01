package Practice;

public class ClassC extends ClassA{

	public void method6() {
		System.out.println("Method 6 from class c");
	}
	
	
	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.method1();
		//obj.method5();
		obj.method1();
	}

}
