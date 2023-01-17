package com.multi_threading.synchronizedblock_vs_method;

public class TestMain {

	public static void main(String[] args) {

		Test test = new Test();

		Thread t1 = new Thread() {
			public void run() {
				test.f1();
			};
		};

		Thread t2 = new Thread() {
			public void run() {
				test.f2();
			};
		};
		Thread t3 = new Thread() {
			public void run() {
				test.f1();
			};
		};
	}

}
