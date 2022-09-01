package colletionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Iterator;
// main diff between Hashset and Linkedhashset is hashset execute in acssending order or with random values and linkedhashset execute line by line in order.

public class Set_Interface_Implements_Classes {
	public static void HashSet() {
		
		HashSet ll = new HashSet();
		ll.add("raut");
		ll.add("kartik"); // duplicate values are allowed
		ll.add("kartik");//but it excecute once.
		ll.add(null);
		ll.add(null); //duplicate null allowed but it excecute once.
		ll.add(false);
		ll.add(20);

//		System.out.println(ll.get(0)); index not allowed use iterator.
//		System.out.println(value.next());// it will return lower value.(use this for single value.)
			
		Iterator ob = ll.iterator();
		while(ob.hasNext()) {
			System.out.println(ob.next());
		}
	}
	public static void LinkedHashSet() {
		
		LinkedHashSet ll = new LinkedHashSet();
		ll.add(10);
		ll.add("kartik"); // duplicate values are allowed
		ll.add("kartik");//but it excecute once.
		ll.add(null);
		ll.add(null); //duplicate null allowed but it excecute once.
		ll.add(false);
		ll.add(20);

//	System.out.println(ll.get(0)); index not allowed use iterator.
//		System.out.println(value.next());// it will return lower value.(use this for single value.)
			
		Iterator ob = ll.iterator();
		while(ob.hasNext()) {
			System.out.println(ob.next());
		}
	}

	public static void main(String[] args) {
	//	Set_Interface_Implements_Classes.LinkedHashSet();
		Set_Interface_Implements_Classes.HashSet();
	}

}
