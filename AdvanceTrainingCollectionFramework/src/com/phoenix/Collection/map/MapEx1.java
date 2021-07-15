package com.phoenix.Collection.map;

import java.util.*;
//author:raja.kumar@stltech.in
public class MapEx1 {
	public static void main(String[]args)
	{
      //Map<String,Integer> map=new HashMap<String,Integer>();//unorder and unsorted
	 // Map<String,Integer> map=new LinkedHashMap<String,Integer>();//order & unsorted
	  //Map<String,Integer> map=new TreeMap<String,Integer>();//sorted according to keys
	  
	  /*Comparator<String> c=Collections.reverseOrder();
	  Map<String,Integer> map=new TreeMap<String,Integer>(c);*/
	  TreeMap<String, Integer> map = new TreeMap<String, Integer>();
	  map.put("Raja", 2);
      map.put("Rahul", 3);
      map.put("Rohan", 4);
      System.out.println("id is: "+map.get("Raja"));
      
      System.out.println(map);
      
      Set<String> set=map.keySet();
      Iterator<String>it=set.iterator();
      while(it.hasNext())
      {
    	  String name=it.next();
    	  int id=map.get(name);
    	  System.out.println("Name is: "+name+" \t\tid: "+id);
      }
      
      System.out.println("\n\n");
      NavigableMap<String,Integer> navMap=map.headMap("Rk",true);
	  System.out.println(navMap);
	  NavigableMap<String,Integer> tlMap=map.tailMap("Rk",true);
	  System.out.println(tlMap);
	
	  SortedMap<String,Integer> sbMap=map.subMap("Raja", "Rk");
	  System.out.println(sbMap);
  
      
	}
  
}
