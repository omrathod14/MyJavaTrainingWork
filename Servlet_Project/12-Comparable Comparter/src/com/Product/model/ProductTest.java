package com.Product.model;

import java.util.*;

public class ProductTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "yes";

		while (choice.equalsIgnoreCase("yes")) {
			ArrayList<Product> products = new ArrayList<>();

			int n = 0;
			System.out.print("\n Enter number of products: ");
			while (true) {
				try {
					n = Integer.parseInt(sc.nextLine());
					if (n > 0)
						break;
					else
						System.out.print("Enter number > 0: ");
				} catch (NumberFormatException e) {
					System.out.print(" Invalid number. Try again: ");
				}
			}

			for (int i = 1; i <= n; i++) {
				System.out.println("\n Enter Product :" + i);

				String category = "";
				while (true) {
					System.out.print("Category: ");
					category = sc.nextLine().trim();
					if (category.isEmpty()) {
						System.out.println(" Category cannot be empty.");
					} else if (!category.matches("[a-zA-Z ]+")) {
						System.out.println(" Category must contain only letters and spaces.");
					} else {
						break;
					}
				}

				String name = "";
				while (true) {
					System.out.print("Name: ");
					name = sc.nextLine().trim();
					if (name.isEmpty()) {
						System.out.println(" Name cannot be empty.");
					} else if (!name.matches("[a-zA-Z0-9 .:-]+")) {
						System.out.println(" Name contains invalid characters.");
					} else {
						break;
					}
				}

				double price = 0.0;
				while (true) {
					System.out.print("Price (Rs): ");
					try {
						price = Double.parseDouble(sc.nextLine());
						if (price <= 0) {
							System.out.println(" Price must be greater than 0.");
						} else {
							break;
						}
					} catch (NumberFormatException e) {
						System.out.println(" Invalid price. Please enter a valid number.");
					}
				}

				products.add(new Product(category, name, price));
			}

			System.out.println("\n How do you want to sort the products?");
			System.out.println("1. By Category (A–Z), then Price");
			System.out.println("2. By Price (Low to High), then Name");
			System.out.println("3. By Name (A–Z), then Category");
			int sortChoice = 0;
			while (true) {
				System.out.print("Please Enter Choice:");
				try {
					sortChoice = Integer.parseInt(sc.nextLine());
					if (sortChoice >= 1 && sortChoice <= 3)
						break;
					else
						System.out.println(" Enter 1, 2, or 3.");
				} catch (NumberFormatException e) {
					System.out.println("Invalid input. Try again.");
				}
			}

			Comparator<Product> comparator = null;
			if (sortChoice == 1)
				comparator = new SortByCategoryThenPriceComparator();
			else if (sortChoice == 2)
				comparator = new SortByPriceThenNameComparator();
			else
				comparator = new SortByNameThenCategoryComparator();

			Collections.sort(products, comparator);

			System.out.println("\n Sorted Product List:");
			for (Product p : products) {
				System.out.println(p);
			}

			while (true) {
				System.out.print("\n Do you want to sort more products? (yes/no): ");
				choice = sc.nextLine().trim().toLowerCase();
				if (choice.equals("yes") || choice.equals("no"))
					break;
				else
					System.out.println(" Please enter only 'yes' or 'no'.");
			}
		}

		System.out.println("\n Thank you! Program ended.");
	}
}
