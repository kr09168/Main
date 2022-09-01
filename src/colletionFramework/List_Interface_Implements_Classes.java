package colletionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class List_Interface_Implements_Classes {

	public static void ArrayList() {
//		ArrayList<Integer> li = new ArrayList<Integer>(); We can also use like this
		ArrayList li = new ArrayList();
		// storing a hetrogeneous data.(any type of data allowed)
		li.add("kartik");
		li.add(45);
		li.add(null);
		li.add(null);// duplictaes null are allowed.
		li.add(20.0);
		li.add(20.0);// duplictaes values are allowed.
		li.add(true);

		System.out.println(li.get(0));
		System.out.println(li.get(1));
		System.out.println(li.get(2));
		System.out.println(li.get(3));
		System.out.println(li.get(4));
		System.out.println(li.get(5));
		System.out.println(li.get(6));
	}
public static void LinkedList() {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		// homogenius data allowed only use <Integer> as generics.
		ll.add(67);
		ll.add(67); // duplicate values are allowed
		ll.add(null);
		ll.add(null); //duplicate null allowed
		ll.add(50);

		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		System.out.println(ll.get(2));
		System.out.println(ll.get(3));
		System.out.println(ll.get(4));

	}
public static void Vector() {
	
	Vector ll = new Vector<>();
	ll.add("raut");
	ll.add("kartik"); // duplicate values are allowed
	ll.add("kartik");//but it excecute once.
	ll.add(null);
	ll.add(null); //duplicate null allowed but it excecute once.
	ll.add(false);
	ll.add(20.0);

	System.out.println(ll.get(0));//in index u can also use iterator.
	System.out.println(ll.get(1));
	System.out.println(ll.get(2));
	System.out.println(ll.get(3));
	System.out.println(ll.get(4));
	System.out.println(ll.get(5));
	System.out.println(ll.get(6));
//	System.out.println(ll.get(7));//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Array index out of range: 7.

}

	public static void main(String[] args) {
	
		//List_Interface_Implements_Classes.ArrayList();
		List_Interface_Implements_Classes.LinkedList();

	}

}
