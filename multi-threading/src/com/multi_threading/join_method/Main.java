package com.multi_threading.join_method;

public class Main {

	public static void main(String[] args) { // main method apne aap me ek thread hai jise main thread khte hai

		Thread person1 = new Thread(new Person1(), "Pawan");
		Thread person2 = new Thread(new Person2(), "Vipul");

		person1.start();
		person2.start();

		try {
			person1.join(); // now the main thread will wait first for the person 1 thread
			person2.join(); // and person 2 thread when both of them executed after that main thread will
							// execute.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// this is me
		System.out.println("Watching movie " + Thread.currentThread().getName()); // when i get 300 rupees (waiting).

		// Never try to use this range in real time applications.
		// Thread Priority Range --> 1 to 10
		// mid -> 5 (also known as default priority)
		// highest priority --> 10

	}

}
