package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraversingCollection {

	public static void main(String[] args) {

		ArrayList<String> n = new ArrayList<String>();
		n.add("gaurav");
		n.add("rohan");
		n.add("pawan");
		n.add("piyush");
		n.add(1, "Aman");

		// Traversing the ArrayList using different methods:-

		// 1) for each loop:

// jis type ka data hume iterate krna hota hai usi type ka variable define krte hai inside brackets
//		for(String str : n) {    
//			System.out.print(str + "\t" + str.length() + "\t");    
//			StringBuffer br = new StringBuffer(str);                         // mirror image or palindrome.
//			System.out.println(br.reverse());
//			
//		}

		// 2) Using iterator() it is only use for Forward traversing.

		Iterator<String> iterator = n.iterator();

		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}

		System.out.println("============================================================================");

		// for backward traversing use Listiterator

		ListIterator<String> listIterator = n.listIterator(n.size()); // cursor ko last me pohochane ke liye use .size()

		while (listIterator.hasPrevious()) {
			String prev = listIterator.previous();
			System.out.println(prev);
		}

		System.out.println("============================================================================");

		// 3) Using forEach() method

		n.forEach(e -> {
			System.out.println(e);
		});

		// Sorting elements using TreeSet
		System.out.println("Using TreeSet..............");

		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.addAll(n);

//			System.out.println(treeSet);

		treeSet.forEach(e -> {
			System.out.println("All the elements are sorted now : " + e);
		});

	}
}
