package com.oops;

public class Student {
	
	String name ;
	int age ;
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	Student(String name , int age){ 
	
			this.name = name ;
			this.age = age ;
		
	}

}
