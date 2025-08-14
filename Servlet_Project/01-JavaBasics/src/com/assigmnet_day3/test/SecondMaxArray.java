package com.assigmnet_day3.test;

import java.util.Scanner;

public class SecondMaxArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("Enter the Numbers to be added");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int max=0;                 
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];       // max no of an array
			}
			
		}
		
		int second_max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=max && arr[i]>second_max) {
				second_max=arr[i];     //second_max of an array
				System.out.println("Second Largest Number in an array is:"+second_max);
			}
		}
			System.out.println("All elements are same no max value!!");
}

}
