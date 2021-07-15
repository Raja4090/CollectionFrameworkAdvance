package com.phoenix.queues;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
//author: raja.kumar@stltech.in
public class SimpleQueueDemo {
	public static void main(String[]args)
	{
		Queue<Integer> numQ=new LinkedList<Integer>();//ordered and unsorted
		//Queue<Integer> numQ=new PriorityQueue<Integer>();//ordered during polling
		//Queue<Integer> numQ=new PriorityQueue<Integer>(Collections.reverseOrder());
		numQ.add(100);
		numQ.add(50);
		numQ.add(20);  //this is  head
		numQ.add(70);
		numQ.add(50);
		
		
		System.out.println("Head of numQ: "+numQ.peek());
		System.out.println("Removing numQ: "+numQ.poll());
		System.out.println("Head of numQ: "+numQ.peek());
		
		while(!numQ.isEmpty())
		{
			System.out.println("After Polling: "+numQ.poll());
		}
		
		System.out.println("Peek : "+numQ.peek());//null
		System.out.println("After Polling: "+numQ.poll());//null
		//System.out.println("After Removing: "+numQ.remove());//exception
		//System.out.println("Element is: "+numQ.element());//exception
	}

}
