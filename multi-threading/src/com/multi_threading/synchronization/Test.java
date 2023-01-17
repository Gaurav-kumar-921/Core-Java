package com.multi_threading.synchronization;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static List<Integer> bowl = new ArrayList<>();

	public static void main(String[] args) {

		Guest_Consumer consumer1 = new Guest_Consumer("consumer1");
		Guest_Consumer consumer2 = new Guest_Consumer("consumer2");

		Chef_Producer producer1 = new Chef_Producer("producer1");
		Chef_Producer producer2 = new Chef_Producer("producer2");

		consumer1.start();
		consumer2.start();
		producer1.start();
		producer2.start();
	}

}
