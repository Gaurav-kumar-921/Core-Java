package com.collections;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollection {

	public static void main(String[] args) {

		// Fornt - remove -> left side -> first come.
		// Rear - Add -> right side -> last come
		// LinkedList also implements Dequeue interface which extends Queue interface.

		Queue<Integer> queue = new LinkedList<>();

		queue.offer(10);
		queue.offer(7);
		queue.offer(5); // for adding elements in the queue
		queue.offer(8);
		queue.offer(4);

		System.out.println(queue.poll()); // it returns the front element and remove it from the queue.

		System.out.println(queue);

		System.out.println(queue.peek()); // ye btayega ki ab front pr kon sa element hai

		System.out.println("=====================================================");

		// Priority Queue
		// priority queue me sbse jada priority us element ki hogi jo sbse chota hoga.
		// and vahi front pr ayega

		// custom priority set krne ke liye use this Comparator.reverseOrder() now it
		// converts from min heap to max heap.
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		pq.offer(25);
		pq.offer(15);
		pq.offer(14);
		pq.offer(29);
		pq.offer(28);

		System.out.println(pq.poll());

		System.out.println(pq.peek());

		System.out.println(pq);

		System.out.println("=====================================================");

		// ArrayDeque - in this data structure we can insert in both sides as well as
		// remove from both sides and also peek on both sides.

		ArrayDeque<Integer> arr = new ArrayDeque<>();

		arr.offer(14);

		arr.offer(16);
		arr.offerLast(5); // for adding element at the Rear side
		arr.offerFirst(18); // for adding element at the front side

		System.out.println(arr);

		System.out.println(arr.peek()); // for finding the element at front.
		System.out.println(arr.peekFirst()); // for finding the element at front.
		System.out.println(arr.peekLast()); // for finding the element at Rear.

		System.out.println(arr.poll()); // for Removing the element at front.
		System.out.println("poll()" + arr);

		System.out.println(arr.pollFirst()); // for Removing the element at front.
		System.out.println("pollFirst()" + arr);

		System.out.println(arr.pollLast()); // for Removing the element at Rear.
		System.out.println("pollLast()" + arr);

	}

}
