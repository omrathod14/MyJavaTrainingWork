package com.StudentManagement.model;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		StudentManager sm = new StudentManager();
		Scanner sc = new Scanner(System.in);
		int choice = -1;

		while (true) {
			System.out.println("\nStudent Record Management");
			System.out.println("1. Add Student");
			System.out.println("2. View All Students");
			System.out.println("3. Search Student by Roll Number");
			System.out.println("4. Delete Student by Roll Number");
			System.out.println("5. Exit");

			System.out.print("Enter your choice (1-5): ");
			try {
				choice = Integer.parseInt(sc.nextLine());

				switch (choice) {
				case 1 -> sm.addStudent();
				case 2 -> sm.viewAllStudents();
				case 3 -> sm.searchStudentByRoll();
				// case 4 -> sm.deleteStudentByRoll();
				case 5 -> {
					System.out.println("Exiting...");
					return;
				}
				default -> System.out.println(" Enter a number between 1 and 5.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a number.");
			}
		}
	}
}
