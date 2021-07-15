package com.phoenix.stacks;

import java.util.Stack;
//author:raja.kumar@stltech.in
public class NumStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> numSt=new Stack<Integer>();
		numSt.push(40);
		numSt.push(20);
		numSt.push(70);
		numSt.push(10);
		numSt.push(80);
		
		System.out.println("Top: "+numSt.peek());
		int idx=numSt.search(70);
		System.out.println("element 70 found at: "+idx);
		System.out.println("remove top: "+numSt.pop());
		while(!numSt.isEmpty())
		System.out.println("removed: "+numSt.pop());
	}

}
