package com.assignmentweek1.test;

import java.util.Scanner;

public class Palindromestring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		int i=0;
		int j=str.length()-1;
		
		boolean isPalindrome = true;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not a palindrome!!!");
        }

        sc.close();
    }
}


