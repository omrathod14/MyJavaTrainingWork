package com.assignment_day4.test;

import java.util.Scanner;

public class ArrayEvenOdd {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		
		int[] num=new int[size];                          //Insert Array Elements
		System.out.println("Enter the elements in an array:");
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		
		int left=0;
		int right=size-1;
		
		while(left<right) {
			if(num[left]%2==0) {         //left element is even
				left++;
			}
			else if(num[right]%2!=0) {   // right element is odd
				right--;
			}
			else {                              //left is odd and right is not even
				int x=num[left];
				num[left]=num[right];
				num[right]=x;
				left++;
				right--;
			}
		}
		System.out.println("Rearranged Array is:");
		for(int i=0;i<size;i++) {
			System.out.print(num[i]+" ");
		}
		sc.close();
	}

}
