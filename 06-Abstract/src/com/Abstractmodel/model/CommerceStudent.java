package com.Abstractmodel.model;

public class CommerceStudent extends Student {
	int accounts, economics, business;

	public CommerceStudent(int rollNumber, String name, int accounts, int economics, int business) {
		super(rollNumber, name);
		this.accounts = accounts;
		this.economics = economics;
		this.business = business;
	}

	public double calculateAvg() {
		return (accounts + economics + business) / 3.0;
	}

	public String calculateGrade() {
		double avg = calculateAvg();
		if (avg >= 75)
			return "A";
		else if (avg >= 60)
			return "B";
		else if (avg >= 45)
			return "C";
		else
			return "D";
	}
}
