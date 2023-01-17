package com.multi_threading;



// creating our thread using Runnable Interface
class MyThread implements Runnable {

	public void run() {
		// task for thread...
		
		for(int i=1;i<=10;i++){
			System.out.println("Value of i is " + i);
			try {
				Thread.sleep(1000);                    // for delaying the threads in miliseconds. 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		Thread thr = new Thread(t1);
		
		thr.start();                // for starting the threads
		
		// object of MyAnotherThread
		MyAnotherThread t2 = new MyAnotherThread();
		t2.start();
	}
}
