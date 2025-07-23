package com.aurionpro.model;

public class CommerceStudent extends Student {
	int accounts, economics, business;

	public CommerceStudent(String name, int rollno, int accounts, int economics, int business) {
		super(name, rollno, "Commerce");
		this.accounts = accounts;
		this.economics = economics;
		this.business = business;
	}

	@Override
	public float calculatePerformance() {
		return (accounts + economics + business) / 3;
	}

	@Override
	public String getGrade() {
		double avg = calculatePerformance();
		if (avg >= 75)
			return "A";
		else if (avg >= 60)
			return "B";
		else if (avg >= 45)
			return "C";
		else
			return "D";
	}

	@Override
	public void displaySubjects() {
		System.out
				.println("Subjects: " + "Accounts=" + accounts + " Economics= " + economics + " Business= " + business);
	}
}