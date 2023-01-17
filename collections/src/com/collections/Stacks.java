package com.collections;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {

		Stack<String> animals = new Stack<>();
		animals.push("Lion");
		animals.push("Cat");
		animals.push("Dog"); // for adding elements into stack
		animals.push("Tiger");
		animals.push("Horse");

		System.out.println(animals);

		System.out.println(animals.peek()); // for finding the element in the top of the stack.
		
		animals.pop();       // for removing the top element of the stack.
		
		System.out.println(animals.peek());
	}

}
