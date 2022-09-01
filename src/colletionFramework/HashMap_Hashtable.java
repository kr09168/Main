package colletionFramework;

import java.util.*; // added collections classes.

public class HashMap_Hashtable {
	
	public static void HashMap() {
		//	HashMap<Integer,String> ob = new HashMap(); We can also use liked this.
	HashMap ob = new HashMap(); // HashMap is a class.
		ob.put("name", "kartik");	// In put method argument we pass the key and value and using we can call any value.	
		ob.put("name", "Raut"); // Duplicate keys & values allowed but it will return last one . ie. Raut
		ob.put(2, null);;
		ob.put("call", true);
		ob.put(4, 20);
		ob.put(5, 20.1);
	
		System.out.println(ob.get("name"));
		System.out.println(ob.get("name"));
		System.out.println(ob.get(2));
		System.out.println(ob.get(4));
		System.out.println(ob.get(5));
		System.out.println(ob.get("call"));
}
	public static void Hashtable() {
		//	Hashtable ob = new Hashtable(); We can also use like this.
	Hashtable<Integer,String> ob = new Hashtable(); // Hashtable is a class.
		ob.put(1, "kartik");	// in put method argument we pass the key and value and using we can call any value.	
		ob.put(2, "Raut"); // duplicate keys & values allowed but it will return last one . ie. Raut
	//	ob.put(3, null);// null is not allowed if use it will throe NullPointerException.
		ob.put(4, "Hashtable");
		ob.put(5, "A");
		ob.put(5, "kartik");// duplicate keys & values allowed but it will return last one . ie. kartik.
		
		System.out.println(ob.get(1));
		System.out.println(ob.get(2));
		System.out.println(ob.get(3));// if there is no value then default value of index is null.
		System.out.println(ob.get(4));
		System.out.println(ob.get(5));
		
}

	public static void main(String[] args) {
	//	Collection.HashMap();
	//	Collection.Hashtable();
	
	}
	
}
