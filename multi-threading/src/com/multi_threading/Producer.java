package com.multi_threading;

class Producer extends Thread{

//	Company c = new Company();
	
 Company c ;
	 
	 public Producer( Company c) {
		this.c = c ;
	}
	
	public void run() {
		int i=1;
		while(true) {
			try {
				c.produce_item(i);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}
}
