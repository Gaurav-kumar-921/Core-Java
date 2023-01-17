package com.ways_to_create_threadClass;

public class ThreadExample5 {

	public static void main(String[] args) {

		Runnable runnable = () -> {
			for (int i = 0; i < 5; i++) {
				sleep(1000);
				System.out.println("Running...");
			}
		};

		Thread thread = new Thread(runnable);
		thread.setDaemon(true);
		thread.start();

		try {
			thread.join(); // now the main thread will be blocked untill the above thread is executed.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
