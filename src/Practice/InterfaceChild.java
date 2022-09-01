package Practice;

public class InterfaceChild implements Interface1,Interface2,Interface3{
	
	InterfaceChild(){
		System.out.println("open browser");
	}
	
	//String b = "khggg";
	
	
	public void demo() {
		String b = "fff";
		System.out.println(b);
	System.out.println("i am demo");
	}
	public void demo2() {
		
		System.out.println("i am demo 1");
		
	}
	
	public void ashwini() {
	System.out.println("My name is ashwini");
}
	
	public static void main(String[] args) {
		
		InterfaceChild sc = new InterfaceChild();
		sc.ashwini();
		sc.demo();
		Interface3.k();
	}

}
