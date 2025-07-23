package com.MiniProject.Test;

public class Professor extends Person {
	int id;

	String[] subjects = new String[5]; // Max 5 subjects
	int subjectCount = 0;

	public Professor(String name, int id, Departments department) {
		super(name, department);
		this.id = id;
	}

	public void assignSubject(String subjectName) {
		if (subjectCount < subjects.length) {
			subjects[subjectCount] = subjectName;
			subjectCount++;
		} else {
			System.out.println("Cannot assign more than 5 subjects.");
		}
	}

	@Override
	public void getdetails() {
		String subjectList = "";
		for (int i = 0; i < subjectCount; i++) {
			subjectList += subjects[i];
			if (i != subjectCount - 1)
				subjectList += ", ";
		}

		System.out.println(
				"Professor Name: " + name + ", ID: " + id + ", Dept: " + department + ", Subjects: " + subjectList);
	}
}
