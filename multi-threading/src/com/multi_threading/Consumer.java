package com.multi_threading;

 class Consumer extends Thread {

//	 Company c = new Company();
	 
	 Company c ;
	 
	 public Consumer( Company c) {
		this.c = c ;
	}
	 
	 public void run() {
		 while(true) {
			 try {
				c.consume_item();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }
}
