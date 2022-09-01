package CoreJava;

public class ConcreteClass extends AbstractClass {
	public  void test1() {
		System.out.println("Abstract method is completed.");
	}
	public static void main(String[] args) {
		ConcreteClass obj = new ConcreteClass();
		obj.test();
		obj.test1();
 // It is a concreate class because it has completed abstract class.
	}

}
