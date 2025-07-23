package com.stringbuilder.test;

import java.util.Scanner;

public class RemoveSpace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (ch != ' ') {
				result.append(ch);
			}
		}

		System.out.println("String without spaces: " + result.toString());

		sc.close();
	}
}
