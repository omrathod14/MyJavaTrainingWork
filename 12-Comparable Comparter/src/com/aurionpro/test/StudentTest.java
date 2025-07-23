package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.aurionpro.model.IdSortComparatorAscending;
import com.aurionpro.model.IdSortComparatorDescending;
//import com.aurionpro.model.NameAscendingComparator;
//import com.aurionpro.model.NameDescendingComparator;
import com.aurionpro.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(101, "Amit"));
		students.add(new Student(102, "Om"));
		students.add(new Student(103, "Raj"));

		String Choice = "yes";

		while (Choice.equalsIgnoreCase("yes")) {
			int sortCriteria = -1;
			int sortOrder = -1;

			while (sortCriteria != 1 && sortCriteria != 2) {
				try {
					System.out.println("\nChoose Sorting Criteria:");
					System.out.println("1. Sort by ID");
					System.out.println("2. Sort by Name");
					System.out.print("Please Enter Choice:");
					sortCriteria = Integer.parseInt(sc.nextLine());
					if (sortCriteria != 1 && sortCriteria != 2) {
						System.out.println("Please enter 1 or 2 only.");
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid input. Please enter a number.");
				}
			}

			while (sortOrder != 1 && sortOrder != 2) {
				try {
					System.out.println("\nChoose Order:");
					System.out.println("1. Ascending");
					System.out.println("2. Descending");
					System.out.print("Please Enter Choice:");
					sortOrder = Integer.parseInt(sc.nextLine());
					if (sortOrder != 1 && sortOrder != 2) {
						System.out.println(" Please enter 1 or 2 only.");
					}
				} catch (NumberFormatException e) {
					System.out.println(" Invalid input. Please enter a number.");
				}
			}

			Comparator<Student> comparator = null;
			if (sortCriteria == 1 && sortOrder == 1)
				comparator = new IdSortComparatorAscending();
			else if (sortCriteria == 1 && sortOrder == 2)
				comparator = new IdSortComparatorDescending();
//			else if (sortCriteria == 2 && sortOrder == 1)
//				comparator = new NameAscendingComparator();
//			else if (sortCriteria == 2 && sortOrder == 2)
//				comparator = new NameDescendingComparator();

			Collections.sort(students, comparator);

			System.out.println("\n Sorted Students:");
			for (Student s : students) {
				System.out.println(s);
			}

			System.out.print("\n Do you want to perform another sorting? (yes/no): ");
			Choice = sc.nextLine().trim();
		}

		System.out.println("\n Thank you! Program ended.");
	}
}
