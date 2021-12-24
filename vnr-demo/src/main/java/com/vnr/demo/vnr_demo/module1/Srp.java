package com.vnr.demo.vnr_demo.module1;

public class Srp {
	private static String name;
	private int accountNum;

	public Srp(String name, int accountNum) {
		
		this.name = name;
		this.accountNum = accountNum;
	}
	public static void display()
	{
		System.out.println("this is my new java class="+name);
	}

}
