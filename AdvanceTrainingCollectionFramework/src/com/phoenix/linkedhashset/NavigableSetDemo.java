package com.phoenix.linkedhashset;

import java.util.NavigableSet;
import java.util.TreeSet;
//author:raja.kumar@stltech.in
public class NavigableSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NavigableSet<Double> nvg=new TreeSet<Double>();//ordered
		nvg.add(5.5);
		nvg.add(3.2);
		nvg.add(1.2);
		
		System.out.println("Totale elements: ");
		for(Double ele:nvg)
			System.out.println(ele);
		
		System.out.println("Ceiling of 1.2: "+nvg.ceiling(1.2));
		System.out.println("Ceiling of 1.3: "+nvg.ceiling(1.3));
		System.out.println("Ceiling of 1.3: "+nvg.ceiling(5.6));
		
		System.out.println("floor of 1.2: "+nvg.floor(1.2));
		System.out.println("floor of 1.3: "+nvg.floor(1.3));
		System.out.println("floor of 1.3: "+nvg.floor(5.6));
		
		
		System.out.println("higher of 1.2: "+nvg.higher(1.2));
		System.out.println("higher of 5.5: "+nvg.higher(5.5));
		
		System.out.println("lower of 1.2: "+nvg.lower(3.2));
		System.out.println("lower of 5.5: "+nvg.lower(5.5));
		System.out.println("Lower of 1.2: "+nvg.lower(1.2));
		
		
	}

}
