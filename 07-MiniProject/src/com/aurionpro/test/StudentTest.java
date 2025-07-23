package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.ArtStudent;
import com.aurionpro.model.CommerceStudent;
import com.aurionpro.model.Performance;
import com.aurionpro.model.ScienceStudent;
import com.aurionpro.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int maxStudents = 5;
		Student[] students = new Student[maxStudents];

		System.out.print("How many students do you want to enter? (max " + maxStudents + "): ");
		int total = scanner.nextInt();
		scanner.nextLine(); 

		if (total <= 0 || total > maxStudents) {
			System.out.println("Invalid number of students. Please run the program again.");
			return;
		}

		for (int i = 0; i < total; i++) {
			System.out.println("\nEnter details for Student " + (i + 1));

			
			System.out.print("Enter name: ");
			String name = scanner.nextLine();

			
			int rollNumber;
			while (true) {
				System.out.print("Enter roll number (positive number): ");
				rollNumber = scanner.nextInt();
				if (rollNumber > 0)
					break;
				System.out.println("Roll number must be positive.");
			}

			scanner.nextLine();

			String stream;
			while (true) {
				System.out.print("Enter stream (Science / Commerce / Arts): ");
				stream = scanner.nextLine().trim().toLowerCase();
				if (stream.equals("science") || stream.equals("commerce") || stream.equals("arts"))
					break;
				System.out.println("Please enter a valid stream.");
			}

			
			int mark1, mark2, mark3;
			System.out.println("Enter marks (0 to 100):");

			mark1 = getValidMark(scanner, "Subject 1");
			mark2 = getValidMark(scanner, "Subject 2");
			mark3 = getValidMark(scanner, "Subject 3");

			
			if (stream.equals("science")) {
				students[i] = new ScienceStudent(name, rollNumber, mark1, mark2, mark3);
			} else if (stream.equals("commerce")) {
				students[i] = new CommerceStudent(name, rollNumber, mark1, mark2, mark3);
			} else if (stream.equals("arts")) {
				students[i] = new ArtStudent(name, rollNumber, mark1, mark2, mark3);
			}
		}

		
		System.out.println("\n=== Student Performance ===");
		for (int i = 0; i < total; i++) {
			students[i].displayinfo();
			Performance.displayPerformance(students[i], true);
			System.out.println("--------------------------------");
		}

		scanner.close();
	}


	public static int getValidMark(Scanner scanner, String subjectName) {
		int mark;
		while (true) {
			System.out.print(subjectName + ": ");
			mark = scanner.nextInt();
			if (mark >= 0 && mark <= 100)
				break;
			System.out.println("Mark must be between 0 and 100.");
		}
		return mark;
	}
}
