package Programs;

public class MyProgram {

	public static void main(String[] args) {
		
		  int b = 6;
		  
		 int count = 0;
		  
		  for(int i=1;i<=b;i++) {
			  
			  if (b%i==0) {
				  
				  count++;
				  
			  }
		  }	
			 if(count==2){
				 System.out.println("prime");
				 }
			 else{
				 System.out.println("not prime");
			 }
		  }
		}    


	
	
	