package com.phoenix.linkedhashset;

import java.util.HashSet;
import java.util.Set;

import com.phoenix.models.Product;
//author:raja.kumar@stltech.in
public class ProductSetDemo {

	public static void main(String[]args)
	{
		Set<Product> productList=new HashSet<Product>();
		productList.add(new Product(1002,"Mobile","Samsung",23500.0f));
		productList.add(new Product(1005,"Laptop","Samsung",23500.0f));
		productList.add(new Product(1006,"Refrigerator","Whirlpool",23500.0f));
		productList.add(new Product(1001,"UHD TV","Sony",23500.0f));
		productList.add(new Product(1002,"Mobile","Samsung",23500.0f));
		
		System.out.println("Before sort:");
		for(Product product:productList)
			System.out.println(product);
	}
}
