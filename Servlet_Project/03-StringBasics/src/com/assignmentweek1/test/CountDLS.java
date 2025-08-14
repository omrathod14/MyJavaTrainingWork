package com.assignmentweek1.test;

import java.util.Scanner;

public class CountDLS {
	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the String:");
		        String input = sc.nextLine();

		        int letters = 0;
		        int digits = 0;
		        int specialChar = 0;

		        for (int i = 0; i < input.length(); i++) {
		            char ch = input.charAt(i);

		            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
		                letters++;
		            } else if (ch >= '0' && ch <= '9') {
		                digits++;
		            } else {
		                specialChar++;
		            }
		        }

		        System.out.println("Letters: " + letters);
		        System.out.println("Digits: " + digits);
		        System.out.println("Special Characters: " + specialChar);

		        sc.close();
		    }

}

