package com.aurionpro.test;

public class SumDigit {
	public static void main(String arg[]) {
		int num=123;
		int total=0;
		
		while(num!=0) {
			int r=num%10;
			total=total+r;
			num=num/10;
		}
		System.out.print("Sum of Number is "+ total);
	}
	
}
