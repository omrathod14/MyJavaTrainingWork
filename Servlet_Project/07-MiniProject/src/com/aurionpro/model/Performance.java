package com.aurionpro.model;

public class Performance {

	public static void displayPerformance(Student student) {      ///default
		double avg = student.calculatePerformance();
		System.out.println("Performance: " + avg + "% " + " Grade: " + student.getGrade());
	}

	public static void displayPerformance(Student student, boolean detailed) {
		if (detailed) {
			student.displaySubjects();
		}
		displayPerformance(student);
	}

	public static void displayPerformance(Student student, String format) {
		double avg = student.calculatePerformance();
		if (format.equalsIgnoreCase("percentage")) {
			System.out.println("Performance:" + avg);
		} else if (format.equalsIgnoreCase("grade")) {
			System.out.println(" Grade:" + student.getGrade());
		} else {
			System.out.println("Invalid Input!!!");
		}

	}

}
