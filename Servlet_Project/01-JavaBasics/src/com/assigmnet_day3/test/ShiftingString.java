package com.assigmnet_day3.test;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftingString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String string=sc.nextLine();
		
		System.out.println("Enter the Position to be shifted:");
		int position=sc.nextInt();
		
		char stringarr[]=string.toCharArray();
		
		for(int i=0;i<stringarr.length;i++) {
			stringarr[i]+=position;
			
		}
		System.out.println("The string after shifting:"+Arrays.toString(stringarr));
		
		
		
	}

}
