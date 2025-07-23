package com.Exam.model;

public class PracticalExam implements ExamEvaluator {
	double marks;
	String grade;

	public void evaluateMarks(double marks) {
		this.marks = marks;
	}

	public void calculateGrade() {
		if (marks >= 80)
			grade = "Distinction";
		else if (marks >= 60)
			grade = "Merit";
		else if (marks >= 40)
			grade = "Pass";
		else
			grade = "Fail";

		System.out.println("Practical Exam Grade: " + grade);
	}

	public String getExamType() {
		return "Practical Exam";
	}
}
