package com.callable_and_future_interface;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Callable<String> task1 = () -> "My first task....";

		ExecutorService executorService = Executors.newSingleThreadExecutor(); // single thread pool.

		Future<String> futureTask = executorService.submit(task1);
		System.out.println("String -> " + futureTask.get()); // for printing the value of future object.

		Future<Integer> futureTask2 = executorService.submit(new CallableClient(10));
		System.out.println("Integer -> " + futureTask2.get()); // for printing the value of future object.

		executorService.shutdown();

	}

}
