package CoreJava;

public final class Counstructor {

	 Counstructor(){ // same as class name , same class name but diff arguments called as counstrcutor overloading.
		
		 System.out.println("zero argument");
	}
	
	 Counstructor(int a){  
			
System.out.println("single argument");
		}
		
	 Counstructor(int a,int b){ 
			
		 System.out.println("double argument");			
		}
		
	
	
	public static void main(String[] args) {
		
		Counstructor obj = new Counstructor();
		Counstructor obj1 = new Counstructor(10);
		Counstructor obj2 = new Counstructor(10,30);
	}

}
