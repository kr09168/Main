package CoreJava;
// child class of classA
public class ClassB extends ClassA{//inheritance.
	
	public void method() {
		System.out.println("i am non static class b");
	}
	
	public static void method1() {
		System.out.println("i am static method of Class B"); // method hiding static have seprate memory so cant override.
	}
	
	public void method2() {
		super.method(); // used to call parent class methods.
		this.method2(); // used to call current class methods.
	}
	
	
	
	
	public static void main(String[] args) {
		ClassB obj = new ClassB();
		obj.method();
		ClassB.method1();
		
	}

}
