package com.ways_to_create_threadClass;

public class StoppableRunnable implements Runnable {

	private boolean stopRequested = false;

	public synchronized void requestStop() {
		this.stopRequested = true;
	}

	public synchronized boolean isStopRequested() {
		return this.stopRequested;
	}

	public void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {

		System.out.println("StoppableRunnable Running.....");
		while (!isStopRequested()) {
			sleep(1000);
			System.out.println("......");
		}
		System.out.println("StoppableRunnable Stopped.....");
	}

	public static void main(String[] args) {

		StoppableRunnable stoppableRunnable = new StoppableRunnable();
		Thread thread = new Thread(stoppableRunnable, "MyThread");
		thread.start();

		try {
			Thread.sleep(10000); // Main thread will be sleeping not the above thread.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("requesting stop...");
		stoppableRunnable.requestStop();
		System.out.println("stop requested...");
	}

}
