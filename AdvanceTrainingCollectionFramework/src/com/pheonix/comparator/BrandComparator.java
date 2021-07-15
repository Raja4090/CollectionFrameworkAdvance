package com.pheonix.comparator;

import java.util.Comparator;
import com.phoenix.models.Product;
//author:raja.kumar@stltech.in
public class BrandComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		String bName1=o1.getBrand();
		String bName2=o2.getBrand();
		return bName1.compareTo(bName2);
	}
}