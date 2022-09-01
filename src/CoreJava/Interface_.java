package CoreJava;
// Remark :- multiple inheritance is possible in interface with use of extends keyword.(e.g. parent class is Super and Super2, and one class is name as child so syntax :- public interface child extends super,super1. 
public interface Interface_ { // interface is collection of incomplete methods accept static.

	int a = 30; // Variables are by default public,static,final.
	
	void test();//incomplete method.
	
	public static void test2() {// static method cannot write incomplete.
		System.out.println("hello");// post java 8 we can write complete static method inside interface.
	
	
	}
	public static void main(String[] args) {
	//	Interface_  ob = new Interface_ (); //  cannot create object because no counstructor.

	}

}
