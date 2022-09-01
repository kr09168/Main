package Practice;

public class ClassB extends ClassA {
	
	public void method5() {
		System.out.println("Mthod 5 From Class B");
	}
	public void method1() {
		System.out.println("zzzzzzzzzzzzz");
	}
	public void Ashwini() {
		super.method1();/// to call super class method.
		this.method1();/// to call current class method.
		
	}

	public static void main(String[] args) {
		ClassB obj = new ClassB();
		obj.method1();
		//obj.method2(); - private
		//obj.method3();
		//obj.method4();
		obj.Ashwini();
		
	}

}
