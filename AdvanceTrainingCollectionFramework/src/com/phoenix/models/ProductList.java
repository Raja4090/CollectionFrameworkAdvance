package com.phoenix.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.pheonix.comparator.BrandComparator;
import com.pheonix.comparator.PriceComparator;
import com.pheonix.comparator.ProductNameComparator;
//author:raja.kumar@stltech.in
public class ProductList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> productList=new ArrayList<Product>();
		productList.add(new Product(1002,"Mobile","Samsung",23500.0f));
		productList.add(new Product(1005,"Laptop","Samsung",23800.0f));
		productList.add(new Product(1006,"Refrigerator","Whirlpool",23200.0f));
		productList.add(new Product(1001,"UHD TV","Sony",21500.0f));
		productList.add(new Product(1002,"Mobile","Lenovo",29500.0f));
		
		System.out.println("Before sort:=>");
		for(Product product:productList)
			System.out.println(product);
		
		System.out.println("\n\n");
		Collections.sort(productList);
		System.out.println("After sort, according to Id:=>");
		for(Product product:productList)
			System.out.println(product);
		
		Collections.sort(productList, Collections.reverseOrder());
		
		System.out.println("\n\nAfter sorting in reverse as per Id:=>");
		for(Product product:productList)
			System.out.println(product);
		
		System.out.println("\n\n");
		Comparator<Product> cNm=new ProductNameComparator();
		Collections.sort(productList,cNm);
		
		System.out.println("Sorting according to name:=>");
		for(Product product:productList)
			System.out.println(product);
		
		System.out.println("\n\n");
		System.out.println("Sorting in reverse according to name:=>");
		//Collections.sort(productList,cNm.reversed());
		Collections.sort(productList,Collections.reverseOrder(cNm));
		for(Product product:productList)
			System.out.println(product);
		
		
		System.out.println("\n\n");
		cNm=new BrandComparator();
		Collections.sort(productList,cNm);
		System.out.println("Sorting according to Brand name:=>");
		for(Product product:productList)
			System.out.println(product);
		
		
	    System.out.println("\n\n");
	    Collections.sort(productList,Collections.reverseOrder(cNm));
	    System.out.println("Sorting according to Brand name in reverse:=>");
		for(Product product:productList)
			System.out.println(product);
		
		
		
		System.out.println("\n\n");
		cNm=new PriceComparator();
		Collections.sort(productList,cNm);
		System.out.println("After sorting, according to price:=>");
		for(Product product:productList)
			System.out.println(product);
		
		
		System.out.println("\n\n");
		Collections.sort(productList,cNm.reversed());
		System.out.println("After sorting in reverse, according to price:=>");
		for(Product product:productList)
			System.out.println(product);
		
		
		
	}

}
