package com.executor_service.single_worker;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutorService {

	public static void main(String[] args) { // single worker hai to ek worker thread hi in saare tasks pr kaam krega

		ExecutorService executorService = Executors.newSingleThreadExecutor(); // creating a single worker thread.

		Runnable task1 = new Runnable() { // Anonimous class type

			@Override
			public void run() {

				System.out.println(Thread.currentThread().getName());
				System.out.println("My Task 1...");
			}
		};

		// Another way to create a taske
		Runnable task2 = () -> { // using lambda expression
			System.out.println(Thread.currentThread().getName());
			System.out.println("My Task 2...");
		};
		
		// 3rd way to create a taske
		MyNewTask task3 = new MyNewTask();

		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);
		
		executorService.shutdown();  // for stoping the program after execution of all the tasks.

	}
}
