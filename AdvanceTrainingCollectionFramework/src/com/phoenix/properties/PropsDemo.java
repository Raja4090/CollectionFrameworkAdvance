package com.phoenix.properties;

import java.util.Properties;

public class PropsDemo {
	public static void main(String[]args)
	{
		Properties props=new Properties();
		props.setProperty("username", "Rahul");
	    props.setProperty("password", "hello123");
		
		String uname=props.getProperty("username");
		String password=props.getProperty("password","admin123");
		
		System.out.println(uname+" "+password);
	}

}
