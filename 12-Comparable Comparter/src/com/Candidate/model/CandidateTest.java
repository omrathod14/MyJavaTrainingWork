package com.Candidate.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CandidateTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String Choice = "yes";

		while (Choice.equalsIgnoreCase("yes")) {
			ArrayList<Candidate> candidates = new ArrayList<>();

			int n = 0;
			System.out.print("\n Enter number of candidates: ");
			while (true) {
				try {
					n = Integer.parseInt(sc.nextLine());
					if (n <= 0) {
						System.out.print("Please enter a positive number: ");
					} else {
						break;
					}
				} catch (NumberFormatException e) {
					System.out.print("Invalid number. Try again: ");
				}
			}

			for (int i = 1; i <= n; i++) {
				System.out.println("\n Enter details for Candidate " + i);
				String name = "";
				while (name.isEmpty()) {
					System.out.print("Name: ");
					name = sc.nextLine().trim();
					if (name.isEmpty()) {
						System.out.println("Name cannot be empty.");
					}
				}

				int age = 0;
				while (true) {
					System.out.print("Age: ");
					try {
						age = Integer.parseInt(sc.nextLine());
						if (age <= 0) {
							System.out.println("Age must be a positive number.");
						} else {
							break;
						}
					} catch (NumberFormatException e) {
						System.out.println("Invalid age. Please enter a number.");
					}
				}

				candidates.add(new Candidate(name, age));
			}

			int sortChoice = 0;
			System.out.println("\n Choose sorting option:");
			System.out.println("1. Sort by Name (A-Z), then Age");
			System.out.println("2. Sort by Age only");
			while (true) {
				System.out.print("Please enter choice: ");
				try {
					sortChoice = Integer.parseInt(sc.nextLine());
					if (sortChoice == 1 || sortChoice == 2)
						break;
					else
						System.out.println(" Please enter 1 or 2.");
				} catch (NumberFormatException e) {
					System.out.println(" Invalid input. Please enter 1 or 2.");
				}
			}

			if (sortChoice == 1) {
				Collections.sort(candidates, new SortByNameComparator());
			} else {
				Collections.sort(candidates, new SortByAgeComparator());
			}

			System.out.println("\n Sorted Candidates:");
			for (Candidate c : candidates) {
				System.out.println(c);
			}

			String choice = "";
			while (true) {
				System.out.print("\nDo you want to perform another sort? (yes/no): ");
				choice = sc.nextLine().trim().toLowerCase();
				if (choice.equals("yes") || choice.equals("no")) {
					break;
				} else {
					System.out.println("Please enter only 'yes' or 'no'.");
				}
			}

			if (choice.equals("no")) {
				System.out.println("\n Program ended. Thank you!");
				break;
			}
		}
	}
}
