package com.aurionpro.test;

import java.util.Scanner;

public class ReplaceItoE {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		String str2=str.replaceAll("e", "i");
		System.out.println("String after replacement:"+str2);
		sc.close();
	}
}
