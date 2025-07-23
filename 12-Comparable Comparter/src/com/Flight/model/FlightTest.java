package com.Flight.model;

import java.util.*;

public class FlightTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Choice = "yes";

		while (Choice.equalsIgnoreCase("yes")) {
			ArrayList<Flight> flights = new ArrayList<>();

			int n = 0;
			System.out.print("\nEnter number of flights: ");
			while (true) {
				try {
					n = Integer.parseInt(sc.nextLine());
					if (n <= 0) {
						System.out.print("Enter a number greater than 0: ");
					} else {
						break;
					}
				} catch (NumberFormatException e) {
					System.out.print(" Invalid number. Try again: ");
				}
			}

			for (int i = 1; i <= n; i++) {
				System.out.println("\n Enter details for Flight :" + i);

				String airline = "";
				while (airline.isEmpty()) {
					System.out.print("Airline: ");
					airline = sc.nextLine().trim();
					if (airline.isEmpty()) {
						System.out.println(" Airline name cannot be empty.");
					}
				}

				// Fare input
				double fare = 0.0;
				while (true) {
					System.out.print("Fare (Rs): ");
					try {
						fare = Double.parseDouble(sc.nextLine());
						if (fare <= 0) {
							System.out.println("Fare must be positive.");
						} else {
							break;
						}
					} catch (NumberFormatException e) {
						System.out.println("Invalid fare. Enter a number.");
					}
				}

				flights.add(new Flight(airline, fare));
			}

			Collections.sort(flights, new SortByFareDescendingComparator());

			System.out.println("\n Sorted Flights (Highest Fare First):");
			for (Flight f : flights) {
				System.out.println(f);
			}

			String choice = "";
			while (true) {
				System.out.print("\nDo you want to sort more flights? (yes/no): ");
				choice = sc.nextLine().trim().toLowerCase();
				if (choice.equals("yes") || choice.equals("no")) {
					break;
				} else {
					System.out.println(" Please enter only 'yes' or 'no'.");
				}
			}

			if (choice.equals("no")) {
				System.out.println("\n Thank you! Program ended.");
				break;
			}
		}
	}
}
