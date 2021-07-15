package com.phoenix.linkedhashset;
import java.util.*;
//author:raja.kumar@stltech.in
public class LinkedHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set <Integer> numSet=new LinkedHashSet<Integer>(); order and unsorted
		Set <Integer> numSet=new TreeSet<Integer>();//sorted
		numSet.add(100);
		numSet.add(5);
		numSet.add(50);
		
		System.out.println("using Iterator: ");
		Iterator <Integer> itr=numSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
