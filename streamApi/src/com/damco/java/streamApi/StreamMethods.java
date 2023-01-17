package com.damco.java.streamApi;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main(String[] args) {
	
//  Predicate ek boolean valued function hota hai jo true ya false return krte hai agr 
//	value true hogi tabhi filter hoga elements vrna ignore ho jayega 
// use lambda expressions for Predicate like   e-> e>10 .
		// filter(Predicate)   
		
		List<String> names = List.of("Gaurav" , "Aman" , "Anil" , "Abhi" , "Pawan" , "Piyush");
		List<String> newName = names.stream().filter(e-> e.startsWith("Aman")).collect(Collectors.toList());
		System.out.println(newName);
		
		
		
		
// jb hume koi same operation sabhi elements pr krna hota hai tb hum map() use krte hai		
		// map(function)      map method function ki value ko return krega and 
		
		List<Integer> numbers = List.of(23,4,5,2,8,9,45);
		List<Integer> newNumbers = numbers.stream().map(e-> e*e).collect(Collectors.toList());
		System.out.println(newNumbers);
		
		// only for printing
		
//		names.stream().forEach(e->{
//			System.out.println(e);
//		});
		
		newName.stream().forEach(System.out::println);               // using method reference
		
		 
		// sorted() method
		numbers.stream().sorted().forEach(e->{
			System.out.println(e);
		});
		
		// Comparator =>         (x,y)->x.compareTo(y)
		
		numbers.stream().sorted((x,y)->y.compareTo(x)).forEach(e->{         // sorted in decending order using comparator 
			System.out.println(e);
		});
		
		// Min element
		Integer min = numbers.stream().min((x,y)->x.compareTo(y)).get();     // it returns single value isliye get() use kiya forEach ki jgh
		System.out.println("Min is " + min);
		
		// Max element
		Integer max = numbers.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println("Max is " + max);
		
		

	}

}
