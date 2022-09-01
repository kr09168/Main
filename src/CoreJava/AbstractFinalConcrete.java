package CoreJava;

public class AbstractFinalConcrete extends AbstractFinal {
//	public final void test() { // cannot override final methods.
	//	System.out.println("i am final method");
//	}

	public static void main(String[] args) {
		AbstractFinalConcrete obj = new AbstractFinalConcrete();
		System.out.println(obj.a = 60);
	//	System.out.println(obj.b = 50);// cannot change value of final variable.

	}

}
