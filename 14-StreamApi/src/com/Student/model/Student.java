package com.Student.model;

public class Student {

	String name;
	int rollno;
	double cgpa;

	public Student(String name, int rollno, double cgpa) {
		this.name = name;
		this.rollno = rollno;
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", rollno=" + rollno + ", cgpa=" + cgpa + "]";
	}

}