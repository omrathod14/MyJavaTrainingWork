package com.assignmentweek1.test;

import java.util.Scanner;

public class ReplaceSpace {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the sentence:");
	        String input = sc.nextLine();

	        String result = "";

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            if (ch == ' ') {
	                result += '-';
	            } else {
	                result += ch;
	            }
	        }

	        System.out.println("Sentence after removing space: " + result);

	        sc.close();
	    }
	}



