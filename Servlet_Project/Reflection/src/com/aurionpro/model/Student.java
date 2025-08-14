package com.aurionpro.model;

public class Student {

	int rollno;
	String name;
	double cgpa;

	public Student() {}

	public Student(int rollno, String name, double cgpa) {
		this.rollno = rollno;
		this.name = name;
		this.cgpa = cgpa;
	}

	public void greet() {
		System.out.println("Hello");
	}

	public double result() {
		return cgpa;
	}

}
