package com.aurionpro.test;

public class PalindromenNumber {
	public static void main(String arg[]) {
		int num=164;
		int rev=0;
		int temp=num;
		while(num>0) {
			int r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		if(rev==temp) {
			System.out.print("It is Palindrome");
		}else {
			System.out.print("Not a Palindrome");
		}
		
	}

}
