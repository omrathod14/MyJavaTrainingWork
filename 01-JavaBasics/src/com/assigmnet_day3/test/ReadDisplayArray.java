package com.assigmnet_day3.test;

import java.util.Scanner;

public class ReadDisplayArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		
		int[] marks=new int[size];
		
		System.out.println("Enter the Numbers to be added");
		
		for(int i=0;i<marks.length;i++) {
			marks[i]=sc.nextInt();
		}
		
		for(int i=0;i<marks.length;i++) {
			System.out.println("The value of array at "+ i + " is " + marks[i]);
		}

	}

}
