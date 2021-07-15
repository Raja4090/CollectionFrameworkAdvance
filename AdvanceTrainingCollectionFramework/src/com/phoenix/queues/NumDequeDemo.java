package com.phoenix.queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
//author:raja.kumar@stltech.in
public class NumDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Deque<Integer> deq=new LinkedList<Integer>();
		Deque<Integer> deq=new ArrayDeque<Integer>();
		deq.add(100);
		deq.add(200);
		deq.addFirst(150);
		deq.addFirst(180);
		deq.addLast(120);
		deq.addLast(130);
		System.out.println("Head of deq: "+deq.peek());
		System.out.println("First element of deq: "+deq.peekFirst());
		System.out.println("Last element of deq: "+deq.peekLast());
		
		System.out.println("poll :"+deq.poll());
		System.out.println("poll first :"+deq.pollFirst());
		System.out.println("poll Last :"+deq.pollLast());
	}

}
