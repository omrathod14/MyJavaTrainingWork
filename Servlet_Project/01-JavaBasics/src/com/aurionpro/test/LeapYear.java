package com.aurionpro.test;

public class LeapYear {
	public static void main(String arg[]) {
		int year=1964;
		if (year%100==0 && year%400==0) {
			System.out.print(year+ "is a leap year");
		}
		else if(year%4==0) {
			System.out.print(year+" is a Leap Year");
		}
		else {
			System.out.print(year+ "is not a Leap Year");
		}
	}

}
