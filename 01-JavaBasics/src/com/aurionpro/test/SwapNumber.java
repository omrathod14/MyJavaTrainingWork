package com.aurionpro.test;

//with third variable
public class SwapNumber {
	public static void main(String arg[]) {
		int a = 10, b = 20;
		System.out.println("Before Swapping : a = " + a + "b =" + b);

		int temp = a;
		a = b;
		b = temp;
		System.out.print("After Swapping : a = " + a + "b =" + b);
	}
}
