package com.multi_threading;

class UserThread extends Thread{
	public void run() {
		// task for thread..
		System.out.println("this is user defined thread...");
	}
}

public class ThreadOp {

	public static void main(String[] args) {
		 System.out.println("Program started....");
		 int x = 45 + 56 ;
		 System.out.println("sum is " + x);
		 
		 
		// it is a static method isliye class name ke saath method name ko call kr diya
		 // ye method hume current thread ka object return krega.
		 Thread t = Thread.currentThread();  
		 
		 String tname = t.getName();             // if we want to know the name of the current thread
		 System.out.println("current running thread is "+ tname);
		 
		 t.setName("MyMain");                   // for changing the name of the thread
		 System.out.println("the new name of thread is "+ t.getName());
		 
		 try {
			Thread.sleep(2000);                // it is also a static method and it is used to delay the thread
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 System.out.println(t.getId());
		 
		 // going to start user defined thread.
// because we just extends the Thread class we dont have to create another object for Thread class
// for accessing the methods of Thread class.
		 UserThread u = new UserThread();  
		 if(u != null)      // for checking the object is null or not to avoid null pointer exception.
		 u.start();                        // for starting the thread
		 
		 
		 
		 System.out.println("Program ended...");
	} 
}
