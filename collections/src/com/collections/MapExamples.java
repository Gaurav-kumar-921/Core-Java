package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {

	public static void main(String[] args) {

		HashMap<String, Integer> fruits = new HashMap<>();
		fruits.put("Apple", 100);
		fruits.put("Banana", 50); // for adding the key value pairs
		fruits.put("Grapes", 80);
		fruits.put("Orange", 50);
		fruits.put("Cherry", 100);
		fruits.put("Apple", 80); // agr already map ke andr vo key present hogi to vo uski value ko update kr
									// dega.
		fruits.put("Melon", 110);

		// to avoid using the same key and updating the previous value of that key use this
//		if(!fruits.containsKey("Banana")) {
//			fruits.put("Banana", 150);
//		}

		// another way to do it
		fruits.putIfAbsent("Banana", 40);

//		System.out.println(fruits);

		// we can iterate data in Map using 
		fruits.forEach((e1, e2) -> {
			System.out.println(e1 + "=> " + e2);
		});

		
//		// entry set
//		for (Map.Entry<String, Integer> e : fruits.entrySet()) {
//			System.out.println(e);
//
//			System.out.println(e.getKey()); // for getting only keys of every element
//			System.out.println(e.getValue()); // for getting only values of every element
//		}
//
//		// key set
//		for (String key : fruits.keySet()) { // if we only wants to iterate keys.
//			System.out.println(key);
//		}
//
//		for (Integer value : fruits.values()) { // if we only wants to iterate Values.
//			System.out.println(value);
//		}
//
//		// for getting a single element
//		System.out.println(fruits.get("Apple"));

	}

}
