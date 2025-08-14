package com.assigmnet_day3.test;

import java.util.Scanner;

public class CountNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("Enter the Numbers to be added");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number to be searched:");
		int num=sc.nextInt();
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				count++;
			}
		}
		
		System.out.println(num+" is repeating "+count+" times");
		
		
	}

}
