package com.aurionpro.test;

import java.util.Scanner;

public class StringCountVowel {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = Character.toLowerCase(str.charAt(i));
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("Vowels in a string are:" + count);

	}
}
