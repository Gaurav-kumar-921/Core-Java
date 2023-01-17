package com.damco.java.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		
		// Q- Create a List and filter all even numbers from List.
		
		// three different ways to create a List
		
		 List<Integer> list1 =  List.of(2,4,50,21,22,67);   // 1st way it is Immutable in nature.
		 
		 List<Integer> list2 = Arrays.asList(23,564,12,598,264);  // 2nd way it is also Immutable.
		 
		 
		 
		 // filtering the elements of list1 without stream
		 
//		 List<Integer> listEven = new ArrayList<>();
//		
//		for(Integer i : list1) {
//			if(i%2==0) {
//			listEven.add(i);
//			}
//		}
//		System.out.println(list1);
//		System.out.println(listEven);
		
		
		// filtering the elements of list1 with using stream
		
//		Stream<Integer> s = list1.stream();         // Stream ka object get krne ke liye use stream() method.
//		List<Integer> newList = s.filter(i-> i%2==0).collect(Collectors.toList());
//		
//		System.out.println(newList);
		
		// or we can write it in a single line 
		
		List<Integer> newList1 = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
 		System.out.println(newList1);
		
		// for filtering the number greater than 10
 		
 		List<Integer> newList2 = list1.stream().filter(i-> i>10).collect(Collectors.toList());
		System.out.println(newList2);

	}

}
