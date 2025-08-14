package com.OOPs.model;

public class Student {

	private String name;
	private int rollno;
	private int marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getMarks() {
		return marks;
	}

	public boolean setMarks(int marks) {
		if(marks>=0 && marks<=100) {
			this.marks = marks;
		}
		else {
			System.out.println("Marks out of range!!");
			return false;
		}
		return true;
	}

}
