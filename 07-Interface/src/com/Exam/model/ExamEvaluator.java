package com.Exam.model;

public interface ExamEvaluator {
	void evaluateMarks(double marks);

	void calculateGrade();

	String getExamType();
}
