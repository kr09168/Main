package Programs;

public class Array {

	public static void main(String[] args) {
		
		//There are three ways to create array in java.
		// 1. int[] name = new int[5]; DATATYPE [] VARIABLE NAME = CREATE OBJECT OF ARRAY WITH MEMORY ALLOCATION.
		//    name[0] = "kartik;" INTIALIZATION. 
		// 2. int[] name; DECLARATION
		//    name=new int[5];MEMORY ALLOCATION.
		//    name[0] = "kartik;" INTIALIZATION.
	    // 3. int[] name = {1,2,3,4,5}   DECLARATION,MEMORY ALLOCATION AND INTIALIZATION IN SINGLE LINE.
	
		
		// 1 type
		
		int[] n =new int[5];
		n[0]=1;
				
				
		// 2 type
		
		int [] num;
		num = new int[5];
		num[0]=2;
	
       // 3. type 
		
		int[] name = {1,2,3};
	
        System.out.println(name[0]);
	
	}

}
