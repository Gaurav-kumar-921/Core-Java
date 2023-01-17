package com.oops;

	
	interface Tiger{
		int eye = 2 ;
		public void walk();
	}
	
	interface Lion{
		int eye = 4 ;
		public void walk();
	}
	
	class Cat implements Tiger , Lion{       // Multiple Inheritance
		public void walk() {
			System.out.println("this is the implementation class of Animal interface");
		}
	}
	
	public class Interfaces {
		public static void main(String[] args) {
			
			Cat c = new Cat();
			c.walk();
			System.out.println();
		}
	}
