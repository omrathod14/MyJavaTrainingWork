package com.aurionpro.test;

public class RevNum {
	public static void main(String arg[]) {
		int num=123;
		int reverse_num=0;
		
		while(num!=0) {
			int r=num%10;
			reverse_num=reverse_num*10+r;
			num=num/10;
			
		}
	
		System.out.print("Reverse Number is "+reverse_num);
		
	}

}
