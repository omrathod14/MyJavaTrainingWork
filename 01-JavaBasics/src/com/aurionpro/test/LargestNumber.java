package com.aurionpro.test;

public class LargestNumber {
	public static void main(String arg[]) {
		int number1 = 5, number2 = 3, number3 = 6;
		if (number1 > number2 && number1 > number3) {
			System.out.println(number1 + " Greatest Number");
		}
		if (number2 > number1 && number2 > number3) {
			System.out.println(number2 + " Greatest Number");
		} else {
			System.out.print(number3 + " Greatest Number");
		}

	}

}
//do optimise it by less code