package CoreJava;

public class CastingB extends CastingA { // child class

	public void test() {
		System.out.println("Method of CastingB");
	}
	public void test2() {						// WE CAN ONLY UPCAST METHODS OF PARENT CLASS.
		System.out.println("Method of CastingB");
	}
	
	
	public static void main(String[] args) {
	
		CastingA obj = new CastingB();// upcasting.
		obj.test();
		
		
	}

}

