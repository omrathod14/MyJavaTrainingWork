package com.aurionpro.test;

import java.util.Scanner;

public class DisplayUsername {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email id:");
		String str = sc.nextLine();

		String username = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '@') {
				break;
			} else {
				username = username + ch;
			}
		}
		System.out.println("Username is:" + username);
	}

}
