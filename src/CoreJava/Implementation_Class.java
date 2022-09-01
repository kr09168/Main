package CoreJava;

public class Implementation_Class implements Interface_  {



	public void test() {
	
		System.out.println("i am method of Interface_ interface and completed in implementation class");
		
	}

	
	
	
	public static void main(String[] args) {
		Implementation_Class obj = new Implementation_Class();
		obj.test();
		//obj.test1();// cant acsess static method of interface in implementation class.
	}

}
