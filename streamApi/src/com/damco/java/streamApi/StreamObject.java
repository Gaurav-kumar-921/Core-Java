package com.damco.java.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {
		
		// Stream API is used to process collections as well as group of objects like array 
		
		// Array,object,collection
		String name[] = {"Durgesh" , "Uttam" , "Ankit" , "Gaurav"};
		
		Stream<String> s = Stream.of(name);
		s.forEach(e->{
			System.out.println(e);
		});
		
		// List, Set            // Stream methods collection ke objects pr call hote hai
		
		 List<Integer> list3 = new ArrayList<>();     
		 list3.add(12);
		 list3.add(42);
		 list3.add(25);
		 list3.add(56);
		 list3.add(28);
		 list3.add(16);
		 
		 Stream<Integer> data = list3.stream();
		 data.forEach(e->{
			 System.out.println(e);
		 });

	}

}
