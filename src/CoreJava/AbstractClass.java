package CoreJava;

public abstract class AbstractClass { // Abstract decleared with abstract keyword

	public void test() {

		System.out.println("complete method");
	}

	public abstract void test1(); // incomplete method is always create with abstract keyword.

	// public static abstract void test2(); :- static method cannot be abstract or
	// incomplete.

	public static void main(String[] args) {
		//AbstractClass obj = new AbstractClass();// cannont create object of abstract class because it dosent have
												// counsructor.

	}

}
