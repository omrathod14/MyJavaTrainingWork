package com.stringbuilder.test;

import java.util.Scanner;

public class ReplaceString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.println("Enter String:");
//		String str = sc.nextLine();

		StringBuilder str1 = new StringBuilder("This is good idea");
		str1.replace(8, 12, "bad");
		System.out.println(str1);
	}
	
	{
		
		
	}
	
	

}
