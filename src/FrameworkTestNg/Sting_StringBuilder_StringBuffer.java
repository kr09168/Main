package FrameworkTestNg;

import org.testng.annotations.Test;

@Test

// Note :- We always use String in automation will not use StringBuilder and StringBuffer.
//Beacuse we all know that we do validation in automation so if the value is mutable then it will be difficult to handle validation.
//E.g :- We are automating login page and if userid or password is mutable then it will be dificult.

public class Sting_StringBuilder_StringBuffer {
	// * String is imutable we cant change value .
	// * String is datatype as well as class too.

	public void String() {

		String a = "kartik"; // stored the string in variable a;

		String b = a.concat(" raut"); // concat a variable with another string. but we stored in another variable that
										// is main part of immutability.

		System.out.println(b); // now with another variable which is b we are are printing the concatination.

	}

	public void StringBuilder() {
		// * StringBuilder is mutable we can change value .
		// * Not syncronize and non thread safe.
		// * Performance is faster
		// use for single thread.
		StringBuilder ob = new StringBuilder("kartik");

		ob.append(" raut");// concating the string with ob variable.

		System.out.println(ob);// calling the ob and we get the concated string in same variable

		System.out.println(ob.reverse());// we have direct method to reverse the string in StringBuilder.

	}

	public void StringBuffer() {
		// * StringBuffer is mutable we can change value .
		// * Syncronize and thread safe.
		// * Performance is slower
		// * use for multi thread.

		StringBuffer ob = new StringBuffer("kartik");

		ob.append(" raut"); // concating the string with ob variable.

		System.out.println(ob); // calling the ob and we get the concated string in same variable

		System.out.println(ob.reverse()); // we have direct method to reverse the string in StringBuffer.

	}
}