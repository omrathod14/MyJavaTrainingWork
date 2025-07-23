package com.aurionpro.model;

public class ArtStudent extends Student {
	int history, politicalscience, sociology;

	public ArtStudent(String name, int rollno, int history, int politicalscience, int sociology) {
		super(name, rollno, "Arts");
		this.history = history;
		this.politicalscience = politicalscience;
		this.sociology = sociology;

	}

	@Override
	public float calculatePerformance() {
		return (history + politicalscience + sociology) / 3;
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
		System.out.println("Subjects: " + " History=" + history + " PoliticalScience=" + politicalscience
				+ " Sociology= " + sociology);
	}

}
