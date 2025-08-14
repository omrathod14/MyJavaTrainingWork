package com.aurionpro.model;

public interface ExamEvaluator {
    void evaluateMarks(double marks);
    void calculateGrade();
    String getExamType();
}

