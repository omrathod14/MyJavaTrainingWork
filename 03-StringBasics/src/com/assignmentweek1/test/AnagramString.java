package com.assignmentweek1.test;

import java.util.Scanner;

public class AnagramString {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the first string: ");
	    String str1 = scanner.nextLine();
	   
	    System.out.println("Enter the second string: ");
	    String str2 = scanner.nextLine();
	   
	    str1 = str1.toLowerCase();
	    str2 = str2.toLowerCase();
	   
	    if (str1.length() != str2.length()) {
	        System.out.println("The 2 strings are not anagrams");
	    }
	   
	    int count=0;
	    for (int i=0;  i<str1.length(); i++) {
	        char ch = str1.charAt(i);
	        for (int j=0; j<str2.length(); j++) {
	            if (ch == str2.charAt(j)) {
	                count++;
	                break;
	            }
	        }
	    }
	    if (count == str1.length()) {
	        System.out.println("given strings are anagrams");
	    }
	    else {
	        System.out.println("not anagrams");
	    }
	}
	}


