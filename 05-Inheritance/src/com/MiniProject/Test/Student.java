package com.MiniProject.Test;

public class Student extends Person {
	int rollNumber;
	static int studentCount = 0;

	String[] courses = new String[5]; // Max 5 courses
	int courseCount = 0;

	public Student(String name, int rollNumber, Departments department) {
		super(name, department);
		this.rollNumber = rollNumber;
		studentCount++;
	}

	public void enrollCourse(String courseName) {
		if (courseCount < courses.length) {
			courses[courseCount] = courseName;
			courseCount++;
		} else {
			System.out.println("Cannot enroll in more than 5 courses.");
		}
	}

	@Override
	public void getdetails() {
		String courseList = "";
		for (int i = 0; i < courseCount; i++) {
			courseList += courses[i];
			if (i != courseCount - 1)
				courseList += ", ";
		}

		System.out.println("Student Name: " + name + ", Roll No: " + rollNumber + ", Dept: " + department
				+ ", Courses: " + courseList);
	}
}
