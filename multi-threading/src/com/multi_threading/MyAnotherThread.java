package com.multi_threading;


// Creating the thread by extending the Thread class
class MyAnotherThread extends Thread {

	public void run() {
		// task for thread...
		
		for(int i=10;i>=1;i--){
			System.out.println("Another thread of i is " + i);
			try {
				Thread.sleep(2000);                    // for delaying the threads in miliseconds. 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
