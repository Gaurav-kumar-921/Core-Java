package com.oops;

public class Polymorphism {

	String name ;
	int age ;
	
	// Method Overloading
	public void printInfo(String name) {
		System.out.println(name);
	}
	
	public void printInfo(int age) {
		System.out.println(age);
	}
	
	public void printInfo(String name , int age) {
		System.out.println(name + " " + age);
	}
	
	public static void main(String[] args) {
		
		Polymorphism p = new Polymorphism();
		p.printInfo("Gaurav");
		p.printInfo(23);
		p.printInfo("Gaurav" , 23);
	}


}


