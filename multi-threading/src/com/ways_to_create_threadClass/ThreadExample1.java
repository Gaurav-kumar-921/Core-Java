package com.ways_to_create_threadClass;

public class ThreadExample1 {

	public static class MyThread extends Thread {   // nested class
		public void run() {
			System.out.println("MyThread is running....");
			System.out.println("MyThread is finished....");
		}
	}

	public static void main(String[] args) {

		MyThread myThread = new MyThread();
		myThread.start();
	}

}
