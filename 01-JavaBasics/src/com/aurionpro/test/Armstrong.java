package com.aurionpro.test;

public class Armstrong {
	public static void main(String arg[]) {
		int num = 153;
		int arm = 0;
		int temp = num;
		while (num != 0) {
			int r = num % 10;
			arm = r * r * r + arm;
			num = num / 10;
		}
		if (temp == arm) {
			System.out.print("It is a Armstrong Number");
		} else {
			System.out.print("It is a not Armstrong Number");
		}

	}

}
