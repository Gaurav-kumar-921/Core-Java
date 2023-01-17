package com.multi_threading.deadlock;

public class MyDeadlock2 {

	public void fun2() {
		synchronized (Test.obj2) {  // T2
			synchronized (Test.obj1) {

			}
		}

	}
}
