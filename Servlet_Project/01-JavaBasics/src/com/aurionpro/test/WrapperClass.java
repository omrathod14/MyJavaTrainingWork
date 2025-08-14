package com.aurionpro.test;

public class WrapperClass {
	public static void main(String[] args) {
		int num1=10;
		Integer num3=num1;  //auto-boxing
		Integer num2=new Integer(num1); //boxing
		
		System.out.println("Number 1 is:"+num1);
		System.out.println("Number 2 is:"+num2);
		System.out.println("Number 3 is:"+num3);
		
		
		
	}
}
