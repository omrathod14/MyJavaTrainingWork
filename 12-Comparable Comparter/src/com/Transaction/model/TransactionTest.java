package com.Transaction.model;

import java.util.*;

public class TransactionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "yes";

		while (choice.equalsIgnoreCase("yes")) {
			ArrayList<Transaction> transactions = new ArrayList<>();

			int n = 0;
			System.out.print("\nEnter number of transactions: ");
			while (true) {
				try {
					n = Integer.parseInt(sc.nextLine());
					if (n > 0)
						break;
					else
						System.out.print(" Enter number > 0: ");
				} catch (NumberFormatException e) {
					System.out.print(" Invalid number. Try again: ");
				}
			}

			for (int i = 1; i <= n; i++) {
				System.out.println("\n Enter Transaction:" + i);

				int id = 0;
				while (true) {
					System.out.print("Transaction ID: ");
					try {
						id = Integer.parseInt(sc.nextLine());
						if (id > 0)
							break;
						else
							System.out.println(" ID must be greater than 0.");
					} catch (NumberFormatException e) {
						System.out.println(" Invalid input. Enter a valid ID.");
					}
				}

				double amount = 0.0;
				while (true) {
					System.out.print("Amount (Rs): ");
					try {
						amount = Double.parseDouble(sc.nextLine());
						if (amount > 0)
							break;
						else
							System.out.println(" Amount must be positive.");
					} catch (NumberFormatException e) {
						System.out.println(" Invalid input. Enter a number.");
					}
				}

				transactions.add(new Transaction(id, amount));
			}

			System.out.println("\n How would you like to sort?");
			System.out.println("1. By Amount (High to Low), then ID");
			System.out.println("2. By ID (Low to High), then Amount");
			int sortChoice = 0;
			while (true) {
				System.out.print("Please Enter Choice: ");
				try {
					sortChoice = Integer.parseInt(sc.nextLine());
					if (sortChoice == 1 || sortChoice == 2)
						break;
					else
						System.out.println("Enter 1 or 2 only.");
				} catch (NumberFormatException e) {
					System.out.println(" Invalid input. Try again.");
				}
			}

			if (sortChoice == 1) {
				Collections.sort(transactions, new SortByAmountThenIdComparator());
			} else {
				Collections.sort(transactions, new SortByIdThenAmountComparator());
			}

			System.out.println("\nSorted Transactions:");
			for (Transaction t : transactions) {
				System.out.println(t);
			}

			while (true) {
				System.out.print("\n Do you want to enter more transactions? (yes/no): ");
				choice = sc.nextLine().trim().toLowerCase();
				if (choice.equals("yes") || choice.equals("no"))
					break;
				else
					System.out.println("Please enter only 'yes' or 'no'.");
			}
		}

		System.out.println("\n Thank you! Program ended.");
	}
}
