package com.multi_threading.join_method;

public class Person2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Person 2 -> Give me 150 rupees !!! " + Thread.currentThread().getName());
	}

}
