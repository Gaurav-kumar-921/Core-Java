package com.oops;

public class Driver {
 
	public static void main(String[] args) {
		
		Pen p1 = new Pen();
		p1.color = "red";
		p1.type = "gel";
		
		Pen p2 = new Pen();
		p2.color = "blue";
		p2.type = "vol";
		
		
		p1.printColor();
		p2.printColor();
		
//		p.write();
//		System.out.println(p.color);
		
		
		Student s = new Student("Gaurav", 23);
//		System.out.println(s.name + " " + s.age);
		s.printInfo();
	}
}
