package colletionFramework;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue_Interface_Implements_Classes {
	
public static void PriorityQueue() {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();// generics is depend on us we can use based on our data requirement.
		// homogenius data allowed only use <Integer> as generics.
		pq.add(10);
		pq.add(67);
		pq.add(67); // duplicate values are allowed
	//	pq.add(null); null is not allowed.
		pq.add(50);

		//System.out.println(pq.get(0));
		// note PriorityQueue not support index.
		// we need to use iterator method for calling data.
		
		Iterator<Integer> value = pq.iterator();
		
	//	System.out.println(value.next());// it will return lower value.(use this for single value.)
		
		while(value.hasNext()) {
		
			System.out.println(value.next()); // this will return all stored values of PriorityQueue<Integer> using while loop.
			// note :- iterator will always return values in accending order. 
		}

	}
	public static void main(String[] args) {
		
		Queue_Interface_Implements_Classes.PriorityQueue();
	
	}

}
