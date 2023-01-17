package com.executor_service.multiple_worker;

public class MyNewTask implements Runnable{

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName());
		System.out.println("My Task 3...");
	}

}
