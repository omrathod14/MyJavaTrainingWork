package com.MethodOverloading;

public class InputValid {

	public int divide(int a, int b) {
		if (b == 0) {
			System.out.println("Invalid: Division by zero");
			return -1;
		}
		return a / b;
	}

	public double divide(double a, double b) {
		if (b == 0.0) {
			System.out.println("Invalid: Division by zero");
			return -1;
		}
		return a / b;
	}

	public static void main(String[] args) {
		InputValid calc = new InputValid();

		int result1 = calc.divide(10, 2);
		System.out.println("Integer Division Result: " + result1); // 5

		int result2 = calc.divide(10, 0);
		System.out.println("Integer Division Result: " + result2); // Invalid, -1

		double result3 = calc.divide(15.0, 3.0);
		System.out.println("Double Division Result: " + result3); // 5.0

		double result4 = calc.divide(15.0, 0.0);
		System.out.println("Double Division Result: " + result4); // Invalid, -1.0
	}
}
