package com.assignment_day4.test;

import java.util.Scanner;

public class ArrayDisplayMarks {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int marks[]=new int[3];
		
		System.out.println("Enter the Marks of 3 Subjects:"); //inserting marks
		for(int i=0;i<marks.length;i++) {
			marks[i]=sc.nextInt();
		}
		
		System.out.println("\nMarks Entered are:");
		for(int i=0;i<marks.length;i++) {
			System.out.println("Marks of subject "+(i+1)+" is "+marks[i]);
		}
		sc.close();
	}

  
}
