package com.aurionpro.model;

public class TheoryExam implements ExamEvaluator {
	 double marks;
	 String grade;

	public void evaluateMarks(double marks) {
		this.marks = marks;
	}

	public void calculateGrade() {
		if (marks >= 90)
			grade = "A+";
		else if (marks >= 75)
			grade = "A";
		else if (marks >= 60)
			grade = "B";
		else if (marks >= 40)
			grade = "C";
		else
			grade = "F";

		System.out.println("Theory Exam Grade: " + grade);
	}

	public String getExamType() {
		return "Theory Exam";
	}
}
