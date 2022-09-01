package Practice;

public interface Interface3 {
	
	int a = 20;
	
	public static void k() {
		int a= 30;
		System.out.println(a);
	}
	
	public static void main() {
		int a= 40;
		System.out.println(a);
		Interface3.k();
	}
	

}
