package com.aurionpro.model;

public class OnlineQuiz implements ExamEvaluator {
	 double marks;
	 String grade;

	public void evaluateMarks(double marks) {
		this.marks = marks;
	}

	public void calculateGrade() {
		if (marks >= 50)
			grade = "Pass";
		else
			grade = "Fail";

		System.out.println("Online Quiz Result: " + grade);
	}

	public String getExamType() {
		return "Online Quiz";
	}
}
