package com.pheonix.comparator;

import java.util.Comparator;
import com.phoenix.models.Product;
//author:raja.kumar@stltech.in
public class ProductNameComparator implements Comparator<Product>{

	public int compare(Product o1,Product o2)
	{
	String product1Name=o1.getName();
	String product2Name=o2.getName();
	return product1Name.compareTo(product2Name);
	}
	
}
