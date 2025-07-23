package com.Abstractmodel.model;

public abstract class Student {
	int rollno;
	String name;

	Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	
	public String getName() {
	    return name;
	}

	public int getRollNumber() {
	    return rollno;
	}

	
	public abstract double calculateAvg();
	public abstract String calculateGrade();

}
