package com.phoenix.searching;

import java.util.Arrays;

public class SearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {50,20,80,40,10,90};
		
        Arrays.sort(arr);
        int ind=Arrays.binarySearch(arr, 20);
        System.out.println("index: "+ind+" values: "+arr[ind]);
        int ind2=Arrays.binarySearch(arr, 30);
        System.out.println(ind2); //
	}

}
