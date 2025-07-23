package com.assigmnet_day3.test;

import java.util.Scanner;

public class Substring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the main string:");
		String main=sc.nextLine();
		
		System.out.println("Enter the sub string to be found:");
		String sub=sc.nextLine();
		
		if(main.contains(sub)) {
			System.out.println("Yes "+sub+" is in a main string");
		}else {
			System.out.println("Substring is not present");
		}
	}

}
