package com.aurionpro.EducationalSoft.model;

public class ExamSession implements IStudent, ITeacher {

	@Override
	public void gradeExam() {
		System.out.println("Grading the exam");

	}

	@Override
	public void createQuestionBank() {
		System.out.println("Creating a Qus Bank");

	}

	@Override
	public void startexam() {
		System.out.println("Exam Started");

	}

}
