package com.aurionpro.test;

import java.util.Scanner;

public class ArrayEg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of an Array:");
		int size=sc.nextInt();
		
		int[] marks=new int[size];
		for (int i=0;i<marks.length;i++) {
			System.out.println("Enter the Number to be added:");
			marks[i]=sc.nextInt();
		}
		for(int result:marks) {
			System.out.println(result);
		}
		
	}

}
