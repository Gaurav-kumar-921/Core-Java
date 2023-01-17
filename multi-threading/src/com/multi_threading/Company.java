package com.multi_threading;

class Company {

	int n ;
	
	// if b = false : chance : producer
	// if b = true : chance : Consumer
	boolean b = false ;                    // for making inter-thread communication

	// synchronized isliye bnaya taaki jb producer thread chale tb consumer thread na chale
	// or jb consumer thread chale tb producer thread na chale.
   synchronized	public void produce_item(int n) throws InterruptedException {
	   
	   if(b) {
		   wait();
	   }
	    
		this.n = n ;
		System.out.println("Produced : " + this.n);
		b = true ;
		notify();
	}
	
	synchronized public int consume_item() throws InterruptedException {
		if(!b) {
			wait();
		}
		System.out.println("Consumed : " + this.n);
		b = false ;
		notify();
		return this.n ;
		
	}
}
