package com.executor_service.multiple_worker;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestExecutorService {

	public static void main(String[] args) { // single worker hai to ek worker thread hi in saare tasks pr kaam krega

		ExecutorService executorService = Executors.newFixedThreadPool(3); // creating a Multiple worker thread.

		Runnable task1 = new Runnable() { // Anonimous class type

			@Override
			public void run() {

				System.out.println(Thread.currentThread().getName());
				System.out.println("My Task 1 started...");
				try {
					TimeUnit.SECONDS.sleep(2); //
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("My Task 1 ended...");
			}
		};

		// Another way to create a taske
		Runnable task2 = () -> { // using lambda expression
			System.out.println(Thread.currentThread().getName());
			System.out.println("My Task 2 started...");
			try {
				TimeUnit.SECONDS.sleep(2); //
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("My Task 2 ended...");
		};

		Runnable task3 = () -> { // using lambda expression
			System.out.println(Thread.currentThread().getName());
			System.out.println("My Task 3 started...");
			try {
				TimeUnit.SECONDS.sleep(2); //
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("My Task 3 ended...");
		};

		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);

		executorService.shutdown(); // for stoping the program after execution of all the tasks.

	}
}
