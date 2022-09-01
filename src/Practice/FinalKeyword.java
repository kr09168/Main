package Practice;

public class FinalKeyword {

	  int a = 20;

	public final void test() {

		System.out.println("final");

	}

	public static void main(String[] args) {

		FinalKeyword ob = new FinalKeyword();
		System.out.println(ob.a = 30);
		

	}

}
