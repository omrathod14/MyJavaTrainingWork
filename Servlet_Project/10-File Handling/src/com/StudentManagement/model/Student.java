package com.StudentManagement.model;

public class Student {
	int roll;
	String name;
	int marks;

	public Student(int roll, String name, int marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public String toFileString() {
		return roll + "," + name + "," + marks;
	}

	public void display() {
		System.out.println("Roll: " + roll + ", Name: " + name + ", Marks: " + marks);
	}
}
