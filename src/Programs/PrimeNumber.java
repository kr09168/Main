package Programs;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int a = 100;
		
		int count=0;
		
		for (int j=1; j<=a;j++) {
		
		for (int i = 1; i<=j; i++) { // for loop to check our value with every no with help of i
									
			if(a%i==0) { // condition to check reminder value
				
				count++; // count will be store here
				
			 if(count == 2) {
				
				System.out.println(j);
			}
			}
		} // for loop completed
		/*if(count==2) { // check wether value of count is 2 or not
			
			System.out.println("No is prime");
		}
		else {
			System.out.println("No is not prime");
		}*/
		
	}

}


}
