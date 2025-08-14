package com.assignmentweek1.test;

import java.util.Scanner;

public class CountCharacterOccurance {
	public static void main(String[] args) {
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		System.out.println("Enter the character to be counted:");
		char ch=sc.next().charAt(0);
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println(ch+" is repeated "+count+" times");
	}

}
