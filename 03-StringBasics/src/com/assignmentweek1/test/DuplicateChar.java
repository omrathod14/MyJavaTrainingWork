package com.assignmentweek1.test;

import java.util.Scanner;

public class DuplicateChar {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String input = sc.nextLine();

		String result = "";

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			// Check if character already exists in result
			boolean isDuplicate = false;
			for (int j = 0; j < result.length(); j++) {
				if (result.charAt(j) == ch) {
					isDuplicate = true;
					break;
				}
			}

			// If not a duplicate, add to result
			if (!isDuplicate) {
				result += ch;
			}
		}

		System.out.println("String after removing duplicates: " + result);
		sc.close();

	}
}
