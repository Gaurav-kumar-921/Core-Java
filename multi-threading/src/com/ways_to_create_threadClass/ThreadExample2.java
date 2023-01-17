package com.ways_to_create_threadClass;

public class ThreadExample2 {

	public static class MyRunnable implements Runnable {

		@Override
		public void run() {

			System.out.println("MyThread is running....");
			System.out.println("MyThread is finished....");
		}

	}

	public static void main(String[] args) {
		
//		MyRunnable myRunnable = new MyRunnable();
//		Thread myThread = new Thread(myRunnable);
		
		// Another way to do it 
		Thread myThread = new Thread(new MyRunnable());
		myThread.start();

	}

}
