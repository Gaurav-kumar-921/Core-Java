package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionMethods {

	public static void main(String[] args) {

		// All methods will be same for all the classes which implements the List
		// interface.
		// collections me auto boxing and auto unboxing apne aap hoti hai.

		List<String> n = new ArrayList<String>();
		n.add("gaurav");
		n.add("rohan");
		n.add("pawan");
		n.add("piyush");
		n.add(1, "Aman"); // for adding element at a perticular index

//		n.remove(1);            // for removing the elements
//		n.remove("piyush");

		System.out.println("Size of collection : " + n.size()); // for finding the size of the collection.

		// ye method equals method call krta hai checking krne ke liye.
		System.out.println(n.contains("pawan")); // for checking if the item is present or not.

		n.set(0, "Goku"); // for replacing an element at a perticular index.

//		n.clear();     // Removes all of the elements from this list. The list will be empty after this call returns.

		System.out.println(n);

		Vector<String> v = new Vector<>();
		v.addAll(n); // for adding all the elements of another collection.

		System.out.println("Vector : " + v);

		System.out.println("=====================================================================");

		// Sets don't have much methods of its own it has only collection methods to use
		// HashSet does not maintain insertion order it adds values on random postion
		// and duplicate values are not allowed.

		Set<Double> hashSet = new HashSet<>();
		hashSet.add(14.14);
		hashSet.add(4.2);
		hashSet.add(34.274245);
		hashSet.add(99.3);
		hashSet.add(99.3);
		hashSet.add(5.2);
		
//		System.out.println(hashSet.contains(4.2)); 
//		
//		System.out.println(hashSet.isEmpty());
//		
//		System.out.println(hashSet.size());
		
//		hashSet.clear();

		System.out.println(hashSet);
		
		
		// LinkedHashSet is used when we want to maintain the insertion order.
		Set<Double> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.addAll(hashSet);

		System.out.println(linkedHashSet);

		
		
		// TreeSet Automatically sorted the elements and duplicate values are not
		// allowed.
		TreeSet<Double> treeSet = new TreeSet<>();
		treeSet.addAll(hashSet);

		System.out.println(treeSet);

	}
}
