package com.aurionpro.model;

public abstract class Student {
	String name;
	int rollno;
	String stream;

	public Student(String name, int rollno, String stream) {
		this.name = name;
		this.rollno = rollno;
		this.stream = stream;
	}

	public void displayinfo() {
		System.out.println("\nName: " + name + " RollNo: " + rollno + " Stream: " + stream);
	}

	public abstract float calculatePerformance();

	public abstract String getGrade();
	
	public abstract void displaySubjects();
}