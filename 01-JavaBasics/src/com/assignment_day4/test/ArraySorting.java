package com.assignment_day4.test;

import java.util.Scanner;

public class ArraySorting {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the of an array:");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the Elements in an array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Original Array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		 //ascending order
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println("\nArray after sorting:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
		
	}
}
