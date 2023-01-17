package com.collections;

import java.util.ArrayList;

public class Generics {

	// Remember Collections ke Generics me primitive datatypes nhi chlte to unki jgh
	// unki Wrapper classes use kro.

// Generics mtlb hetrogeneous storing object ko homogeneous object storing collection bnana

	// 1) Type Safe - same type of elements(objects) are added to collection.

	// 2) Un Type Safe - different types of elements can be added to collection.

	public static void main(String[] args) {

		// Type Safe collection
		ArrayList<String> n = new ArrayList<String>();
		n.add("gaurav");
		n.add("rohan");
		n.add("pawan");
		n.add("piyush");
//		n.add(124);    // now we can't add the different type of data in the collection.

		System.out.println(n);
//		System.out.println(n.get(1));      // in this collection we can get data using indexes and Insertion order will be maintained.

		// Un Type Safe collection

//		LinkedList list = new LinkedList<>();
//		list.add("goku");
//		list.add(12);     // now we can add the different type of data in the collection.
//		list.add(14.52);
//		list.add(true);
//		System.out.println(list.get(2)); // in this collection we can get data using indexes and Insertion order will be maintained.

	}
}
