package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClassMethods {

	public static void main(String[] args) {


		List<HashCodeAndEqualsMethod> list = new ArrayList<>();
		
		list.add(new HashCodeAndEqualsMethod("Gaurav" , 2));
		list.add(new HashCodeAndEqualsMethod("Pawan" , 5));
		list.add(new HashCodeAndEqualsMethod("Piyush" , 7));
		list.add(new HashCodeAndEqualsMethod("Deepak" , 1));
		list.add(new HashCodeAndEqualsMethod("Rohan" , 6));
		
		HashCodeAndEqualsMethod h1 = new HashCodeAndEqualsMethod("Gaurav", 2);
		HashCodeAndEqualsMethod h2 = new HashCodeAndEqualsMethod("Rohan", 6);
		
		
//		list.add(20);
//		list.add(40);
//		list.add(54);
//		list.add(144);
//		list.add(20);
//		list.add(25);
//		list.add(10);
//		list.add(23);
//		list.add(20);
		
//		System.out.println("min element " + Collections.min(list));
//		System.out.println("max element " + Collections.max(list));
//		System.out.println("Frequency " + Collections.frequency(list,20));         // number of occurence
//		
//		Collections.sort(list);                 // sorting
//		Collections.sort(list, Comparator.reverseOrder());          // sorting in reverse order
		
		System.out.println(h1.compareTo(h2));
		
		System.out.println(list);

	}

}
