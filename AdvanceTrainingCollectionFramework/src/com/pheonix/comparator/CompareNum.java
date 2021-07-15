package com.pheonix.comparator;

import java.util.Comparator;
/*
 * author:raja.kumar@stltech.in
 */
public class CompareNum implements Comparator<Integer>{

	public int compare(Integer n1,Integer n2)
	{
		if(n1<n2)
			return 1;
		else if(n2<n1)
			return -1;
		else
			return 0;
	}
}
