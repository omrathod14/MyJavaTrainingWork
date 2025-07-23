package com.stringbuilder.test;

import java.util.Scanner;

public class ReverseStringChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String str1 = sc.nextLine();

		System.out.print("Enter second string: ");
		String str2 = sc.nextLine();

		StringBuilder sb = new StringBuilder(str2);
		sb.reverse();

		if (str1.equals(sb.toString())) {
			System.out.println("The strings are reverse of each other.");
		} else {
			System.out.println("The strings are NOT reverse of each other.");
		}

	}
}
