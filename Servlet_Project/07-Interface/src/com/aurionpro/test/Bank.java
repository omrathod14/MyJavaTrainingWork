package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.AccountOperations;
import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.LoanAccount;
import com.aurionpro.model.SavingsAccount;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountOperations[] accounts = { new SavingsAccount(), new CurrentAccount(), new LoanAccount() };

		while (true) {
			System.out.println("\n==== Welcome to Bank ====");
			for (int i = 0; i < accounts.length; i++) {
				System.out.println((i + 1) + ". " + accounts[i].getAccountType());
			}
			System.out.println("0. Exit");

			int accChoice = -1;
			try {
				System.out.print("Choose account (0-3): ");
				accChoice = Integer.parseInt(sc.nextLine());

				if (accChoice == 0) {
					System.out.println("Thanks for banking with us!");
					break;
				}

				if (accChoice < 1 || accChoice > accounts.length) {
					throw new ArrayIndexOutOfBoundsException("Invalid account choice.");
				}

			} catch (NumberFormatException e) {
				System.out.println("Error: Please enter a valid number. " + e.getMessage());
				continue;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Error: " + e.getMessage());
				continue;
			}

			AccountOperations selected = accounts[accChoice - 1];

			System.out.println("\nSelected: " + selected.getAccountType());
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");

			int action = -1;
			try {
				System.out.print("Choose operation: ");
				action = Integer.parseInt(sc.nextLine());

				if (action < 1 || action > 3) {
					throw new IllegalArgumentException("Invalid operation choice.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Error: Please enter a valid number.");
				continue;
			} catch (IllegalArgumentException e) {
				System.out.println("Error: " + e.getMessage());
				continue;
			}

			double amount = 0;
			if (action == 1 || action == 2) {
				try {
					System.out.print("Enter amount: Rs");
					amount = Double.parseDouble(sc.nextLine());

					if (amount <= 0) {
						throw new IllegalArgumentException("Amount must be greater than 0.");
					}
				} catch (NumberFormatException e) {
					System.out.println("Error: Invalid amount. Please enter a valid number.");
					continue;
				} catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
					continue;
				}
			}

			switch (action) {
			case 1:
				selected.deposit(amount);
				break;
			case 2:
				selected.withdraw(amount);
				break;
			case 3:
				selected.checkBalance();
				break;
			}

			String again = "";
			while (true) {
				System.out.print("\nDo you want to perform another transaction? (yes/no): ");
				again = sc.nextLine().trim().toLowerCase();

				if (again.equals("yes") || again.equals("no")) {
					break;
				} else {
					System.out.println("Invalid input! Please enter 'yes' or 'no'.");
				}
			}

			if (again.equals("no")) {
				System.out.println("Thanks for banking with us!");
				break;
			}
		}

		sc.close();
	}
}
