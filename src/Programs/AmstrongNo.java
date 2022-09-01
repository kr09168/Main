package Programs;

public class AmstrongNo { 
	
	// amstrong no is cube of each digit and sum of all digits  1^3=1 + 5^3=125 + 3^3=27; = 153 is amstrong no
	
	public static void main(String[] args) {
	
		int a = 153;
		int Backup =a;
		int sum = 0;
		
		while(a>0) {
			sum=sum+(a%10)*(a%10)*(a%10);
			a=a/10;
		}
		
		 if (sum==Backup) {
			 System.out.println("no is amstrong");
		 }
		 else {
			 System.out.println("no is not amstrong");
		 }
	}
}
	