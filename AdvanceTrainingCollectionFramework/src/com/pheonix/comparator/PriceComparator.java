package com.pheonix.comparator;

import java.util.Comparator;

import com.phoenix.models.Product;
//author:raja.kumar@stltech.in
public class PriceComparator implements Comparator<Product> {
	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		float price1=o1.getPrice();
		float price2=o2.getPrice();
		if(price1>price2)
			return 1;
		else if(price1<price2)
			return -1;
		
		return 0;
	}

}
