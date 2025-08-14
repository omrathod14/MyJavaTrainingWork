package com.aurionpro.test;

import java.util.Scanner;

public class ArrayStringLength {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number of Strings:");
	int size=sc.nextInt();
	
	sc.nextLine();
	
	int arr[]=new  int[size];
	
	System.out.println("Enter the String:");
	
	int sum=0;
	for(int i=0;i<size;i++) {
		String str=sc.nextLine();
		sum +=str.length();
		
	}
	System.out.println("The length of string is:"+sum);
	
}
}
