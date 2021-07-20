package com.phoenix.Collection.list;

import java.util.Arrays;
import java.util.List;

public class ListArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		System.out.println("Arrays to List conversiong:==>");
		List<Integer>numList=Arrays.asList(100,600,300,200,800,500);
		numList.set(2,1000);
		numList.forEach(System.out::println);
		
		
		Integer []iArr=new Integer[numList.size()];
		iArr=numList.toArray(iArr);
		
		System.out.println("\n\nIterating over iArr:==>");
		for(int ele:iArr)
			System.out.println(ele);
	}

}
