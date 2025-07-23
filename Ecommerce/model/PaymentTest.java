package com.Ecommerce.model;

import com.aurionpro.model.CreditCard;
import com.aurionpro.model.NetBanking;
import com.aurionpro.model.PaymentGateway;
import com.aurionpro.model.UPI;

import java.util.Scanner;

public class PaymentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PaymentGateway[] methods = { new CreditCard(), new UPI(), new NetBanking() };

		while (true) {
			System.out.println("\n==== E-Commerce Checkout ====");
			for (int i = 0; i < methods.length; i++) {
				System.out.println((i + 1) + ". " + methods[i].getMethodName());
			}
			System.out.println("0. Exit");

			int choice = -1;
			try {
				System.out.print("Enter your choice (0 to exit): ");
				choice = Integer.parseInt(sc.nextLine());

				if (choice == 0) {
					System.out.println("Thank you for shopping!");
					break;
				}

				if (choice < 1 || choice > methods.length) {
					throw new IllegalArgumentException("Invalid option. Try again.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Error: Please enter a number.");
				continue;
			} catch (IllegalArgumentException e) {
				System.out.println("Error: " + e.getMessage());
				continue;
			}

			PaymentGateway selected = methods[choice - 1];

			double amount = 0;
			try {
				System.out.print("Enter amount to pay (greater than 0): Rs");
				amount = Double.parseDouble(sc.nextLine());

				if (amount <= 0) {
					throw new IllegalArgumentException("Amount must be greater than 0.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Error: Please enter a valid amount.");
				continue;
			} catch (IllegalArgumentException e) {
				System.out.println("Error: " + e.getMessage());
				continue;
			}

			int action = -1;
			try {
				System.out.println("1. Pay");
				System.out.println("2. Refund");
				System.out.print("Choose action: ");
				action = Integer.parseInt(sc.nextLine());

				if (action != 1 && action != 2) {
					throw new IllegalArgumentException("Enter 1 or 2 only.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Error: Please enter a valid number.");
				continue;
			} catch (IllegalArgumentException e) {
				System.out.println("Error: " + e.getMessage());
				continue;
			}

			if (action == 1) {
				selected.pay(amount);
			} else {
				selected.refund(amount);
			}
		}

		sc.close();
	}
}
