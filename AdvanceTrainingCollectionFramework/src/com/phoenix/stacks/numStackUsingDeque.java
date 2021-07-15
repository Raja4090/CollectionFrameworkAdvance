package com.phoenix.stacks;

import java.util.ArrayDeque;
//author:raja.kumar@stltech.in
public class numStackUsingDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque<Integer> stack=new ArrayDeque<Integer>();
		stack.addLast(40);
		stack.addLast(20);
		stack.addLast(70);
		stack.addLast(10);
		stack.addLast(80);
		
		System.out.println("PeekLast :"+stack.peekLast());
		System.out.println("pop element: "+stack.pollLast());
		System.out.println("PeekLast :"+stack.peekLast());
		
		while(!stack.isEmpty())
			System.out.println("Popped: "+stack.pollLast());
	}

}
