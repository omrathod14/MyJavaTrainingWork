package com.aurionpro.model;

import java.io.Serializable;

public class Student implements Serializable {
	String name;
	int rollno;

	public Student(String name, int rollno) {

		this.name = name;
		this.rollno = rollno;

	}

	public void display() {
		System.out.println("Name of Student: " + name + " RollNo: " + rollno);
	}
}
