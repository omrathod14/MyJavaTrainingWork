package com.Movie.model;

import java.util.*;

public class MovieTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "yes";

		while (choice.equalsIgnoreCase("yes")) {
			ArrayList<Movie> movies = new ArrayList<>();

			int n = 0;
			System.out.print("\n Enter number of movies: ");
			while (true) {
				try {
					n = Integer.parseInt(sc.nextLine());
					if (n > 0)
						break;
					else
						System.out.print("Enter a number > 0: ");
				} catch (NumberFormatException e) {
					System.out.print("Invalid number. Try again: ");
				}
			}

			for (int i = 1; i <= n; i++) {
				System.out.println("\n Movie :" + i);

				String title = "";
				while (true) {
					System.out.print("Title: ");
					title = sc.nextLine().trim();
					if (title.isEmpty()) {
						System.out.println("Title cannot be empty.");
					} else if (!title.matches("[a-zA-Z0-9 .:-]+")) {
						System.out.println(" Title contains invalid characters.");
					} else {
						break;
					}
				}

				int year = 0;
				while (true) {
					System.out.print("Year: ");
					try {
						year = Integer.parseInt(sc.nextLine());
						int currentYear = Calendar.getInstance().get(Calendar.YEAR);
						if (year < 1880 || year > currentYear) {
							System.out.println(" Year should be between 1880 and " + currentYear);
						} else {
							break;
						}
					} catch (NumberFormatException e) {
						System.out.println(" Invalid input. Enter a number.");
					}
				}

				movies.add(new Movie(title, year));
			}

			int sortChoice = 0;
			System.out.println("\n How do you want to sort?");
			System.out.println("1. By Year (Latest First), then Title");
			System.out.println("2. By Title (A to Z), then Year");
			while (true) {
				System.out.print("Please Enter Choice");
				try {
					sortChoice = Integer.parseInt(sc.nextLine());
					if (sortChoice == 1 || sortChoice == 2)
						break;
					else
						System.out.println(" Enter 1 or 2 only.");
				} catch (NumberFormatException e) {
					System.out.println(" Invalid input. Enter 1 or 2.");
				}
			}

			if (sortChoice == 1) {
				Collections.sort(movies, new SortByYearDescThenTitleComparator());
			} else {
				Collections.sort(movies, new SortByTitleThenYearComparator());
			}

			System.out.println("\n Sorted Movie List:");
			for (Movie m : movies) {
				System.out.println(m);
			}

			while (true) {
				System.out.print("\n Do you want to try again? (yes/no): ");
				choice = sc.nextLine().trim().toLowerCase();
				if (choice.equals("yes") || choice.equals("no"))
					break;
				else
					System.out.println(" Please type 'yes' or 'no'.");
			}
		}

		System.out.println("\n Thank you! Program ended.");
	}
}
