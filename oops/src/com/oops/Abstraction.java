	 package com.oops;
	 
	 
	 abstract class Animal{
		 abstract void walk();
		 
		 public void eat() {
			 System.out.println("Animal eats");
		 }
		 
		 Animal(){
			 System.out.println("this is Animal Constructor");
		 }
	 }
	 
	 class Horse extends Animal {
		 public void walk() {
			 System.out.println("Now we Implemented the Abstract method");
		 }
		 
		 Horse(){
			 System.out.println("this is Horse Costructor");
		 }
	 }
	 
	 

//   jb bhi hum derived class ka koi object created krte hai to sbse pehele base class
//	 ka constructor call hota hai fir derived class ka constructor call hota hai 
//	 this concept is known as constructor chaining.
	
	public class Abstraction {
		
		public static void main(String[] args) {
			
			Horse h = new Horse();
			h.walk();
			h.eat();
		}
	
	}
