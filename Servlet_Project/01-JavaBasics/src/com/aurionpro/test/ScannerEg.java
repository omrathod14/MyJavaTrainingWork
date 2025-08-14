package com.aurionpro.test;

import java.util.Scanner;
public class ScannerEg {
	public static void main(String arg[]) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter your Name:");
		String Username=scanner.nextLine();
		
		System.out.print("Enter your Age:");
		int age=scanner.nextInt();
		
		System.out.print("Hello my name is "+Username +" I'm " + age + " old");
		
		
	}

}
