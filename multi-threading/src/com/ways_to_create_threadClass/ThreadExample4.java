package com.ways_to_create_threadClass;

public class ThreadExample4 {

	public static void main(String[] args) {

		Runnable runnable = () -> {   // that's also how we can create a thread.

			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " is running");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(threadName + " is finished");
			
//			System.out.println("Lambda is running....");
//			System.out.println("Lambda is finished....");
		};

		Thread thread = new Thread(runnable , "MyThread 1");  // for setting the thread name manually.
		thread.start();
		
//		Thread thread2 = new Thread(runnable , "MyThread 2");  
//		thread2.start();

	}

}
