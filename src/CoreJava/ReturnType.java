package CoreJava;

public class ReturnType {
	
	public void test() { // void means it will not return any value.
		int a= 10+20;
		System.out.println(a);
	}
	
	public int addition() {
		int d= 30+40;
		String s = "velocity";
		System.out.println(d);
				
		return d;
	}
	public static ReturnType demo() {
		ReturnType obj = new ReturnType();
		obj.test();
		obj.addition();
		
		return obj;
		
	}
	public static void main(String [] args) {
	ReturnType obj = ReturnType.demo();
	ReturnType.demo();
	ReturnType.demo();
	}
	
	
	
	
	
}
