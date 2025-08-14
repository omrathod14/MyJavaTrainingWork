package com.aurionpro.test;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		String rev_str=" ";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			rev_str=ch+rev_str;
		}
		System.out.println("Original String is:"+str);
		System.out.println("Reverse String is:"+rev_str);
	}

}
