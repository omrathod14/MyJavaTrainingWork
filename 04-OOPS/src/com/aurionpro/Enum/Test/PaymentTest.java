package com.aurionpro.Enum.Test;

import java.util.Scanner;

public class PaymentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter payment status (SUCCESS, PENDING, FAILED, CANCELLED): ");
		String input = sc.next().toUpperCase();

		if (input.equals("SUCCESS")) {
			System.out.println("Payment received");
		} else if (input.equals("PENDING")) {
			System.out.println("Payment is pending");
		} else if (input.equals("FAILED")) {
			System.out.println("Payment failed");
		} else if (input.equals("CANCELLED")) {
			System.out.println("Payment was cancelled");
		} else {
			System.out.println("Invalid payment status entered.");
		}

		sc.close();
	}
}
