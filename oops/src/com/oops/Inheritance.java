package com.oops;

 class Shape {                           // Single level inheritance

	String color ;
}
  
 class Size extends Shape{                  // Mutli level inheritance
	 public void area(int l , int h) {
		 System.out.println((1*l*h)/2);
	 }
 }
 
 class Area extends Size {
	
 }
 
 class CircleArea extends Size{                // hierarchical inheritance
	 public void areaOfCircle(int r) {
		 System.out.println((3.14)*r*r);
	 }
 }
 


public class Inheritance {
	
	public static void main(String[] args) {
		Shape c = new Shape();
		c.color = "red";
		System.out.println(c.color); 
		
		CircleArea ca = new CircleArea();
		ca.area(5, 5);
		ca.areaOfCircle(5);
	}
}


