package com.assignmentweek1.test;

import java.util.Scanner;

public class LongestWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Sentence:");
		String sent = sc.nextLine();

		String long_word = "";
		String current_word = "";

		for (int i = 0; i < sent.length(); i++) {
			char ch = sent.charAt(i);

			if (ch != ' ') {
				current_word += ch;
			} else {
				if (current_word.length() > long_word.length()) {
					long_word = current_word;
				}
				current_word = "";

			}
		}
		if (current_word.length() > long_word.length()) {
			long_word = current_word;
		}
		System.out.println("Longest Word is:" + long_word);
	}
}
