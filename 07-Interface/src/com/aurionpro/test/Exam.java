package com.aurionpro.test;

import com.aurionpro.model.ExamEvaluator;

import com.aurionpro.model.OnlineQuiz;
import com.aurionpro.model.PracticalExam;
import com.aurionpro.model.TheoryExam;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ExamEvaluator[] exams = { new TheoryExam(), new PracticalExam(), new OnlineQuiz() };

		while (true) {
			System.out.println("\n==== Exam Evaluation System ====");
			for (int i = 0; i < exams.length; i++) {
				System.out.println((i + 1) + ". " + exams[i].getExamType());
			}
			System.out.println("0. Exit");

			int choice = -1;
			try {
				System.out.print("Select exam type (0 to exit): ");
				choice = Integer.parseInt(sc.nextLine());

				if (choice == 0) {
					System.out.println("Exiting Exam System.");
					break;
				}

				if (choice < 1 || choice > exams.length) {
					throw new IllegalArgumentException("Invalid exam type selected.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Error: Please enter a valid number.");
				continue;
			} catch (IllegalArgumentException e) {
				System.out.println("Error: " + e.getMessage());
				continue;
			}

			ExamEvaluator selected = exams[choice - 1];

			double marks = -1;
			try {
				System.out.print("Enter marks (0–100): ");
				marks = Double.parseDouble(sc.nextLine());

				if (marks < 0 || marks > 100) {
					throw new IllegalArgumentException("Marks should be between 0 and 100.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Error: Invalid input. Please enter numeric marks.");
				continue;
			} catch (IllegalArgumentException e) {
				System.out.println("Error: " + e.getMessage());
				continue;
			}

			selected.evaluateMarks(marks);
			selected.calculateGrade();
		}

		sc.close();
	}
}
