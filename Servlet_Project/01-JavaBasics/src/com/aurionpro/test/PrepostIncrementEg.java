package com.aurionpro.test;

public class PrepostIncrementEg {
	public static void main(String arg[]) {
		int a = 10;
		int b= a++;                   //pre increment
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		int c = 10;
		int d= ++c;                   //post increment
		System.out.println("c : "+c);
		System.out.print("d : "+d);
		
	}
}
