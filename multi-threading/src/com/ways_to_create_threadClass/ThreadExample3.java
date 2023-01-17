package com.ways_to_create_threadClass;

public class ThreadExample3 {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {

			@Override
			public void run() {

				System.out.println("MyThread is running....");
				System.out.println("MyThread is finished....");

			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
	}

}
