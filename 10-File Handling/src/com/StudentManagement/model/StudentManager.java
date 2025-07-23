package com.StudentManagement.model;

import java.io.*;
import java.util.*;

public class StudentManager {
	String fileName = "students.txt";

	public int getValidInt(Scanner sc, String message) {
		int value = -1;
		while (true) {
			try {
				System.out.print(message);
				value = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Please enter a valid number.");
			}
		}
		return value;
	}

	// 1. Add Student
	public void addStudent() {
		Scanner sc = new Scanner(System.in);

		int roll = getValidInt(sc, "Enter Roll Number: ");

		System.out.print("Enter Name: ");
		String name = sc.nextLine().trim();
		while (name.isEmpty()) {
			System.out.print("Name cannot be empty. Enter again: ");
			name = sc.nextLine().trim();
		}

		int marks = getValidInt(sc, "Enter Marks: ");

		Student s = new Student(roll, name, marks);

		try {
			FileWriter fw = new FileWriter(fileName, true);
			fw.write(s.toFileString() + "\n");
			fw.close();
			System.out.println("Student added.");
		} catch (IOException e) {
			System.out.println("Error writing to file: " + e.getMessage());
		}
	}

	// 2. View All Students
	public void viewAllStudents() {
		try {
			File file = new File(fileName);
			if (!file.exists()) {
				System.out.println("No student records found.");
				return;
			}

			Scanner fileScanner = new Scanner(file);
			boolean found = false;

			System.out.println("\n Student List:");
			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				String[] parts = line.split(",");
				if (parts.length == 3) {
					int roll = Integer.parseInt(parts[0]);
					String name = parts[1];
					int marks = Integer.parseInt(parts[2]);
					Student s = new Student(roll, name, marks);
					s.display();
					found = true;
				}
			}
			fileScanner.close();

			if (!found)
				System.out.println("No student records to show.");

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}

	// 3. Search Student
	public void searchStudentByRoll() {
		Scanner sc = new Scanner(System.in);
		int target = getValidInt(sc, "Enter Roll Number to search: ");
		boolean found = false;

		try {
			File file = new File(fileName);
			if (!file.exists()) {
				System.out.println(" File not found.");
				return;
			}

			Scanner fileScanner = new Scanner(file);
			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				String[] parts = line.split(",");
				if (Integer.parseInt(parts[0]) == target) {
					Student s = new Student(Integer.parseInt(parts[0]), parts[1], Integer.parseInt(parts[2]));
					System.out.println("Student Found:");
					s.display();
					found = true;
					break;
				}
			}
			fileScanner.close();

			if (!found) {
				System.out.println("Student with that roll number not found.");
			}

		} catch (IOException | NumberFormatException e) {
			System.out.println("Error searching student: " + e.getMessage());
		}
	}

	// 4. Delete Student
	public void deleteStudentByRoll() {
		Scanner sc = new Scanner(System.in);
		int target = getValidInt(sc, "Enter Roll Number to delete: ");
		boolean deleted = false;

		try {
			File file = new File(fileName);

			File tempFile = new File("temp.txt");

			Scanner fileScanner = new Scanner(file);
			FileWriter fw = new FileWriter(tempFile);

			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				String[] parts = line.split(",");
				if (Integer.parseInt(parts[0]) != target) {
					fw.write(line + "\n");
				} else {
					deleted = true;
				}
			}

			fileScanner.close();
			fw.close();

			if (file.delete() && tempFile.renameTo(file)) {
				if (deleted)
					System.out.println(" Student deleted.");
				else
					System.out.println(" Roll number not found.");
			} else {
				System.out.println(" Error updating file.");
			}

		} catch (IOException | NumberFormatException e) {
			System.out.println(" Error deleting student: " + e.getMessage());
		}
	}
}
