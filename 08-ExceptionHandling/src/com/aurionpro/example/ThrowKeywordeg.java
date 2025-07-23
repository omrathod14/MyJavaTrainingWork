package com.aurionpro.example;

import java.util.Scanner;

public class ThrowKeywordeg {

	static void ValidateMarks(int marks) {
		if(marks<0 || marks>100) {
			throw new IllegalArgumentException("Marks are not valid");
			
		}
		System.out.println("valid Marks");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks:");
		int marks = sc.nextInt();
		
		ValidateMarks(marks);

	}

}
