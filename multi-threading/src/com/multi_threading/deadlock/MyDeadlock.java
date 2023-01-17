package com.multi_threading.deadlock;

public class MyDeadlock {

	public void fun() {
		synchronized (Test.obj1) {   // T1
			synchronized (Test.obj2) {

			} 
		}

	}

}
