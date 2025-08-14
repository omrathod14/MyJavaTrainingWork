package com.MiniProject.Test;

import java.util.Scanner;

public class CollegeMain {

	public static boolean isValidDepartment(String dept) {
		return dept.equalsIgnoreCase("COMPUTER_SCIENCE") || dept.equalsIgnoreCase("MECHANICAL")
				|| dept.equalsIgnoreCase("ELECTRICAL") || dept.equalsIgnoreCase("CIVIL") || dept.equalsIgnoreCase("IT");
	}

	public static Departments getDepartment(String dept) {
		return Departments.valueOf(dept.toUpperCase());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("How many students? ");
		int studentCount = sc.nextInt();
		sc.nextLine(); 

		System.out.print("How many professors? ");
		int professorCount = sc.nextInt();
		sc.nextLine(); 

		Student[] students = new Student[studentCount];
		Professor[] professors = new Professor[professorCount];

		System.out.println("\n--- Enter Student Details ---");
		for (int i = 0; i < studentCount; i++) {
			System.out.print("Student Name: ");
			String name = sc.nextLine();

			System.out.print("Roll Number: ");
			int roll = sc.nextInt();
			sc.nextLine();

			String deptInput;
			while (true) {
				System.out.print("Department (COMPUTER_SCIENCE, MECHANICAL, ELECTRICAL, CIVIL,IT): ");
				deptInput = sc.nextLine();
				if (isValidDepartment(deptInput))
					break;
				System.out.println("Invalid department. Try again.");
			}

			Departments dept = getDepartment(deptInput);
			Student s = new Student(name, roll, dept);

			System.out.print("How many courses to enroll (max 5): ");
			int courseCount = sc.nextInt();
			sc.nextLine();

			if (courseCount > 5)
				courseCount = 5;

			for (int j = 0; j < courseCount; j++) {
				System.out.print("Course " + (j + 1) + ": ");
				String course = sc.nextLine();
				s.enrollCourse(course);
			}

			students[i] = s;
		}

		System.out.println("\n--- Enter Professor Details ---");
		for (int i = 0; i < professorCount; i++) {
			System.out.print("Professor Name: ");
			String name = sc.nextLine();

			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();

			String deptInput;
			while (true) {
				System.out.print("Department (COMPUTER_SCIENCE, MECHANICAL, ELECTRICAL, CIVIL,IT): ");
				deptInput = sc.nextLine();
				if (isValidDepartment(deptInput))
					break;
				System.out.println("Invalid department. Try again.");
			}

			Departments dept = getDepartment(deptInput);
			Professor p = new Professor(name, id, dept);

			System.out.print("How many subjects to assign (max 5): ");
			int subjectCount = sc.nextInt();
			sc.nextLine();

			if (subjectCount > 5)
				subjectCount = 5;

			for (int j = 0; j < subjectCount; j++) {
				System.out.print("Subject " + (j + 1) + ": ");
				String subject = sc.nextLine();
				p.assignSubject(subject);
			}

			professors[i] = p;
		}

		// Display all students
		System.out.println("\n--- Student Details ---");
		for (Student s : students) {
			s.getdetails();
		}

		// Display all professors
		System.out.println("\n--- Professor Details ---");
		for (Professor p : professors) {
			p.getdetails();
		}

		System.out.println("\nTotal Students: " + Student.studentCount);

		sc.close();
	}
}
