package com.aurionpro.EducationalSoft.model;

public class ExamServiceTest {
	public static void main(String[] args) {
		
		TeacherAssigment teacher=new TeacherAssigment();
		teacher.assignteacher();
		
		
		ExamSession exam=new ExamSession();
		exam.createQuestionBank();
		exam.startexam();
		exam.gradeExam();
	}

}
