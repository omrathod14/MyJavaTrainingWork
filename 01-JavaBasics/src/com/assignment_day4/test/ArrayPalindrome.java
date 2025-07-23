package com.assignment_day4.test;

import java.util.Scanner;

public class ArrayPalindrome {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the elements in an array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int i,j;        //i= left start   //j=right start
		for(i=0,j=size-1;i<=j;i++,j--) 
		{
			if(arr[i]!=arr[j]) {
				System.out.println("Array is not Palindrome!!");
				break;
			}
			
		}
		if(i>j) {
			System.out.println("Array is Palindrome");
		}
		sc.close();
	}

}
